package exercicio2.entities;

public class PessoaFisica extends Contribuinte{
	private Double gastos;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double renda, Double gastos) {
		super(nome, renda);
		this.gastos = gastos;
	}

	public Double getGastos() {
		return gastos;
	}

	public void setGastos(Double gastos) {
		this.gastos = gastos;
	}

	@Override
	public Double calcularImposto() {
		double imposto;
		if(super.getRenda() >= 20000) {
			imposto = super.getRenda() * 0.25;
		}else {
			imposto = super.getRenda() * 0.15;
		}
		if(gastos != 0) {
			imposto -= gastos * 0.5;
		}
		return imposto;
	}
	
	
	
	
	

}
