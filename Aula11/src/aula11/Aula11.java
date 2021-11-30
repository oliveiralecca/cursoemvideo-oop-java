package aula11;
public class Aula11 {
    public static void main(String[] args) throws Exception {
        //Pessoa p1 = new Pessoa(); => classe abstrata não pode ser instanciada

        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(30);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Luis");
        a1.setMatricula(1111);
        a1.setCurso("SI");
        a1.setIdade(25);
        a1.setSexo("M");
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(2222);
        b1.setNome("Bernardo");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
    }
}
