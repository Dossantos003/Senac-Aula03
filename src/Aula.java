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
                 7 - Exercicio Graus
                 8 - Exercício Gorjeta
                 9 - Exercício Carro
                 10 - Exercício Horas Trabalhadas
                 11 - Exercício troco
                
                 Escolha o seu exércicios em números de 1 á 11: """);

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
            case 7:
                exercicio07();
                break;
            case 8:
                exercicio08();
                break;
            case 9:
                exercicio09();
                break;
            case 10 :
                exercicio10();
                break;
            case 11:
                exercicio11();
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

        sc.close();

    }

    static void exercicio07(){

        System.out.println("=== Exercício 07 ===");

        double graus, fahrenheit;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Graus Celsius");
        graus = sc.nextDouble();

        fahrenheit = graus * 9 / 5 + 32;

        System.out.printf("%.1f °C = %.1f °F", graus, fahrenheit);

        sc.close();



    }

    static void exercicio08(){

        System.out.println("=== Exercício 08 ===");

        Scanner sc = new Scanner(System.in);
        double valorDaConta, gorjetaPorcentagem, gorjetaResultado, total, cadaPessoaPaga;
        int pessoas;

        System.out.println("Digite o valor da conta: ");
        valorDaConta = sc.nextDouble();

        System.out.println("Digite a porcentagem da gorjeta: ");
        gorjetaPorcentagem = sc.nextDouble();

        System.out.println("Digite os números de pessoas: ");
        pessoas = sc.nextInt();

        gorjetaResultado = valorDaConta / gorjetaPorcentagem;
        total = gorjetaResultado + valorDaConta;
        cadaPessoaPaga = total / pessoas;

        System.out.printf("""
                
                Valor da conta : R$ %.2f
                Gorjeta porcentagem : %.2f
                Número de Pessoas : %d
                Valor da gorjeta : R$ %.2f
                Valor Total : R$ %.2f
                Cada pessoa paga: R$ %.2f
                """, valorDaConta, gorjetaPorcentagem, pessoas, gorjetaResultado, total, cadaPessoaPaga);

        sc.close();
    }

    static void exercicio09() {
        System.out.println("=== Exercício 09 ===");
        Scanner sc = new Scanner( System.in);

        double km, litros, consumo;

        System.out.println("Digite a quantidades de KM rodados: ");
        km = sc.nextDouble();

        System.out.println("Digite a quantidade de litros usados: ");
        litros = sc.nextDouble();

        consumo = km / litros;

        System.out.printf("""
                Km rodados : %.2f
                litros gastos: %.1f
                consumo : %.2f km/l
                """ , km, litros, consumo);

        sc.close();
    }

    static void exercicio10(){
        System.out.println("=== Exercício 10 ===");
        Scanner sc = new Scanner(System.in);
        double valorDahoras, salarioBruto, inss, inssCalculado, resultado;
        int horasTrabalhadas;

        System.out.println("Digite o valor das horas trabalhadas: ");
        valorDahoras = sc.nextDouble();

        System.out.println("Digite as horas trabalhadas :");
        horasTrabalhadas = sc.nextInt();

        salarioBruto = valorDahoras * horasTrabalhadas;
        inss = salarioBruto / 100;
        inssCalculado = inss * 9;

        resultado = salarioBruto - inssCalculado;

        System.out.printf("""
                Valor da hora : R$ %.2f
                Horas Trabalhads : %d
                Salário Bruto : R$ %.2f
                INSS (porcentagem de 9) : R$ %.2f
                Salário Liquido : R$ %.2f
                """, valorDahoras, horasTrabalhadas, salarioBruto, inssCalculado, resultado);
        sc.close();
    }

    static void exercicio11(){
        System.out.println("=== Exercício 11 ===");
        int valor, nota100,nota50, nota20,nota10,nota5,nota2,moeda1,resto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro do troco: ");
        valor = sc.nextInt();

        nota100 = valor / 100;
        resto = valor % 100;

        nota50 = valor / 50;
        resto = resto % 50;

        nota20 = valor / 20;
        resto = resto % 20;

        nota10 = valor / 10;
        resto = resto % 10;

        nota5 = valor / 5;
        resto = resto % 5;

        nota2 = resto / 2;
        resto = resto % 2;

        moeda1 = resto;


        System.out.printf("""
                 Valor do troco inteiro é : %d
                 %d: notas de 100
                 %d: notas de 50
                 %d: notas de 20
                 %d: notas de 10
                 %d: notas de 5
                 %d: notas de 2
                 %d: moedas de 1 real
                """, valor, nota100, nota50, nota20, nota10,nota5,nota2, moeda1);

    }
}
