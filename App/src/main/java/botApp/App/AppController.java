package botApp.App;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController{

    @RequestMapping("/hi")
    public String sayHi(){
        return "Hello";
    }
}
