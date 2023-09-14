import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seletora seletora = new Seletora();

        System.out.print("Digite 1 para Cachorro ou 2 para Gato: ");
        int valor = scanner.nextInt();

        Object objetoSelecionado = seletora.selecionarClasse(valor);//Seletora em minúsuclo=objeto

        if (objetoSelecionado instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) objetoSelecionado;
            cachorro.latir();
        } else if (objetoSelecionado instanceof Gato) {
            Gato gato = (Gato) objetoSelecionado;
            gato.miar();
        } else {
            System.out.println("Valor não reconhecido. Escolha 1 para Cachorro ou 2 para Gato.");
        }

        scanner.close();
    }
}
