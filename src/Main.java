import primeiraQuestao.Animal;
import primeiraQuestao.Cavalo;
import primeiraQuestao.Leao;
import segundaQuestao.Cirugiao;
import segundaQuestao.ClinicoGeral;
import segundaQuestao.Medico;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int escolha = -1;
        System.out.println("----------- Inicio do programa ------------");
        while (escolha != 0) {
            System.out.println("Escolha a questao que quer resolver:\n[1] Questao 01\n[2] Questao 02");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    primeiraQuestao();
                    break;
                case 2:
                    segundaQuestao();
                    break;
                case 0:
                    System.out.println("Tchau");
                    break;
                default:
                    System.out.println("Digite um número válido");
            }
        }

        System.out.println("Fim");

    }

    public static void primeiraQuestao() {
        Animal cacaco = new Animal();
        Cavalo poltrao = new Cavalo();
        Leao miau = new Leao();

        declararNovoAnimal(cacaco, "animal");
        declararNovoAnimal(poltrao, "cavalo");
        declararNovoAnimal(miau, "leao");

        System.out.println("Digite a raca do cavalo: ");
        poltrao.setRaca(sc.nextLine());

        System.out.println("Digite se o leao tem juba:\n[1] SIM \n[2] Não");
        int tc = sc.nextInt();
        sc.nextLine();

        switch (tc) {
            case 1:
                miau.setJuba(true);
                break;
            case 2:
                miau.setJuba(false);
                break;
            default:
                System.out.println("numero invalido");
        }

        System.out.println(cacaco.getCor());
        cacaco.comer();

        System.out.println(poltrao.getCor());
        poltrao.comer();
        poltrao.fugir();

        System.out.println(miau.getCor());
        if (miau.getJuba()) {
            System.out.println("que leao bonito");
        } else {
            System.out.println("acho que e uma leoa");
        }
        miau.cacar();
        miau.comer();

    }

    public static void declararNovoAnimal(Animal a, String tipo) {
        System.out.println("Digite o tamanho do " + tipo + ": ");
        a.setTamanho(sc.nextFloat());
        sc.nextLine();

        System.out.println("Digite a cor do " + tipo + ": ");
        a.setCor(sc.nextLine());
        a.comer();
    }


    private static void segundaQuestao() {
        Medico atila = new Medico();
        ClinicoGeral carol = new ClinicoGeral();
        Cirugiao rog =  new Cirugiao();

        declararNovoMedico(atila, "Medico");
        declararNovoMedico(carol, "Clinico Geral");
        declararNovoMedico(rog, "Cirugiao");

        System.out.println("O clinico Geral atende em Casa? (true/false)");
        boolean atndCasa = sc.nextBoolean();
        sc.nextLine();

        carol.setAtendeEmCasa(atndCasa);

        atila.tratarPaciente();
        carol.receitar();
        rog.tratarPaciente();
        rog.fazerIncisao();
    }

    private static void declararNovoMedico(Medico m, String tipo){
        System.out.printf("O %s trabalho no Hospital? (true/false)", tipo);

        boolean trabHosp = sc.nextBoolean();
        sc.nextLine();
        m.setTrabalhaNoHospital(trabHosp);
    }

}
