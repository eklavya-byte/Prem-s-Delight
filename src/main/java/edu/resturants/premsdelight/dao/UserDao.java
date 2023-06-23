package edu.resturants.premsdelight.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.resturants.premsdelight.entity.User;
import edu.resturants.premsdelight.exceptions.UserEmailAndPasswordNotFound;
import edu.resturants.premsdelight.exceptions.UserIdNotFoundException;
import edu.resturants.premsdelight.repository.UserRepository;

@Repository
public class UserDao {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user ) {
		return userRepository.save(user);
		
	}
	
	public User findUserById(long userId) {
	Optional<User> optional=userRepository.findById(userId);
	if(optional.isPresent())
	{
		return optional.get();
	}
		throw new UserIdNotFoundException("user with the given Id not found ! ");
	}
	
	public User findUserByEmailAndPassword(String email,String password ) {
		Optional<User> optional=userRepository.getUserByEmailAndPassword(email,password);
		if(optional.isPresent())
		{
			return optional.get();
		}
		throw new UserEmailAndPasswordNotFound("User with the given Email and Password not found ! ");
	}
	
	public void deleteUserById(long userId) {
		
		userRepository.delete(findUserById(userId));
	}
}
