
public class ExercicioSete {
	public static void main(String[] args) {
		int x = 4, y = 5, z = 6;
		
		
		if ((x >= 0 || x < 0) && (y >= 0 || y < 0) && (z >= 0 || z < 0))
        {
            if (((x + y) > z) && ((x + z) > y) && ((z + y) > x))
            {
                if (x == y && y == z)
                {
                    System.out.println("Equilátero");
                }
                else if (x == y || y == z || x == z)
                {
                	System.out.println("Isósceles");
                }
                else
                {
                	System.out.println("Escaleno");
                }
            }
            else { 
            	System.out.println("Não é um triângulo"); 
            }
        }
	}
}
