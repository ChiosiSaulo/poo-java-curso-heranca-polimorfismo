package exercicio2.entities;

public class PessoaJuridica extends Contribuinte{
	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double renda, Integer numeroFuncionarios) {
		super(nome, renda);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double calcularImposto() {
		double imposto;
		if(numeroFuncionarios < 10) {
			imposto = super.getRenda() * 0.16;
		}else {
			imposto = super.getRenda() * 0.14;
		}
		return imposto;
	}
	
	
}
