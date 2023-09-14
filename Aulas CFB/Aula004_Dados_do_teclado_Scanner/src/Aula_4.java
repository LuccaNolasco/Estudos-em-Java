import java.util.*;
public class Aula_4{
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);
        float n1,n2,n3,media;
        int faltas;
        String nome;
        System.out.print("Insiro nome:  ");
        nome=teclado.nextLine();

        System.out.println("Insira as 3 notas");
        n1=teclado.nextFloat();
        n2=teclado.nextFloat();
        n3=teclado.nextFloat();

        media=(n1+n2+n3)/3;

        System.out.print("Insira as faltas do aluno: ");
        faltas=teclado.nextInt();

        if(faltas<=10){
            if (media>=7){
                System.out.printf("O(a) aluno(a) %s foi aprovado(a) com média %f", nome, media);
            } else{
                System.out.printf("Recuperação pois a média foi %f",media);
            }
        } else{
            System.out.println("Reprovado por falta");
        }

    }//fim do método
}