package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App 
{
    public static void main( String[] args )
    {
        String nombre, apellido;
        int edad = -1;
        Persona persona;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa.\n");
        System.out.println("Por favor, introduzca los datos que se le vayan solicitando.");

        System.out.print("Introduzca su nombre: ");
        nombre = sc.nextLine();

        System.out.print("\nIntroduzca sus apellidos: ");
        apellido = sc.nextLine();
    
        try {
            System.out.print("\nIntroduzca su edad: ");
            edad = sc.nextInt();
            sc.nextLine(); // Limpia buffer    
        } catch (Exception e) {
            System.err.println("\nERROR - Se ha producido un error al leer los datos introducidos.");
        }

        sc.close();

        persona = new Persona(nombre, apellido, edad);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(persona);
        System.out.println(json);
    }
}
