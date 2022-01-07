package com.jd.controller;

import java.awt.SystemColor;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jd.model.User;
import com.jd.repository.UserRepository;
import com.jd.service.UserService;

@RestController
public class UserController {
	
//	@Autowired
//	UserService userService;
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping()
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView();
//		User updated = new User(null, null, null, null);
//		mav.addObject("updated", updated);
        mav.setViewName("login");
		return mav;
	}
 
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
    public ModelAndView getEmployeeById(User user) {
//    	User entity = UserService.getUser(user.getId());
		System.out.println(user);
    	User entity = userRepository.getById(user.getId());
    	System.out.println("Entity "+entity);
    	ModelAndView mav = new ModelAndView();
    	System.out.println(user.getId().equals(entity.getId()));
    	if(user.getId().equals(entity.getId())&&user.getPassword().equals(entity.getPassword())) {
        	mav.addObject("entity", entity);
            mav.setViewName("home");
    		return mav;
    	} else {
    		mav.setViewName("login");
    		return mav;
    	}
    }
	
	@GetMapping("/save")
	public ModelAndView saveUser() {
		ModelAndView mav = new ModelAndView();
        mav.setViewName("save");
		return mav;
	}
    
    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity<User> create(User user) {
//    	User updated = UserService.createUser(user);
    	User updated = userRepository.save(user);
//    	ModelAndView mav = new ModelAndView();
//    	mav.addObject("updated", updated);
//        mav.setViewName("save");
		return new ResponseEntity<User>(updated, HttpStatus.CREATED);
    }
}
