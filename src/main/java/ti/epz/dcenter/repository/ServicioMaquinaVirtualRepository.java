package ti.epz.dcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ti.epz.dcenter.entity.ServicioMaquinaVirtual;

@Repository
public interface ServicioMaquinaVirtualRepository extends JpaRepository<ServicioMaquinaVirtual, Integer> {
}
