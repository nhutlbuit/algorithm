package dependencyInversionPrinciple;

public class FrontendDeveloper implements Developer {
    @Override
    public void develop() {
        codeAngular();
    }

    private void codeAngular() {};
}
