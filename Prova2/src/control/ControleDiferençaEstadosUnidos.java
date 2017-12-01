package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Medalha;
import view.ViewDiferençaPaises;
import view.ViewSolicitarPais;

public class ControleDiferençaEstadosUnidos {

	private BDSimulado bds;

	public ControleDiferençaEstadosUnidos(BDSimulado bds) {
		this.bds = bds;
	}
	@SuppressWarnings("unused")
	public void DiferençaEstadosUnidos() {

		int diferençaOuro = 0;
		int diferençaPrata = 0;
		int diferençaBronze = 0;
		
		ArrayList<Medalha> medalhas = bds.getMedalhas();

		ViewSolicitarPais vsp = new ViewSolicitarPais();
		String pais = vsp.getPais();
		String p = "";
		for (int i = 0; i < medalhas.size(); i++) {
			if (medalhas.get(i).getPais().equalsIgnoreCase(pais)) {
				diferençaOuro = medalhas.get(i).getQtdMedalhaOuro() - medalhas.get(0).getQtdMedalhaOuro();
				diferençaPrata = medalhas.get(i).getQtdMedalhaPrata() - medalhas.get(0).getQtdMedalhaPrata();
				diferençaBronze = medalhas.get(i).getQtdMedalhaBronze() - medalhas.get(0).getQtdMedalhaBronze();
				p += "Diferença de Medalha dos paises " + pais + " e  os " + medalhas.get(0).getPais()
						+ "\n - Quantidade Medalhas de Ouro: " + diferençaOuro + "\n - Quantidade Medalhas de Prata: "
						+ diferençaPrata + "\n - Quantidade Medalhas de Bronze: " + diferençaBronze;
			}
		}

		ViewDiferençaPaises vde = new ViewDiferençaPaises(p);
	}
}
