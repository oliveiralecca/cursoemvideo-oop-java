package aula09;
public class Pessoa {
  //atributos
  private String nome, sexo;
  private int idade;

  //método construtor
  public Pessoa(String nome, int idade, String sexo) {
    this.nome = nome;
    this.sexo = sexo;
    this.idade = idade;
  }

  //métodos
  public void fazerAniver(){
    this.setIdade(this.getIdade() + 1);
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
