package aula14;
public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", "M", 22, "juba");
        g[1] = new Gafanhoto("Creuza", "F", 15, "creuzita");

        Visualizacao vis = new Visualizacao(g[0], v[2]);
        vis.avaliar();

        System.out.println("VÍDEOS\n------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println("\nVISUALIZAÇÃO\n------------------------");
        System.out.println(vis.toString());
    }
}
