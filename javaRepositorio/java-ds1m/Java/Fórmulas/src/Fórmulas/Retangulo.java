package F�rmulas;

public class Retangulo {

	public static void main(String[] args) {
		
		double base;
		double altura;
		double area;
		double perimetro;
		
		base = 8;
		altura = 5;
		
		area = base * altura;
		
		//perimetro = (base * 2) + (altura * 2) 
				
		perimetro = 2 * ( base + altura ) ;
		
		System.out.println("�rea:" + area + " metros");
		
		System.out.print("per�metro:" + perimetro + " metros" );
		

	}

}
