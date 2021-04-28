import java.util.ArrayList;


//Classe que utiliza um método que coloca cada letra da palavra recebida em um ArrayList, inverte as letras
//na lista e preenche uma nova String com eles, retornando-a no final.
    public class EmbaralhadorPalavraDois implements Embaralhador {

        @Override
        public String embaralhar(String palavra) {

            int tamanho = palavra.length();
            ArrayList<String> lista = new ArrayList<String>();

            // Inverte valores na lista
            for (int i= palavra.length(); i > 0; i--)
            {
                lista.add(palavra.substring(i-1, i));
            }

            String novaPalavra= palavra.substring(1, 1);

            // passa os valores  na lista para a string
            for (int i=0; i<tamanho ; i++)
            {
                novaPalavra += lista.get(i);
            }
            return novaPalavra;
        }


        @Override
        public String toString() {
            return "Embaralhador da palavara Dois";
        }

}
