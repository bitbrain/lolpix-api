package org.lolpix.repositories;

import org.lolpix.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Lukas F&uuml;lling
 */
@Repository
interface UserRepo extends MongoRepository<User, String> {
    User findById(String id);
    User findByUsername(String username);
    User findByEmail(String email);
}
