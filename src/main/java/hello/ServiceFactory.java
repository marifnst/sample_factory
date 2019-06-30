package hello;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceFactory {

    @Autowired
    private List<GeneralService> services;

    private static final Map<String, GeneralService> myServiceCache = new HashMap<>();

    @PostConstruct
    public void initMyServiceCache() {
        for (GeneralService service : services) {
            System.out.println("load service : " + service.getType());
            myServiceCache.put(service.getType(), service);
        }
    }

    public static GeneralService getService(String type) {
        GeneralService service = myServiceCache.get(type);
        if (service == null) {
            throw new RuntimeException("Unknown service type: " + type);
        }            
        return service;
    }

}
