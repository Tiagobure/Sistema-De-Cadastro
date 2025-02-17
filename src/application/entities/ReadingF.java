package application.entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import application.exception.ReadinException;

public class ReadingF {

	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	List<String> list = new ArrayList<>();
	String path = "c:\\teste\\arquivo.txt";
	
	
	public ReadingF() {
		
	}
	public ReadingF(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void reading() {

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String question = br.readLine();
			while (question != null) {
				list.add(question);
				System.out.println(question);

				question = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
