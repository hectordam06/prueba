import java.util.Scanner;

public class segundo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner MyScanner = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de n�meros aleatorios: ");
		int elementos = MyScanner.nextInt();
		
		int num_aleat[] = new int[elementos];
		
		for(int i=0;i<num_aleat.length;i++) {
			num_aleat[i] = (int)(Math.random()*100);
		}
		
		for(int j = 0; j < num_aleat.length; j++) {
			System.out.println(num_aleat[j]);
		}
	}
}
