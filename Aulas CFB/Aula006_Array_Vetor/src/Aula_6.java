import java.util.*;
public class Aula_6{
    public static void main(String[]args) {
        Scanner teclado = new Scanner (System.in);
        int nota=0;
        final int tam=5;
        char[] gabarito={'a','a','d','b','c'};
        char[] respostas= new char[tam];
        for(int i=0;i<tam;i++){
            System.out.print("Insira o valor de "+ (i+1) +" :\n");
            respostas[i]=teclado.next().charAt(0);
        }

        for(int i=0;i<tam;i++){
            if(gabarito[i]==respostas[i]){
                nota++;
            }
        }
        System.out.print("A nota do aluno foi: "+nota);
    }
}