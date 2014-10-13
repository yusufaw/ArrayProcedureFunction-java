package array;

import java.util.Scanner;

/**
 * @author Yusuf Aji Wibowo
 *
 */
public class Input {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n;
		System.out.print("Masukkan Panjang Array : ");
		n=input.nextInt();
		int A[] = new int[n+1];
		inputData(n,A);
		cetakData(A,n);
		cariPosisi(A, n);
		posData(A, n);
		nilaiTerbesar(A, n);
		copyArray(A, n);
		genapGanti(A, n);
	}
	public static void inputData(int n,int []A){
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<n;i++){
			System.out.print("Masukkan Array Ke-"+(i+1)+" : ");
			 A[i]=input.nextInt();
		}
	}
	public static void cetakData(int A[],int n){
		System.out.print("\nArray : ");
		for(int i=0;i<n;i++){
			System.out.print(A[i]+" ");
		}
	}
	
	public static void cariPosisi(int A[],int n){
		Scanner input=new Scanner(System.in);
		System.out.println("\n\nCari Posisi");
		System.out.print("\tMasukkan Bilangan : ");
		int dataCari=input.nextInt();
		for(int i=0;i<n;i++){
			if (A[i]==dataCari){
				System.out.print("Bilangan "+dataCari+" ada di posisi : "+(i+1));
				return;
			}
		}
		System.out.println("Data tidak ditemukan");
	}
	
	public static void posData(int A[],int n){
		Scanner input=new Scanner(System.in);
		System.out.println("\n\nCari Pos-pos Data");
		System.out.print("\tMasukkan Bilangan : ");
		int dataCari=input.nextInt();
		boolean temu=false;
		System.out.print("Bilangan "+dataCari+" ada di posisi : ");
		for(int i=0;i<n;i++){
			 if(A[i]==dataCari){
				System.out.print((i+1)+" ");
				temu=true;
			}
		}
		if(temu==false)
			System.err.print("Data tidak ditemukan");
	}
	public static void nilaiTerbesar(int A[],int n){
		int max=A[0];
		for(int i=1;i<n;i++){
			while(A[i]>max){
				max=A[i];
			}
		}
		System.out.println("\n\nNilai Terbesar : "+max);
	}
	
	public static void copyArray(int A[],int n){
		Scanner input=new Scanner(System.in);
		System.out.print("\nMasukkan posisi awal copy : ");
		int I=input.nextInt();
		System.out.print("Masukkan panjang copy : ");
		int k=input.nextInt();
		System.out.print("Hasil copy : ");
		int B[]=new int[k];
		int j=0;
		if(I+k-1<=n){
		for(int i=(I-1);i<(I+k-1);i++){
			B[j]=A[i];
			System.out.print(B[j]+" ");
			j++;
			}
		System.out.println("");
		}
		else	
		System.out.println("Tidak dapat diproses");
	}
	
	public static void genapGanti(int[]A,int n){
		System.out.print("\nHasil Ganti Genap : ");
		for(int i=0; i<n;i++){
			while(A[i]%2==0 && i!=0){
				A[i] = A[i-1]*3;
			}
			System.out.print(A[i]+" ");
		}
	}
}