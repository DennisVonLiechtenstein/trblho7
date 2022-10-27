package round7;

import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;

public class Abracadabra {

	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		 int V[]=new int[10];
		for(int i=0;i<V.length;i++) {
			System.out.println("Digite o "+(i+1)+" numero inteiro:");
			V[i]=scanf.nextInt();
			
		}
		
	      Arrays.sort(V);
		
		for(int i=0;i<V.length;i++) {
		 System.out.print("["+V[i]+"]");
		
		}
			
			
			
			
		

	}

}
