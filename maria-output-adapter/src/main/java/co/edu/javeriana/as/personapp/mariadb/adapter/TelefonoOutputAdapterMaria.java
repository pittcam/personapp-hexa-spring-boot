package co.edu.javeriana.as.personapp.mariadb.adapter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import co.edu.javeriana.as.personapp.mariadb.entity.TelefonoEntity;
import co.edu.javeriana.as.personapp.mariadb.mapper.TelefonoMapperMaria;
import co.edu.javeriana.as.personapp.mariadb.repository.TelefonoRepositoryMaria;
import co.edu.javeriana.as.personapp.domain.Phone;
import co.edu.javeriana.as.personapp.application.port.out.PhoneOutputPort;
import co.edu.javeriana.as.personapp.common.annotations.Adapter;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Slf4j
@Component("phoneOutputAdapterMaria")
@Transactional
public class TelefonoOutputAdapterMaria implements PhoneOutputPort {

    @Autowired
    private TelefonoRepositoryMaria telefonoRepositoryMaria;

    @Autowired
    private TelefonoMapperMaria telefonoMapperMaria;

    @Override
    public Optional<Phone> findById(String id) {
        Optional<TelefonoEntity> telefonoEntity = telefonoRepositoryMaria.findById(id);
        return telefonoEntity.map(telefonoMapperMaria::fromAdapterToDomainOwner);
    }


    @Override
    public Phone save(Phone phone) {
        TelefonoEntity telefonoEntity = telefonoMapperMaria.fromDomainToAdapter(phone);
        TelefonoEntity savedEntity = telefonoRepositoryMaria.save(telefonoEntity);
        return telefonoMapperMaria.fromAdapterToDomain(savedEntity);
    }

    @Override
    public boolean delete(String id) {
        if (telefonoRepositoryMaria.existsById(id)) {
            telefonoRepositoryMaria.deleteById(id);
            return true;
        } else {
            throw new IllegalArgumentException("No se encontró el teléfono con ID: " + id);
        }
    }

    @Override
    public List<Phone> findAll() {
        return telefonoRepositoryMaria.findAll().stream()
                .map(telefonoMapperMaria::fromAdapterToDomainOwner)
                .collect(Collectors.toList());
    }
}