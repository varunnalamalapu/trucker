package trucker.service;

import trucker.entity.readings;
import trucker.entity.vehicleDetails;

import java.util.List;

public interface vehicleService {
    vehicleDetails put(List<vehicleDetails> veh);
    readings post(readings read);
}
