import com.objetos.Coche;

public class Conductor {
    public static void main(String[] args) {
        Coche car = new Coche();
        car.setMarca("Seat");
        car.setModelo("Panda");
        car.arrancar(); //arrancamos
        car.acelerar(); //20
        car.acelerar(); //40
        car.acelerar(); //60
        car.frenar(); // 50
        car.frenar(); //40
        car.frenar(true); //0 y apagado
        //Si intentamos acelerar después...
        car.acelerar(); //no podemos acelerar
        System.out.println(car);
    }
}
