package aplicativo.br;

import java.util.Scanner;

public class Cadastrar extends Banco {
	
		Scanner scanner = new Scanner(System.in);
		
		Usuario u = new Usuario();
		Banco b = new Banco();
		Divida d = new Divida();
		
		public Usuario incluirUsuario(){
			System.out.println("Digite o nome do usuario: ");
			String n = scanner.next();
			u.setNome(n);
			return u;
		}
				
		public Banco incluirBanco(){
			System.out.println("Digite o nome da agencia: ");
			String ag = scanner.next();
			System.out.println("Digite o numero da conta: ");
			int num = scanner.nextInt();
			System.out.println("Digite o saldo: ");
			double sald = scanner.nextDouble();
			b.setAgencia(ag);
			b.setNumeroConta(num);
			b.setSaldo(sald);
			return b;
		}
		
		public Pagamento incluirPagamento(){
			System.out.println("Digite o codigo do pagamento: ");
			int c = scanner.nextInt();
			System.out.println("Digite o valor do pagamento: ");
			int v = scanner.nextInt();
			System.out.println("Informe a data do vencimento: ");
			String d = scanner.next();
			System.out.println("De um nome ao pagamento: ");
			String s = scanner.next();
			Pagamento p = new Pagamento();
			p.setCodigoDivida(c);
			p.setVlrPagamento(v);
			p.setDataPagamento(d);
			p.setNomePagamento(s);
			if(p.getVlrPagamento() > b.getSaldo()){
				System.out.println("Impossível realizar pagamento, sem saldo\n");
				return null;
			}
			
			return p;
		}
		
		public Divida incluirDivida(){
			System.out.println("Digite o codigo da divida: ");
			int cod = scanner.nextInt();
			System.out.println("Digite o nome da divida: ");
			String div = scanner.next();
			System.out.println("Digite o vencimento da divida: ");
			String venc = scanner.next();
			System.out.println("Digite o valor da divida: ");
			double vlr = scanner.nextDouble();
			d.setCodigoDivida(cod);
			d.setNomeDivida(div);
			d.setVencimento(venc);
			d.setValorDivida(vlr);
			return d;
			
		}
			
				
}


