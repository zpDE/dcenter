package ti.epz.dcenter.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "servidor")
public class Servidor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "servidor_id")
    private int id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private Integer nucleos;

    @Column
    private Integer memoria;

    @Column
    private Integer capacidad_almacenamiento;

    @Column
    private String hypervisor;

    /*
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/
}
