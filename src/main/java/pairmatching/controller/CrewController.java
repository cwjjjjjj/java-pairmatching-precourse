package pairmatching.controller;

import pairmatching.model.Course;
import pairmatching.model.Crew;
import pairmatching.model.Crews;
import pairmatching.view.InputView;

import java.io.IOException;
import java.util.List;

public class CrewController {
    private String backendCrewFileName = "src/main/resources/backend-crew.md";
    private String frontendCrewFileName = "src/main/resources/frontend-crew.md";
    public Crews readCrews() throws IOException {
        Crews crews = new Crews();

        List<String> crewsName = InputView.readFile(backendCrewFileName);
        for (int i = 0; i < crewsName.size(); i++) {
            crews.addBackendCrew(new Crew(Course.BACKEND, crewsName.get(i)));
        }

        crewsName = InputView.readFile(frontendCrewFileName);
        for (int i = 0; i < crewsName.size(); i++) {
            crews.addFrontendCrew(new Crew(Course.FRONTEND, crewsName.get(i)));
        }
        return crews;
    }
}
