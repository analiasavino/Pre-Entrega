public class Articulo {

    private int id;
    private String marca;
    private String modelo;
    private int rodado;
    private double precio;

    public Articulo (int id, String marca, String modelo, int rodado, double precio) {
      this.id = id;
      this.marca= marca ;
      this.modelo = modelo;
      this.rodado = rodado;
      this.precio = precio;
    }
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
    void mostrar() {
      System.out.println("ID: " + this.id + " | marca: " + this.marca + " | modelo: " + this.modelo + " | rodado: "
            + this.rodado);

    }
  }

