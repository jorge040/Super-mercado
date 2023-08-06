package MX.eje.Supermercado.modelo;


public class Cliente implements Rangoedad{

    private  double dinero;

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

   /*public void (double dinero){
        if () {
        }
    }*/

    public static void main(String[] args) {

        Cliente mariana = new Cliente();
        mariana.Rangoedad(22);
        mariana.setDinero(1000);

        System.out.println(mariana.dinero);

    }
}
