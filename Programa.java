import java.util.Scanner;

public class Programa {

    public static void main(String args[]) {

        Soma soma = new Soma();
        Subtração subtração = new Subtração();
        Multiplicação multiplicação = new Multiplicação();
        Divisão divisão = new Divisão();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();  //VALIDAÇÃO DO NOME//
        System.out.println("\nDigite o que deseja consultar "+nome+": ");
        System.out.println("|S+|-Soma |S-|-Subtração |M|-Multiplicação |D|-Divisão: ");
        String resposta = teclado.next();  //VALIDAÇÃO DA RESPOSTA//

        while (!resposta.toUpperCase().equals("S+") && !resposta.toUpperCase().equals("S-") && !resposta.toUpperCase().equals("M") && !resposta.toUpperCase().equals("D")) {
            System.out.println("\nInvalido - tente novamente");
            System.out.println("\nDigite o que deseja consultar "+nome+": ");
            System.out.println("|S+|-Soma |S-|-Subtração |M|-Multiplicação |D|-Divisão: ");
            resposta = teclado.next();  //VALIDAÇÃO DA RESPOSTA//
        }

        if (resposta.toUpperCase().equals("S+")) {  //VALIDAÇÃO DA SOMA//
            System.out.println("\nVocê optou pela opção SOMA "+nome);
            System.out.println("\nDigite o seu primeiro valor "+nome+": ");
            soma.setValor1(teclado.nextDouble());
            System.out.println("\nDigite o seu segundo valor "+nome+": ");
            soma.setValor2(teclado.nextDouble());
            soma.CalcularValores();;
            System.out.println("\nO valor da soma é de: "+soma.getValor1());
        }

        if (resposta.toUpperCase().equals("S-")) {  //VALIDAÇÃO DA SUBTRAÇÃO//
            System.out.println("\nVocê optou pela opção SUBTRAÇÂO "+nome);
            System.out.println("\nDigite o seu primeiro valor "+nome+": ");
            subtração.setValor1(teclado.nextDouble());
            System.out.println("\nDigite o seu segundo valor "+nome+": ");
            subtração.setValor2(teclado.nextDouble());
            subtração.CalcularValores();;
            System.out.println("\nO valor da subtração é de: "+subtração.getValor1());
        }

        if (resposta.toUpperCase().equals("M")) {  //VALIDAÇÃO DA MULTIPLICAÇÃO//
            System.out.println("\nVocê optou pela opção MULTIPLICAÇÂO "+nome);
            System.out.println("\nDigite o seu primeiro valor "+nome+": ");
            multiplicação.setValor1(teclado.nextDouble());
            System.out.println("\nDigite o seu segundo valor "+nome+": ");
            multiplicação.setValor2(teclado.nextDouble());
            multiplicação.CalcularValores();;
            System.out.println("\nO valor da multiplicação é de: "+multiplicação.getValor1());
        }

        if (resposta.toUpperCase().equals("D")) {  //VALIDAÇÃO DA DIVISÃO//
            System.out.println("\nVocê optou pela opção DIVISÂO "+nome);
            System.out.println("\nDigite o seu primeiro valor "+nome+": ");
            divisão.setValor1(teclado.nextDouble());
            System.out.println("\nDigite o seu segundo valor "+nome+": ");
            divisão.setValor2(teclado.nextDouble());
            divisão.CalcularValores();;
            System.out.println("\nO valor da divisão é de: "+divisão.getValor1());
        }

        for (int i = 1; i < 100; i++) {
            System.out.println("\nDeseja fazer outra consulta "+nome+"?");
            System.out.println("|S|-Sim |N|-Não: ");
            resposta = teclado.next();

            while (!resposta.toUpperCase().equals("S") && !resposta.toUpperCase().equals("N")) {
                System.out.println("\nInvalido - tente novamente");
                System.out.println("\nDeseja fazer outra consulta "+nome+"?");
                System.out.println("|S|-Sim |N|-Não: ");
                resposta = teclado.next();
            }

            if (resposta.toUpperCase().equals("S")) {  //VALIDAÇÃO DA RESPOSTA SIM//
                System.out.println("\nDigite o que deseja consultar "+nome+": ");
                System.out.println("|S+|-Soma |S-|-Subtração |M|-Multiplicação |D|-Divisão: ");
                resposta = teclado.next();  //VALIDAÇÃO DA RESPOSTA//

                while (!resposta.toUpperCase().equals("S+") && !resposta.toUpperCase().equals("S-") && !resposta.toUpperCase().equals("M") && !resposta.toUpperCase().equals("D")) {
                    System.out.println("\nInvalido - tente novamente");
                    System.out.println("\nDigite o que deseja consultar "+nome+": ");
                    System.out.println("|S+|-Soma |S-|-Subtração |M|-Multiplicação |D|-Divisão: ");
                    resposta = teclado.next();  //VALIDAÇÃO DA RESPOSTA//
                }

                if (resposta.toUpperCase().equals("S+")) {  //VALIDAÇÃO DA SOMA//
                    System.out.println("\nVocê optou pela opção SOMA "+nome);
                    System.out.println("\nDigite o seu primeiro valor "+nome+": ");
                    soma.setValor1(teclado.nextDouble());
                    System.out.println("\nDigite o seu segundo valor "+nome+": ");
                    soma.setValor2(teclado.nextDouble());
                    soma.CalcularValores();;
                    System.out.println("\nO valor da soma é de: "+soma.getValor1());
                }

                if (resposta.toUpperCase().equals("S-")) {  //VALIDAÇÃO DA SUBTRAÇÃO//
                    System.out.println("\nVocê optou pela opção SUBTRAÇÂO "+nome);
                    System.out.println("\nDigite o seu primeiro valor "+nome+": ");
                    subtração.setValor1(teclado.nextDouble());
                    System.out.println("\nDigite o seu segundo valor "+nome+": ");
                    subtração.setValor2(teclado.nextDouble());
                    subtração.CalcularValores();;
                    System.out.println("\nO valor da subtração é de: "+subtração.getValor1());
                }

                if (resposta.toUpperCase().equals("M")) {  //VALIDAÇÃO DA MULTIPLICAÇÃO//
                    System.out.println("\nVocê optou pela opção MULTIPLICAÇÂO "+nome);
                    System.out.println("\nDigite o seu primeiro valor "+nome+": ");
                    multiplicação.setValor1(teclado.nextDouble());
                    System.out.println("\nDigite o seu segundo valor "+nome+": ");
                    multiplicação.setValor2(teclado.nextDouble());
                    multiplicação.CalcularValores();;
                    System.out.println("\nO valor da multiplicação é de: "+multiplicação.getValor1());
                }

                if (resposta.toUpperCase().equals("D")) {  //VALIDAÇÃO DA DIVISÃO//
                    System.out.println("\nVocê optou pela opção DIVISÂO "+nome);
                    System.out.println("\nDigite o seu primeiro valor "+nome+": ");
                    divisão.setValor1(teclado.nextDouble());
                    System.out.println("\nDigite o seu segundo valor "+nome+": ");
                    divisão.setValor2(teclado.nextDouble());
                    divisão.CalcularValores();;
                    System.out.println("\nO valor da divisão é de: "+divisão.getValor1());
                }
            }

            if (resposta.toUpperCase().equals("N")) {  //VALIDAÇÃO DA RESPOSTA NÃO//
                System.out.println("\nObrigado, volte sempre");
                break;
            }
        }
    }
}
