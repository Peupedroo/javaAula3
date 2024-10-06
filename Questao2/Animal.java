public class Animal {
    protected String nome;
    protected String raca;


    public void setRaca(String raca) {
        this.raca = raca;
    }

    public  Animal ( String nome ) {
        this.nome = nome;
    }

    public void caminha (){
        System.out.println(this.nome + "esta caminhando");
    }


}
