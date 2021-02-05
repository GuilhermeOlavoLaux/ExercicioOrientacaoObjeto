public class Visualizacao {
    private Inscrito espectador;
    private Video filme;


    public Visualizacao(Inscrito espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(espectador.getTotAssistido() +1);
        this.filme.setViews(filme.getViews() +1);
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);

    }

    public void avaliar(float porcentagem) {
        int tot = 0;
        if (porcentagem <= 20) {
            tot = 3;
        } else if (porcentagem <= 50) {
            tot = 5;
        } else if (porcentagem <= 90) {
            tot = 8;
        } else if (porcentagem <= 100) {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }



    public Inscrito getEspectador() {
        return espectador;
    }

    public void setEspectador(Inscrito espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }




}
