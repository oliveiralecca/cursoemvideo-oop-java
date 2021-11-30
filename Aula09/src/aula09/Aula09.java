package aula09;
public class Aula09 {
    public static void main(String[] args) throws Exception {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo Java", "JP da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Matheus Zeenox", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Lorena Burck", 800, p[0]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
}
