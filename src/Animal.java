package primeiraQuestao;

public class Animal {
    protected float tamanho;
    protected String cor;

    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }

    public float getTamanho(){
        return this.tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void comer(){
        System.out.println("Nham nahm! que matinho gostoso");
    }

}
