package dependencyInversionPrinciple;

import java.util.List;

public class Project {

    private List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void build() {
        developers.forEach(developer -> developer.develop());
    }
}
