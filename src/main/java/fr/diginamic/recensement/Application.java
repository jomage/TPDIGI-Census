package fr.diginamic.recensement;

import fr.diginamic.recensement.io.FileRead;

public class Application {
	
	public static void main(String[] args) {
		FileRead f = new FileRead();
		
		System.out.println(f.getInfos());
	}

}
