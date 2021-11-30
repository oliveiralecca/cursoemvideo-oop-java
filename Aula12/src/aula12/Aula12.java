package aula12;
public class Aula12 {
    public static void main(String[] args) throws Exception {
        //Animal n = new Animal(); => classe abstrata não pode ser instanciada
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.3f);
        m.setCorPelo("Cinza");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();

        p.locomover();

        r.locomover();
    }
}
