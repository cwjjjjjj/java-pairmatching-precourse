package pairmatching.model;

import java.util.List;

public class Pair {
    private Course course;
    private Level level;
    private String mission;
    private List<Crew> matchingResult;

    public Pair(Course course, Level level, String mission, List<Crew> matchingResult) {
        this.course = course;
        this.level = level;
        this.mission = mission;
        this.matchingResult = matchingResult;
    }

    public String getMission() {
        return mission;
    }

    public String getCourse() {
        return course.toString();
    }

    public String getLevel() {
        return level.toString();
    }

    public List<Crew> getMatchingResult() {
        return matchingResult;
    }
}
