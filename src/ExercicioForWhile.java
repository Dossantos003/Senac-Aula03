import java.util.Scanner;

public class ExercicioForWhile {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                === Exercícios ===
                1 - contador
                2 - contagem regressiva
                3 -  Somar até digitar zero
                4 - Validação de nota
                5 - Validação 
                6 - Calculadora
                
                Digite o número do exercício que a vossa exelência deseja:
                """);
        int exercicios = sc.nextInt();

        switch (exercicios){
            case 1 :
                contador();
                break;
            case 2 :
                contadorReverso();
                break;
            case 3 :
                somaDoZero();
                break;
            case 4 :
                validarNota();
                break;
            case 5:
                validarSenha();
                break;
            case 6:
                calculadora();
                break;

        }
    }


    public static void contador(){
        System.out.println("=== Execício Contador ===");
        int contador = 1;

        while(contador <= 10){
            System.out.println(contador);
            contador++;
        }
    }
    public static void contadorReverso(){
        System.out.println("=== Execício Contador ===");

        int contador = 10;

        while(contador >= 1){
            System.out.println(contador);
            contador--;
        }
        System.out.println("Lançar");
    }

    public static void somaDoZero() {

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

        System.out.println("Digite um número (0 para parar): ");
        int numero = sc.nextInt();

        while (numero != 0) {

            soma += numero;
            contador++;

            System.out.println("Digite um número (0 para parar): ");
            numero = sc.nextInt();
        }
        System.out.println("soma: " + soma);
        System.out.println("numeros digitados: " + contador);

        sc.close();

    }

    static void validarNota(){
        Scanner sc = new Scanner(System.in);
        double nota;

        do {
            System.out.println("Digite a nota (0 a 10): ");
            nota = sc.nextDouble();

            if (nota <0|| nota > 10){
                System.out.println("Nota inválida, tente de novo");
            }
        }while (nota <0|| nota > 10 );

        System.out.println("Nota registrada: " + nota);
        sc.close();

    }
     static void validarSenha(){
         Scanner sc = new Scanner(System.in);
         double senha, tentativas;
         tentativas = 0;

         do {
             System.out.println("Digite a senha do usuário (máximas de tentativas são 3) ");
             senha = sc.nextDouble();
             tentativas ++;

             if (senha != 1234 && tentativas < 3){
                 System.out.println("Senha invalida, tente novamente (Apenas 3 tentativas)");
             }
         }while (senha != 1234 && tentativas < 3 );

         System.out.println("Usuário bloqueado");

         sc.close();

     }

     static void calculadora(){
         Scanner leitor = new Scanner(System.in);
         int opcao;

         do {
             System.out.println("1 - Somar");
             System.out.println("2 - Subtrair");
             System.out.println("3 - Multiplicar");
             System.out.println("4 - Dividir");
             System.out.println("0 - Sair"); // Nova opção
             System.out.print("Escolha: ");
             opcao = leitor.nextInt();

             System.out.print("Primeiro número: ");
             double a = leitor.nextDouble();
             System.out.print("Segundo número: ");
             double b = leitor.nextDouble();



             switch (opcao) {
                 case 1 -> System.out.printf("Resultado: %.2f%n", a + b);
                 case 2 -> System.out.printf("Resultado: %.2f%n", a - b);
                 case 3 -> System.out.printf("Resultado: %.2f%n", a * b);
                 case 4 -> {
                     if (b == 0) {
                         System.out.println("Não é possível dividir por zero!");
                     } else {
                         System.out.printf("Resultado: %.2f%n", a / b);
                     }
                 }
                 case 0 -> System.out.println("Saindo...");
                 default -> System.out.println("Opção inválida");
             }
         } while (opcao != 0); // Repete enquanto a opção não for 0
     }
         }

      static void tabuada(){
          Scanner leitor = new Scanner(System.in);
          System.out.print("Tabuada de qual número? ");
          int numero = leitor.nextInt();
          for (int i = 1; i <= 10; i++) {
              System.out.printf("%d x %2d = %3d%n", numero, i, numero * i);
          }
          leitor.close();
      }

void main() {
}









