class Animal {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void mover() {
        if ("sapo".equals(especie)) {
            nadar();
            pular();
        } else if ("macaco".equals(especie)) {
            subirEmArvores();
            pular();
        } else {
            System.out.println("Comportamento desconhecido para a espécie: " + especie);
        }
    }

    private void nadar() {
        System.out.println("Nadando");
    }

    private void pular() {
        System.out.println("Pulando");
    }

    private void subirEmArvores() {
        System.out.println("Subindo em árvores");
    }
}