package ti.epz.dcenter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import ti.epz.dcenter.entity.MaquinaVirtual;

public interface MaquinaVirtualRepository extends JpaRepository<MaquinaVirtual, Integer> {

    List<MaquinaVirtual> findMaquinaVirtualByServidorId(Integer servidor_id);
}
