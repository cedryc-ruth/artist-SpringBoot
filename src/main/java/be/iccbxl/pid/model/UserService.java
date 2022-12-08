package be.iccbxl.pid.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Objects.requireNonNull(username);
		
        User user = userRepository.findUserWithName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return user;
    }

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		
		userRepository.findAll().forEach(users::add);
		
		return users;
	}
	
	public User getUser(long id) {
		return userRepository.findById(id);
	}
 
	public void addUser(User user) {
		userRepository.save(user);
	}
 
	public void updateUser(long id, User user) {
		userRepository.save(user);
	}
 
	public void deleteUser(long id) {
		userRepository.deleteById(id);
	}
}
