import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmbralhamentoTest {
    @Test
    public void testeEmbaralhadorUm() {

        EmbaralhadorPalavraUm e = new EmbaralhadorPalavraUm();
        String s = "teste";
        assertNotEquals(e.embaralhar(s), s);
    }


    @Test
    public void testeEmbaralhadorDois() {

        EmbaralhadorPalavraDois e = new EmbaralhadorPalavraDois();
        String s = "teste";
        assertEquals(e.embaralhar(s), "etset");
    }


}