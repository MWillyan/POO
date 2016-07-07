package aplicativo.br;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Usuario usuario = new Usuario();
		Pagamento pagamento = new Pagamento();
		Divida divida = new Divida();
		Banco banco = new Banco();
		Cadastrar cadastrar = new Cadastrar();
		Relatorio relatorio = new Relatorio();
		ArrayList<Pagamento> listaDePagamento = new ArrayList<Pagamento>();
		ArrayList<Divida> listaDeDivida = new ArrayList<Divida>();
		
		
		boolean continuar = true;
	
		do{
			System.out.println("---------APP Fina�as Pessoais---------\n");
			System.out.println("Digite a op��o desejada: \n");
						
			System.out.println("1 - Realizar pagamento \n");
			System.out.println("2 - Cadastrar Usuario \n");
			System.out.println("3 - Cadastrar Divida \n");
			System.out.println("4 - Cadastrar Banco \n");
			System.out.println("5 - Relatorios \n");
			System.out.println("0 - Sair \n");
			int opc = scanner.nextInt();
			
			if(opc == 1){
				Pagamento p = cadastrar.incluirPagamento();
				if(p != null){
					listaDePagamento.add(p);
					for(Divida d : listaDeDivida){
						if(d.getCodigoDivida() == p.getCodigoDivida()){
							listaDeDivida.remove(d);
							break;
						}
					}
				}
			}
			if(opc == 2){
				System.out.println("2 - Cadastrar Usuario\n");
				cadastrar.incluirUsuario();
			}
			if(opc == 3){
				System.out.println("3 - Cadastrar Divida\n");
				cadastrar.incluirDivida();
				Divida d = cadastrar.incluirDivida();
				listaDeDivida.add(d);
			}
			if(opc == 4){
				System.out.println("4 - Cadastrar Banco\n");
				cadastrar.incluirBanco();
			}
			if(opc == 5){
				System.out.println("1 -Relatorio de Pagamentos \n");
				System.out.println("2 - Reatorio de Dividas \n");
				int opc1 = scanner.nextInt();
				if(opc1 == 1){
					relatorio.gerar(listaDePagamento, usuario);
				}else{
					relatorio.gerarD(listaDeDivida, usuario);
				}
			}
			
			if(opc == 0){
				continuar = false;
				System.out.println("Aplicativo finalizado!");
			}
		}while(continuar);
		
		
	}

}
