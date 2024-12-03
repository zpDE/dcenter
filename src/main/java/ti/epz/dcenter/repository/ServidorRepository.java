package ti.epz.dcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ti.epz.dcenter.entity.Servidor;

public interface ServidorRepository extends JpaRepository<Servidor, Integer> {
}
