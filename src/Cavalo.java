package primeiraQuestao;

public class Cavalo extends Animal {
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void fugir() {
        System.out.println("Correndo desesperadamente!");
    }

}
