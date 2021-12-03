package No6;

import java.util.Scanner;

public class No6Main {
	public static void main(String[] args) throws Exception{
//		Ujian, gunakan inputan
//		jenis kelamin, status
//		pria blm menikah, pajak 10%
//		pria menikah, pajak 5%
//		wanita blm menikah, pajak 7%
//		wanita menikah, pajak 3%
//		validasi: jika diinputkan selain 2 jenis kelamin
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan kelamin = ");
		String kelamin = in.nextLine();
		System.out.println("Masukkan status menikah = ");
		String menikah = in.nextLine();		
		try {
		if(menikah == "iya") {
			if(kelamin == "pria"){
				
			}
			else if(kelamin == "wanita"){
				
			}
			else {
				throw new Exception("Umur tidak valid");
			}
		}
		else if(menikah == "tidak") {
			if(kelamin == "pria"){
				
			}
			else if(kelamin == "wanita"){
				
			}
			else {
				throw new Exception("Umur tidak valid");
			}
		}
		else {
			menikah = null;
			System.out.println(menikah.length());
		}
		
		}catch (NullPointerException e) {
			System.out.println("Masukan Input Menikah Tidak Valid");
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
		
	}
	}