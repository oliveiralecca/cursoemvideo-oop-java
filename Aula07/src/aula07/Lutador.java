package aula07;
public class Lutador {
  //atributos
  private String nome, nacionalidade, categoria;
  private int idade, vitorias, derrotas, empates;
  private float altura, peso;

  //construtor
  public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
    this.nome = no;
    this.nacionalidade = na;
    this.idade = id;
    this.altura = al;
    this.setPeso(pe);
    this.vitorias = vi;
    this.derrotas = de;
    this.empates = em;
  }

  //getters e setters
  public String getNome() {
    return nome;
  }
  public void setNome(String no) {
    this.nome = no;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }
  public void setNacionalidade(String na) {
    this.nacionalidade = na;
  }

  public int getIdade() {
    return idade;
  }
  public void setIdade(int id) {
    this.idade = id;
  }

  public float getAltura() {
    return altura;
  }
  public void setAltura(float al) {
    this.altura = al;
  }

  public float getPeso() {
    return peso;
  }
  public void setPeso(float pe) {
    this.peso = pe;
    this.setCategoria();
  }

  public String getCategoria() {
    return categoria;
  }
  private void setCategoria() {
    if (this.getPeso() < 52.2) {
      this.categoria = "Inválido";
    } else if (this.getPeso() <= 70.3) {
      this.categoria = "Leve";
    } else if (this.getPeso() <= 83.9) {
      this.categoria = "Médio";
    } else if (this.getPeso() <= 120.2) {
      this.categoria = "Pesado";
    } else {
      this.categoria ="Inválido";
    }   
  }

  public int getVitorias() {
    return vitorias;
  }
  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }

  public int getDerrotas() {
    return derrotas;
  }
  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }

  public int getEmpates() {
    return empates;
  }
  public void setEmpates(int empates) {
    this.empates = empates;
  }

  //métodos
  public void apresentar() {
    System.out.println("---------- APRESENTAÇÃO ----------");
    System.out.println("Lutador: " + this.getNome());
    System.out.println("Origem: " + this.getNacionalidade());
    System.out.println(this.getIdade() + " anos");
    System.out.println(this.getAltura() + " m de altura");
    System.out.println("Pesando " + this.getPeso() + " kg");
    System.out.println("Ganhou: " + this.getVitorias());
    System.out.println("Perdeu: " + this.getDerrotas());
    System.out.println("Empatou: " + this.getEmpates());
    System.out.println("----------------------------------");
  }

  public void status() {
    System.out.println("----------------------------------------------------------------------");
    System.out.print(this.getNome());
    System.out.print(" é um peso " + this.getCategoria() + ", ");
    System.out.print(this.getVitorias() + " vitórias, ");
    System.out.print(this.getDerrotas() + " derrotas e ");
    System.out.println(this.getEmpates() + " empates.");
    System.out.println("----------------------------------------------------------------------");
  }

  public void ganharLuta() {
    this.setVitorias(this.getVitorias() + 1);
  }

  public void perderLuta() {
    this.setDerrotas(this.getDerrotas() + 1);
  }

  public void empatarLuta() {
    this.setEmpates(this.getEmpates() + 1);
  }
}
