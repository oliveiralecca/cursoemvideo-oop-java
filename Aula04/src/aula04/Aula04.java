package aula04;
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 1.5f);
        //Caneta c1 = new Caneta(); => modo normal de instanciar objeto sem construtor ou com construtor sem parâmetros

        c1.setModelo("BIC");
        //c1.modelo = "BIC"; => é possível mudar "modelo" desse jeito pois ele é public

        c1.setPonta(0.5f);
        //c1.ponta = 0.5f; => não é possível mudar "ponta" (private) sem um método modificador (setter)

        c1.status();
        System.out.println("\nPrint do MAIN: Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta() + "\n");

        Caneta c2 = new Caneta("Pilot", 0.7f); //modo de instanciar objeto que tenha construtor com parâmetros
        c2.status();
    }
}
