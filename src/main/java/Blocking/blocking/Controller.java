package Blocking.blocking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Controller {
    
    MongoRepository repo;
    
    public Controller(MongoRepository repo) {
        this.repo = repo;
    }
    
    // Dumb endpoint
    @GetMapping("/api/greeting")
    public String getUsers() {
        return "Hello";
    }
    
    /*
    In this endpoint, an instance of class User is created,
    then the mongo repository saves that instance and returns it.
    */
    @GetMapping("/api/users")
    public Mono setUsers() {
        User user = new User();
        user.setName("Amer");
        user.setPassword("12332100");
        return repo.save(user);
    }
    
}
