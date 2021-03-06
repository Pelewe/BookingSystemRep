package com.example.demo.users;

import com.example.demo.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	 @RequestMapping("/hello")
	 public String sayHi() {
		 return "hey";
	 }
	 
	@RequestMapping("/users")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}
	
	
	/*@GetMapping(value="/user/last_name/{last_name}")
	public List<User> searchUser(@PathVariable String name){
		
		return userService.searchUser(name);
	}*/
	@GetMapping("/{name}")
	public List<User> searchUser(@PathVariable("name") String name){
		
		return userService.searchUser(name);
	}
	
	
	@GetMapping(value="/user/{id}")
	public Optional<User> getUser(@PathVariable("id") Long id){
		return userService.getUser(id);
	}

	
	/*@RequestMapping(method= RequestMethod.DELETE,value=("/user/{id}"))
	public boolean deleteUser(@PathVariable Long id){
		userService.deleteUser(id);
		return true;
	}*/
	
	@RequestMapping("/user/{id}")
	public boolean deleteUser(@RequestParam("id") long id ){
		userService.deleteUser(id);
	
		return true;
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/user"))
	public void updateUser(@RequestBody User user){
		userService.updateUser(user);
	}
	
	/*@RequestMapping(method=RequestMethod.POST,value= "/user")
	public void createUser(@RequestBody User user){
		userService.createUser(user);
	}*/
	@PostMapping(value= "/user")
	public void createUser(@RequestBody User user){
		userService.createUser(user);
	}
	
	@RequestMapping(method=RequestMethod.POST ,value="/login")
	public void login(@RequestParam("email") String Email, @RequestParam("password")String pass, ModelMap modelmap )
	{
		User user=userService.login(Email);
		if(user.getPassword().equals(pass)) {
		
		}
		else {
			modelmap.addAttribute("msg","Invalid email or password");
		}
	}
}
