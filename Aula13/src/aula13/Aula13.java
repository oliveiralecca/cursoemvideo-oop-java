package aula13;
public class Aula13 {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero();
        m.emitirSom();

        Lobo l = new Lobo();
        l.emitirSom();

        Cachorro c = new Cachorro();
        c.emitirSom();

        c.reagir("Olá");
        c.reagir("Vai apanhar");

        c.reagir(11, 45);
        c.reagir(21, 00);

        c.reagir(false);

        c.reagir(2, 12.5f);
    }
}
