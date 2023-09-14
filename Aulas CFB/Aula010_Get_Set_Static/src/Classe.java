import java.util.Scanner;

public class Classe {
    Scanner cin=new Scanner (System.in);

    private int atk, def, stm,n;
    static int nJogadores;
    static int pontosTotal=0;

    public Classe(int n){
        System.out.printf("Jogador número %d criado,seu ataque:\n",n);
        this.n=n;
        atk= cin.nextInt();
        nJogadores++;
    }
    public int getAtk(){
        return this.atk;
    }
    public void setAtkDebuff(int a ){
            atk-=a;
    }
    public void info(){
        System.out.printf("Atk do jogador %d: %d\n",this.n, this.atk);
        System.out.printf("Numero de jogadores:%d\n",nJogadores);
        System.out.printf("Pontos totais: %d\n",pontosTotal);
        System.out.println("---------------------------------");
    }

    static void pontos(){
        pontosTotal+=10;
    }

}
