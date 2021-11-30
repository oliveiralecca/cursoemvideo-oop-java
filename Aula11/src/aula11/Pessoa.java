package aula11;
//classe abstrata => não pode ser instanciada, não pode gerar objetos
public abstract class Pessoa {
  //atributos
  private String nome, sexo;
  private int idade;

  //métodos
  public final void fazerAniversario() {
    this.idade++;
  } //método final não pode ser sobreposto (em suas subclasses, por exemplo)

  @Override
  public String toString() {
    return "Dados [nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + "]";
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
