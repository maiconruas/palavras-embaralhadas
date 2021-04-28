public class FabricaDeEmbaralhador {

    // Retorna um embaralhador aleatóriamente.
    public Embaralhador getEmbaralhadorAleatorio()
    {
        int random = (int) (Math.random() * 2);
        if (random == 0)
        {
            return  new EmbaralhadorPalavraUm();
        } else
        {
            return new EmbaralhadorPalavraDois();
        }

    }
}
