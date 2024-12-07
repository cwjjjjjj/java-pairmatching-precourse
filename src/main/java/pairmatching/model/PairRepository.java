package pairmatching.model;

import java.util.ArrayList;
import java.util.List;

public class PairRepository {
    //매칭된 pair들을 저장하는 리스트
    //과정, 레벨, 미션에 맞는 페어 매칭 결과를 가짐
    private List<Pair> pairs = new ArrayList<>();

    //pairs를 바탕으로 만든 OX 2차원 배열
    //오직 비교(validate)만을 위해 존재함
    private List<boolean[][]> backendLevelPairs = new ArrayList<>();
    private List<boolean[][]> frontendLevelPairs = new ArrayList<>();

    //생성자에서는 백/프론트 사람 인원^2 크기의 배열을 생성해서 add
    public PairRepository(Crews crews) {
        for (int i = 0; i < 5; i++) {
            backendLevelPairs.add(new boolean[crews.getBackendCrewsSize()][crews.getBackendCrewsSize()]);
        }
        for (int i = 0; i < 5; i++) {
            frontendLevelPairs.add(new boolean[crews.getFrontendCrewsSize()][crews.getFrontendCrewsSize()]);
        }
    }

    //과정, 레벨, 미션에 맞는 페어 매칭 결과가 있으면 반환 (없으면 null)
    public Pair findPair(String course, String mission) {
        for (int i = 0; i < pairs.size(); i++) {
            Pair pair = pairs.get(i);
            if (pair.getMission().equals(mission) && pair.getCourse().equals(course)) {
                return pair;
            }
        }
        return null;
    }

    //O가 겹치는 부분이 있는지 검사. But!!! 아직 구현이 안 됐음
    public boolean validatePair(List<String> shuffledCrew, String[] mission) {
        String level = mission[1];
        int index = Integer.parseInt(String.valueOf(level.charAt(2))) - 1;

        //과정과 레벨에 맞는 OX 2차원 표가 나옴
        if (mission[0].equals("백엔드")) {
            backendLevelPairs.get(index);
        }
        if (mission[0].equals("프론트엔드")) {
            frontendLevelPairs.get(index);
        }

        //일치하는 게 없으면(매칭한 적 없다면) false 반환
        return false;
    }
}
