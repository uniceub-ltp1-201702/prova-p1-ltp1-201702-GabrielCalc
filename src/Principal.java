import java.util.ArrayList;

public class Principal {
	//Nome: Gabriel Gago Duro Calcagno RA:21708493

	public static void main(String[] args) {
		
		BDSimulado bds = new BDSimulado();
		
		//Resposta 2a
		System.out.println(bds.getInfoCliente("Evandro da Silva"));
		System.out.println(bds.getInfoCliente("João dos Montes"));
		
		//Resposta 2b
		System.out.println(bds.ligacoesPorCliente("Maria do Socorro"));
		
		//Resposta 2c
		System.out.println(bds.ligacoesPorUF("DF"));
		
		//Resposta 2d
		System.out.println(bds.ligacoesUFDiferente());
	}

}
