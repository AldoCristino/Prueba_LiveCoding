import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MangosNaranjas mg;
		int mangos, naranjas;
		
		System.out.println("Ingrese numero de Mangos\n");
		mangos = sc.nextInt();
		System.out.println();
		System.out.println("Ingrese numero de Naranjas\n");
		naranjas = sc.nextInt();
		
		sc.close();
		
		mg = new MangosNaranjas(mangos,naranjas);
		
		System.out.println(mg.mcd());
	}//

}//
