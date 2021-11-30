package aula03;
public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();  
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; => atributo privado, não posso alterar daqui 
        c1.carga = 50;  
        //c1.tampada = true; => atributo privado
        c1.status();  
        c1.destampar(); 
        c1.rabiscar();    
    }
}
