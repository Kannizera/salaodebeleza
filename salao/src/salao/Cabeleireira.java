package salao;

public class Cabeleireira extends Funcionario {
	
	private Double comissao;  //percentual de acrescimo ao salarioBasico

	public Cabeleireira() {
		super();
	}

	public Cabeleireira(Double comissao) {
		super();
		this.comissao = comissao;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	
	public void comporSalario() {
		
		super.setSalarioBasico(super.getSalarioBasico() + (super.getSalarioBasico() * comissao /100)); 
		System.out.println("Salario do cabeleireiro: " + super.getSalarioBasico());
	}

}
