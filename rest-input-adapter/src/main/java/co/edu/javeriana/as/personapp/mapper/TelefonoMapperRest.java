package co.edu.javeriana.as.personapp.mapper;

import co.edu.javeriana.as.personapp.common.annotations.Mapper;
import co.edu.javeriana.as.personapp.domain.Person;
import co.edu.javeriana.as.personapp.domain.Phone;
import co.edu.javeriana.as.personapp.model.request.TelefonoRequest;
import co.edu.javeriana.as.personapp.model.response.TelefonoResponse;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;

@Mapper
public class TelefonoMapperRest {

    public TelefonoResponse fromDomainToAdapterRestMaria(Phone phone){
        return fromDomainToAdapterRest(phone, "MariaDB");
    }

    public TelefonoResponse fromDomainToAdapterRestMongo(Phone phone){
        return fromDomainToAdapterRest(phone, "MongoDB");
    }

    public TelefonoResponse fromDomainToAdapterRest(Phone phone, String database){
        return new TelefonoResponse(
                phone.getNumber(),
                phone.getCompany(),
                phone.getOwner().getIdentification().toString(),
                database,
                "Ok");
    }

    public Phone fromAdapterToDomain(TelefonoRequest request, Person owner) {
        return new Phone(
                request.getNumero(),
                request.getCompania(),
                owner
        );
    }
}
