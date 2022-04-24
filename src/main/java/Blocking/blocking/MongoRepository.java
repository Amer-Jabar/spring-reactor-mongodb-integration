package Blocking.blocking;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/*
This interface declared here extends the ReactiveMongoRepository. the given types should be other than Object. Otherwise,
the Couldn't find PersistentEntity exception will be thrown. Custom named methods cannot be created in this type of Repository.
But you can change the return type of the existing methods by overriding them.
*/
public interface MongoRepository extends ReactiveMongoRepository<User, User> {}


