package crudEx.demo.Repo;

import crudEx.demo.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, String>{ //users-->table name
}
