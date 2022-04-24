package Blocking.blocking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class BlockingApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlockingApplication.class, args);
    }
}
