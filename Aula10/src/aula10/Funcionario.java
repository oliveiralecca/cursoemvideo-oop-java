package aula10;
public class Funcionario extends Pessoa {
  //atributos
  private String setor;
  private boolean trabalhando;

  //métodos
  public void mudarTrabalho() {
    setTrabalhando(!(this.getTrabalhando()));
  }

  //getters e setters
  public String getSetor() {
    return setor;
  }
  public void setSetor(String setor) {
    this.setor = setor;
  }

  public boolean getTrabalhando() {
    return trabalhando;
  }
  public void setTrabalhando(boolean trabalhando) {
    this.trabalhando = trabalhando;
  } 
}
