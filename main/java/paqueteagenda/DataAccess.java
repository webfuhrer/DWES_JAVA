package paqueteagenda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataAccess {
private static String phonebook_path="phonebook.csv";
private static String separator=",";
	public static void registerContact(Contact contact) {
		
		
	}

	public static ArrayList<Contact> getAllContacts() {
		ArrayList<Contact> contact_list=new ArrayList<Contact>();
		try {
			
			FileReader fr=new FileReader(phonebook_path);
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			while(line!=null)
			{
				//1-Parto la linea(split) Manolo,67686876
				String[] fields=line.split(separator);
				//2-Creo contacto
				String name=fields[0];
				String phone=fields[1];
				Contact c=new Contact(name, phone);
				//3-Añado el contacto al ArrayList
				contact_list.add(c);
				//4-Vuelvo a leer la linea
				line=br.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return contact_list;
	}

}
