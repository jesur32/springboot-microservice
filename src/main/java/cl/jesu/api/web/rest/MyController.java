package cl.jesu.api.web.rest;


import cl.jesu.api.domain.ExampleDTO;
import cl.jesu.api.service.iface.IExampleService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jesu")
public class MyController {


    private IExampleService exampleService;

    public MyController(IExampleService exampleService) {
        this.exampleService = exampleService;
    }


    @CrossOrigin
    @GetMapping(path = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ExampleDTO actualizarReasignacion() {

        return exampleService.getMsg();


    }


}
