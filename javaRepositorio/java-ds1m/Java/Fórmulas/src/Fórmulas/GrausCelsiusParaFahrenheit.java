package F�rmulas;

public class GrausCelsiusParaFahrenheit {
	
public static void main(String[]args) {
		
	//�F para �C
		float Celsius1 = 50f;//Escolha o valor de �C
		float Fahrenheit1 = (9 * Celsius1 + 160) / 5;
		System.out.println(Fahrenheit1 +"�F" + " = " + Celsius1 + "�C");
		
	//�C para �F
		float Fahrenheit2 = 122f;//Escolha o valor de �F
		float Celsius2 = (Fahrenheit2 - 32) * 5 / 9;
		
		System.out.println(Celsius2 +"�C" + " = " + Fahrenheit2 + "�F");
		
		
	}

}
