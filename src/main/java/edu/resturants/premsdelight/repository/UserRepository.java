package edu.resturants.premsdelight.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.resturants.premsdelight.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User , Long> {
	
//    @Query("SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2")
//	Optional<User> getUserByEmailandPassword(String email, String password);

//	Optional<User> findUserByEmailAndPassword(String email,String password);

	User findUserByEmailAndPassword(String email, String password);

	Optional<User> getUserByEmailAndPassword(String email, String password);
}
