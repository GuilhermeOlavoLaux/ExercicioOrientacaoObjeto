public class Main {

    public static void main(String[] args) {

        Video[] aula = new Video[6]; // criando um vídeo
        aula[0] = new Video("Aula 1 de Orientação Objetos");
        aula[1] = new Video("Aula 2 de Orientação Objetos");
        aula[2] = new Video("Aula 3 de Orientação Objetos");


        Inscrito[] usuario = new Inscrito[6]; // criando um inscrito
        usuario[0] = new Inscrito("Guilherme", 21, "Masculino", "ex");
        usuario[1] = new Inscrito("Arthur", 24, "Masculino", "ex2");

        Visualizacao[] view = new Visualizacao[6]; //criando a visualização de um inscrito em um vídeo
        view[0] = new Visualizacao(usuario[0], aula[2]);

        view[0].avaliar(9); // avaliação do vídeo assistido pelo usuário Guilherme


        System.out.print("Vídeo: ");
        System.out.println(aula[2]);
        System.out.print("Quem esta assistindo: ");
        System.out.println(usuario[0]);
        System.out.print("Usuario inscrito: ");
        System.out.println(view[0]);





    }
}
