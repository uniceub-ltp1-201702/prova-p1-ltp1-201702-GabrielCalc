import java.time.LocalDateTime;

public class Ligacao {
	
	private int código;
	private String numTelDestino;
	private LocalDateTime dataeHoraInicio;
	private LocalDateTime dataeHoraFim;
	private String cidadeDestino;
	private String UFDestino;
	private Cliente clienteLigação;
	
	
	public LocalDateTime getDataeHoraInicio() {
		return dataeHoraInicio;
	}

	public void setDataeHoraInicio(LocalDateTime dataeHoraInicio) {
		this.dataeHoraInicio = dataeHoraInicio;
	}

	public LocalDateTime getDataeHoraFim() {
		return dataeHoraFim;
	}

	public void setDataeHoraFim(LocalDateTime dataeHoraFim) {
		this.dataeHoraFim = dataeHoraFim;
	}
		
	

	@Override
	public String toString() {
		return "Ligação [código=" + código + ", numTelDestino=" + numTelDestino + " cidadeDestino = "
				+ cidadeDestino + ", UFDestino=" + UFDestino + ", clienteLigação=" + clienteLigação + "]";
	}

	public Ligacao(int código, String numTelDestino, LocalDateTime dataInicio, LocalDateTime horaInicio, String cidadeDestino, String uFDestino, Cliente clienteLigação) {
		super();
		this.código = código;
		this.numTelDestino = numTelDestino;
		this.cidadeDestino = cidadeDestino;
		UFDestino = uFDestino;
		this.clienteLigação = clienteLigação;
		this.dataeHoraInicio = dataeHoraInicio;
		this.dataeHoraFim = dataeHoraFim;
	}
	
	public int getCódigo() {
		return código;
	}
	public void setCódigo(int código) {
		this.código = código;
	}
	public String getNumTelDestino() {
		return numTelDestino;
	}
	public void setNumTelDestino(String numTelDestino) {
		this.numTelDestino = numTelDestino;
	}
	public String getCidadeDestino() {
		return cidadeDestino;
	}
	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}
	public String getUFDestino() {
		return UFDestino;
	}
	public void setUFDestino(String uFDestino) {
		UFDestino = uFDestino;
	}
	public Cliente getClienteLigação() {
		return clienteLigação;
	}
	public void setClienteLigação(Cliente clienteLigação) {
		this.clienteLigação = clienteLigação;
	}
	
	
	

}
