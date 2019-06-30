package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

    // https://stackoverflow.com/questions/6390810/implement-a-simple-factory-pattern-with-spring-3-annotations

    @RequestMapping("/load")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        GeneralService generalService = ServiceFactory.getService(name);
        generalService.process();
        return "Successfuly load " + generalService.getType();
    }
}
