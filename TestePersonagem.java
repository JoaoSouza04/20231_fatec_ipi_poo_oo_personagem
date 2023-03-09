public class TestePersonagem {
    public static void main(String [] args) throws Exception {
        //Personagem p = new Personagem();
        //java 10+
        var p = new Personagem(2, 4, 10);
        p.nome = "Davi Randola";
        while (true) {
            p.cacar();
            Thread.sleep(5000);
            p.comer();
            Thread.sleep(5000);
            p.dormir();
            Thread.sleep(5000);
            p.cacar();
            Thread.sleep(5000);
            p.cacar();
            Thread.sleep(5000);
            p.cacar();
            Thread.sleep(5000);
            System.out.println("=====================================");
            Thread.sleep(5000);

        }
    }
}