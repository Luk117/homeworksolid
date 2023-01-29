package main;
import modelo.Envio;
import modelo.Estudiante;
import modelo.Informatica;
import modelo.Industrial;
import modelo.Administrador;
import service.EmailGmail;
import service.EmailOutlook;
import service.EnvioMaterial;
import service.MySQL;
import service.Oracle;
import service.ServicioGuardar;

public class Main {
    public static void main(String[] args) {

        Estudiante[] listadoEstudiantes = {
                new Informatica("Daniel"),
                //new Industrial("Camila"),
                //new Administrador("Nicolas")  
        };
        //Principio Dependency Inversion
        verMateriasEstudiantes(listadoEstudiantes);
        EnvioMaterial material = new EnvioMaterial(new EmailOutlook(), new Envio());
        material.enviarMaterialEstudiante(new Informatica("Daniel"));
        //material.enviarMaterialEstudiante(new Industrial("Camila"));
        //material.enviarMaterialEstudiante(new Administrador("Nicolas"));

        ServicioGuardar servicio = new ServicioGuardar(new MySQL());
        servicio.guardar();
    }

    //Principio Open/Closed
    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) { 
            System.out.println(estudiante.asignaturas);
        }
    }

    
    
}

