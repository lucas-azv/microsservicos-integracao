package udicentro.iftm.edu.br.user_api.repository;

import org.springframework.stereotype.Repository;

import udicentro.iftm.edu.br.user_api.model.User;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {

}
