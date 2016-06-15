package org.lolpix;

import org.lolpix.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lerk on 15.06.16.
 */
@Repository
interface UserRepo extends MongoRepository<User, String> {
    User findById(String id);
    User findByUsername(String username);
    User findByEmail(String email);
}
