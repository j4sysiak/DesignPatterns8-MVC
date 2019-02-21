package pl.jaceksysiak.designpatterns.demo1;

import javax.swing.SwingUtilities;

import pl.jaceksysiak.designpatterns.demo1.controller.Controller;
import pl.jaceksysiak.designpatterns.demo1.model.Model;
import pl.jaceksysiak.designpatterns.demo1.view.View;

public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				runApp();
			}
			
		});
	}
	
	public static void runApp() {
		Model model = new Model();
		View view = new View(model);  //subject (tego podmiotu b�dziemy nas�uchiwa�)

		Controller controller = new Controller(view, model);  // obserwator zdarzenia: objekt controller nas�uchuje view (zdarzenia odpalenia logowania)
		 
		view.setLoginListener(controller);
	}

}
