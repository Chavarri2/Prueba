package modelo;

import javax.swing.DefaultListModel;

public class ListaPersonaModelo {
	
	private DefaultListModel<Persona>modelo;
	
	public ListaPersonaModelo() {
		modelo=new DefaultListModel<Persona>();
	}
	
	public DefaultListModel<Persona> getModelo(){
		return modelo;
	}
	
}
