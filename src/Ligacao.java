import java.time.LocalDateTime;

public class Ligacao {
	
	private int c�digo;
	private String numTelDestino;
	private LocalDateTime dataeHoraInicio;
	private LocalDateTime dataeHoraFim;
	private String cidadeDestino;
	private String UFDestino;
	private Cliente clienteLiga��o;
	
	
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
		return "Liga��o [c�digo=" + c�digo + ", numTelDestino=" + numTelDestino + " cidadeDestino = "
				+ cidadeDestino + ", UFDestino=" + UFDestino + ", clienteLiga��o=" + clienteLiga��o + "]";
	}

	public Ligacao(int c�digo, String numTelDestino, LocalDateTime dataInicio, LocalDateTime horaInicio, String cidadeDestino, String uFDestino, Cliente clienteLiga��o) {
		super();
		this.c�digo = c�digo;
		this.numTelDestino = numTelDestino;
		this.cidadeDestino = cidadeDestino;
		UFDestino = uFDestino;
		this.clienteLiga��o = clienteLiga��o;
		this.dataeHoraInicio = dataeHoraInicio;
		this.dataeHoraFim = dataeHoraFim;
	}
	
	public int getC�digo() {
		return c�digo;
	}
	public void setC�digo(int c�digo) {
		this.c�digo = c�digo;
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
	public Cliente getClienteLiga��o() {
		return clienteLiga��o;
	}
	public void setClienteLiga��o(Cliente clienteLiga��o) {
		this.clienteLiga��o = clienteLiga��o;
	}
	
	
	

}
