package application;

import java.util.Locale;
import java.util.Scanner;

import application.entities.ReadingF;
import application.entities.WritingF;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		ReadingF r = new ReadingF();
		WritingF w = new WritingF();

		r.reading();
        w.creatFile( null, "0");
		
        
        sc.close();
	}

}
