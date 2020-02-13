package cadastro;

import java.util.Date;

public class DadosPessoais {
	
	private Integer id;
	private String nomeDoMembro;
	private Date dataNascimento;	
	private Date dataDeCasamento;
	private String nomeDoPai;
	private String nomeDaMae;
	private String estadoCivil;
	private String conjuge;
	private String naturalidade;
	private String sexo;
	private String nacionalidade;
	private String profissao;
	private String tipoSanguineo;
	private String formacao;
	private String cpf;
	private String rg;
	private Integer quantidadeDeFilhos;
	
	
	public DadosPessoais() {
		
	}


	public DadosPessoais(Integer id, String nomeDoMembro, Date dataNascimento, Date dataDeCasamento, String nomeDoPai,
			String nomeDaMae, String estadoCivil, String conjuge, String naturalidade, String sexo,
			String nacionalidade, String profissao, String tipoSanguineo, String formacao, String cpf, String rg,
			Integer quantidadeDeFilhos) {
		super();
		this.id = id;
		this.nomeDoMembro = nomeDoMembro;
		this.dataNascimento = dataNascimento;
		this.dataDeCasamento = dataDeCasamento;
		this.nomeDoPai = nomeDoPai;
		this.nomeDaMae = nomeDaMae;
		this.estadoCivil = estadoCivil;
		this.conjuge = conjuge;
		this.naturalidade = naturalidade;
		this.sexo = sexo;
		this.nacionalidade = nacionalidade;
		this.profissao = profissao;
		this.tipoSanguineo = tipoSanguineo;
		this.formacao = formacao;
		this.cpf = cpf;
		this.rg = rg;
		this.quantidadeDeFilhos = quantidadeDeFilhos;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNomeDoMembro() {
		return nomeDoMembro;
	}


	public void setNomeDoMembro(String nomeDoMembro) {
		this.nomeDoMembro = nomeDoMembro;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public Date getDataDeCasamento() {
		return dataDeCasamento;
	}


	public void setDataDeCasamento(Date dataDeCasamento) {
		this.dataDeCasamento = dataDeCasamento;
	}


	public String getNomeDoPai() {
		return nomeDoPai;
	}


	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}


	public String getNomeDaMae() {
		return nomeDaMae;
	}


	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public String getConjuge() {
		return conjuge;
	}


	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}


	public String getNaturalidade() {
		return naturalidade;
	}


	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}


	public String getTipoSanguineo() {
		return tipoSanguineo;
	}


	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}


	public String getFormacao() {
		return formacao;
	}


	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public Integer getQuantidadeDeFilhos() {
		return quantidadeDeFilhos;
	}


	public void setQuantidadeDeFilhos(Integer quantidadeDeFilhos) {
		this.quantidadeDeFilhos = quantidadeDeFilhos;
	}


	@Override
	public String toString() {
		return "DadosPessoais [id=" + id + ", nomeDoMembro=" + nomeDoMembro + ", dataNascimento=" + dataNascimento
				+ ", dataDeCasamento=" + dataDeCasamento + ", nomeDoPai=" + nomeDoPai + ", nomeDaMae=" + nomeDaMae
				+ ", estadoCivil=" + estadoCivil + ", conjuge=" + conjuge + ", naturalidade=" + naturalidade + ", sexo="
				+ sexo + ", nacionalidade=" + nacionalidade + ", profissao=" + profissao + ", tipoSanguineo="
				+ tipoSanguineo + ", formacao=" + formacao + ", cpf=" + cpf + ", rg=" + rg + ", quantidadeDeFilhos="
				+ quantidadeDeFilhos + "]";
	}
	
	
	

}
