package service.impl;
import java.util.List;

import mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import entity.User;
import service.user.userService;
/***
 * 
 * @author Administrator
 * @param user
 * 查找权限用户
 */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,timeout=5)
@Service
public class userServiceImpl implements userService {

	
	@Autowired
	UserMapper usermapper;
	
	public User getUserByUser(User user) {
		
			User u=usermapper.getUserByUser(user);
			return u;
		}
	

	public User getUserByLoginName(String username) {
		
		return usermapper.getUserByLoginName(username);
	}

	public String findDeptLeaders(User user) {
		
		return usermapper.findDeptLeaders(user);
	}

	public String findOwner(User user) {
		
		return usermapper.findOwner(user);
	}

	public String findServiceman(User user) {
	
		return usermapper.findServiceman(user);
	}

	public String findSupervisor(User user) {
	
		return usermapper.findSupervisor(user);
	}
	
	
	public List<String> findDeptLeaders2(User user) {
		
		return usermapper.findDeptLeaders2(user);
	}

	public List<String> findOwner2(User user) {
		
		return usermapper.findOwner2(user);
	}

	public List<String> findServiceman2(User user) {
	
		return usermapper.findServiceman2(user);
	}

	public List<String> findSupervisor2(User user) {
	
		return usermapper.findSupervisor2(user);
	}
	}


