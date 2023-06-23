package edu.resturants.premsdelight.dto;

import edu.resturants.premsdelight.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	private long id;
	private String name;
	private String email;
	private long phoneNumber;
	private Role role;
}
