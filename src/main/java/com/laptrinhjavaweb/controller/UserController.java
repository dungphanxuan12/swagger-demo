package com.laptrinhjavaweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1")
@Api(value = "User APIs")
public class UserController {

	@ApiOperation(value = "Xem danh sách User", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Dữ liệu trả về Thành công, bạn có thể custom message tại đây"),
			@ApiResponse(code = 500, message = "Server lỗi với status code 500") })
	@GetMapping("/users")
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		users.add(new User("dungphan", "dungphanxuan12@gmail.com", 23));
		users.add(new User("truonglam", "truongtunglam@gmail.com", 30));
		return users;
	}

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable("id") Long id) {
		User userWithFlexibleId = new User("dungphan", "dungphanxuan12@gmail.com", 23);
		userWithFlexibleId.setId(id);
		return userWithFlexibleId;
	}

	@PostMapping("/users")
	public User getUser(User user) {
		return user;
	}

}
