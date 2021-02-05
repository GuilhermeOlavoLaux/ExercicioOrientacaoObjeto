public class Inscrito extends Pessoa{
    private String login;
    private int totAssistido;


    public Inscrito(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo, login);
        this.login = login;
        this.totAssistido = 0;

    }

    @Override
    public String toString() {
        return "Inscrito{" + super.toString()+
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
