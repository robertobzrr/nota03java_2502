package segundaQuestao;

public class Medico {

        private boolean trabalhoNoHospital;

        public boolean getTrabalhaNoHospital(){
            return trabalhoNoHospital;
        }

        public void setTrabalhaNoHospital(boolean trabalhoNoHospital){
            this.trabalhoNoHospital = trabalhoNoHospital;
        }

        public void tratarPaciente() {
            System.out.println("medicando");
        }


}
