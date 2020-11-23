package model;

import controller.DenunciaDAO;
import java.util.ArrayList;

public class Denuncia {

	private int tipoDenuncia;
	private String endereco;
	private String observacao;
	
	public Denuncia() {
	}
	
	public Denuncia (int tipoDenuncia, String endereco, String observacao ) {
		this.tipoDenuncia = tipoDenuncia;
		this.endereco = endereco;
		this.observacao = observacao;
	}
	public  static ArrayList<Denuncia> getListaDenuncia() {
		return DenunciaDAO.carregarListaDenuncia();
	}

	public int getTipoDenuncia() {
		return tipoDenuncia;
	}

	public void setTipoDenuncia(int tipoDenuncia) {
		this.tipoDenuncia = tipoDenuncia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	// Cadastra novo aluno
	public static void cadastrarDenuncia(int tipoDenuncia, String endereco, String observacao) {
		DenunciaDAO.cadastrarDenuncia(tipoDenuncia, endereco, observacao);
	}

	// Deleta um aluno espec�fico pelo seu campo ID
	public static void deletarDenuncia(int id) {
		DenunciaDAO.deletarDenuncia(id);
	}

	// Edita um aluno espec�fico pelo seu campo ID
	public static void editarDenuncia(int id) {
		DenunciaDAO.editarDenuncia(id);
	}

	// carrega dados de um aluno espec�fico pelo seu ID
	public static void getDenuncia(int id) {
		DenunciaDAO.carregarDenuncia(id);
	}

}
