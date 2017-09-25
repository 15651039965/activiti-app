package mapper;

import java.util.List;

import entity.User;
/**
 * 
 * @author Boris_dy E-mail: dy@ui8.cn
 * @version 创建时间：2016年11月10日 上午10:43:39
 */
public interface UserMapper {
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	public User login(User user);
	public User getUserByLoginName(String username);
	public User getUserByUser(User user);
	public String findDeptLeaders(User user);
	public String findOwner(User user);
	public String findServiceman(User user);
	public String findSupervisor(User user);
	public List<String> findDeptLeaders2(User user);
	public List<String> findOwner2(User user);
	public List<String> findServiceman2(User user);
	public List<String> findSupervisor2(User user);
}
