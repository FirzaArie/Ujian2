package No3;

import java.util.Scanner;

public class No3Main {
	public static void main(String[]args) {
		// Silakan isi bagian ini
		Scanner in = new Scanner (System.in);
		System.out.print("Masukkan jarak (kilometer) = ");
		int jarak = in.nextInt();
		System.out.print("Masukkan waktu (jam) = ");
		int waktu = in.nextInt();
		double rata = hitungKecepatan(jarak,waktu);
		System.out.print("Kecepatan rata - rata anda adalah "+rata/100 +" km/jam");
	}
		static double hitungKecepatan(int jarak, int waktu) {
		//Silakan isi bagian ini dan ganti “anu” dengan kode yang tepat
		double rata = jarak*100/waktu;
		return rata;
		}

}
