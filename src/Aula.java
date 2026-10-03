import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                ========= Exércicios ===========
                
                 1 - Treinamento métodos (01)
                 2 - Treinamento métodos (02)
                 3 - Exercício Scanner
                 4 - Exercicio Scanner ano de nascimento
                 5 - Exercicio Scanner Dados pessoais
                 6 - Exercicio Scanner Preço
                
                 Escolha o seu exércicios em números de 1 á 5: """);

        byte exemplos;
        String resultado;
        exemplos = sc.nextByte();

        switch (exemplos) {
            case 1:
                exercicio01();
                break;
            case 2:
                exercicio02();
                break;
            case 3:
                exercicio03();
                break;

            case 4:
                exercicio04();
                break;

            case 5:
                exercicio05();
                break;
            case 6:
                exercicio06();
                break;
            default:
        }


    }


    public static void exercicio01() {
        System.out.println("=== Exercicio 01 ===");
        System.out.println("Exibe o código para mim");
    }

    static void exercicio02() {
        System.out.println("=== Exercício 02 ===");
        System.out.println("Exibe o código para mim parte 02");
    }

    static void exercicio03() {
        String nome;
        int idade;

        System.out.println("==== Exercício 03 =====");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();

        System.out.println("Digite sua idade e descubra qual será sua idade no próximo ano: ");
        idade = leitor.nextByte();

        int idadeAnoQueVem = idade + 1;

        System.out.printf("""
                Olá, %s ! Ano que vem você terá %d anos. 
                """, nome, idadeAnoQueVem);

        leitor.close();

    }

    static void exercicio04() {

        System.out.println("=== Exercicio 04 ===");
        Scanner sc = new Scanner(System.in);
        // variavel para mostrar o ano e o resultado
        int ano, resultado;

        // saida de dados perguntando a idade
        System.out.println("Digite o ano que você nasceu ?");
        ano = sc.nextInt();
        // variavel resultado para mostrar a sua idade
        resultado = 2026 - ano;

        // imprime o resultado
        System.out.printf("""
                O ano que você nasceu é : %d
                Em 2026 você completa %d anos""", ano, resultado);
        sc.close();

    }

    static void exercicio05() {

        System.out.println("=== Exercicio 05 ===\n");

        Scanner sc = new Scanner(System.in);
        String nome, sobrenome;
        double altura;
        int idade;

        System.out.println("Olá, digite seu nome: ");
        nome = sc.nextLine();

        System.out.printf("%s, digite seu sobrenome: \n", nome);
        sobrenome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();


        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();


        System.out.printf("""
                
                ===== FICHA PESSOAL ===
                
                NOME COMPLETO: %s %s
                IDADE:%d
                ALTURA:%.2f m
                """, nome, sobrenome, idade, altura);


    }

    static void exercicio06(){
        System.out.println("=== Exercicio 06 ===");
        Scanner sc = new Scanner(System.in);
        double preco, resultado;
        int quantidade;

        System.out.println("Digite o preço do produto: ");
        preco = sc.nextDouble();

        System.out.println("Digite a quantidade");
        quantidade = sc.nextInt();

        resultado = preco * quantidade;

        System.out.printf("%d X R$ %.2f = R$ %.2f ",quantidade, preco, resultado );

    }


}
