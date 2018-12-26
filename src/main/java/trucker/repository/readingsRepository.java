package trucker.repository;

import org.springframework.data.repository.CrudRepository;
import trucker.entity.readings;

public interface readingsRepository extends CrudRepository<readings,String> {
}
