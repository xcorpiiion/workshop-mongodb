package br.com.workshop.workshop.repository;

import br.com.workshop.workshop.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends MongoRepository<User, String> {

}
