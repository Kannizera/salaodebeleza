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
			servico.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Qual o pre�o? ")));
			servico.setTempo(Integer.parseInt(JOptionPane.showInputDialog("Qual o tempo? ")));
		
			listaServicos.add(servico);
			resposta  = JOptionPane.showInputDialog("Deseja cadastrar outro servi�o? Sim ou N�o ");
		}

		
		System.out.println("qtd de servicos: " + listaServicos.size());
		
		

	}

}
