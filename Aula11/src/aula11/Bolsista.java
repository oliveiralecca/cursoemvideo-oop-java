package aula11;
//classe final => não pode ter filhos, ou seja, nenhuma outra classe pode herdar dela
public final class Bolsista extends Aluno {
  //atributos
  private float bolsa;

  //métodos
  public void renovarBolsa() {
    System.out.println("Renovando bolsa de " + this.getNome() + "...");
  }

  @Override
  public void pagarMensalidade() {
    System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
  }

  //getters e setters
  public float getBolsa() {
    return bolsa;
  }
  public void setBolsa(float bolsa) {
    this.bolsa = bolsa;
  }  
}
