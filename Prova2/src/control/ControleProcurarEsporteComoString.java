package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Esporte;
import view.ViewExibirEsportes;
import view.ViewProcurarPorPalavrasIncompletas;

public class ControleProcurarEsporteComoString {
	private BDSimulado bds;

	public ControleProcurarEsporteComoString(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void ProcurarEsporteComoString() {

		ArrayList<Esporte> esportes = bds.getEsportes();

		ViewProcurarPorPalavrasIncompletas vppi = new ViewProcurarPorPalavrasIncompletas();

		// Recupera letra/palavra passada por Usuario
		String nome = vppi.getNome().toUpperCase();

		String pecs = "";
		for (int i = 0; i < esportes.size(); i++) {
			if (esportes.get(i).getModalidade().toUpperCase().contains(nome)) {
				pecs += esportes.get(i).getEsporte() + "n";

			}
		}
		ViewExibirEsportes ves = new ViewExibirEsportes(pecs);
	}

}
