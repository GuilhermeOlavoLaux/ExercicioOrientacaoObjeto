public class Main {

    public static void main(String[] args) {

        Video[] aula = new Video[3];
        aula[0] = new Video("Aula 1 de Orientação Objetos");
        aula[1] = new Video("Aula 2 de Orientação Objetos");
        aula[2] = new Video("Aula 3 de Orientação Objetos");


        Inscrito[] Usuario = new Inscrito[2];
        Usuario[0] = new Inscrito("Guilherme", 21, "Masculino", "Laux");
        Usuario[1] = new Inscrito("Arthur", 24, "Masculino", "Arth");

        System.out.println(aula[0]);
        System.out.println(Usuario[1]);


    }
}
