package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ManipuladorArquivo {

	public void write(String path, String text, boolean novo) {
		try {

			FileWriter fw = new FileWriter(path, novo);
			fw.write(text + "\n");
			fw.close();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel abrir o arquivo para escrita");
		}

	}
	public void ApagarTudoDoArquivo(String path) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(path);
			writer.print("");
			writer.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado");
			e.printStackTrace();
		}
		
	}

	public ArrayList<String> readAll(String path) {

		ArrayList<String> lines = new ArrayList<String>();

		try {

			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);

			String line = "";

			while ((line = br.readLine()) != null) {
				lines.add(line);
			}

			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel abrir o arquivo para leitura");
		} catch (IOException e) {

		}

		return lines;
	}

}