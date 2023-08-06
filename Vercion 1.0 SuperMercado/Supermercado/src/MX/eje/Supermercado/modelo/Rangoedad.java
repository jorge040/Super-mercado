package MX.eje.Supermercado.modelo;

public interface Rangoedad {

        public default boolean Rangoedad(int edad){
            if (edad >= 18){
                System.out.println("Rango adulto");
                return true;
            }else{
                System.out.println("Rango Bebe");
                return false;
            }
        }
    }


