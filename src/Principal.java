import java.io.IOException;
import java.util.Scanner;

public class Principal {


    //É essa classe que é responsável por ler a entrada do usuário e por imprimir as informações no console.
    public static Scanner input = new Scanner(System.in);
    public static int score = 0;

    public static void main(String[] args) throws IOException {


        FabricaMecanicaDoJogo f = new FabricaMecanicaDoJogo();
        boolean MenuInicio = true;
        boolean teste = false;
        int tentativas;




        while(MenuInicio){
            System.out.println("\n MENU");
            System.out.println("1. nivel Facíl");
            System.out.println("2. nivel Difícil");
            System.out.println("3. Total");
            System.out.println("4. Sair");
            String menu = input.nextLine();

            switch (menu)
            {
                case "1":
                    MecanicaDoJogo mFacil = f.getMecanicaFacil();
                    String palavraEscolhida = mFacil.getPalavraEscolhida();
                    String palavraEmbaralhada =mFacil.getPalavraEscolhidaEmbaralhada();

                    System.out.println("\nModo Facíl: \n5 tentativas! \nDica na 3ª tentativa!");
                    System.out.println("\nDigite o significado da palavra : " +palavraEmbaralhada);
                    teste = mFacil.testaPalavra(input.nextLine());
                    tentativas = 1;


                    while(!mFacil.jogoTerminou(tentativas))
                    {
                        System.out.println("\nErrado!");
                        System.out.println("Voce ainda tem " + (5-tentativas) +" tentativas!");
                        if (tentativas >1 && mFacil.temDica())
                        {
                            System.out.println("Dica: " +palavraEscolhida.substring(0, palavraEscolhida.length()/2) + "...");
                        }
                        System.out.println("palavra embaralhada: " +palavraEmbaralhada + "\nTente novamente: ");

                        teste = mFacil.testaPalavra(input.nextLine());
                        tentativas ++;
                        if (tentativas == 5)
                        {
                            System.out.println("Perdeu!. A palavra era: " + palavraEscolhida );
                            score = 0;
                        }


                    }
                    if (teste)
                    {
                        System.out.println("\nParabéns, você acertou na " +tentativas +"ª tentativa !" );
                        score++;
                    }
                    break;

                case "2":
                    MecanicaDoJogo mDificil = f.getMecanicaDificil();
                    String palavraEmbaralhadaH =mDificil.getPalavraEscolhidaEmbaralhada();
                    String palavraEscolhidaH = mDificil.getPalavraEscolhida();

                    System.out.println("\nModo Dificíl: \n3 tentativas! \nSem dicas!");
                    System.out.println("\nDigite o significado da palavra: " +palavraEmbaralhadaH);
                    teste = mDificil.testaPalavra(input.nextLine());
                    tentativas = 1;


                    while(!mDificil.jogoTerminou(tentativas))
                    {
                        System.out.println("\nErrado!");
                        System.out.println("Voce ainda tem " + (3-tentativas) +" tentativas!");
                        System.out.println("palavra embaralhada: " +palavraEmbaralhadaH + "\nTente novamente: ");
                        teste = mDificil.testaPalavra(input.nextLine());
                        tentativas ++;
                        if (tentativas == 3)
                        {
                            System.out.println("Perdeu!. A palavra era: " + palavraEscolhidaH );
                            score = 0;
                        }

                    }
                    if (teste)
                    {
                        System.out.println("\nParabéns, você acertou na " +tentativas +"ª tentativa !" );
                        score++;
                    }
                    break;

                case "3":
                    System.out.println("\nO seu recorde é: " +score);
                    break;

                case "4":
                    MenuInicio = false;

            }

        }

        System.out.println("\nFim.");


    }
}
