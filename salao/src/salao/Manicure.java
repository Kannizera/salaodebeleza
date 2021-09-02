package salao;

public class Manicure extends Funcionario {
  private Integer produtividade=1; //escala de 1 a 3 (1 - 10% de aumento; 2 - 20% ; 3 - 30% )
 

public Manicure(Integer produtividade) {
	super();
	this.produtividade = produtividade;
}

public Manicure() {
	
	System.out.println("passei pelo construtor do manicure");

}

public Integer getProdutividade() {
	return produtividade;
}

public void setProdutividade(Integer produtividade) {
	this.produtividade = produtividade;
}


public void comporSalario() {
	 
	 if (produtividade.equals(1)) 
		 super.setSalarioBasico(super.getSalarioBasico() * 1.1);
	 else
		 if (produtividade.equals(2))
			 super.setSalarioBasico(super.getSalarioBasico() * 1.2);
		 else super.setSalarioBasico(super.getSalarioBasico() * 1.3);
		 
	 System.out.println("Salario do manicure: " + super.getSalarioBasico());
	 
}	
	
}
