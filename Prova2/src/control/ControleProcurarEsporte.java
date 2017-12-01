package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Esporte;
import view.ViewProcurarEsporte;
import view.ViewSolicitarEsporte;

public class ControleProcurarEsporte {

	private BDSimulado bds;

	public ControleProcurarEsporte(BDSimulado bds) {
		this.bds = bds;
	}
	@SuppressWarnings("unused")
	public void ProcurarModalidade() {

		ArrayList<Esporte> esportes = bds.getEsportes();
		ViewSolicitarEsporte vse = new ViewSolicitarEsporte();
		String nomeEsporte = vse.getEsporte();
		String e = "";
		for (int i = 0; i < esportes.size(); i++) {
			if (esportes.get(i).getEsporte().equalsIgnoreCase(nomeEsporte)) {
				e += "Esporte: " + esportes.get(i).getEsporte() + " - " + "Modalidade: "
						+ esportes.get(i).getModalidade();
			}
		}
		ViewProcurarEsporte vpe = new ViewProcurarEsporte(e);
	}
}
