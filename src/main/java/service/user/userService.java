package service.user;


import java.util.List;

import entity.User;

public interface userService {
public User getUserByUser(User user);
public User getUserByLoginName(String username);
public String findDeptLeaders(User user);
public String findOwner(User user);
public String findServiceman(User user);
public String findSupervisor(User user);

}
