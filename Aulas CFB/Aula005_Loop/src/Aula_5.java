import java.util.*;
public class Aula_5{
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);
        float preco,total=0,altura;
        int option,idade;

        System.out.println("Insira a opção desejada.\n1- Preço\n2-Altura\n3-Idade");
        option=teclado.nextInt();

        switch (option) {
            case 1:
                //For
                for (int i = 1; i <= 5; i++) {
                    System.out.print("Insira o preço do produto " + i + " : R$");
                    preco = teclado.nextFloat();
                    total += preco;
                }
                System.out.println("O total foi R$" + total);
                break;
            case 2:
                //while
                System.out.print("Insira a altura do aluno. Para terminar, digite 0:");
                altura=teclado.nextFloat();
                while(altura!=0){
                    System.out.print("Insira a altura do aluno. Para terminar, digite 0:");
                    altura=teclado.nextFloat();
                }
                break;
            case 3:
                //Do while
                do{
                    System.out.print("Insira a idade do aluno. Para finalizar. Digite 0 ou menor:");
                    idade=teclado.nextInt();
                }while(idade>0);
                break;
            default:
                System.out.println("Valor inválido");
        }

        System.out.print("Fim do programa");
    }//fim do método
}//fim da classe