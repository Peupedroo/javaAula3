//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerente g  = new Gerente();
        Programador p = new Programador();
        boolean verdade;
    do{
        System.out.println("qual o seu nome?");
        p.setNome(scanner.nextLine());

        System.out.println("qual ano vc nasceu ");
        p.setNasc(scanner.nextInt());

        System.out.println("qual o seu salario?");
        p.setSalario(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("qual seu projeto");
        g.setProjeto(scanner.nextLine());

        System.out.println("qual sua linguagem");
        p.setLinguagem(scanner.nextLine());

        System.out.println("seu nome e " + p.getNome());
        System.out.println("seu salario e " + p.getSalario());
        System.out.println("sua idade e " + p.calcularIdade());
        System.out.println("seu projeto e " + g.getProjeto());
        System.out.println("sua linguagem e " + p.getLinguagem());


        System.out.println("Digite se quiser ficar  S : ");
        String continuar = scanner.nextLine();

        if (continuar.equals("S")){
            verdade = true;
        }
        else {
             verdade = false;
        }
    }while (verdade == true);
    }
}