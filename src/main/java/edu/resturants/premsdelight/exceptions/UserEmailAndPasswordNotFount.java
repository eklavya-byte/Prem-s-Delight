package edu.resturants.premsdelight.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class UserEmailAndPasswordNotFount extends RuntimeException{
	
	private String message;
	
	public UserEmailAndPasswordNotFount(String string) {
		 message = this.message;
	}

	public void UserEmailAndPasswordNotFound(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
