import com.objetos.Director;
import com.objetos.Empleado;

public class App {
    public static void main(String[] args) {
        System.out.println("Probando la clase Persona");
        try {
            Empleado emp = new Empleado();
            Director dire = new Director();
            System.out.println("Vacaciones empleado: "
            + emp.getDiasVacaciones());
            System.out.println("Vacaciones director: "
            + dire.getDiasVacaciones());







            //EL SALARIO MINIMO SON 1200 DE UN EMPLEADO
            emp.setNombre("Santos");
            emp.setApellidos("Cerdan");
            System.out.println("Salario mínimo EMPLEADO: "
             + emp.getSalarioMinimo());

            System.out.println("Salario mínimo DIRECTOR: "
             + dire.getSalarioMinimo());
            emp.setNombre("Empleado");
            emp.setApellidos("Empleado");
            emp.setSueldo(1800);
            System.out.println(emp.getNombreCompleto());
            // Persona tyrion = new Persona("Tyrion", "Lannister");
            // System.out.println(tyrion.getNombreCompleto());
            // //CUANDO HABLAMOS DE CLASES, NECESITAMOS OBJETOS PARA 
            // //TRABAJAR CON DICHAS CLASES
            // //INSTANCIAMOS EL OBJETO PERSONA
            // Persona personaje = new Persona();
            // System.out.println("Genero: " + personaje.getGenero());
            // //YA PODEMOS UTILIZAR LA PERSONA Y SUS PROPIEDADES
            // personaje.setNombre("Jon");
            // personaje.setApellidos("Nieve");
            // personaje.setEdad(29);
            // System.out.println(personaje.getNombre() + " "
            // + personaje.getApellidos() + ", Edad: " + personaje.getEdad()); 
            // personaje.setGenero(Persona.tipoGenero.MASCULINO);
            // System.out.println("Género: " + personaje.getGenero());
            // System.out.println(personaje.getNombreCompleto());
            // System.out.println(personaje.getNombreCompleto(true));
            // System.out.println(personaje.getNombreCompleto(19));
            
            // System.out.println("12345678" + Persona.getLetraNif(12345678));
            // System.out.println("34256789" + Persona.getLetraNif(34256789));

            // personaje.setDni("12345678Z");
        } catch (Exception e) {
            //NUNCA DEJAREMOS UN CATCH VACIO
            System.out.println("Error: " + e.getMessage());
        }
    }
}
