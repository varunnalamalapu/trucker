package trucker.service

import org.junit.Before
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.context.annotation.Bean
import org.springframework.test.context.junit4.SpringRunner
import trucker.entity.vehicleDetails
import trucker.repository.readingsRepository
import trucker.repository.vehicleRepository

@RunWith(SpringRunner.class)
class vehicleServiceImplTest {
    @TestConfiguration
    static class vehicleServiceImplTestConfiguration{
        @Bean
        public vehicleService getService(){return new vehicleServiceImpl()}
    }
    @Autowired
    vehicleService service;
    @MockBean
    vehicleRepository repository;
    @MockBean
    readingsRepository repo;

    @Before
    public void setup(){
        vehicleDetails veh = new vehicleDetails();


    }
    void testPost() {
    }

    void testPut() {
    }
}
