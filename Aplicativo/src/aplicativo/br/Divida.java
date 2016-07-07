package aplicativo.br;

import java.util.Date;

public class Divida {
	
	private int codigoDivida;
	
	public int getCodigoDivida() {
		return codigoDivida;
	}

	public void setCodigoDivida(int codigoDivida) {
		this.codigoDivida = codigoDivida;
	}

	private String nomeDivida;
	
	private String vencimento;
	
	private double valorDivida;
	
	private Usuario usuario;

	public String getNomeDivida() {
		return nomeDivida;
	}

	public void setNomeDivida(String nomeDivida) {
		this.nomeDivida = nomeDivida;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String venc) {
		this.vencimento = venc;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void imprimirDetalhes(int i){
		System.out.println("Pagamento numero: "+i);
		System.out.println("Valor Divida: "+valorDivida);
		System.out.println("Data vencimento: "+vencimento);
		System.out.println("Nome Divida: "+nomeDivida);
	}

}
