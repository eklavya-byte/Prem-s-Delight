package edu.resturants.premsdelight.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.resturants.premsdelight.entity.User;

public interface UserRepository extends JpaRepository<User , Long> {
	
	@Query("SELECT u User WHERE u.email=?1 AND u.password=?2" )
	Optional<User> getUserByEmailandPassword(String email, String password);

	Optional<User> findUserByEmailAndPassword(String email,String password);

}
