package ti.epz.dcenter.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "maquina_virtual")
public class MaquinaVirtual {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_maquina_virtual")
    private int id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private String sistema_operativo;

    @Column
    private int vcpu;

    @Column
    private int ram;

    @ManyToOne
    private Servidor servidor;
}
