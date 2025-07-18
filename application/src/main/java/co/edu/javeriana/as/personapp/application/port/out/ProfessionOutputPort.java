package co.edu.javeriana.as.personapp.application.port.out;

import co.edu.javeriana.as.personapp.common.annotations.Port;
import co.edu.javeriana.as.personapp.domain.Profession;

import java.util.List;

@Port
public interface ProfessionOutputPort {
    public Profession save(Profession Profession);

    public Boolean delete(Integer identification);

    public List<Profession> find();

    public Profession findById(Integer identification);
    public Long count();
}
