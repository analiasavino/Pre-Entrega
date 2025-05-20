import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
  static ArrayList<Articulo> listaArticulo= new ArrayList<>();
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int input = 0;

    do {
      System.out.println("******************************************************************************\n" +
            "Bienvenido al sector de almacen, de bicicletas Analia  por favor ingrese la opcion deseada: \n" +
            "\t1-Crear un artículo nuevo\n" +
            "\t2-Consultar un artículo\n" +
            "\t3-Listar artículos\n" +
            "\t4-Modificar un artículo\n" +
            "\t5-Borrar un artículo \n" +
            "\t6-Salir\n" +
            "*******************************************************************************************\n"
      );
      input = sc.nextInt(); //pido la opcion
      sc.nextLine(); //limpio el buffer para que el sistema no se quede esperando

      switch (input) {
        case 1 -> agregarArticulo();
        //case 2 -> listarArticulos();
        //case 3 -> buscarModificarArticulo();
       // case 4 -> eliminarArticulo();
        case 5 -> System.out.println("Saliendo ...");
        default -> System.out.println("Opción inválida");
      }
    } while (input != 5);
  } //fin del metodo cuando se inicia el programa

  public static void  agregarArticulo(){
    System.out.print("Por favor ingrese el ID que va a corresponder al nuevo producto: ");
    int id = sc.nextInt();sc.nextLine();
    if(id ){
      System.out.print("Ese ID ya existe por favor ingrese otro: ")
    }
    System.out.print("Por favor ingrese la marca del nuevo producto: ");
    String marca = sc.next();sc.nextLine();
    System.out.print("Por favor ingrese el modelo del nuevo producto: ");
    String modelo = sc.nextLine();
    System.out.print("Por favor ingrese el rodado del nuevo producto: ");
    int rodado = sc.nextInt(); sc.nextLine();
    System.out.print("Por favor ingrese el precio del nuevo producto: ");
    double precio = sc.nextDouble();sc.nextLine();

    Articulo nuevo = new Articulo(id, marca,modelo,rodado,precio);
    listaArticulo.add(nuevo);
    System.out.println("El articulo con el id: " + id + " fue agregado con exito.");
  }
}