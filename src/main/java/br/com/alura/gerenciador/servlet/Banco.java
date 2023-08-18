package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Empresa> lista = new ArrayList<>();

	public void adiciona(Empresa empresa) {
		// TODO Auto-generated method stub
		lista.add(empresa);
		System.out.println("OK REGISTERED");
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}
}
