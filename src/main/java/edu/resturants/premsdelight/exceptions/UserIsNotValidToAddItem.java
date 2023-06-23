package edu.resturants.premsdelight.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserIsNotValidToAddItem extends RuntimeException {
	
	private String message;

	@Override
	public String getMessage() {
		return message;
	}

}
