import static java.lang.Math.min;

public class Personagem {
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    
    
    /*construtor padrao: lista de parametros vazia*/
    Personagem(int energia, int fome, int sono){
        if (energia >= 0 && energia <= 10)
        this.energia = energia;
        if (fome >= 0 && fome <= 10)
        this.fome = fome;
        if (sono >= 0 && sono <= 10) 
        this.sono = sono;

        System.out.println("Construindo um objeto...");
    }




    void cacar() {
        if (energia >= 2){
        System.out.println(nome + " cacando");
        energia -= 2;
        }
        else {
            System.out.println(nome + " sem energia para cacar");
        }
        fome = min(fome + 1, 10);
        sono = min(sono + 1, 10);
        System.out.println(obterEstado());
    }

    void comer() {
        if (fome >= 1) {
        System.out.print(nome + " comendo\n");

        energia = min(energia + 1, 10);
        fome -= 1;
        }
        else {
            System.out.println(nome + " sem fome");
        }
        System.out.println(obterEstado());
    }

    void dormir() {
        if (sono >= 1) {
            //%n serve para pular linha em todos os SO's
            System.out.printf("%s dormindo%n", nome);
            energia = energia + 1 < 10 ? energia + 1 : 10;
            sono--;
        }
        else {
            System.out.println(nome + " sem sono");
        }
        System.out.println(obterEstado());
    }

    String obterEstado() {
        return String.format(("e(%d), s(%d), f(%d)"), energia, sono, fome);
    }
} 