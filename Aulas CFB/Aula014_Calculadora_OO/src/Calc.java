import java.util.Scanner;
public class Calc {
    static public void main(String[]args) {

        Scanner cin = new Scanner(System.in);
        Numero n1 = new Numero(0);
        Numero n2 = new Numero(0);
        Numero res = new Numero(0);
        String opc="S";
        while(opc.equals("S") || opc.equals("s") {
            System.out.printf("Digite o valor 1: ");
            n1.setValor(cin.nextInt());
            System.out.printf("Digite o valor 2: ");
            n2.setValor(cin.nextInt());

            res.setValor(n1.getValor() + n2.getValor());
            System.out.printf("A soma de %d e %d é: %d\n", n1.getValor(), n2.getValor(), res.getValor());
            System.out.println("Deseja somar outro valor? ");
            opc=cin.next();
        }
        cin.close();
    }
}