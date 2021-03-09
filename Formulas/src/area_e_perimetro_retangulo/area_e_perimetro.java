package area_e_perimetro_retangulo;

public class area_e_perimetro {
	
public static void main(String[] args) {
		
		float ladoMaior = 3f;
		float ladoMenor = 2f;
		float area = ladoMenor * ladoMaior;
		float perimetro = (ladoMenor * 2) + (ladoMaior * 2);
		
		System.out.print(area);
		System.out.println(" é a área");
		System.out.print(perimetro);
		System.out.print(" é o perimetro.");
		
        }

}