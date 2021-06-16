package models;

public class ComputadorAlugavel implements Alugavel  {
		
		
	public Boolean alugar() {
		
		/*
		if (tem carro em estoque) {
			return Carro
		}
		*/
		
		return true;
	}
	
	public Integer calcular(Integer horas) {
		
		return horas * 50;
		
	}

	public String dizerMarca() {
		return null;
	}

}

