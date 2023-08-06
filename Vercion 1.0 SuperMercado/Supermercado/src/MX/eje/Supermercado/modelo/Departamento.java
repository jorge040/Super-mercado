package MX.eje.Supermercado.modelo;

/**
 *
 * @autor Jorge Ivan Cuellar Razo
 * @vercion 1.0
 *
 */

public class Departamento {
    private int pasillo;
    private double precio;
    private String marca;
    private String tematica;
    private String material;
    private double peso;

    public Departamento(int pasillo, double precio, String marca, String tematica, String material, double peso) {
        this.pasillo = pasillo;
        this.precio = precio;
        this.marca = marca;
        this.tematica = tematica;
        this.material = material;
        this.peso = peso;
    }


    public int getPasillo() {
        return pasillo;
    }

    public void setPasillo(int pasillo) {
        this.pasillo = pasillo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
