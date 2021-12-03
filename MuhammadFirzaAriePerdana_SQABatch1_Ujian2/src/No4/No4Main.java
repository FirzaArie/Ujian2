package No4;

import java.util.Scanner;

public class No4Main {
	public static void main(String[]args) {
		// Silakan isi bagian ini
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan sisa BBM dalam tangki (liter) = ");
		int sisa = in.nextInt();
		System.out.println("Masukkan konsumsi BBM kendaraan (km/liter) = ");
		int jarakPerLiter = in.nextInt();
		double sisaJarak = hitungSisaJarak(sisa, jarakPerLiter);
		System.out.print("Kendaraan anda dapat menempuh jarak "+sisaJarak+"  kilometer dengan sisa BBM yang ada di tangki");
		}
		static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		return sisaJarak;
		}

}
