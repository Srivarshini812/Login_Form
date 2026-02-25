package Login_Form.login_form;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import Login_Form.login_form.entity.loginentity;
import Login_Form.login_form.repository.loginrepo;

@SpringBootApplication(scanBasePackages = {"Login_Form.login_form","repository"})
public class LoginFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginFormApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(loginrepo repo,PasswordEncoder pswEncoder)
	{
	   return args ->
	   {
	   loginentity entity=new loginentity();
	   entity.setEmail("srivarshini@gmail.com");
	   entity.setPassword(pswEncoder.encode("srivarshini812"));
	   repo.save(entity);
	   };
}
}

