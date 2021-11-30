package aula04;
public class Caneta {
  public String modelo;
  private float ponta;

  // public Caneta() {
  //   this.setModelo("Pilot");
  //   this.ponta = 0.7f;
  // } //método construtor sem parâmetros => tem o mesmo nome da classe

  public Caneta(String m, float p) {
    this.modelo = m; //acessando diretamente o atributo
    this.setPonta(p); //utilizando setter para acessar o atributo
  } //método construtor com parâmetros

  public String getModelo() {
    return this.modelo;
  }
  public void setModelo(String m) {
    this.modelo = m;
  }

  public float getPonta() {
    return this.ponta;
  }
  public void setPonta(float p) {
    this.ponta = p;
  }

  public void status() {
    System.out.println("STATUS");
    System.out.println("Modelo: " + this.getModelo());
    //System.out.println("Modelo: " + this.modelo);    
    System.out.println("Ponta: " + this.getPonta());
    //System.out.println("Ponta: " + this.ponta);
  }
}
