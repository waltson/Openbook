package br.com.Openbook.negocio;

public enum Genero {
	AGROPECUARIA("AGROPECU�RIA"), ANTOLOGIAS("ANTOLOGIAS"), AUTOAJUDA(
			"AUTOAJUDA"), AVENTURA("AVENTURA"), BIOGRAFICOS("BIOGR�FICOS"), CIENTIFICOS(
			"CIENT�FICOS"), CONTOS("CONTOS"), CRONICAS("CR�NICAS"), DIDATICOS(
			"DID�TICOS"), EPICO("�PICO"), FANTASIA("FANTASIA"), FICCAO_CIENTIFICA(
			"FIC��O CIENT�FICA"), FICCAO_HISTORICA("FIC��O HIST�TICA"), VIAGEM(
			"VIAGEM"), HORROR("HORROR"), INFANTOJUVENIS("INFATOJUVENIS"), MANUAIS(
			"MANUAIS"), MEMORIAS("MEM�RIAS"), POESIA("POESIA"), POLITICA(
			"POL�TICA"), POLICIAL("POLICIAL"), PROPAGANDA_MARKETING(
			"PROGARANDA E MARKERTING"), ROMANCES("ROMANCES"), TERROR("TERROR"), SUSPENSE(
			"SUSPENSE");

	private String genero;

	Genero(String genero) {
		this.genero = genero;

	}

	public String getGenero() {
		return genero;
	}

	public static String[] elementos = null;

	public static String[] names() {
		if (elementos != null)
			return elementos;
		Genero[] generos = values();
		elementos = new String[generos.length];

		for (int i = 0; i < generos.length; i++) {
			elementos[i] = generos[i].toString();
		}

		return elementos;
	}

	public String toString() {
		return genero;
	}

	public static Genero getValueOf(String str) {
		Genero[] ci = values();
		Genero ret = null;
		for (int i = 0; i < ci.length; i++) {
			if (str.equalsIgnoreCase(ci[i].toString())) {
				ret = ci[i];
				break;
			}
		}
		return ret;
	}
}
