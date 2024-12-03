package ti.epz.dcenter.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "servicio_id")
    private int id;

    @Column
    private String nombre;

    @Column
    private String descripcion;


}
