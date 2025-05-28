public class Articulo {

  //defino los atributos que van a tener todos mis articulos.
    private int id;
    private String marca;
    private String modelo;
    private int rodado;
    private double precio;

    //defino el constructor que me va a permitir crear mi un nuevo articulo. Es un metodo.

    public Articulo (int id, String marca, String modelo, int rodado, double precio) {
      this.id = id;
      this.marca= marca ;
      this.modelo = modelo;
      this.rodado = rodado;
      this.precio = precio;
    }
    //Getter an setters para tener acceso a las variables privadas (encapsulamiento)

    public int getId() {
      return id;
    }
    public void setId(int id) {
      this.id = id;
    }
    public String getMarca() {
      return marca;
    }
    public void setMarca(String marca) {
      this.marca = marca;
    }
    public String getModelo() {
      return modelo;
    }
    public void setModelo(String modelo) {
      this.modelo = modelo;
    }
    public int getRodado() {
    return rodado;
    }
    public void setRodado(int rodado) {
    this.rodado = rodado;
    }
    public double getPrecio() {
      return precio;
    }
    public void setPrecio(double precio) {
      this.precio = precio;
    }

  // creo el metodo mostrar que me va a mostrar el nuevo articulo creado.

  void mostrar(){
    System.out.println(("\tID: " + this.id + "\n" +
          " \tMarca: " + this.marca + "\n"+
          " \tModelo: " + this.modelo + "\n" +
          " \tRodado: " + this.rodado + "\n" +
          " \tPrecio: " + this.precio));
  }

}


