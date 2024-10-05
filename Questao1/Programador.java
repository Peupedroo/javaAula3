public class Programador extends Funcionario{
    String linguagem ;

    public void setLinguagem(String linguagem ){
        this.linguagem = linguagem;
    }
    public String getLinguagem (){
        return linguagem;
    }

    public String informarLinguagem() {
        return getLinguagem();
    }
}
