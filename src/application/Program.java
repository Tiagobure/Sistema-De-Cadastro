package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import application.entities.Cadastro;

public class Program {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		 
		List<String> list =new ArrayList<>();
		List<Cadastro> cadastro = new ArrayList();
		String path = "c:\\teste\\arquivo.txt";
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String question = br.readLine();
			while(question != null) {
				list.add(question);
				question = br.readLine();
			}
			for(String element : list) {
				System.out.println(element);
			}
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("*********RESPOSTAS************");
		
		System.out.print("1: ");
		String name = sc.nextLine();
		System.out.print("2: ");
		String email = sc.nextLine();
		System.out.print("3: ");
		int age= sc.nextInt();
		System.out.print("4: ");
		double heigth = sc.nextDouble();
		
		cadastro.add(new Cadastro(name, email,age, heigth));
		
		
		
		
		
		sc.close();
	}

}
