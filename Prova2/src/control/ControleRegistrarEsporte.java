package control;

import model.BDSimulado;
import model.Esporte;
import view.ViewRegistrarModalidade;
import view.ViewSolicitarEsporte;
import view.ViewSolicitarModalidade;

	public class ControleRegistrarEsporte {
		private BDSimulado bds;
		public ControleRegistrarEsporte(BDSimulado bds) {
		this.bds = bds;
	}
		@SuppressWarnings("unused")
	public void RegistrarEsporte() {

		ViewSolicitarEsporte vse = new ViewSolicitarEsporte();
		String nomeEsporte = vse.getEsporte();

		ViewSolicitarModalidade vsm = new ViewSolicitarModalidade();
		String nomeModalidade = vsm.getModalidade();
		Esporte incluir = new Esporte(nomeEsporte, nomeModalidade);
		bds.gravarEsporte(incluir);
			while (true) {
		ViewRegistrarModalidade vcm = new ViewRegistrarModalidade();
		int cadastra = vcm.getValidador();
		if (cadastra == 1) {
		ViewSolicitarModalidade vsm1 = new ViewSolicitarModalidade();
		String nomeModalidade1 = vsm1.getModalidade();
		Esporte incluir2 = new Esporte(nomeEsporte, nomeModalidade);

			} else {
				break;
			}

		}

	}

}
