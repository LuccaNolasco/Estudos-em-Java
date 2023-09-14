public class Aula_2{
    public static void main(String [] args){
        int num=1;
        String palavra="Palavra!";

        System.out.println("Quebra de Linha ao fim com println");
        System.out.print("Sem Quebra de linha com o print.");
        System.out.print(" Porém, é possível quebrar com contrabarra + n juntos:\n assim");
        System.out.print("\nJá o printf, já permite com formatação. Porém, você deve colocar os tipos dos argumentos\n");
        System.out.printf("%s - %d", "Dessa forma, essa string ocupou o %+s, e o numero à seguir ocupará o %+d",33);
        //É possível misturar
        System.out.printf("\nString anterior: %s + %d \n","string do meio",22);
        System.out.printf("Valor da variável num: %d. Valor da string: %s \n",num,palavra);
    }//fim do método

}//fim da classe