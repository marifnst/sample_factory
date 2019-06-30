package hello;

import org.springframework.stereotype.Component;

@Component
public class MotorCycleService implements GeneralService {

    @Override
    public void process() {
        System.out.println("hello world from " + MotorCycleService.class.getName());
    }

    @Override
    public String getType() {
        return MotorCycleService.class.getName();
    }
    
}
