package ejercicio3;

public class Rectangulo {
	private double base;
	private double altura;

	public Rectangulo(double base) {
		this.base = base;
	}

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double area() {
		if(altura==0) {
			return base*base;
		}else {
			return base*altura;
		}
	}
	
	public double perimetro() {
		if(altura==0) {
			return base*4;
		}else {
			return 2*(base+altura);
		}
	}
	
	public void escalarse(int factor) {
		base=base*factor;
		altura=altura*factor;
	}
	public void cuadrado() {
		if(altura==0) {
			System.out.println("Es un cuadrado");
		}else {
			System.out.println("Es un rectangulo");
		}
	}

	public void mostrar() {
		System.out.printf("Sus medidas son: %.2f x %.2f\nSu area es de %.2f y el perimetro es %.2f\n", base, altura, area(), perimetro());
	}
}
