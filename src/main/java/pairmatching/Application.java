package pairmatching;

import pairmatching.controller.CrewController;
import pairmatching.controller.MatchingController;
import pairmatching.model.Crews;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        CrewController crewController = new CrewController();
        Crews crews = crewController.readCrews();
        MatchingController matchingController = new MatchingController(crews);
        matchingController.run();
    }
}
