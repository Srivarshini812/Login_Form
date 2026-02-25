package Login_Form.login_form.service;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import Login_Form.login_form.entity.loginentity;
import Login_Form.login_form.repository.loginrepo;

@Service
public class loginservice implements UserDetailsService{

	private final loginrepo repo;
	public loginservice(loginrepo repo) {
		this.repo=repo;
		}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		loginentity entity=repo.findByEmail(email).orElseThrow(()->
		
		new UsernameNotFoundException("Users Not Found"));
		
		return org.springframework.security.core.userdetails.User
		.builder()
		.username(entity.getEmail())
		.password(entity.getPassword())
		.build();
		
	}

}
