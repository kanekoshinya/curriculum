package attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import attendance.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
  User findByUsernameEquals(String username);
}
