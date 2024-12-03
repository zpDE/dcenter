package ti.epz.dcenter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ti.epz.dcenter.entity.Servicio;
import ti.epz.dcenter.repository.ServicioRepository;

@Service
public class ServicioService {

    @Autowired
    ServicioRepository servicioRepository;

    public List<Servicio> findAll() {
        return servicioRepository.findAll();
    }
    public Optional<Servicio> findById(Integer id_servicio) {
        return  servicioRepository.findById(id_servicio);
    }

    public Servicio save(Servicio servicio) {
        return servicioRepository.save(servicio);
    }
}
