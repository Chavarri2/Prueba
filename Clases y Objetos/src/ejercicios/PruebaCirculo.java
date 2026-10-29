package ejercicios;

public class PruebaCirculo { 
	  
	 public static void main(String[] args) { 
	   
	  //Crea un objeto de tipo círculo con valor 
	  // 3.4 de radio y color azul que se llame c1 
	     Circulo c1=new Circulo(3.4,"azul");
	  // Saca por pantalla el área del circulo c1 
	   System.out.println("El area de c1:"+c1.calcularArea());
	     
	  // Modifica el color del circulo a Rojo 
	   c1.setColor("Rojo");
	  // Saca por pantalla el color del circulo c1 
	   System.out.println("El color de c1 es"+ c1.getColor()); 
	  // Saca por pantalla el perímetro del circulo c1 
	   System.out.println("El perimeto de c1 es"+ c1.calcularPerimetro());   
	  // Crea un circulo c2 con radio 3 
	    Circulo c2=new Circulo(3);
	  // Saca por pantalla el color del circulo c2 
	    System.out.println("El color de c2 es"+ c2.getColor()); 
	  // Crea un circulo c3 con color verde 
	     Circulo c3=new Circulo("verde");
	  // Modifica los círculos c2 y c3 para que tengan el mismo radio que c1 
	     c2.setRadio(c1.getRadio());
	     c3.setRadio(c1.getRadio());
	  // Saca por pantalla los radios de los 3 círculos 
	     System.out.println("El radiode c1"+ c1.getRadio()); 
	     System.out.println("El radiode c2"+ c2.getRadio());
	     System.out.println("El radiode c3"+ c3.getRadio());
	   
	  // Asigna al círculo dos un color negro 
	     c2.setColor("negro");
	   
	  // Saca por pantalla c1 de 3 formas diferentes 
	    System.out.println(c1);
	    System.out.println(c1.toString());
	    System.out.println("radio: "+ c1.getRadio()+ " color:"+ c1.getColor());
	    visualizar(c1);
	   
	   
	 }

	 private static void visualizar(Circulo c1) {
		System.out.println(c1);
		
	 } 
	 
	} 

