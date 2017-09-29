import java.time.LocalDate;

public class Cliente {
	
	//Atributos
	
	private String nome;
	private String CPF;
	private LocalDate dataNascimento;
	private String numeroTel;
	private String cidade;
	private String UF;
	
	
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", CPF=" + CPF + ", dataNascimento=" + getDataNascimentoComoString() + ", numeroTel="
				+ numeroTel + ", cidade=" + cidade + ", UF=" + UF + "]";
	}
	
	//Metodo para retornar data como String
		public String getDataNascimentoComoString(){
			return dataNascimento.getDayOfMonth() + "/" +
					dataNascimento.getMonthValue() + "/" +
					dataNascimento.getYear();
		}
		
	public Cliente(String nome, String cPF, LocalDate dataNascimento, String numeroTel, String cidade, String uF) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.dataNascimento = dataNascimento;
		this.numeroTel = numeroTel;
		this.cidade = cidade;
		UF = uF;
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	
	

}
