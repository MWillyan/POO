package aplicativo.br;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LeitorDeArquivo {
	
	 public ArrayList<Pagamento> lerOsProdutosSalvos(String nomeDoArquivo){

	        String delimitador = "&";

	        ArrayList<Pagamento> lista = new ArrayList<Pagamento>();

	        System.out.println("|-----------------------------------------------|");
	        System.out.println("|  Leitura do Arquivo :: "+nomeDoArquivo);
	        System.out.println("|-----------------------------------------------|");

	        try{

	            FileReader fileReader = new FileReader(nomeDoArquivo);
	            Scanner scanner = new Scanner(fileReader);

	            while (scanner.hasNext()) {

	                Pagamento pagamento = new Pagamento();

	                String linha = scanner.nextLine();

	                String[] vetor = linha.split(delimitador);

	                pagamento.setVlrPagamento(Long.parseLong(vetor[0]));
	                pagamento.setNomePagamento(vetor[1]);
	                pagamento.setUsuario(vetor[2]);
	                pagamento.setDataPagamento(vetor[3]);

	                lista.add(pagamento);

	            }

	        }catch (FileNotFoundException e){
	            System.out.println("| ==> ERRO :: arquivo com nome \""+nomeDoArquivo+"\" não foi econtrado.");
	        }catch (Exception e){
	            e.printStackTrace();
	        }

	        return lista;
	    }

}
