package ejercicios;
public class PruebaCirculo {

public static void main(String[] args) {

 //Crea un objeto de tipo círculo con valor
 // 3.4 de radio y color azul que se llame c1
	Circulo c1=new Circulo(3.14, "azul");

 // Saca por pantalla el área del circulo c1
	System.out.println(c1.calcularArea());

 // Modifica el color del circulo a Rojo
	c1.setColor("rojo");
 // Saca por pantalla el color del circulo c1
	System.out.println(c1.getColor());
 // Saca por pantalla el perímetro del circulo c1
	System.out.println(c1.calcularPerimetro());
 // Crea un circulo c2 con radio 3
	Circulo c2=new Circulo(3);
 // Saca por pantalla el color del circulo c2
	System.out.println(c1.getColor());
 // Crea un circulo c3 con color verde
	Circulo c3=new Circulo("verde");
 // Modifica los círculos c2 y c3 para que tengan el mismo radio
 // que c1
	c2.setRadio(c1.getRadio());
	c3.setRadio(c1.getRadio());
 // Saca por pantalla los radios de los 3 círculos
	System.out.println("Radio del circulo 1: "+c1.getRadio()+" Radio del circulo 2: "+c2.getRadio()+"Radio del circulo 3: "+c3.getRadio());
 // Asigna al círculo dos un color negro
	c2.setColor("negro");
 // Saca por pantalla c1 de 3 formas diferentes
	System.out.println(c1);
	System.out.println(c1.toString());
	System.out.println(c1.getRadio()+c1.getColor());
 }
} 