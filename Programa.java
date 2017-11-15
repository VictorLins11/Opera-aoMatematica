import java.util.Scanner;

public class Programa {
	
	public static void main(String args[]) {
		
		Soma soma = new Soma();
		Subtra�ao subtra�ao = new Subtra�ao();
		Multiplica�ao multiplica�ao = new Multiplica�ao();
		Divisao divisao = new Divisao();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o que deseja consultar");
		System.out.println("|S+|-Soma |S-|-Subtra�ao |M|-Multiplica��o |D|-Divis�o: ");
		String resposta = teclado.next();
		
		while(!resposta.toUpperCase().equals("S+") && !resposta.toUpperCase().equals("S-") && !resposta.toUpperCase().equals("M") && !resposta.toUpperCase().equals("D")) {
			System.out.println("\nInvalido - tente novamente");
			System.out.println("Digite o que deseja consultar");
			System.out.println("|S+|-Soma |S-|-Subtra�ao |M|-Multiplica��o |D|-Divis�o: ");
			resposta = teclado.next();
		}
		
		if(resposta.toUpperCase().equals("S+")) {  //VALIDA��O DA SOMA
			System.out.println("\nDIgite o seu primeiro valor: ");
			soma.setValor1(teclado.nextDouble());
			System.out.println("\nDigite o seu segundo valor: ");
			soma.setValor2(teclado.nextDouble());
			soma.CalcularValores();
			System.out.println("\nO valor da soma � de: "+soma.getValor1());
		}
		
		if(resposta.toUpperCase().equals("S-")) {  //VALIDA��O DA SUBTRA��O
			System.out.println("\nDIgite o seu primeiro valor: ");
			subtra�ao.setValor1(teclado.nextDouble());
			System.out.println("\nDigite o seu segundo valor: ");
			subtra�ao.setValor2(teclado.nextDouble());
			subtra�ao.CalcularValores();
			System.out.println("\nO valor da subtra�ao � de: "+subtra�ao.getValor1());
		}
		
		if(resposta.toUpperCase().equals("M")) {  //VALIDA��O DA MULTIPLICA��O
			System.out.println("\nDIgite o seu primeiro valor: ");
			multiplica�ao.setValor1(teclado.nextDouble());
			System.out.println("\nDigite o seu segundo valor: ");
			multiplica�ao.setValor2(teclado.nextDouble());
			multiplica�ao.CalcularValores();
			System.out.println("\nO valor da multiplica�ao � de: "+multiplica�ao.getValor1());
		}
		
		if(resposta.toUpperCase().equals("D")) {  //VALIDA��O DA DIVIS�O
			System.out.println("\nDIgite o seu primeiro valor: ");
			divisao.setValor1(teclado.nextDouble());
			System.out.println("\nDigite o seu segundo valor: ");
			divisao.setValor2(teclado.nextDouble());
			divisao.CalcularValores();
			System.out.println("\nO valor da divisao � de: "+divisao.getValor1());
		}
		
		for(int i = 0;i < 100;i++) {
			System.out.println("\nDeseja fazer outra consulta?");
			System.out.println("|S|-Sim |N|-N�o: ");
			resposta = teclado.next();
			
			while(!resposta.toUpperCase().equals("S") && !resposta.toUpperCase().equals("N")) {
				System.out.println("\nInvalido - tente novamente");
				System.out.println("\nDeseja fazer outra consulta?");
				System.out.println("|S|-Sim |N|-N�o: ");
				resposta = teclado.next();
			}
			
			if(resposta.toUpperCase().equals("S")) {
				System.out.println("Digite o que deseja consultar");
				System.out.println("|S+|-Soma |S-|-Subtra�ao |M|-Multiplica��o |D|-Divis�o: ");
				resposta = teclado.next();
				
				while(!resposta.toUpperCase().equals("S+") && !resposta.toUpperCase().equals("S-") && !resposta.toUpperCase().equals("M") && !resposta.toUpperCase().equals("D")) {
					System.out.println("\nInvalido - tente novamente");
					System.out.println("Digite o que deseja consultar");
					System.out.println("|S+|-Soma |S-|-Subtra�ao |M|-Multiplica��o |D|-Divis�o: ");
					resposta = teclado.next();
				}
				
				if(resposta.toUpperCase().equals("S+")) {  //VALIDA��O DA SOMA
					System.out.println("\nDIgite o seu primeiro valor: ");
					soma.setValor1(teclado.nextDouble());
					System.out.println("\nDigite o seu segundo valor: ");
					soma.setValor2(teclado.nextDouble());
					soma.CalcularValores();
					System.out.println("\nO valor da soma � de: "+soma.getValor1());
				}
				
				if(resposta.toUpperCase().equals("S-")) {  //VALIDA��O DA SUBTRA��O
					System.out.println("\nDIgite o seu primeiro valor: ");
					subtra�ao.setValor1(teclado.nextDouble());
					System.out.println("\nDigite o seu segundo valor: ");
					subtra�ao.setValor2(teclado.nextDouble());
					subtra�ao.CalcularValores();
					System.out.println("\nO valor da subtra�ao � de: "+subtra�ao.getValor1());
				}
				
				if(resposta.toUpperCase().equals("M")) {  //VALIDA��O DA MULTIPLICA��O
					System.out.println("\nDIgite o seu primeiro valor: ");
					multiplica�ao.setValor1(teclado.nextDouble());
					System.out.println("\nDigite o seu segundo valor: ");
					multiplica�ao.setValor2(teclado.nextDouble());
					multiplica�ao.CalcularValores();
					System.out.println("\nO valor da multiplica�ao � de: "+multiplica�ao.getValor1());
				}
				
				if(resposta.toUpperCase().equals("D")) {  //VALIDA��O DA DIVIS�O
					System.out.println("\nDIgite o seu primeiro valor: ");
					divisao.setValor1(teclado.nextDouble());
					System.out.println("\nDigite o seu segundo valor: ");
					divisao.setValor2(teclado.nextDouble());
					divisao.CalcularValores();
					System.out.println("\nO valor da divisao � de: "+divisao.getValor1());
				}
			}
			
			if(resposta.toUpperCase().equals("N")) {
				System.out.println("\nObrigado, volte sempre");
				break;
			}
		}
	}
}