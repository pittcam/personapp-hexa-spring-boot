package co.edu.javeriana.as.personapp.terminal.mapper;

import co.edu.javeriana.as.personapp.terminal.model.PhoneModelCli;
import co.edu.javeriana.as.personapp.domain.Phone;
import co.edu.javeriana.as.personapp.common.annotations.Mapper;

public class PhoneMapperCli {
    public PhoneModelCli fromDomainMapperCli(Phone phone){
        PhoneModelCli phoneModelCli = new PhoneModelCli();
        phoneModelCli.setNumero(phone.getNumber());
        phoneModelCli.setOperadora(phone.getCompany());
        phoneModelCli.setDuenioId(phone.getOwner().getIdentification());
        phoneModelCli.setDuenioNombre(phone.getOwner().getFirstName());
        return phoneModelCli;
    }

}
