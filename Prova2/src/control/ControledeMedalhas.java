package control;
import java.util.ArrayList;
import model.BDSimulado;
import model.Medalha;
import view.ViewExibirPaises;
import view.ViewPaisesAssociados;
public class ControledeMedalhas {

	private BDSimulado bds;

	public ControledeMedalhas(BDSimulado bds) {
		this.bds = bds;
	}
	@SuppressWarnings("unused")
	public void Medalhas() {

		ArrayList<Medalha> medalhas = bds.getMedalhas();
		String m = "";
		for (int i = 0; i < medalhas.size(); i++) {

			if (medalhas.get(i).getPais().equalsIgnoreCase("Suriname")
					|| medalhas.get(i).getPais().equalsIgnoreCase("Guiana")
					|| medalhas.get(i).getPais().equalsIgnoreCase("Equador")
					|| medalhas.get(i).getPais().equalsIgnoreCase("Brasil")
					|| medalhas.get(i).getPais().equalsIgnoreCase("Colômbia")
					|| medalhas.get(i).getPais().equalsIgnoreCase("Peru")) {

				m += "\n" + medalhas.get(i).getPais() + 
						"\n Medalha de Ouro: " + medalhas.get(i).getQtdMedalhaOuro() + 
						"\n Medalha de Prata: " + medalhas.get(i).getQtdMedalhaPrata() + 
						"\n Medalhas de Bronze: "+ medalhas.get(i).getQtdMedalhaBronze();
			}
		}
		ViewPaisesAssociados vpa = new ViewPaisesAssociados();
		int tipo = vpa.getValidador();
		if (tipo == 1) {
			for (int i = 0; i < medalhas.size(); i++) {
				if (medalhas.get(i).getPais().equalsIgnoreCase("Chile")
						|| medalhas.get(i).getPais().equalsIgnoreCase("Bolívia")
						|| medalhas.get(i).getPais().equalsIgnoreCase("Venezuela")
						|| medalhas.get(i).getPais().equalsIgnoreCase("Argentina")
						|| medalhas.get(i).getPais().equalsIgnoreCase("Uruguai")
						|| medalhas.get(i).getPais().equalsIgnoreCase("Paraguai")) {
					m += "\n" + medalhas.get(i).getPais() + 
							"\n Medalha de Ouro: " + medalhas.get(i).getQtdMedalhaOuro()+ 
							"\n Medalha de Prata: " + medalhas.get(i).getQtdMedalhaPrata() + 
							"\n Medalhas de Bronze: " + medalhas.get(i).getQtdMedalhaBronze();
				}
			}
		}
		ViewExibirPaises vep = new ViewExibirPaises(m);
	}
}
