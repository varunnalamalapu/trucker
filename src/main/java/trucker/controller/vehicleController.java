package trucker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import trucker.entity.readings;
import trucker.entity.vehicleDetails;
import trucker.service.vehicleService;

import java.util.List;

@RestController
@RequestMapping()
public class vehicleController {
    @Autowired
    private vehicleService service;

    @RequestMapping(method = RequestMethod.PUT,value="vehicles"
            ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE
            ,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public vehicleDetails update(@RequestBody List<vehicleDetails> veh){
        return service.put(veh);
    }
    @RequestMapping(method = RequestMethod.POST,value="readings"
            ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE
            ,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public readings update(@RequestBody readings read){
        return service.post(read);
    }


}
