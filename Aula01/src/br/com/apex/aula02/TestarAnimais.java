package br.com.apex.aula02;

public class TestarAnimais {

	public static void main(String[] args) {
		
	Mamifero camelo = new Mamifero("Camelo",150,4,"Amarelo","Terra",2,"Frutas");
	
	Peixe tubarao = new Peixe("Tubarao",300,0,"Cinzento", "Mar",1.5f,"Barbatanas e caudas");
	
	Mamifero ursoCanada = new Mamifero("Urso-do-canada",180,4, "Vermelho", "Terra",0.5f,"Mel");
	
	
	camelo.dadosMamifero();
	tubarao.dadosPeixe();
	ursoCanada.dadosMamifero();

	}

}
