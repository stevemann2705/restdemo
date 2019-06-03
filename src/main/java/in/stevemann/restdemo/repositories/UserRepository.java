package in.stevemann.restdemo.repositories;

import in.stevemann.restdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
