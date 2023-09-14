public class Pessoa {
    private int num;
    private float altura, peso;
    public Pessoa(int n){
        this.num = n;
        System.out.printf("Pessoa de número %d criada \n",num);
    }

    public void setAltura(float n){
        altura = n;
    }
    public float getAltura(){
        return altura;
    }

    public void setPeso(float n){
        peso = n;
    }

    public float getPeso(){
        return peso;
    }
}
