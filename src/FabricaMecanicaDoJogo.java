import java.io.IOException;

//retorna a MecanicaDoJogo que deve ser utilizada
public class FabricaMecanicaDoJogo {

    public MecanicaDoJogo getMecanicaFacil () throws IOException
    {
        return new NivelFacil();
    }

    public MecanicaDoJogo getMecanicaDificil () throws IOException
    {
        return new NivelDificil();
    }
}
