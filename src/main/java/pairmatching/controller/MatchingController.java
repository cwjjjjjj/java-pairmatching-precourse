package pairmatching.controller;

import camp.nextstep.edu.missionutils.Randoms;
import pairmatching.model.Crews;
import pairmatching.model.PairRepository;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class MatchingController {
    private Crews crews;
    private PairRepository pairRepository = new PairRepository(crews);

    //메세지 출력과
    public void run() {
        OutputView.printSelectFunctionMessage();
        String selection = InputView.selectFunction();
        // TODO validation

        OutputView.printInformation();
        if(selection.equals("1")) {
            String[] mission = InputView.selectMission().split(", ");
            if (isMatched(mission)) {
                //매칭 이력이 있는 미션이라면 || 또는 다시 매칭한다면
                matchPair(mission);
            }
        }
    }

    private void matchPair(String[] mission) {
        //해당 코스의 크루들 이름을 가져와서
        List<String> crewsName = new ArrayList<>();
        if (mission[0].equals("백엔드")) {
            crewsName = crews.getBackendCrewsName();
        }
        if (mission[0].equals("프론트엔드")) {
            crewsName = crews.getFrontendCrewsName();
        }
        //셔플한다.
        List<String> shuffledCrew = shuffleCrew(crewsName, mission);
    }

    //
    private List<String> shuffleCrew(List<String> crewsName, String[] mission) {
        for (int i = 0; i < 3; i++) {
            List<String> shuffledCrew = Randoms.shuffle(crewsName);
            if (pairRepository.validatePair(shuffledCrew, mission)) {
                //
                return shuffledCrew;
            }
        }
        return null;
    }

    private boolean isMatched(String[] mission) {
        if (pairRepository.findPair(mission[0], mission[2]) != null) {
            OutputView.printRematchingMessage();
            if (InputView.selectRematching().equals("아니오")) {
                return false;
            }
        }
        return true;
    }

    public MatchingController(Crews crews) {
        this.crews = crews;
    }
}
