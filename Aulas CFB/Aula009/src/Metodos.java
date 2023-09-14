import java.util.*;
public class Metodos {
    public static void main (String[]args){
        Scanner cin= new Scanner(System.in);
        String a;
        int n1,n2;
        int []vec=new int[5];
        a= cin.nextLine();
        System.out.println("Agora insira dois inteiros");
        n1=cin.nextInt();
        n2= cin.nextInt();
        saida(a);
        //System.out.println(soma(n1,n2));
        System.out.println("Insira valores quanto quiser somar");
        for(int i=0;i<5;i++){
            vec[i]= cin.nextInt();
        }
        System.out.println(somaQuantos(vec));
    }
    //É possível fazer sobrecarga
    public static int somaQuantos(int... num){
        int soma=0;
        for(int n:num){
            soma+=n;
        }
        return soma;
    }
    public static int soma(int a, int b){
        return a+b;
    }
    public static void saida(String a){
        System.out.println(a);
    }
} 