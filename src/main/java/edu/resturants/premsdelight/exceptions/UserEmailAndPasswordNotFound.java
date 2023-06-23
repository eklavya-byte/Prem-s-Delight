package edu.resturants.premsdelight.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class UserEmailAndPasswordNotFound extends RuntimeException{
	
	private String message;

	@Override
	public String getMessage() {

		return message;
	}
}
