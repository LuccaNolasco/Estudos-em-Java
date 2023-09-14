import java.util.*;
public class Aula_7 {
    public static void main(String[]args){
        Scanner cin = new Scanner(System.in);
        int []num=new int[5];
        int []numeros=new int[5];
        int p=2;
        char []let=new char[10];

        //For para receber os valores:
        for(int i=0;i<5;i++){
            System.out.printf("Insira o valor da casa %d: ",i);
            num[i]=cin.nextInt();
        }

        Arrays.sort(num);
        Arrays.fill(let,'c');
        System.arraycopy(num,0,numeros,0,4);

        /* For padrão:
        for(int i=0;i<5;i++){
            System.out.printf("O valor da casa %d é: %d\n", i, num[i]);
        }*/

        //For Simplificado para leitura de Arrays:
        /*
        for (int n:num) {
            System.out.printf("%d - ", n);
        }
        for(char n:let){
            System.out.println(n + " - ");
        }
        for(int n:numeros){
            System.out.println(n+" : ");
        }
        */

        System.out.println("Os arrays são iguais?" + (Arrays.equals(num,numeros)? "Sim":"Não"));
        if (Arrays.equals(num,numeros)){
            System.out.println("Entrou no if");
        }
        System.out.println(Arrays.binarySearch(num,p));


    }
}