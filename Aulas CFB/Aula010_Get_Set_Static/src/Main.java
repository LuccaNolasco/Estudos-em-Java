import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin=new Scanner (System.in);

        int cont=0,debuff;

        Classe.pontos();

        Classe j1 = new Classe(++cont);
        Classe j2 = new Classe(++cont);

        //System.out.println(j1.atk); Não funciona pois está private

        System.out.printf("Ataque do jogador 1 = %d\n",j1.getAtk());
        System.out.printf("Ataque do jogador 2 = %d\n",j2.getAtk());

        System.out.println("Insira um debuff de ataque ao J1:");
        debuff= cin.nextInt();
        j1.setAtkDebuff(debuff);
        j1.info();
        j2.info();
        System.out.println("Numero de jogadores até agora "+Classe.nJogadores);
        cin.close();
    }
}