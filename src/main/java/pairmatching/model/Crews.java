package pairmatching.model;

import java.util.ArrayList;
import java.util.List;

public class Crews {
    private List<Crew> backendCrews = new ArrayList<>();
    private List<Crew> frontendCrews = new ArrayList<>();

    public void addBackendCrew(Crew crew) {
        backendCrews.add(crew);
    }

    public void addFrontendCrew(Crew crew) {
        frontendCrews.add(crew);
    }

    public List<String> getBackendCrewsName() {
        List<String> backendCrewsName = new ArrayList<>();
        for (int i = 0; i < backendCrews.size(); i++) {
            backendCrewsName.add(backendCrews.get(i).getName());
        }
        return backendCrewsName;
    }

    public List<String> getFrontendCrewsName() {
        List<String> frontendCrewsName = new ArrayList<>();
        for (int i = 0; i < frontendCrews.size(); i++) {
            frontendCrewsName.add(frontendCrews.get(i).getName());
        }
        return frontendCrewsName;
    }
}
