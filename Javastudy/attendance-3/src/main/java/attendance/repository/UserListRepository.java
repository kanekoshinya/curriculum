package attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import attendance.entity.UserList;

/**
 * user_listテーブルを操作するためのRepositoryクラスです
 */
public interface UserListRepository extends JpaRepository<UserList, Integer> {
}