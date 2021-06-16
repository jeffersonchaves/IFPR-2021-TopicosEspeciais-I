package models;

public class GerenciarCoisasAlugaveis {
	
	
	public void realizarAluguel(Alugavel alugavel) {
		
		Double preco = null;
		
		if(alugavel.alugar()) {
			
			preco = Double.valueOf(alugavel.calcular(24));
			
		}
		
		System.out.println("me pague " + preco);
		
	}

}
