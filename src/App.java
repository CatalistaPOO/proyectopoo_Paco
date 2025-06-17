import com.objetos.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Probando la clase Persona");
        try {
            //CREAMOS UNA COLECCION PARA ALMACENAR EMPLEADOS
            
            ArrayList<Persona> empleados = new ArrayList<Persona>();
            Empleado emp1 = new Empleado();
            emp1.setNombre("Empleado 1");
            emp1.setApellidos("Empleado 1");
            empleados.add(emp1);
            System.out.println("Emp1: " + emp1.getClass());
            //DIBUJAMOS LA CLASE DE LA COLECCION
            System.out.println("Colección 0: " 
            + empleados.get(0).getClass());
            Empleado emp2 = new Empleado();
            emp2.setNombre("Empleado 2");
            emp2.setApellidos("Empleado 2");
            empleados.add(emp2);  
            //PODRIAMOS AGREGAR UN DIRECTOR???
            Director dire = new Director();
            dire.setNombre("Director");
            dire.setApellidos("Director");
            empleados.add(dire);
            Persona becario = new Persona();
            becario.setNombre("Becario");
            becario.setApellidos("Becario");
            empleados.add(becario);
            //POR SUPUESTO, PODEMOS RECORRER TODOS LOS EMPLEADOS
            for (Persona emp: empleados){
                //AQUI ESTAMOS RECORRIENDO Personas, pero en realidad
                //TENEMOS MULTIPLES OBJETOS (Persona, Empleado y Director)
                //SI NECESITAMOS APLICAR ALGUN METODO DE LA CLASE 
                //ESPECIFICA, DEBEMOS PREGUNTAR POR EL TIPO DE CLASE
                //Y REALIZAR UN CASTING
                if (emp instanceof Director){
                    //PODEMOS MANDAR
                    ((Director)emp).mandar();
                }
                System.out.println(emp.getNombreCompleto());
            }
            //TENEMOS LOS SIGUIENTES DATOS EN LA COLECCION:
            //0,1 --> Empleado
            //2 --> Director
            //3 --> Persona
            //SI DESEO RECUPERAR EL OBJETO 0...
            //CON QUE FORMA VIENE LA POSICION CERO?: Persona
            //SI ESTAMOS SEGUROS, PODEMOS REALIZAN UN CASTING
            //UN CASTING ES CONVERTIR UN OBJETO EN OTRO SIEMPRE
            //QUE SEAN COMPATIBLES.
            // (clase)objeto
            Empleado temp = (Empleado) empleados.get(0);
            //QUEREMOS AL DIRECTOR
            Director jefe = (Director) empleados.get(2);
            jefe.mandar();
            



            // Empleado emp = new Empleado();
            // Director dire = new Director();
            // System.out.println(emp.toString());

            //EL SALARIO MINIMO SON 1200 DE UN EMPLEADO
            // emp.setNombre("Santos");
            // emp.setApellidos("Cerdan");
            // System.out.println("Salario mínimo EMPLEADO: "
            //  + emp.getSalarioMinimo());

            // System.out.println("Salario mínimo DIRECTOR: "
            //  + dire.getSalarioMinimo());
            // emp.setNombre("Empleado");
            // emp.setApellidos("Empleado");
            // emp.setSueldo(1800);
            // System.out.println(emp.getNombreCompleto());
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
