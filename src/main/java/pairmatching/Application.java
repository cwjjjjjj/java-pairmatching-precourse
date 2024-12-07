package pairmatching;

import pairmatching.controller.CrewController;
import pairmatching.controller.MatchingController;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        CrewController crewController = new CrewController();
        MatchingController matchingController = new MatchingController();
        crewController.readCrews();
        matchingController.run();
    }
}
