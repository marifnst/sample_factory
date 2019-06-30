package hello;

import org.springframework.stereotype.Component;

@Component
public class CarService implements GeneralService {

    @Override
    public void process() {
        System.out.println("hello worl from " + CarService.class.getName());
    }

    @Override
    public String getType() {
        return CarService.class.getName();
    }
    
}
