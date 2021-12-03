import java.util.Scanner;

public class No1 {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan nilai maksimal deret = ");
		int batas = in.nextInt();
		System.out.print("1"); 
		cetakFibonacci(batas);
		}
		static void cetakFibonacci(int batas) {
		// silakan isi bagian ini

			 int n1=0,n2=1,n3,i;   
			 for(i=2;i<batas;++i){  
			  n3=n1+n2;  
			  System.out.print(" "+n3); 
			  if(n2+n3 > batas){
			  break;
			  }else { 
			  n1=n2;  
			  n2=n3;
			  }
				 
			 }  

			}
		}


