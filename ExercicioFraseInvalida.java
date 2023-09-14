package senaiprojetos;

import javax.swing.JOptionPane;

public class ExercicioFraseInvalida {

	public static void main(String[] args) {

		/*
		 * Elabore uma classe que receba uma frase e verifique se essa frase possui
		 * palavras impróprias. As palavras impróprias são: sexo e sexual. Caso encontre
		 * uma dessas palavras, emita em tela a mensagem “conteúdo impróprio”, caso
		 * contrário “conteúdo liberado”
		 */

		String[] palavras = { "sexo", "sexual" };
		String fraseFornecida, frase;

		frase = JOptionPane.showInputDialog(null,
				"Digite um frase, o programa irá verificar se existe alguma palavra imprópria");

		fraseFornecida = frase.toLowerCase();

		if (fraseFornecida.contains(palavras[0]) || fraseFornecida.contains(palavras[1])) {
			JOptionPane.showMessageDialog(null, "Conteúdo impróprio");
		} else {
			JOptionPane.showMessageDialog(null, "Conteúdo liberado");

		}

	}

}
