import java.io.IOException;

public interface MecanicaDoJogo {

    //Interface que representa o andamento e a lógica do jogo
    public boolean testaPalavra(String tentativa) throws IOException;
    public boolean jogoTerminou (int tentativas);
    public boolean temDica();
    public String getPalavraEscolhida() throws IOException;
    public String getPalavraEscolhidaEmbaralhada() throws IOException;
}
