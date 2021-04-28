import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class BancoDePalavras {

    private ArrayList<String> palavras = new ArrayList<String>();

    // Método para lê um palavra e armazena em uma ArrayList
    private void leitor() throws IOException {

        try {
            // Limpa a lista para preencher novamente
            palavras.clear();
            BufferedReader lerArq = new BufferedReader(new FileReader("palavra.txt"));

            // lê a primeira linha
            String linha = lerArq.readLine();
            while (linha != null)
            {
                // adiciona palavra em uma posição da Lista.
                palavras.add(linha.toLowerCase());

                // continua lendo as linhas.
                linha = lerArq.readLine();
            }
            lerArq.close();

        } catch (FileNotFoundException e) {

            System.out.println("Arquivo não encontrado");
        }
    }


    // Retorna lista com palavras lidas.
    private ArrayList <String> getListaPalavras () throws IOException
    {
        this.leitor();
        return palavras;

    }


    //Retorna uma palavra aleatória da lista de palavras do arquivo.txt
    public String getPalavraAleatoria () throws IOException
    {
        // cria uma copia da lista de palavras.
        @SuppressWarnings("unchecked")
        ArrayList<String> palavrasCopia = (ArrayList<String>) getListaPalavras().clone();

        Collections.shuffle(palavrasCopia);
        String a = palavrasCopia.get(0);
        return a;
    }

}
