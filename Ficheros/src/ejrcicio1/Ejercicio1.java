package ejrcicio1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Path usuario= Paths.get("usuario.txt");
		int intentos=3;
		try {
			while(intentos<=3){
				System.out.println("Introduce tu usuario y contraseña (usuario:contraseña)");
				String you= teclado.nextLine();
				Files.writeString(usuario, you, StandardOpenOption.CREATE_NEW);
				System.out.println("Introduce tu usuario");
			}

		} catch (Exception e) {
			e.getMessage();
		}finally {
			System.out.println("Intentos restantes"+ intentos);
		}
		teclado.close();
	}

}
