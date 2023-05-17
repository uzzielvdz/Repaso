
package repaso;

import java.util.Scanner;

public class Repaso {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder numerosConcatenados = new StringBuilder();
        int cantidadNumeros = 0;
        int suma = 0;

        System.out.println("Calculadora de Media");
        System.out.println("Ingresa los números para calcular la media.");
        System.out.println("Escribe 'terminar' para finalizar.");

        while (true) {
            System.out.print("Ingrese un número (o 'terminar'): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("terminar")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                suma += numero;
                cantidadNumeros++;

                numerosConcatenados.append(numero);
                numerosConcatenados.append(" ");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Inténtalo de nuevo.");
            }
        }

        if (cantidadNumeros > 0) {
            double media = (double) suma / cantidadNumeros;
            System.out.println("Conjunto de números ingresados: " + numerosConcatenados.toString().trim());
            System.out.println("La media de los números ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números para calcular la media.");
        }
    }
}


  

