package edu.badpals.hospitalrrhh;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

    }
}

/*

        1. Realiza el diagrama de clases para el siguiente supuesto:

        El departamento de RRHH del hospital Álvaro Cunqueiro quiere informatizar la asignación de tareas al personal del centro.

        De todo el personal se mantendrá la siguiente información: DNI, número de la seguridad social, nombre, dirección y teléfono.
        Se ha clasificado al personal en 4 categorías: médicos, enfermeros, celadores y limpieza.

        Los médicos tendrán asignada una consulta de visita y también se guardará un histórico con todas las operaciones y visitas que han realizado a los pacientes. Para cada operación o visita se registrará una breve descripción y su fecha.


        Los enfermeros podrán tener o no asignada una consulta (sólo en caso de que sean el enfermero asociado a un médico). También pueden estar asignados por turnos a las diferentes plantas del hospital.


        El personal de limpieza será responsable de una o más plantas del hospital. Se considera que las consultas están asignadas a cada una de las plantas.
        Tanto para los enfermeros, como celadores y personal de limpieza almacenaremos sus turnos para calcular su carga de trabajo.


        2. Crea las clases Java de al menos 2 entidades hijas (junto con sus clases asociadas) y demuestra los 3 tipos de herencia existentes en Hibernate en 3 paquetes de código independientes. Crea un readme en MarkDown que contenga las capturas justificativas de la creación de las 3 versiones de tablas en MySQL. ¿Cuál crees que es la mejor solución para este tipo de supuesto? Justifica tu respuesta en dicho readme.md

        3. Desglosa el atributo dirección y trátalo como un objeto incrustado. Demuestra su uso.

        Entrega un zip que contenga el fichero StarUML solución del diagrama y el proyecto de clases IntelliJ.

 */
