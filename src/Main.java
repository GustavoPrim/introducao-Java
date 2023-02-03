import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();

        if (idade <= 12) {
            System.out.println("Ainda é uma criança");
        } else if (idade > 12 && idade <= 21) {
            System.out.println("É um adolescente");
        } else if (idade > 21 && idade <= 60) {
            System.out.println("É um adulto");
        } else {
            System.out.println("Ta velho ein");
        }

        int i = 10;
        while (i > 0) {
            System.out.println(i);
            --i;
        }


        double x = 7 + 3;
        System.out.println(x);

        double y = +3;
        System.out.println(y);

        double z = -3;
        System.out.println(z);


        // pré incremento
        int a = 8;
        int b = ++a;
        System.out.println("a=" + a);
        System.out.println("b=" + b);


        //pós incremento
        int c = 8;
        int d = c++;//pós-incremento
        System.out.println("c=" + c);
        System.out.println("d=" + d);


        boolean e = true;
        boolean f = false;
        boolean g = true;
        System.out.println(e && f);
        System.out.println(e && g);


        boolean h = true;
        boolean j = false;
        boolean k = false;
        System.out.println(h || k);
        System.out.println(k || j);

        // while
        int contador = 0;
        while (contador < 50) {
            System.out.print("Digite um numero inteiro: ");
            int numero = sc.nextInt();

            if ((numero % 2) == 0) {
                System.out.println("Este é um número par");
            } else {
                System.out.println("Esse é um número impar");
            }
            contador++;
        }
    }
}