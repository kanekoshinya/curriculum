package schoo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoo1.entity.User_information;



public interface UserRepository extends JpaRepository<User_information, Integer> {
}