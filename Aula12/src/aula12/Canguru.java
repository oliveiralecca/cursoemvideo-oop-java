package aula12;
public class Canguru extends Mamifero {
  @Override
  public void locomover(){
    System.out.println("Saltando...");
  } //sobreposição da sobreposição (em Mamífero, que já sobrepõe Animal)

  public void usarBolsa() {
    System.out.println("Usando bolsa...");
  }
}
