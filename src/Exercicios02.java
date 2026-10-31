import java.util.Scanner;

public class Exercicios02 {
    static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int exercicio;
        System.out.println("""
                Digite um número para escolher o exercicio:
                
                1 - Entrada Cinema
                2 - Login
                3 - Nota valida
                4 - Fim de semana
                5 - Mês
                6 - Lanchonete
                """);

     exercicio = sc.nextInt();

     switch (exercicio){
         case 1 :
             entradaCinema();
         break;
         case 2 :
             login();
         break;
         case 3:
             notaValida();
         break;
         case 4 :
             fimDeSemana();
         break;
         case 5:
            mes();
         break;
         case 6:
             lanchonete();
         break;
         default:
             System.out.println("Código invalido");
         break;
     }

    }

    static void entradaCinema(){

       Scanner sc = new Scanner(System.in);

        System.out.println("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Tem ingresso? (s/n)");
        String resposta = sc.nextLine();

        boolean temIngresso = resposta.equalsIgnoreCase("s");

        if(idade >= 14 && temIngresso){
            System.out.println("Pode entrar, Bom filme");
        }else {
            System.out.println("Entrdada não permitida");
        }
        sc.close();
    }

    static void login(){
        Scanner sc = new Scanner(System.in);
        String usuario, senha, usuarioCorreto, senhaCorreta;
        usuarioCorreto = "admin";
        senhaCorreta = "java123";

        System.out.println("Digite o nome do usuario ?");
        usuario = sc.nextLine();
        System.out.println("Digite a senha do usuario ?");
        senha = sc.nextLine();

        if (senha.equals(senhaCorreta) && usuario.equalsIgnoreCase(usuarioCorreto)){
            System.out.println("Acesso Liberado!");

        }else {
            System.out.println("Acesso Negado!");

        }
        sc.close();
    }

    static void notaValida(){
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Digite a nota de 0 a 10: ");
        nota = sc.nextDouble();
        if (nota >= 0 && nota <=10){
            System.out.println("Nota registrada");
        }else {
            System.out.println("Nota invalida");
        }
        sc.close();
    }

    static void fimDeSemana(){
        Scanner sc = new Scanner(System.in);
        int dia;
        System.out.println("""
                Digite o dia da semana atravês de 1 á 7:
                1- Segunda - Feira
                2- Terça - Feira
                3- Quarta - Feira
                4- Quinta - Feira
                5- Sexta - Feira
                6 - Sabado
                7 - Domingo
                """);
        dia = sc.nextInt();
            switch (dia){
                case 1:
                    System.out.println("Segunda - Feira ");
                    break;
                case 2:
                    System.out.println("Terça - Feira ");
                    break;
                case 3:
                    System.out.println("Quarta - Feira ");
                    break;
                case 4:
                    System.out.println("Quinta - Feira ");
                    break;
                case 5:
                    System.out.println("Sexta - Feira ");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Código invalido");
                    break;
            }
            sc.close();
    }
    static void mes(){
        Scanner sc = new Scanner(System.in);
        int mes;
        System.out.println("""
                Digite o Mês atravês de 1 á 12:
                1- Janeiro
                2- Fevereiro
                3- Março
                4- Abril
                5- Maio
                6- Junho
                7- Julho
                8- Agosto
                9- Setembro
                10- Outubro
                11- Novembro
                12 - Dezembro
                """);
        mes = sc.nextInt();
        switch (mes){
            case 1:
                System.out.println("1 - Janeiro ");
                System.out.println(" Possui 31 Dias");
                break;
            case 2:
                System.out.println("2 - Fevereiro ");
                System.out.println("Possui 28 Dias");
                break;
            case 3:
                System.out.println("3 - Março ");
                System.out.println("Possui 31 dias");
                break;
            case 4:
                System.out.println("4 - Abril ");
                System.out.println("Possui 30 dias");
                break;
            case 5:
                System.out.println("5 - Maio ");
                System.out.println("Possui 31 dias");
                break;
            case 6:
                System.out.println("6 - Junho ");
                System.out.println("Possui 30 dias");
                break;
            case 7:
                System.out.println("7 - Julho ");
                System.out.println("Possui 31 dias");
                break;
            case 8:
                System.out.println("8 - Agosto ");
                System.out.println("Possui 31 dias");
            case 9 :
                System.out.println("9 - Setembro ");
                System.out.println("Possui 30 dias");
                break;
            case 10 :
                System.out.println("10 - Outubro ");
                System.out.println("Possui 31 dias");
                break;
            case 11:
                System.out.println("11 - Novembro ");
                System.out.println("Possui 30 dias");
                break;
            case 12 :
                System.out.println("12 - Dezembro");
                System.out.println("Possui 31 dias");
                break;
            default:
                System.out.println("Código invalido");
                break;

        }
        sc.close();
    }
    static void lanchonete(){
        Scanner sc = new Scanner(System.in);
        int cardapio, quantidade;
        System.out.println("""
                Digite o que você deseja no cardapio:
                1- X-Burguer R$ 18,00
                2- X-Salada R$ 20,30
                3- Hot Dog R$ 12,40
                4- Refrigerante R$ 6,00
                """);
        cardapio = sc.nextInt();
        System.out.println("Digite a quantidade que você deseja:");
        quantidade = sc.nextInt();
        switch (cardapio){
            case 1:
                System.out.println("Você escolheu a opção\n" +
                        "X-Burguer R$ 18,00\n" +
                        "Quantidade: " + quantidade +
                        "\nValor Total: R$ " + 18 * quantidade
                         );
                break;
            case 2:
                System.out.println("Você escolheu a opção\n" +
                        "X-Salada R$ 18,00\n" +
                        "Quantidade: " + quantidade +
                        "\nValor Total: R$ " + 20.30 * quantidade
                );

                break;
            case 3:
                System.out.println("Você escolheu a opção\n" +
                        "Hot-Dog R$ 12,40\n" +
                        "Quantidade: " + quantidade +
                        "\nValor Total: R$ " + 12.40 * quantidade
                );
                break;
            case 4:
                System.out.println("Você escolheu a opção\n" +
                        "Refrigerante R$ 6,00\n" +
                        "Quantidade: " + quantidade +
                        "\nValor Total: R$ " + 6 * quantidade
                );
                break;
            default:
                System.out.println("Código invalido");
                break;
        }
        sc.close();
    }





}
