import java.util.Scanner;

public class Exercicios {

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
                 12 - Exercício If e Else (número positivo)
                 13 - Exercício maior de idade
                 14 - Exercício Par ou Impar
                 15 - Exercício Senha Correta
                
                 Escolha o seu exércicios em números de 1 á 15: """);

        byte exemplos;
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
            case 10:
                exercicio10();
                break;
            case 11:
                exercicio11();
                break;
            case 12:
                exercicio12();
                break;
            case 13:
                exercicio13();
                break;
            case 14:
                exrcicio14();
                break;
            case 15:
                exercicio15();
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

    static void exercicio06() {
        System.out.println("=== Exercicio 06 ===");
        Scanner sc = new Scanner(System.in);
        double preco, resultado;
        int quantidade;

        System.out.println("Digite o preço do produto: ");
        preco = sc.nextDouble();

        System.out.println("Digite a quantidade");
        quantidade = sc.nextInt();

        resultado = preco * quantidade;

        System.out.printf("%d X R$ %.2f = R$ %.2f ", quantidade, preco, resultado);

        sc.close();

    }

    static void exercicio07() {

        System.out.println("=== Exercício 07 ===");

        double graus, fahrenheit;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Graus Celsius");
        graus = sc.nextDouble();

        fahrenheit = graus * 9 / 5 + 32;

        System.out.printf("%.1f °C = %.1f °F", graus, fahrenheit);

        sc.close();


    }

    static void exercicio08() {

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
        Scanner sc = new Scanner(System.in);

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
                """, km, litros, consumo);

        sc.close();
    }

    static void exercicio10() {
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

    static void exercicio11() {
        System.out.println("=== Exercício 11 ===");
        int valor, nota100, nota50, nota20, nota10, nota5, nota2, moeda1, resto;
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

        nota2 = valor / 2;
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
                """, valor, nota100, nota50, nota20, nota10, nota5, nota2, moeda1);

    }

    static void exercicio12() {
        System.out.println("=== Exercício 12 ===");
        int numero; // variavel número
        Scanner sc = new Scanner(System.in); // entrada da variável
        System.out.println("Digite um número:"); // perguntando o número
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Esse é número é positivo");
        } // tomada de decisão

        System.out.println("Fim do programa!"); // finalização do sistema
        sc.close();
    }

    static void exercicio13() {
        System.out.println("=== Exercício 13 ===");
        Scanner sc = new Scanner(System.in);
        byte idade; // variavel idade
        System.out.println("Digite sua idade :"); // saida de dados perguntando a idade
        idade = sc.nextByte(); // guardando a idade

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } // tomada de decisão
        System.out.println("Fim do programa!"); // finalização do programa!
        sc.close();
    }

    static void exrcicio14() {
        System.out.println("=== Exercício 14 ===");
        Scanner sc = new Scanner(System.in);
        double numero;
        System.out.println("Digite um número:");
        numero = sc.nextByte();
        String res;

        res = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println(res);

    }

    static void exercicio15() {
        System.out.println("=== Exercício 15 ===");

        Scanner sc = new Scanner(System.in);
        // guarda a variaveis da senha
        int senhaCorreta, senha;
        // variavel da senha
        String res;
        // variavel senha correta
        senhaCorreta = 1234;

        // saida de dados perguntando para usuário
        System.out.println("Digite uma senha em número inteiros: ");
        senha = sc.nextInt();
        //tomada de decisão
        res = (senha == senhaCorreta) ? "O usuário digitou a senha correta" : "O usuário digitou a senha incorreta";

        System.out.println(res);

        sc.close();

    }

    static void exercicio16() {
        System.out.println("=== Exercício 16 ===");
        Scanner sc = new Scanner(System.in);
        double peso, pesocalculado;
        System.out.println("""
                
                  ======= Sitema de calculo de desconto ======
                
                  Peso até 1kg (10 reais)
                  Peso acima de 1kg até 5kg (20 reais)
                  Peso acima de 5kg até 10kg (35 reais)
                  Peso acima de 10kg (50 reais)
                
                """);
        System.out.println("Digite o peso :");
        peso = sc.nextDouble();
        if (peso < 0){
            System.out.println("Valor invalido");
        }
        else if (peso > 0 & peso <= 1){
            System.out.println("O peso digitado foi " + peso + "O valor é R$ 10");
        }else if (peso <= 5){
            System.out.println("O peso digitado foi " + peso + "O valor é R$ 20");
        }else if (peso <= 10){
            System.out.println("O peso digitado foi " + peso + "O valor é R$ 35");
        }else {
            System.out.println("O peso digiatdo foi " + peso + "O valor é R$ 50");
        }



    }



}
