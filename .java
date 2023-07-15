import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 2002) {
			//caso a senha esteja errada
			System.out.println("Senha invalida");
			x = sc.nextInt();
			
		}
		// caso a senha esteja certa
		System.out.println("Acesso permitido");
		sc.close();
	}
}
