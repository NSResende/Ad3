package controller;

import model.Denuncia;
import java.util.ArrayList;

public class denunciaControl {

	private int ultimoID;

	public denunciaControl() {
		ultimoID = 1;
	}

	public int getUltimoID() {
		return ultimoID;
	}

	public void setUltimoID(int ultimoID) {
		this.ultimoID = ultimoID;
	}

	public void cadastrarDenuncia(int tipoDenuncia, String endereco, String observacao) {
		Denuncia.cadastrarDenuncia(tipoDenuncia, endereco, observacao);
	}

	public void editarDenuncia(int id) {
		Denuncia.editarDenuncia(id);
	}

	public void deletarDenuncia(int id) {
		Denuncia.deletarDenuncia(id);
	}

	// PASSAGEM DE INFORMAÇAO
	public  void getDenuncia(int id) {
		Denuncia.getDenuncia(id);
	}

	public static ArrayList<Denuncia> getListaDenuncia() {
		return Denuncia.getListaDenuncia();
	}

}
