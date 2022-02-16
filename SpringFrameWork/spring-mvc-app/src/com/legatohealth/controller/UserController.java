package com.legatohealth.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.legatohealth.beans.User;
import com.legatohealth.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public ModelAndView save(@RequestParam("n1") String name, @RequestParam("n2") String password,
			@RequestParam("n3") int age) {
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		user.setAge(age);
		userService.storeUser(user);
		return new ModelAndView("storeSuccess", "msg", "Successfully Stored");
	}

	@RequestMapping(value = "/findUser", method = RequestMethod.GET)
	public ModelAndView fetchUser(@RequestParam("n1") int userId) {
		User user = userService.findUser(userId);
		return new ModelAndView("storeSuccess", "msg", user);
	}

	@RequestMapping(value = "/findAllUsers", method = RequestMethod.GET)
	public ModelAndView fetchAllUsers() {
		List<User> list = userService.findAllUsers();
		return new ModelAndView("storeSuccess", "msg", list);
	}

	@RequestMapping(value = "/updateName", method = RequestMethod.GET)
	public ModelAndView updateUserName(@RequestParam("n1") int userId, @RequestParam("n2") String name) {
		userService.updateName(userId, name);
		return new ModelAndView("storeSuccess", "msg", "Name Updated Successfully");
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public ModelAndView deleteUser(@RequestParam("n1") int userId) {
		userService.deleteUser(userId);
		return new ModelAndView("storeSuccess", "msg", "Deleted Successfull");
	}

	@RequestMapping(value = "/datetime", method = RequestMethod.GET)
	public ModelAndView home() {
		LocalDateTime modelDateTime = LocalDateTime.now();
		ModelAndView mav = new ModelAndView("welcome", "date", modelDateTime);
		return mav;
	}
}
