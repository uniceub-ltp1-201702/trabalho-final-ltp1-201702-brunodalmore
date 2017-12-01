package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Medalha;
import view.ViewDiferençaPaises;
import view.ViewSolicitarPais;

public class ControleDiferençaPaises {

	private BDSimulado bds;

	public ControleDiferençaPaises(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void DiferençaPaises() {

		int diferençaOuroPais1 = 0;
		int diferençaPrataPais1 = 0;
		int diferençaBronzePais1 = 0;
		int diferençaOuroPais2 = 0;
		int diferençaPrataPais2 = 0;
		int diferençaBronzePais2 = 0;

		ArrayList<Medalha> medalhas = bds.getMedalhas();
		ViewSolicitarPais vsp1 = new ViewSolicitarPais();
		String pais1 = vsp1.getPais();
		ViewSolicitarPais vsp2 = new ViewSolicitarPais();
		String pais2 = vsp2.getPais();
		String p = "";
		for (int i = 0; i < medalhas.size(); i++) {
			if (medalhas.get(i).getPais().equals(pais1)) {
				diferençaOuroPais1 = medalhas.get(i).getQtdMedalhaOuro();
				diferençaPrataPais1 = medalhas.get(i).getQtdMedalhaPrata();
				diferençaBronzePais1 = medalhas.get(i).getQtdMedalhaBronze();
			}
			if (medalhas.get(i).getPais().equals(pais1)) {
				diferençaOuroPais2 = medalhas.get(i).getQtdMedalhaOuro();
				diferençaPrataPais2 = medalhas.get(i).getQtdMedalhaPrata();
				diferençaBronzePais2 = medalhas.get(i).getQtdMedalhaBronze();
			}
		}
		diferençaOuroPais2 = diferençaOuroPais2 - diferençaOuroPais1;
		diferençaPrataPais2 = diferençaPrataPais1 - diferençaPrataPais2;
		p += "Diferença de Medalha entre entre os paises " + pais1 + " e " + pais2 + "\n - Quantidades Medalhas de Ouro: "
				+ diferençaOuroPais2 + "\n - Quantidades Medalhas de Prata: " + diferençaPrataPais2
				+ "\n - Quantidades Medalhas de Bronze: " + diferençaBronzePais2;

		ViewDiferençaPaises vde = new ViewDiferençaPaises(p);
	}
}
