public class Personagem {
    String nome;
    int energia;
    int fome;
    int sono;

    void cacar() {
        System.out.println(nome + " cacando");
    }

    void comer() {
        System.out.print(nome + " comendo\n");
    }

    void dormir() {
        //%n serve para pular linha em todos os SO's
        System.out.printf("%s dormindo%n", nome);
    }
} 