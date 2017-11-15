import java.util.Scanner;

public class Programa {
	
	public static void main(String args[]) {
		
		Soma soma = new Soma();
		Subtraçao subtraçao = new Subtraçao();
		Multiplicaçao multiplicaçao = new Multiplicaçao();
		Divisao divisao = new Divisao();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o que deseja consultar");
		System.out.println("|S+|-Soma |S-|-Subtraçao |M|-Multiplicação |D|-Divisão: ");
		String resposta = teclado.next();
		
		while(!resposta.toUpperCase().equals("S+") && !resposta.toUpperCase().equals("S-") && !resposta.toUpperCase().equals("M") && !resposta.toUpperCase().equals("D")) {
			System.out.println("\nInvalido - tente novamente");
			System.out.println("Digite o que deseja consultar");
			System.out.println("|S+|-Soma |S-|-Subtraçao |M|-Multiplicação |D|-Divisão: ");
			resposta = teclado.next();
		}
		
		if(resposta.toUpperCase().equals("S+")) {  //VALIDAÇÃO DA SOMA
			System.out.println("\nDIgite o seu primeiro valor: ");
			soma.setValor1(teclado.nextDouble());
			System.out.println("\nDigite o seu segundo valor: ");
			soma.setValor2(teclado.nextDouble());
			soma.CalcularValores();
			System.out.println("\nO valor da soma é de: "+soma.getValor1());
		}
		
		if(resposta.toUpperCase().equals("S-")) {  //VALIDAÇÃO DA SUBTRAÇÃO
			System.out.println("\nDIgite o seu primeiro valor: ");
			subtraçao.setValor1(teclado.nextDouble());
			System.out.println("\nDigite o seu segundo valor: ");
			subtraçao.setValor2(teclado.nextDouble());
			subtraçao.CalcularValores();
			System.out.println("\nO valor da subtraçao é de: "+subtraçao.getValor1());
		}
		
		if(resposta.toUpperCase().equals("M")) {  //VALIDAÇÃO DA MULTIPLICAÇÃO
			System.out.println("\nDIgite o seu primeiro valor: ");
			multiplicaçao.setValor1(teclado.nextDouble());
			System.out.println("\nDigite o seu segundo valor: ");
			multiplicaçao.setValor2(teclado.nextDouble());
			multiplicaçao.CalcularValores();
			System.out.println("\nO valor da multiplicaçao é de: "+multiplicaçao.getValor1());
		}
		
		if(resposta.toUpperCase().equals("D")) {  //VALIDAÇÃO DA DIVISÃO
			System.out.println("\nDIgite o seu primeiro valor: ");
			divisao.setValor1(teclado.nextDouble());
			System.out.println("\nDigite o seu segundo valor: ");
			divisao.setValor2(teclado.nextDouble());
			divisao.CalcularValores();
			System.out.println("\nO valor da divisao é de: "+divisao.getValor1());
		}
		
		for(int i = 0;i < 100;i++) {
			System.out.println("\nDeseja fazer outra consulta?");
			System.out.println("|S|-Sim |N|-Não: ");
			resposta = teclado.next();
			
			while(!resposta.toUpperCase().equals("S") && !resposta.toUpperCase().equals("N")) {
				System.out.println("\nInvalido - tente novamente");
				System.out.println("\nDeseja fazer outra consulta?");
				System.out.println("|S|-Sim |N|-Não: ");
				resposta = teclado.next();
			}
			
			if(resposta.toUpperCase().equals("S")) {
				System.out.println("Digite o que deseja consultar");
				System.out.println("|S+|-Soma |S-|-Subtraçao |M|-Multiplicação |D|-Divisão: ");
				resposta = teclado.next();
				
				while(!resposta.toUpperCase().equals("S+") && !resposta.toUpperCase().equals("S-") && !resposta.toUpperCase().equals("M") && !resposta.toUpperCase().equals("D")) {
					System.out.println("\nInvalido - tente novamente");
					System.out.println("Digite o que deseja consultar");
					System.out.println("|S+|-Soma |S-|-Subtraçao |M|-Multiplicação |D|-Divisão: ");
					resposta = teclado.next();
				}
				
				if(resposta.toUpperCase().equals("S+")) {  //VALIDAÇÃO DA SOMA
					System.out.println("\nDIgite o seu primeiro valor: ");
					soma.setValor1(teclado.nextDouble());
					System.out.println("\nDigite o seu segundo valor: ");
					soma.setValor2(teclado.nextDouble());
					soma.CalcularValores();
					System.out.println("\nO valor da soma é de: "+soma.getValor1());
				}
				
				if(resposta.toUpperCase().equals("S-")) {  //VALIDAÇÃO DA SUBTRAÇÃO
					System.out.println("\nDIgite o seu primeiro valor: ");
					subtraçao.setValor1(teclado.nextDouble());
					System.out.println("\nDigite o seu segundo valor: ");
					subtraçao.setValor2(teclado.nextDouble());
					subtraçao.CalcularValores();
					System.out.println("\nO valor da subtraçao é de: "+subtraçao.getValor1());
				}
				
				if(resposta.toUpperCase().equals("M")) {  //VALIDAÇÃO DA MULTIPLICAÇÃO
					System.out.println("\nDIgite o seu primeiro valor: ");
					multiplicaçao.setValor1(teclado.nextDouble());
					System.out.println("\nDigite o seu segundo valor: ");
					multiplicaçao.setValor2(teclado.nextDouble());
					multiplicaçao.CalcularValores();
					System.out.println("\nO valor da multiplicaçao é de: "+multiplicaçao.getValor1());
				}
				
				if(resposta.toUpperCase().equals("D")) {  //VALIDAÇÃO DA DIVISÃO
					System.out.println("\nDIgite o seu primeiro valor: ");
					divisao.setValor1(teclado.nextDouble());
					System.out.println("\nDigite o seu segundo valor: ");
					divisao.setValor2(teclado.nextDouble());
					divisao.CalcularValores();
					System.out.println("\nO valor da divisao é de: "+divisao.getValor1());
				}
			}
			
			if(resposta.toUpperCase().equals("N")) {
				System.out.println("\nObrigado, volte sempre");
				break;
			}
		}
	}
}