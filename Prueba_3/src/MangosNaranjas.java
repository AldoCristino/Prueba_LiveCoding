import java.util.ArrayList;

public class MangosNaranjas {
	private int mangos;
	private int naranjas;
	
	public MangosNaranjas(int mangos, int naranjas) {
		this.mangos = mangos;
		this.naranjas = naranjas;
	}

	public int getMangos() {
		return mangos;
	}

	public void setMangos(int mangos) {
		this.mangos = mangos;
	}

	public int getNaranjas() {
		return naranjas;
	}

	public void setNaranjas(int naranjas) {
		this.naranjas = naranjas;
	}
	
	public String mcd() {
		
		ArrayList <Integer> cajaMango = new ArrayList<>();
		ArrayList <Integer> cajaNara = new ArrayList<>();
		int cajaMayor = 0;
		
		for (int i = 2; i <= mangos; i++) { 
			if(mangos % i == 0) {
				cajaMango.add(i);
			}
		}
		for (int i = 2; i <= naranjas; i++) { 
			if(naranjas % i == 0) {
				cajaNara.add(i);
			}
		}
		
		for (Integer caja : cajaNara) {
			for (Integer cajaMa : cajaMango) {
				if(caja == cajaMa && caja > cajaMayor) {
					cajaMayor = cajaMa;
				}
				
			}
		}		
		
		int numMango = mangos /  cajaMayor ;
		int numNara =  naranjas /  cajaMayor ;
		
		return "El numero de cajas es: " + cajaMayor + "\nEl numero de mangos en caja es de: " + numMango +
				"\nEl numero de Naranjas en caja es de: " + numNara;
	}// mcd
}
