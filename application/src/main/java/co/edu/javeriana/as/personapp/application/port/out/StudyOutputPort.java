package co.edu.javeriana.as.personapp.application.port.out;

import co.edu.javeriana.as.personapp.common.annotations.Port;
import co.edu.javeriana.as.personapp.domain.Study;

import java.util.List;

@Port
public interface StudyOutputPort {
    public Study save(Study study);
    public Boolean delete(Integer personId, Integer professionId);
    public List<Study> find();
    public Study findById(Integer personId, Integer professionId);
    public long count();

}
