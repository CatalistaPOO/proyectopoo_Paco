import com.objetos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Probando la clase Persona");
        //CUANDO HABLAMOS DE CLASES, NECESITAMOS OBJETOS PARA 
        //TRABAJAR CON DICHAS CLASES
        //INSTANCIAMOS EL OBJETO PERSONA
        Persona personaje = new Persona();
        //YA PODEMOS UTILIZAR LA PERSONA Y SUS PROPIEDADES
        personaje.nombre = "Jon";
        personaje.apellidos = "Nieve";
        personaje.edad = -8;
        System.out.println(personaje.nombre + " " + personaje.apellidos
         + ", Edad: " + personaje.edad);
    }
}
