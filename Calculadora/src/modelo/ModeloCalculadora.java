package modelo;

public class ModeloCalculadora {
	public String suma(double num1, double num2) {
		double resultado=num1+num2;
		return sinCeros(resultado);
	}
	public String resta(double num1, double num2) {
		double resultado=num1-num2;
		return sinCeros(resultado);
	}
	public String multiplicacion(double num1, double num2) {
		double resultado=num1*num2;
		return sinCeros(resultado);
	}
	public String division(double num1, double num2) {
		double resultado=num1/num2;
		return sinCeros(resultado);
	}
	public String sinCeros(double resultado) {
		if(resultado%1==0) {
			return Integer.toString((int)resultado);
		}else {
			return Double.toString(resultado);
		}
	}
}
