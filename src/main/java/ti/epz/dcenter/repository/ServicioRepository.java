package ti.epz.dcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ti.epz.dcenter.entity.Servicio;

public interface ServicioRepository extends JpaRepository<Servicio, Integer> {
}
