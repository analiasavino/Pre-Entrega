import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
  static ArrayList<Articulo> listaArticulo = new ArrayList<>();
  static Scanner sc = new Scanner(System.in);
  private static int id;
  private static double precio;

  public static void main(String[] args) {
    int input = 0;

    do {
      System.out.println("******************************************************************************\n" +
            "Bienvenido al sector de almacen, de bicicletas Analia  por favor ingrese la opcion deseada: \n" +
            "\t1-Crear un artículo nuevo\n" +
            "\t2-Listar artículos exitentes\n" +
            "\t3-Modificar artículos\n" +
            "\t4-Borrar un artículo\n" +
            "\t5-Salir\n" +
            "*******************************************************************************************\n"
      );
      input = sc.nextInt(); //pido la opcion
      sc.nextLine(); //limpio el buffer para que el sistema no se quede esperando

      switch (input) {
        case 1 -> agregarArticulo(); //la flechita me hace ahorrar el break
        case 2 -> listarArticulos();
        case 3 -> buscarModificarArticulo();
        case 4 -> eliminarArticulo();
        case 5 -> System.out.println("Saliendo ...");
        default -> System.out.println("Opción inválida");
      }
    } while (input != 5);
  } //fin del metodo de inicio del programa

  //Creamos el metodo crear articulo

  public static void agregarArticulo() {
    System.out.print("Por favor ingrese el ID que va a corresponder al nuevo producto: ");
    while (true) {
      try {
        String input2 = sc.next();
        id = Integer.parseInt(input2);

        boolean idExistente = false;
        for (Articulo a : listaArticulo) {
          if (a.getId() == id) {
            idExistente = true;
            break;
          }
        }
        if (idExistente) {
          System.out.println("Ese ID ya fue creado. Por favor ingrese un ID distinto.");
        } else {
          break;
        }

      } catch (NumberFormatException e) {
        System.err.println("Error: La entrada no es un número entero válido, por favor vuelva a ingresar.");
      }
    }
      System.out.print("Por favor ingrese la marca del nuevo producto: ");
      String marca = sc.next();
      System.out.print("Por favor ingrese el modelo del nuevo producto: ");
      String modelo = sc.next();
      System.out.print("Por favor ingrese el rodado del nuevo producto: ");
      int rodado = sc.nextInt();
      System.out.print("Por favor ingrese el precio del nuevo producto: ");
      while (true) {
        try {
          String input3 = sc.next();
          precio = Double.parseDouble(input3);
          System.out.println("El precio ingresado es el siguiente: " + precio);
          break;
        } catch (NumberFormatException e) {
          System.err.println("Error: La entrada no es un precio válido, por favor vuelva a ingresar: ");

        }
        sc.nextLine();
      }

      //Creamos el nuevo articulo

      Articulo nuevo = new Articulo(id, marca, modelo, rodado, precio);
      listaArticulo.add(nuevo);
      System.out.println("El articulo con el id: " + id + " fue agregado con exito.");
    }

  //Cremos el metodo listar articulo

  public static void listarArticulos() {
    if (listaArticulo.isEmpty()) {
      System.out.println("No hay articulos cargados.");
    } else {
      for (Articulo a : listaArticulo) {
        a.mostrar();
      }
    }
  }

  //Creamos el metodo modificar articulo.

  public static void buscarModificarArticulo() {
    System.out.println("Ingrese el ID que desea modificar: ");
    int id = sc.nextInt();
    sc.nextLine();
    Articulo articuloAModificar = null;

    for (Articulo a : listaArticulo) {
      if (a.getId() == id) {
        articuloAModificar = a;
        break;
      }
    }
    if (articuloAModificar != null){
      System.out.print("Nueva marca: ");
        articuloAModificar.setMarca(sc.nextLine());

        System.out.println("Nuevo modelo");
        articuloAModificar.setModelo(sc.nextLine());

        System.out.println("Nuevo rodado");
        articuloAModificar.setRodado(sc.nextInt());

        System.out.println("Nuevo precio");
        articuloAModificar.setPrecio(sc.nextDouble());
      } else {
        System.out.println("Ese ID no se encuentra disponible intente de nuevo.");
      }
    }

  //Creamos metodo eliminar.

  public static void eliminarArticulo() {
    System.out.println("Por favor ingrese el ID del articulo que desea eliminar: ");
    while (true) {
      try {
        String input4 = sc.next();
        id = Integer.parseInt(input4);
        System.out.println("El id ingresado es el siguiente: " + id);
        break;
      } catch (NumberFormatException e) {
        System.err.println("Error: La entrada no es un número entero válido, por favor vuelva a ingresar: ");
      }
    }
    listaArticulo.removeIf(articulo -> articulo.getId() == id);
    System.out.println("El Articulo " + id + " fue eliminado");
  }
}