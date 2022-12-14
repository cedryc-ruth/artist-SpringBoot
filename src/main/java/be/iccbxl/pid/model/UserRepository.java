package be.iccbxl.pid.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
	List<User> findByLogin(String login);
	List<User> findByLastname(String lastname);
	 
	User findById(long id);
}
