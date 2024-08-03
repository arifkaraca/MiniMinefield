package miniMinefield;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int row, column;
		System.out.println("Mayın Tarlasına Hoşgeldiniz.");
		System.out.println("Lütfen Oynamak İstediğiniz Boyutları Giriniz :");
		System.out.println("Satır Sayısı : ");
		row = scan.nextInt();
		System.out.println("Sütun Sayısı : ");
		column = scan.nextInt();
		
		miniMinefield mayin = new miniMinefield(row, column);
		mayin.start();
	}

}
