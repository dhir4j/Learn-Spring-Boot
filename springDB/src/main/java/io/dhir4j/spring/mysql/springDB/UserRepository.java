package io.dhir4j.spring.mysql.springDB;
import org. springframework. data.repository. CrudRepository;
import io.dhir4j.spring.mysql.springDB.User;
public interface UserRepository extends CrudRepository<User, Integer> {

}
