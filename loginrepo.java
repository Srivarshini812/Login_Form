package Login_Form.login_form.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import Login_Form.login_form.entity.loginentity;

public interface loginrepo extends JpaRepository<loginentity,Long> {
	Optional<loginentity> findByEmail(String email);

}
