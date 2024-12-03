package ti.epz.dcenter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ti.epz.dcenter.entity.Servidor;
import ti.epz.dcenter.repository.ServidorRepository;

@Service
public class ServidorService {

    @Autowired
    ServidorRepository servidorRepository;

    public List<Servidor> findAll() {
        return servidorRepository.findAll();
    }

    /**
     * @param id_servidor
     * @return
     */
    public Optional<Servidor> findById(int id_servidor) {
        return servidorRepository.findById(id_servidor);
    }

    public Servidor save(Servidor servidor) {
        return servidorRepository.save(servidor);
    }

}
