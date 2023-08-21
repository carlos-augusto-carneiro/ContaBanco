import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        int Numero;
        String Agencia;
        String NomeCliente;
        float Saldo;
        

        System.out.println("Por favor, digite o número da Agência !");
        Agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome !");
        NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo !");
        Saldo = scanner.nextFloat();

        System.out.println("Por favor, digite o numero da sua conta !");
        Numero = scanner.nextInt();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + 
        ", conta " + Numero + "e seu saldo " + Saldo + " já está disponível para saque");

        scanner.close();
    }
}
