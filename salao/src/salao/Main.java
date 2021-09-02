package salao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		ArrayList<Servico> listaServicos = new ArrayList<Servico>(); 
		
		String resposta = "Sim";
		while(resposta.equals("Sim")) {
			Servico servico = new Servico();
		
			servico.setDescricao(JOptionPane.showInputDialog("Qual a descricao? "));
			servico.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Qual o preço? ")));
			servico.setTempo(Integer.parseInt(JOptionPane.showInputDialog("Qual o tempo? ")));
		
			listaServicos.add(servico);
			resposta  = JOptionPane.showInputDialog("Deseja cadastrar outro serviço? Sim ou Não ");
		}
	
		System.out.println("qtd de servicos: " + listaServicos.size());

//		Funcionario f = new Funcionario();
		
		Manicure m = new Manicure();
		
		m.setNome(JOptionPane.showInputDialog("Qual seu nome? "));
		m.setSalarioBasico(Double.parseDouble(JOptionPane.showInputDialog("Qual seu salário básico? ")));
		m.setProdutividade(Integer.parseInt(JOptionPane.showInputDialog("Qual sua produtividade (1; 2 ou 3) ")));
		m.comporSalario();
		
		Cabeleireira c = new Cabeleireira();
		c.setNome(JOptionPane.showInputDialog("Qual seu nome? "));
		c.setSalarioBasico(Double.parseDouble(JOptionPane.showInputDialog("Qual seu salário básico? ")));
		c.setComissao(Double.parseDouble(JOptionPane.showInputDialog("Qual seu percentual de comissao? ")));
		c.comporSalario();

		
	}

}
