package aula10;
public class Professor extends Pessoa {
  //atributos
  private String especialidade;
  private float salario;

  //métodos
  public void receberAum(float aum) {
    this.setSalario(this.getSalario() + aum);
  }

  //getters e setters
  public String getEspecialidade() {
    return especialidade;
  }
  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public float getSalario() {
    return salario;
  }
  public void setSalario(float salario) {
    this.salario = salario;
  }  
}
