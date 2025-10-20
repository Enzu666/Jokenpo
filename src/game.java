import java.util.Random;
import java.util.Scanner;
public class game {
    int escolha1;
    private Scanner leitor = new Scanner(System.in);

    public void ReceberDados() {
        System.out.println("---------------------------------");
        System.out.println("----------**INICIANDO**----------");
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Escolha uma opção:");
        System.out.println();
        System.out.println("(1) PEDRA");
        System.out.println("(2) PAPEL");
        System.out.println("(3) TESOURA");
        System.out.print("Digite sua escolha: ");

        if (leitor.hasNextInt()) {
            escolha1 = leitor.nextInt();
        } else {
            System.out.println("Entrada inválida. Encerrando rodada.");
            leitor.next();
            escolha1 = 0;
        }

        SituarCondicao();
    }

    public void SituarCondicao() {
        if (escolha1 == 1) {
            System.out.println("você escolheu PEDRA");
        } else if (escolha1 == 2) {
            System.out.println("você escolheu PAPEL");
        } else if (escolha1 == 3) {
            System.out.println("você escolheu TESOURA");
        }

        if (escolha1 >= 1 && escolha1 <= 3) {
            SituarCondicaoDaMaquina();
        }
    }

    public void SituarCondicaoDaMaquina() {
        Random random = new Random();

        int numeroInteiro = random.nextInt(3) + 1;

        System.out.println("máquina escolheu " + numeroInteiro);

        if (escolha1 == 1 && numeroInteiro > 1 && numeroInteiro < 3) {
            System.out.println("Ah, que pena! você perdeu!");

        } else if (escolha1 == 2 && numeroInteiro == 3) {
            System.out.println("Ah, que pena! você perdeu!");

        } else if (escolha1 == 3 && numeroInteiro < 2) {
            System.out.println("Ah, que pena! você perdeu!");

        } else if (escolha1 == 1 && numeroInteiro > 2) {
            System.out.println("PARABÉNS, VOCÊ GANHOU!");

        } else if (escolha1 == 2 && numeroInteiro == 1) {
            System.out.println("PARABÉNS, VOCÊ GANHOU!");

        } else if (escolha1 == 3 && numeroInteiro > 1 && numeroInteiro < 3) {
            System.out.println("PARABÉNS, VOCÊ GANHOU!");

        } else if (escolha1 == 3 && numeroInteiro == 3) {
            System.out.println("EMPATE");

        } else if (escolha1 == 2 && numeroInteiro == 2) {
            System.out.println("EMPATE");

        } else if (escolha1 == 1 && numeroInteiro == 1) {
            System.out.println("EMPATE");
        }

    }

    public void IniciarJogo() {
        char continuar;
        do {
            ReceberDados();

            System.out.println("---------------------------------");
            System.out.print("Deseja jogar novamente? (S/N): ");

            String input = leitor.next();
            if (input.isEmpty()) {
                continuar = 'N';
            } else {
                continuar = Character.toUpperCase(input.charAt(0));
            }

        } while (continuar == 'S');

        System.out.println("---------------------------------");
        System.out.println("Jogo encerrado. Até a próxima!");
    }
}
//professor, peço perdão pelo atraso,
// espero que receba a atividade, lembrando que eu precisei me ausentar
// por motivos pessoais, foi algo inesperado e, por isso,
// não consegui avisar com antecedência. Prefiro não entrar em
// detalhes, mas gostaria que soubesse que minha ausência não foi por
// descaso ou falta de compromisso com a disciplina. Mesmo tendo faltado,
// me preocupei em fazer a atividade em casa, sozinho, para não ficar para
// trás. Entendo que existem regras, mas gostaria de saber se há alguma
// possibilidade de considerar ou remanejar a avaliação. Agradeço pela compreensão.