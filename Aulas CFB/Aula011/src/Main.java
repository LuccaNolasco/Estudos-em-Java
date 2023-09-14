import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Main{
    public static void main(String[]args){
       Scanner cin=new Scanner(System.in);
       int cont=0;
       float altura,peso;
       Pessoa p1= new Pessoa(++cont);
       Pessoa p2= new Pessoa(++cont);
        System.out.println("Insira a altura da pessoa 1");
        altura=cin.nextFloat();
        p1.setAltura(altura);
        System.out.println("Insira o peso da pessoa 1");
        peso=cin.nextFloat();
        p1.setPeso(peso);
        System.out.println("Insira a altura da pessoa 2");
        altura=cin.nextFloat();
        p2.setAltura(altura);
        System.out.println("Insira o peso da pessoa 2");
        peso=cin.nextFloat();
        p2.setPeso(peso);

        System.out.printf("Pessoa 1\nPeso: %.2fkg\nAltura: %.2fm\n",p1.getPeso(),p1.getAltura());
        System.out.printf("Pessoa 2\nPeso: %.2fkg\nAltura: %.2fm\n",p2.getPeso(),p2.getAltura());
        cin.close();
    }
}