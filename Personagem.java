public class Personagem {
    private String nome;
    private int energia;
    private int fome;
    private int sono;

    void cacar() {
        system.out.printl(nome + " cacando");
    }

    void comer() {
        System.out.print(nome + " comendo\n");
    }

    void dormir() {
        //%n serve para pular linha em todos os SO's
        System.out.printf("%s dormindo%n", nome);
    }
} 