package calculadora;

public class Calculadora {
	private int num1;
	private int num2;

	
	public Calculadora(int a, int b) {
		System.out.println("Hola");
		num1 = a;
		num2 = b;
	}

	public int suma() {
		int resul = num1 + num2;
		return resul;
	}

	public int resta() {
		int resul = num1 - num2;
		return resul;
	}

	public int multiplica() {
		int resul = num1 * num2;
		return resul;
	}

	public int divide() {
		int resul = num1 / num2;
		return resul;
	}
	
	public int raizNdeX() {
		int resul = (int) (Math.pow(num1, (1/num2)));
		return resul;
	}
}
