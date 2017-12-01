package control;

import java.io.IOException;
import javax.swing.JOptionPane;
import control.ControleProcurarEsporte;
import control.ControleProcurarEsporteComoString;
import control.ControleRegistrarEsporte;
import control.ControleDiferençaPaises;
import control.ControledeMedalhas;
import model.BDSimulado;
import view.ViewPrincipal;

public class ControlePrincipal {

		private BDSimulado bds;
		private ViewPrincipal vp;
		private ControleProcurarEsporte cpe;
		private ControleProcurarEsporteComoString cpes;
		private ControleDiferençaPaises cdp;
		private ControledeMedalhas cm;
		private ControleRegistrarEsporte cre;
		private ControleDiferençaEstadosUnidos cdeu;

		public ControlePrincipal() throws IOException {

			this.bds = new BDSimulado();

			this.vp = new ViewPrincipal();

			this.cpe = new ControleProcurarEsporte(bds);
			this.cpes = new ControleProcurarEsporteComoString(bds);
			this.cdp = new ControleDiferençaPaises(bds);
			this.cm = new ControledeMedalhas(bds);
			this.cre = new ControleRegistrarEsporte(bds);

			tratarOpcao(this.vp.getOpcao());
		}

		public void tratarOpcao(String opcao) throws IOException {

			while (true) {
				switch (opcao) {
				case "1":
					this.cpe.ProcurarModalidade();
					break;
				case "2":
					this.cdeu.DiferençaEstadosUnidos();
					break;
				case "3":
					this.cdp.DiferençaPaises();
					break;
				case "4":
					this.cm.Medalhas();
					break;
				case "5":
					this.cpes.ProcurarEsporteComoString();
					break;
				case "6":
					this.cre.RegistrarEsporte();
					break;
				case "7":
					JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema");
					return;
				default:
					JOptionPane.showConfirmDialog(null, "Digite algumas dos opções acima");
				}
				opcao = this.vp.getOpcao();
			}

		}

}
