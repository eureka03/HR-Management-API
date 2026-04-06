package repository;

import entity.User;
import org.springframework.data.repository.Repository;


public interface UserRepository extends Repository<User, Integer> {
}
