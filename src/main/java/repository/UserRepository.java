package repository;


import model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

	// Can I define queries by these function calls?
	User findByUsername(String username);
}
