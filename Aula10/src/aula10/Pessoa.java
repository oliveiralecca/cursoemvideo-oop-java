package aula10;
public class Pessoa {
  //atributos
  private String nome, sexo;
  private int idade;

  //métodos
  public void fazerAniv() {
    this.setIdade(this.getIdade() + 1);
  }

  @Override
  public String toString() {
    return "Pessoa [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
  }

  //getters e setters
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }  
}
