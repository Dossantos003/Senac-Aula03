public class Aula02_03 {
    static void main() {

        // Exercício 01 = Hello World

        //System.out.println("Hello World");

        //System.out.println("---------------------------------");

        // Exercicio 02 = Nome, idade, profissão

       /** System.out.println("Exercicio01)

        System.out.println("Gabriel dos Santos Nascimento");
        System.out.println("22 anos");
        System.out.println("Estágio");*/

        /*System.out.println("----------------------------------------------");*/

        //Exercicio 03 = Olá Turma de Java

       /**System.out.println("Exercício 02");


        System.out.print("Olá, ");
        System.out.println("Turma de Java");
        System.out.println("Esta frase fica na linha de baixo.");
        System.out.print("E esta, mais embaixo.");*/

        //System.out.println("--------------------------------------------");

       /* System.out.println("Exercício 03");
        System.out.println(" ");*/

        // Título

        /**System.out.println("=== CAFÉ COADO =====");
        System.out.println(" ");

        // Descrição

        System.out.println("Ingredientes: 500 ml de água e 4 colheres de pó");
        System.out.println(" ");

        // Passo a Passo

        System.out.println("1. Ferva a água");
        System.out.println("2. Coloque o filtro no suporte");
        System.out.println("3. Coloque o pó no filtro");
        System.out.println("4. Despeja a água quente devagar");
        System.out.print("5. Sirva!");*/

        //System.out.println("-----------------------------------------------------");

        //System.out.println("Exercicio 04"); Qual exercicio

        //Exercicio 04 - Imprimir nome e idade;

        /**String nome = "Gabriel";
        int idade = 22;
        System.out.println("Nome: " + nome + ", idade: " + idade);
        System.out.printf("Nome: %s, idade %d", nome, idade);*/


        // Dados

      /**  String nome = "Gabriel";
        int idade = 22;
        Double altura = 1.79;
        Boolean estudante = true;*/

        //System.out.println("-----------------------------");

        /*System.out.println("Exercicio 05");  Qual exercício
        System.out.println(" ");*/

        // Titulo
        /**System.out.println("=== FICHA PESSOAL ===");

        System.out.println(" ");

        // Saída de Dados
        System.out.printf("Nome: %s \n" + "Idade: %d \n" + "Altura: %.2f m \n" + "Estudante: %s", nome, idade, altura, estudante  );*/

        //System.out.println("---------------------------------");

        /*System.out.println("Exercício 06");

       double[] numeros = {17,5};
       double soma = numeros[0] + numeros[1];
       double subtracao = numeros[0] - numeros[1];
       double multiplicaco = numeros[0] - numeros[1];
       double divisao = numeros[0] / numeros[1];
       double resto = numeros [0] % numeros[1];

        System.out.printf("Soma: %.2f \n Subtração: %.2f \n Multiplicação: %.2f \n Divisao: %.2f \n Resto : %.2f"  , soma,subtracao,multiplicaco,divisao,resto );*/

        double conta, taxa, total, totalIndividual;
        byte qtdPessoas = 4;
        String valorPorcetagem;
        conta = 180.0;
        taxa = conta / 10;
        total = conta + taxa;
        totalIndividual = total / qtdPessoas;
        valorPorcetagem = "(10%)";

        System.out.printf("Conta: R$ %.2f\nServiço %s : R$ %.2f \nTotal: R$ %.2f \nCada um paga : R$ %.2f", conta, valorPorcetagem, taxa, total, totalIndividual);









    }
}

//Comentários:

// psvm = public static void main (String []args)
// sout = System.out.println(); saída de dados com quebra de linha
// souf = System.out.printf(); saída de dados com formatação juntando texto com valores
// shift + f10 = rodar o código;

// sem o fechamneto da primeira saida não tem o ponto em vírgula
// sem o fechamento do código
// Segunda linha do sout dentro da saida não tem o fechamento das aspas
// Na terceira linha o system está em linha minuscula
//Na quarta linha está escrito printn