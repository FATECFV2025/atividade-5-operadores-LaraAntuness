import java.util.Scanner; 

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Operadores op = new Operadores();

        System.out.print("Digite o primeiro valor: ");
        float a = sc.nextFloat();

        System.out.print("Digite o segundo valor: ");
        float b = sc.nextFloat();

        System.out.println("\nOPERAÇÕES ARITMÉTICAS");
        System.out.println("Adição: " + op.adicao(a, b));
        System.out.println("Subtração: " + op.subtracao(a, b));
        System.out.println("Multiplicação: " + op.multiplicacao(a, b));
        System.out.println("Divisão: " + op.divisao(a, b));

        op.Comparacao(a, b);
        op.Logicos(a, b);
        op.Atribuicao((int) a, (int) b);

        System.out.println("\nATRIBUIÇÃO (Retorno dos métodos originais)");
        System.out.println("Atribuição soma: " + op.atribuirSoma(10, 5));
        System.out.println("Atribuição subtração: " + op.atribuirSubtracao(10, 5));
        System.out.println("Atribuição multiplicação: " + op.atribuirMultiplicacao(10, 5));
        System.out.println("Atribuição divisão: " + op.atribuirDivisao(10, 5));

        System.out.println("\nOPERADORES LÓGICOS");
        System.out.println("E lógico (true && false): " + op.eLogico(true, false));
        System.out.println("OU lógico (true || false): " + op.ouLogico(true, false));
        System.out.println("NÃO lógico (!true): " + op.naoLogico(true));

        System.out.println("\nCOMPARAÇÃO");
        System.out.println("Igual: " + op.igual(10, 10));
        System.out.println("Diferente: " + op.diferente(10, 5));
        System.out.println("Maior: " + op.maior(10, 5));
        System.out.println("Menor: " + op.menor(10, 5));
        System.out.println("Maior ou igual: " + op.maiorOuIgual(10, 10));
        System.out.println("Menor ou igual: " + op.menorOuIgual(5, 10));

        sc.close(); 
    }
}


