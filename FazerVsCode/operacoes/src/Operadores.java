public class Operadores {

    public float adicao(float v1, float v2) {
        return v1 + v2;
    }

    public float subtracao(float v1, float v2) {
        return v1 - v2;
    }

    public float multiplicacao(float v1, float v2) {
        return v1 * v2;
    }

    public float divisao(float v1, float v2) {
        return v1 / v2;
    }

    public void Comparacao(float a, float b) {
        System.out.println("Verificando os valores de a e b:");
        if (a == b) {
            System.out.println("Os números são iguais ");
        } else {
            System.out.println("Eles não são iguais");
        }
    }

    public void Logicos(float a, float b) {
        System.out.println("Operações lógicas:");

        if (a > 0 && b > 0) {
            System.out.println("Ambos os números são positivos.");
        } else {
            System.out.println("Pelo menos um dos números não é positivo.");
        }

        if (a % 2 == 0 || b % 2 == 0) {
            System.out.println("Pelo menos um dos números é par.");
        } else {
            System.out.println("Nenhum número é par.");
        }

        if (a != b) {
            System.out.println("Os números são diferentes.");
        } else {
            System.out.println("Os números são iguais.");
        }
    }

    // ADICIONADO DA VERSÃO 2
    public void Atribuicao(int a, int b) {
        System.out.println("Operadores de atribuição:");
        System.out.println("Valor inicial de a: " + a);
        a += b;
        System.out.println("Após a += b, valor de a: " + a);
        a -= b;
        System.out.println("Após a -= b, valor de a: " + a);
        a *= b;
        System.out.println("Após a *= b, valor de a: " + a);
        a /= b;
        System.out.println("Após a /= b, valor de a: " + a);
        a %= b;
        System.out.println("Após a %= b, valor de a: " + a);
    }

    public int atribuirSoma(int valor, int incremento) {
        valor += incremento;
        return valor;
    }

    public int atribuirSubtracao(int valor, int decremento) {
        valor -= decremento;
        return valor;
    }

    public int atribuirMultiplicacao(int valor, int multiplicador) {
        valor *= multiplicador;
        return valor;
    }

    public int atribuirDivisao(int valor, int divisor) {
        valor /= divisor;
        return valor;
    }

    public boolean eLogico(boolean a, boolean b) {
        return a && b;
    }

    public boolean ouLogico(boolean a, boolean b) {
        return a || b;
    }

    public boolean naoLogico(boolean a) {
        return !a;
    }

    public boolean igual(int a, int b) {
        return a == b;
    }

    public boolean diferente(int a, int b) {
        return a != b;
    }

    public boolean maior(int a, int b) {
        return a > b;
    }

    public boolean menor(int a, int b) {
        return a < b;
    }

    public boolean maiorOuIgual(int a, int b) {
        return a >= b;
    }

    public boolean menorOuIgual(int a, int b) {
        return a <= b;
    }
}

