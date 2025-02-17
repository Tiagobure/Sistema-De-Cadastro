package application.entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class WritingF {
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);

	List<Register> cadastro = new ArrayList();
	ReadingF r = new ReadingF();
	File sourceFile = new File(r.getPath());
	String sourceFolder = sourceFile.getParent();
	
	
	

	public WritingF() {
		
	}




	public void creatFile(String folder, String numbering) {
		folder = sourceFolder;
		File directory = new File(folder);
		if (!directory.exists()) {
			directory.mkdirs();
		}

		File[] files = sourceFile.listFiles();
		int nextNumber = 1;

		if (files != null) {
			for (File file : files) {
				String name = file.getName();
				if (name.startsWith(numbering)) {
					try {
						String numberStr = name.substring(numbering.length());
						
						int number =Integer.parseInt(numberStr);
						if(number >= nextNumber) {
							nextNumber = number + 1;
						}
					}catch(NumberFormatException e) {
						System.out.print("Error: " + e.getMessage());
					}

				}
			}

		}
		
		System.out.println("*********RESPOSTAS************");

		System.out.print("1: ");
		String name = sc.nextLine();
		System.out.print("2: ");
		String email = sc.nextLine();
		System.out.print("3: ");
		int age = sc.nextInt();
		System.out.print("4: ");
		double heigth = sc.nextDouble();

		cadastro.add(new Register(name, email, age, heigth));

		String newFile = folder + "\\" + numbering + "-" + name.toUpperCase().replace(" ", "") + ".txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile, true))) {
			for (Register cad : cadastro) {
				bw.write("1-" + cad.getName().toUpperCase());
				bw.newLine();
				bw.write("2-" + cad.getEmail().toUpperCase());
				bw.newLine();
				bw.write("3-" + cad.getAge());
				bw.newLine();
				bw.write("4-" + cad.getHeight().toString());
			}
			System.out.println("USUARIO CADASTRADO!");

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	

		

	}

	

	
}
