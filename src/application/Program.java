package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
       
		List<String> list =new ArrayList<>();
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
		
	}

}
