public class Main{
    public static void main (String[]args){
        Carro c1=new Carro("Celta");
        Carro c2=new Carro("Corolla");
        CarroCombate c3=new CarroCombate("Uno",100 );
        CarroCombate c4=new CarroCombate("Fusca",50);

        c3.atirar();
        c3.atirar();
        c3.atirar();

        c4.sofrerDano(30);
        c1.sofrerDano(50);

        c1.info();
        c2.info();
        c3.info();
        c4.info();

    }
}