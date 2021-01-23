package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.SistemaEscolarModel;
import view.SistemaEscolarView;

public class SistemaEscolaContoller {
	
	private SistemaEscolarModel model;
	private SistemaEscolarView view;
	
	public SistemaEscolaContoller(SistemaEscolarModel model, SistemaEscolarView view ) {
		this.model = model;
		this.view = view;
		this.view.SistemaEscolarListener(new SistemaEscolarListener);
	}
	
	
	class SistemaEscolarListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			double nota1 = 0;
			double nota2 = 0;
			double nota3 = 0;
			double nota4 = 0;
			
			nota1 = view.getNota1();
			nota2 = view.getNota2();
			nota3 = view.getNota3();
			nota4 = view.getNota4();
			
			model.somar();
			
			view.
			
		}
		
	}
	
	

}
