class Seletora {
    public Object selecionarClasse(int valor) {
        if (valor == 1) {
            return new Cachorro();
        } else if (valor == 2) {
            return new Gato();
        } else {
            return null;
        }
    }
}

/* Também é possível usar um método static para não precisar instanciar uma seletora

    public static Object selecionarClasse(int valor) {
        if (valor == 1) {
            return new Cachorro();
        } else if (valor == 2) {
            return new Gato();
        } else {
            return null;
        }
    }

    Nesse caso, no main ficaria:

   int valor = 1; // ou qualquer outro valor
    Object objetoSelecionado = Seletora.selecionarClasse(valor); <- Seletora em maiúsculo= Classe

    if (objetoSelecionado instanceof Cachorro) {
        Cachorro cachorro = (Cachorro) objetoSelecionado;
        cachorro.latir();
    } else if (objetoSelecionado instanceof Gato) {
        Gato gato = (Gato) objetoSelecionado;
        gato.miar();
    } else {
        System.out.println("Valor não reconhecido. Escolha 1 para Cachorro ou 2 para Gato.");
    }

 */