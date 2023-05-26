package sprintfinal;

import java.time.LocalDate;
import java.util.Scanner;

public class Administrativo extends Usuario{
	
	String area, experienciaPrevia;
	Scanner sc= new Scanner(System.in);
	public Administrativo(String nombre, String apellido,LocalDate fechaNacimiento,int run, String area, String experienciaPrevia) {
		super(nombre, apellido, fechaNacimiento, run);
	
		while(area.length()<5 || area.length()>20) {
			System.out.println("Favor el area debe estar entre 5 y 20 caracteres");
			area=sc.nextLine();
		}
		this.area=area;
		while(experienciaPrevia.length()>100) {
			System.out.println("Item experiencia previa debe tener menos de 100 caracteres");
			experienciaPrevia=sc.nextLine();
		}
		this.experienciaPrevia=experienciaPrevia;
	}
	
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Área: "+ area + ", Experiencia previa: " + experienciaPrevia + "\n");
	}
}
