package basquete.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoBasqueteTest {

    @Test
    public void deveRetornarNomeJogador() {
        ConfiguracaoBasquete.getInstance().setNomeJogador("LeBron James");
        assertEquals("LeBron James", ConfiguracaoBasquete.getInstance().getNomeJogador());
    }

    @Test
    public void deveRetornarEquipe() {
        ConfiguracaoBasquete.getInstance().setEquipe("Lakers");
        assertEquals("Lakers", ConfiguracaoBasquete.getInstance().getEquipe());
    }

}
