package be.iccbxl.pid.model;
 
import java.time.LocalDateTime;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String login;
	private String password;
	private String firstname;
	private String lastname;
private String email;
	private String langue;
	private LocalDateTime created_at;
 
	protected User() {}
 
	public User(String login, String firstname, String lastname) {
		this.login = login;
		this.firstname = firstname;
		this.lastname = lastname;
		this.created_at = LocalDateTime.now();
	}
 
	public Long getId() {
		return id;
	}	
	
	public String getLogin() {
		return login;
	}
 
	public void setLogin(String login) {
		this.login = login;
	}
 
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}
 
	public String getFirstname() {
		return firstname;
	}
 
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
 
	public String getLastname() {
		return lastname;
	}
 
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
 
	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}
	 
        public String getLangue() {
		return langue;
	}
 
	public void setLangue(String langue) {
		this.langue = langue;
	}
 
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	
	@Override
	public String toString() {
		return login + "(" + firstname + " " + lastname + ")";
	}
}