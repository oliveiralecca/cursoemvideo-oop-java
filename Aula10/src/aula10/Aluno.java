package aula10;
public class Aluno extends Pessoa {
  //atributos
  private int matr;
  private String curso;

  //métodos
  public void cancelarMtr() {
    System.out.println("A matrícula será cancelada!");
  }

  //getters e setters
  public int getMatr() {
    return matr;
  }
  public void setMatr(int matr) {
    this.matr = matr;
  }

  public String getCurso() {
    return curso;
  }
  public void setCurso(String curso) {
    this.curso = curso;
  }  
}
