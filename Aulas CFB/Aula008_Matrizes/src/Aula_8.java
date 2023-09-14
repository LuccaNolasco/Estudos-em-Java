import java.util.*;
public class Aula_8 {
    public static void main(String[] args) {
        Scanner cin = new Scanner (System.in);
        final int linhas=3, colunas=3;
        int[][]numero=new int[linhas][colunas];
        char [][]let={{'a','b','c'},{'d','E','F'}};

        for(int i=0; i<linhas;i++){
            for(int j=0;j<colunas;j++){
                System.out.print("Número na linha "+i+" e na coluna "+j+" : ");
                numero[i][j]=cin.nextInt();
            }
        }
        for(int i=0; i<linhas;i++){
            for(int j=0;j<colunas;j++){
                System.out.print(numero[i][j]+" ");
            }
            System.out.println();
        }
        //For para impressão de matrizes:
        for(int []n : numero){
            for(int v : n){
                System.out.printf("%3d |", v);
            }
            System.out.print("\n");
        }

        for(char[]a: let){
            for(char b:a){
                System.out.printf("%2c |", b);
            }
            System.out.print("\n");
        }

    }
}
