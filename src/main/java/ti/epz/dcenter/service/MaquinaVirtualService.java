package ti.epz.dcenter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ti.epz.dcenter.entity.MaquinaVirtual;
import ti.epz.dcenter.repository.MaquinaVirtualRepository;

@Service
public class MaquinaVirtualService {

    @Autowired
    MaquinaVirtualRepository maquinaVirtualRepository;

    public List<MaquinaVirtual> findAll() {
        return maquinaVirtualRepository.findAll();
    }

    public Optional<MaquinaVirtual> findById(Integer id_maquina_virtual) {
        return maquinaVirtualRepository.findById(id_maquina_virtual);
    }

    public MaquinaVirtual save(MaquinaVirtual maquinaVirtual) {
        return maquinaVirtualRepository.save(maquinaVirtual);
    }


}
