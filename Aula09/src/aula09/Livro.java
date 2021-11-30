package aula09;
public class Livro implements Publicacao {
  //atributos
  private String titulo, autor;
  private int totPaginas, pagAtual;
  private boolean aberto;
  private Pessoa leitor;

  //método construtor
  public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
    this.titulo = titulo;
    this.autor = autor;
    this.totPaginas = totPaginas;
    this.leitor = leitor;
    this.aberto = false;
    this.pagAtual = 0;
  }

  //métodos
  public String detalhes() {
    return "Livro [aberto=" + aberto + "\n, autor=" + autor + "\n, leitor=" + leitor.getNome() + "\n, pagAtual=" + pagAtual + "\n, titulo=" + titulo + "\n, totPaginas=" + totPaginas + "]";
  }

  //getters e setters
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }
  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getTotPaginas() {
    return totPaginas;
  }
  public void setTotPaginas(int totPaginas) {
    this.totPaginas = totPaginas;
  }

  public int getPagAtual() {
    return pagAtual;
  }
  public void setPagAtual(int pagAtual) {
    this.pagAtual = pagAtual;
  }

  public boolean getAberto() {
    return aberto;
  }
  public void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  public Pessoa getLeitor() {
    return leitor;
  }
  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }

  //métodos abstratos da Interface
  @Override
  public void abrir() {
    this.setAberto(true);
  }

  @Override
  public void fechar() {
    this.setAberto(false);
  }

  @Override
  public void folhear(int p) {
    if (p > this.getTotPaginas()) {
      this.setPagAtual(0);
    } else {
      this.setPagAtual(p);
    }    
  }

  @Override
  public void avancarPag() {
    this.setPagAtual(this.getPagAtual() + 1);
  }

  @Override
  public void voltarPag() {
    this.setPagAtual(this.getPagAtual() - 1);
  }  
}
