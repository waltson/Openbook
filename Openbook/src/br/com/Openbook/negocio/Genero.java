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

	private Genero(String genero) {
		this.genero = genero;

	}

	public String getGenero() {
		return genero;
	}

	public static String[] elementos = null;

	public static String[] elementos() {
		if (elementos != null)
			return elementos;
		Genero[] generos = values();
		elementos = new String[generos.length];

		for (int i = 0; i < generos.length; i++) {
			elementos[i] = generos[i].toString();
		}

		return elementos;
	}

	public static Genero getValueOf(String str) {
		Genero[] genero = values();
		Genero ret = null;
		for (int i = 0; i < genero.length; i++) {
			if (str.equalsIgnoreCase(genero[i].toString())) {
				ret = genero[i];
				break;
			}
		}
		return ret;
	}

	public String toString() {
		return genero;
	}
}
