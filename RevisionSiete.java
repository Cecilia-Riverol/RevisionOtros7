//Codigo elaborado por sandra Riverol
//Calificación 5 de 5 por compañera Selene Rojas

package com.revisionSiete;
import java.util.HashMap; //Importo HashMaps
import java.util.Scanner; //Importo Scanner

public class RevisionSiete {

	public static void main(String[] args) {

		System.out.println("Escribe el nombre de un país y te diré su capital: ");//Corrigo SystemOut y reacomodo
		    Scanner s = new Scanner(System.in); //Corregimos systemIn.

		    HashMap<String, String> capitales = new HashMap<>(); //Importamos HashMap, cambiamos nombre al hashmap, cambiamos tipo de datos a string.

		    capitales.put("Canadá", "Otawwa");
		    capitales.put("Estados Unidos", "Washington DC");
		    capitales.put("México", "México DF");
		    capitales.put("Belice", "Belmopán");
		    capitales.put("Costa rica", "San José");
		    capitales.put("El Salvador", "San Salvador"); //Añado los datos de San Salvador
		    capitales.put("Guatemala", "Ciudad de Guatemala");
		    capitales.put("Honduras", "Tegucigalpa");
		    capitales.put("Nicaragua", "Managua");
		    capitales.put("Panamá", "Panamá");
		   		    
		    

		    while (true) { //Elimino do-while y pongo un sólo while con ifs
		    	
	            String pais = s.nextLine();

	            if (pais.equalsIgnoreCase("salir")) { // Primero revisamos si es salir
	                System.out.println("Gracias por jugar");
	            	s.close(); // Cerrar escaner
	                break; // Salir del loop
	            } 
	            else if (capitales.containsKey(pais)) { // En caso de que sí esté en el mapa
	                System.out.println("La capital de " + pais + " es " + capitales.get(pais));//En una sola línea para más comodidad
	            } 
	            
	            else {
	                System.out.println("No conozco la respuesta ");
	                System.out.println("¿Podrías decirme cuál es la capital de " + pais + "?: "); // Pido nueva capital
	                String newCapital = s.nextLine(); 
	                capitales.put(pais, newCapital); // Añado al mapa
	                System.out.println("Gracias por enseñarme nuevas capitales, ahora lo recuerdo");
	                System.out.println("Escribe el nombre de un país y te diré su capital: ");
	            }
	        }
	    }
	}