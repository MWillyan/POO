package aplicativo.br;

import java.util.ArrayList;
import java.util.Scanner;

public class Relatorio {
	
	public void gerar(ArrayList<Pagamento> lista, Usuario user){
		System.out.println("|--------------------------|");
		System.out.println("| Relatorio de Pagamentos  |");
		System.out.println("|--------------------------|");
		
		int i = 0;
		
		for(Pagamento pagamento: lista ){
			i++;
			pagamento.imprimirDetalhes(i);
			System.out.println("Nome do usuario: "+user.getNome());
			System.out.println("|-------------------------|");
		}
		System.out.println("|--------------------------|");
		
	}
	
	public void gerarD(ArrayList<Divida> lista, Usuario user){
		System.out.println("|--------------------------|");
		System.out.println("| Relatorio de Dividas     |");
		System.out.println("|--------------------------|");
		
		int i = 0;
		
		for(Divida divida: lista){
			i++;
			divida.imprimirDetalhes(i);
			System.out.println("Nome do usuario: "+user.getNome());
			System.out.println("|-------------------------|");
		}
		System.out.println("|--------------------------|");
	}

}
