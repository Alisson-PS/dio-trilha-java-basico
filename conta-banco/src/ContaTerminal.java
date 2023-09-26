import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TO_DO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero = 1021;
        double saldo = 999.99;
        //Exibir mensagens para nosso usuario
        System.out.println("Por favor, digite sua agencia: ");
        String agencia = scanner.next();
        //Obter pela scanner os valores digitados no termianal
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        //Exibir a mensagem "conta criada"
        System.out.println("Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque.");
            
        }
    

    }
