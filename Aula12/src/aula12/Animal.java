package aula12;
//classe abstrata não pode ser instanciada
public abstract class Animal {
  protected float peso;
  protected int idade, membros;

  //para utilizar métodos abstratos, a classe também deve ser abstrata (também utilizados em Interfaces)
  public abstract void locomover();
  public abstract void alimentar();
  public abstract void emitirSom();

  public float getPeso() {
    return peso;
  }
  public void setPeso(float peso) {
    this.peso = peso;
  }

  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getMembros() {
    return membros;
  }
  public void setMembros(int membros) {
    this.membros = membros;
  } 
}
