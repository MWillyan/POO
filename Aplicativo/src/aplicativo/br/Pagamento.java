package aplicativo.br;

import java.util.Date;

public class Pagamento {
	
	private int codigoDivida;
	
	public int getCodigoDivida() {
		return codigoDivida;
	}



	public void setCodigoDivida(int codigoDivida) {
		this.codigoDivida = codigoDivida;
	}



	private double vlrPagamento;
	
	private String dataPagamento;
	
	private String nomePagamento;
	
	private String usuario;
	
		
	public double getVlrPagamento() {
		return vlrPagamento;
	}



	public void setVlrPagamento(double vlrPagamento) {
		this.vlrPagamento = vlrPagamento;
	}



	public String getDataPagamento() {
		return dataPagamento;
	}



	public void setDataPagamento(String d) {
		this.dataPagamento = d;
	}



	public String getNomePagamento() {
		return nomePagamento;
	}



	public void setNomePagamento(String nomePagamento) {
		this.nomePagamento = nomePagamento;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String vetor) {
		this.usuario = vetor;
	}
	
	public void imprimirDetalhes(int i){
		System.out.println("Pagamento numero: "+i);
		System.out.println("Valor Pagamento: "+vlrPagamento);
		System.out.println("Data Pagamento: "+dataPagamento);
		System.out.println("Nome Pagamento: "+nomePagamento);
		
	}



	public String toString(String delimitador) {
		// TODO Auto-generated method stub
		return null;
	}



	public Long getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
