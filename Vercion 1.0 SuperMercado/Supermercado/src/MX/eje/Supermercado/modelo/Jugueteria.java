package MX.eje.Supermercado.modelo;

public class Jugueteria extends Departamento{
    public Jugueteria(int pasillo, double precio, String marca, String tematica, String material, double peso) {
        super(pasillo, precio, marca, tematica, material, peso);
    }

    public static void main(String[] args) {

        Jugueteria Baribie = new Jugueteria(1,200,"Mattel","Generica","Plastico",100);
        System.out.println(Baribie.getPrecio());


    }
}
