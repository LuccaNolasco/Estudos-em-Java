public class Aula_3{
    public static void main(String[]args){
        //if, if...else, ?, switch case
        int nota=70,faltas=10, media=70,resultado;
        String res;

        //Ternário
        resultado= nota>=media? 1 : 0;
        res=(nota >= media? "Aprovado" : "Reprovado");//Operação ternária

        System.out.println("Res: " + res );
        System.out.println("Resultado: " + (resultado == 1? "Aprovado" : "Reprovado"));

        //If... else
        if(nota>=70 && faltas < 11 ){
            System.out.println("Aprovado!");
        }else if(nota>28 && faltas<11){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }

        //Switch
        int pos=6;
            switch(pos){
                case 1:
                    System.out.println("Primeiro Lugar");
                    break;
                case 2:
                    System.out.println("Segundo Lugar");
                    break;
                case 3: case 4: case 5:
                    System.out.println("Premio de Participaxion");
                    break;
                default:
                    System.out.println("Nadica");
                    break;
            }

        System.out.println("Fim do programa");
    }//fim do método
}//fim da classe