package pairmatching.controller;

import pairmatching.model.Crews;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class MatchingController {
    private Crews crews;

    public void run() {
        OutputView.printSelectFunctionMessage();
        String selection = InputView.selectFunction();
        // TODO validation

        if(selection.equals("1")) {

        }
    }

    private void matchPair() {
        String[] mission = InputView.selectMission().split(", ");

    }

    public MatchingController(Crews crews) {
        this.crews = crews;
    }
}
