public class Gerente extends Funcionario{
    String projeto;


    public void setProjeto (String projeto) {
        this.projeto = projeto;
    }

    public String getProjeto() {
        return projeto;
    }
    public String informarProjeto() {
        return getProjeto();
    }
}
