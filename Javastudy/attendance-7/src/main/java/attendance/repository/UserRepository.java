package attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import attendance.entity.UserEntity;

/**
 * user_listテーブルを操作するためのRepositoryクラスです
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	public UserEntity findUser(String loginId);
}