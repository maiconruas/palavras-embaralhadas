import java.io.IOException;

public class NivelDificil implements  MecanicaDoJogo{


    private FabricaDeEmbaralhador f = new FabricaDeEmbaralhador();
    private BancoDePalavras b = new BancoDePalavras();
    private boolean acertou;
    private String palavraEscolhidaAleatoria = b.getPalavraAleatoria();
    private String PalavraEscolhidaEmbaralhada = f.getEmbaralhadorAleatorio().embaralhar(palavraEscolhidaAleatoria);

    public NivelDificil() throws IOException {
    }

    @Override
    public boolean testaPalavra(String tentativa) throws IOException
    {
        if (tentativa.equals(getPalavraEscolhida()))
        {
            acertou = true;
            return true;
        }else
        {
            acertou = false;
            return false;
        }
    }

    @Override
    public boolean jogoTerminou (int tentativas)
    {
        if (tentativas == 3 || acertou )
        {
            return true;
        } else return false;


    }
    @Override
    public boolean temDica()
    {
        return false;
    }

    @Override
    public String getPalavraEscolhida() throws IOException
    {
        return palavraEscolhidaAleatoria;
    }

    public String getPalavraEscolhidaEmbaralhada() throws IOException
    {
        return PalavraEscolhidaEmbaralhada;
    }
}
