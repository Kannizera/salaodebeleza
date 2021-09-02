package salao;

public abstract class Funcionario {
	
	private String nome;
	private Double salarioBasico;
	
	public Funcionario() {
		super();
        System.out.println("passei pelo construtor do funcionario");
	}

	public Funcionario(String nome, Double salarioBasico) {
		super();
		this.nome = nome;
		this.salarioBasico = salarioBasico;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioBasico() {
		return salarioBasico;
	}

	public void setSalarioBasico(Double salarioBasico) {
		this.salarioBasico = salarioBasico;
	}

    public abstract void comporSalario();
	
	
}
