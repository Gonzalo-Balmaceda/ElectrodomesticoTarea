package testElectrodomestico;

import domain.Electrodomestico;

import java.util.Scanner;
import java.util.SortedMap;

public class Test {
    public static void main(String[] args) {
        Electrodomestico electrodomestico = crearElectrodomestico();
        System.out.println("Su electrodomestico tiene las siguientes caracteristicas: \n" + electrodomestico);

    }

    // Método Verificar Consumo
    public static char comprobarConsumo(char consumo) {
        if (consumo >= 'A' && consumo <= 'F') {
            return  consumo;
        } else  {
            return 'F';
        }
    }

    // Método para comprobar que el color sea válido.
    public static String comprobarColor(String color) {
        // Colores correctos.
        String[] coloresValidos = {"Blanco", "Negro", "Gris", "Rojo", "Azul"};

        for (String colorValido : coloresValidos) { // Iteramos el arreglo de los colores válidos.
            if (color.equalsIgnoreCase(colorValido)) {
                return color;
            }
        }
        return "Blanco";
    }

    public static Electrodomestico crearElectrodomestico() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el precio del electrodoméstico: ");
        int precio = entrada.nextInt();

        System.out.println("Ingrese el color del electrodoméstico: ");
        String color = entrada.next();

        System.out.println("Ingrese el consumo energetico del electrodoméstico: ");
        String consumo = entrada.next();

        System.out.println("Ingrese el peso del electrodoméstico: ");
        double peso = entrada.nextDouble();

        // Comprobación
        String colorValido = comprobarColor(color);
        char consumoValido = comprobarConsumo(consumo.charAt(0));

        return new Electrodomestico(precio, colorValido, consumoValido, peso);
    }
}
