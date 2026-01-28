package kz.se41.dbforassign3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class Controller {
        @GetMapping("/index_se")//http://localhost:8080/index
        public String print_message(){
            return "Hello World";
        }
    }
