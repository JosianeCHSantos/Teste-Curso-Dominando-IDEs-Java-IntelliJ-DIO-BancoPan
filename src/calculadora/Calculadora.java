package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        //Criando fluxo de entrarda através do teclado:
        Scanner scan = new Scanner(System.in);

        //Criando variáveis:
        int a, b;

        //Criando chamada para as variáveis:
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        /*adicionando as variáveis aos metétodos (digitar a operação, exemplo somar e todas as outras, dar enter,
        clicar sobra a palavra e pressionar CTRL ALT V)*/

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("somar: " + somar);
        System.out.println("subtrair: " + subtrair);
        System.out.println("multiplicar: " + multiplicar);
        System.out.println("dividir: " + dividir);



    }

    //Criando métodos:

    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
     public static int multiplicar(int a, int b){
        return a * b;
    }
     public static int dividir(int a, int b){
        return a / b;
    }

}

