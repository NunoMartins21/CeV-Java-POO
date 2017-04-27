package aula14b;

public class ExercicioFinal {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, 'M', "juba");
        g[1] = new Gafanhoto("Creuza", 12, 'F', "creuzita");
        
        Visualizacao vi[] = new Visualizacao[2];
        vi[0] = new Visualizacao(g[0], v[2]); // Jubileu assiste HTML
        vi[0].avaliar();
        vi[1] = new Visualizacao(g[0], v[1]); // Jubileu assiste PHP
        vi[1].avaliar(87.0f);
        
        for (Visualizacao vis : vi) {
            System.out.println(vis.toString());
        }
        
        
        /* for (Video vi : v) {
            System.out.println(vi.toString());
        }
        
        System.out.println("------------------------------------------");
        
        for (Gafanhoto ga : g) {
            System.out.println(ga.toString());
        } */
    }
    
}
