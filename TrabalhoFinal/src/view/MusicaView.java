package view;

import javax.swing.JOptionPane;

public class MusicaView {
	
	//SOLICITAR NOME DA MUSICA AO USUÁRIO
	public String perguntarMusica() {
		String musica = JOptionPane.showInputDialog("Digite o nome da Musica:");
		if(musica == null){
			return null;
		}
		if (musica.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Digite uma musica!");
				return perguntarMusica();
			}
		
		return musica;
	
	}
	
}
