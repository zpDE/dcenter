package ti.epz.dcenter.entity;

import jakarta.persistence.*;

@Entity(name = "servicio_maquina_virtual")
public class ServicioMaquinaVirtual {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "servicio_maquina_virtual_id")
    private int id;

    @ManyToOne
    private MaquinaVirtual maquina_virtual;

    @ManyToOne
    private Servicio servicio;

    @Column
    private Boolean activo;


}
