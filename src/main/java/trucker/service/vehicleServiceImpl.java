package trucker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import trucker.entity.readings;
import trucker.entity.vehicleDetails;
import trucker.repository.readingsRepository;
import trucker.repository.vehicleRepository;

import java.util.List;

@Service
public class vehicleServiceImpl implements vehicleService {
    @Autowired
    vehicleRepository repository;
    @Autowired
    readingsRepository repo;
    @Transactional
    public readings post(readings read) {
        return repo.save(read);
    }
    @Transactional
    public vehicleDetails put(List<vehicleDetails> veh) {
        vehicleDetails v1=veh.get(0);
        vehicleDetails v2=veh.get(1);
        repository.save(v1);
        return repository.save(v2);
    }
}
