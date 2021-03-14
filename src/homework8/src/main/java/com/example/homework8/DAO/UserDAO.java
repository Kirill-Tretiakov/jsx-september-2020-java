package homework8.src.main.java.com.example.homework8.DAO;


import homework8.src.main.java.com.example.homework8.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
public interface UserDAO extends JpaRepository<User, Integer> {
}
