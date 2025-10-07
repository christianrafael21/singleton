package basquete.singleton;

public class ConfiguracaoBasquete {

    private ConfiguracaoBasquete() {};
    private static ConfiguracaoBasquete instance = new ConfiguracaoBasquete();
    public static ConfiguracaoBasquete getInstance() {
        return instance;
    }

    private String nomeJogador;
    private String equipe;

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
}
