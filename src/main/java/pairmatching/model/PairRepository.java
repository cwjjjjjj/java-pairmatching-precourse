package pairmatching.model;

import java.util.ArrayList;
import java.util.List;

public class PairRepository {
    private List<Pair> pairs = new ArrayList<>();

    public Pair findPair(String course, String mission) {
        for (int i = 0; i < pairs.size(); i++) {
            Pair pair = pairs.get(i);
            if (pair.getMission().equals(mission) && pair.getCourse().equals(course)) {
                return pair;
            }
        }
        return null;
    }

    public boolean validatePair(List<String> shuffledCrew, String[] mission) {
        for (int i = 0; i < pairs.size(); i++) {
            Pair pair = pairs.get(i);
            if (pair.getLevel().equals(mission[1])) {

            }
        }
        return false;
    }
}
