package cl.jesu.api.service.impl;


import cl.jesu.api.domain.ExampleDTO;
import cl.jesu.api.service.iface.IExampleService;
import org.springframework.stereotype.Service;

@Service
public class ExampleService implements IExampleService {


    @Override
    public ExampleDTO getMsg() {
        return new ExampleDTO("It Works!!");
    }
}
