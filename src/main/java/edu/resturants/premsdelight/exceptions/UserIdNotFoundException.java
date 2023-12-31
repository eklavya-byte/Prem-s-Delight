package edu.resturants.premsdelight.exceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class UserIdNotFoundException extends RuntimeException {
	private String message;

	@Override
	public String getMessage() {
		return message;
	}

}