package tr.edu.ogu.ceng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.edu.ogu.ceng.dao.FacultySupervisorRepository;
import tr.edu.ogu.ceng.model.FacultySupervisor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
public class FacultySupervisorService {

    @Autowired
    private FacultySupervisorRepository facultySupervisorRepository;

    public FacultySupervisor saveFacultySupervisor(FacultySupervisor facultySupervisor){
    	Timestamp localDateTime = new Timestamp(System.currentTimeMillis());
        facultySupervisor.setCreateDate(localDateTime);
        facultySupervisor.setUpdateDate(localDateTime);
        return facultySupervisorRepository.save(facultySupervisor);
    }
}
