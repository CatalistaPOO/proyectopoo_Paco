import com.objetos.Mes;
import java.util.ArrayList;
import java.util.Scanner;

public class Clima {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Mes> meses = new ArrayList<Mes>();
        //BUCLE PARA ALMACENAR MESES
        for (int i = 1; i <= 12; i++){
            Mes mes = new Mes();
            mes.setNombre("JUNIO " + i);
            mes.setTemperaturaMaxima(38);
            mes.setTemperaturaMinima(20);    
            meses.add(mes);
        }
        //BUCLE PARA DIBUJAR LOS MESES
        for (Mes m : meses){
            System.out.println(m);
        }
        System.out.println("Fin de programa");
    }
}
