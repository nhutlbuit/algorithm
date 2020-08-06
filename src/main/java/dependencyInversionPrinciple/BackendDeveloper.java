package dependencyInversionPrinciple;

public class BackendDeveloper implements Developer {

    @Override
    public void develop() {
        codeJava();
    }

    private void codeJava() {};
}
