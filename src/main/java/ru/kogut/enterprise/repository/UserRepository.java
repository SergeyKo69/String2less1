package ru.kogut.enterprise.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kogut.enterprise.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
