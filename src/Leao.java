package primeiraQuestao;

public class Leao extends Animal {
    private boolean juba;

    public boolean getJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }

    public void cacar() {
        System.out.println("estou cacando");
    }

    @Override
    public void comer() {
        System.out.println("Nham nahm! que cavalo gostoso");
    }
}
