package models;

public class CarroAlugavel implements Alugavel {
	
	
	public Boolean alugar() {
		
		/*
		if (tem carro em estoque) {
			return Carro
		}
		*/
		
		return true;
	}
	
	public Integer calcular(Integer horas) {
		
		return horas * 25;
		
	}

	public String dizerMarca() {
		// TODO Auto-generated method stub
		return null;
	}

}
