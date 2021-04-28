import java.util.ArrayList;
import java.util.Collections;
public class EmbaralhadorPalavraUm implements Embaralhador{


    //Coloca palavaras em um ArrayList e embaralha as palavras e retorna a palavara em uma String no final
    @Override
    public String embaralhar(String palavra) {
        int tamanho = palavra.length();
        ArrayList<String> lista = new ArrayList<String>();

        for (int i=0; i < palavra.length(); i++)
        {
            lista.add(palavra.substring(i, i+1));
        }

        Collections.shuffle(lista);

        String novaPalavra= palavra.substring(1, 1);

        for (int i=0; i<tamanho ; i++)
        {
            novaPalavra += lista.get(i);
        }
        return novaPalavra;

    }

    @Override
    public String toString() {
        return "Embaralhador da palavra Um";
    }

}