package ti.epz.dcenter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ti.epz.dcenter.entity.ServicioMaquinaVirtual;
import ti.epz.dcenter.repository.ServicioMaquinaVirtualRepository;

@Service
public class ServicioMaquinaVirtualService {

    @Autowired
    private ServicioMaquinaVirtualRepository servicioMaquinaVirtualRepository;

    public List<ServicioMaquinaVirtual> findAll() {
        return servicioMaquinaVirtualRepository.findAll();
    }
    public Optional<ServicioMaquinaVirtual> findById(Integer id) {
        return servicioMaquinaVirtualRepository.findById(id);
    }

    public ServicioMaquinaVirtual save(ServicioMaquinaVirtual servicioMaquinaVirtual) {
        return servicioMaquinaVirtualRepository.save(servicioMaquinaVirtual);
    }
}
