package segundaQuestao;

public class ClinicoGeral extends Medico {

        private boolean atendeEmCasa;

        public boolean getAtendeEmCasa(){
            return atendeEmCasa;
        }

        public void setAtendeEmCasa(boolean atendeEmCasa){
            this.atendeEmCasa = atendeEmCasa;
        }

        public void receitar(){
            System.out.println("Aqui está sua receita");
        }



}
