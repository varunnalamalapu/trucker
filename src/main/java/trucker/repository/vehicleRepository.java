package trucker.repository;

import org.springframework.data.repository.CrudRepository;
import trucker.entity.vehicleDetails;

public interface vehicleRepository extends CrudRepository<vehicleDetails,String> {
}
