package br.com.Openbook.negocio;

public class Cliente {

	private String nome;
	private String sexo;
	private String endereco;
	private String bairro;
	private String cidade;
	private Estados estado;
	private String cep;
	private String tel;
	private String cpf;

	public Cliente() {
		super();
	}

	public Cliente(String nome, String sexo, String endereco, String bairro,
			String cidade, Estados estado, String cep, String tel, String cpf) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.tel = tel;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estados) {
		this.estado = estados;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public static String[] getColunas() {
		// TODO Auto-generated method stub
		return new String[] { "id_cliente", "nome_cliente", "endereco_cliente",
				"bairro_cliente", "cidade_cliente", "estado_cliente",
				"cep_cliente", "telefone_cliente", "cpf_cliente",
				"sexo_cliente" };
	}

}
