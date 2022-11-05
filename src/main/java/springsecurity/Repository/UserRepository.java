package springsecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springsecurity.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
