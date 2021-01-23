package principal;

import controler.CalculadoraController;
import model.CalculadoraModel;
import view.CalculadoraView;

public class Principal {
	
	public static void main(String[] args) {
		
		CalculadoraView view = new CalculadoraView();
		CalculadoraModel model = new CalculadoraModel();
		CalculadoraController controller = new CalculadoraController(model, view);
		
		view.setVisible(true);
	}

}






