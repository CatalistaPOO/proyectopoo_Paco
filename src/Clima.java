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
            //PEDIMOS LOS DATOS AL USUARIO
            System.out.println("Nombre mes");
            String nombre = teclado.nextLine();
            System.out.println("Temperatura máxima");
            int tempMax = teclado.nextInt();
            System.out.println("Temperatura mínima");
            int tempMin = teclado.nextInt();
            mes.setNombre(nombre);
            mes.setTemperaturaMaxima(tempMax);
            mes.setTemperaturaMinima(tempMin);    
            meses.add(mes);
        }
        //BUCLE PARA DIBUJAR LOS MESES
        for (Mes m : meses){
            System.out.println(m);
        }
        System.out.println("Fin de programa");
    }
}
