package br.com.Openbook.negocio;

public enum Genero {
	AGROPECUARIA("AGROPECUÁRIA"), ANTOLOGIAS("ANTOLOGIAS"), AUTOAJUDA(
			"AUTOAJUDA"), AVENTURA("AVENTURA"), BIOGRAFICOS("BIOGRÁFICOS"), CIENTIFICOS(
			"CIENTÍFICOS"), CONTOS("CONTOS"), CRONICAS("CRÔNICAS"), DIDATICOS(
			"DIDÁTICOS"), EPICO("ÉPICO"), FANTASIA("FANTASIA"), FICCAO_CIENTIFICA(
			"FICÇÃO CIENTÍFICA"), FICCAO_HISTORICA("FICÇÃO HISTÓTICA"), VIAGEM(
			"VIAGEM"), HORROR("HORROR"), INFANTOJUVENIS("INFATOJUVENIS"), MANUAIS(
			"MANUAIS"), MEMORIAS("MEMÓRIAS"), POESIA("POESIA"), POLITICA(
			"POLÍTICA"), POLICIAL("POLICIAL"), PROPAGANDA_MARKETING(
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
