package sampletest.account;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//問２－１ リポジトリを作成するアノテーションを記述
@Repository
public interface AccountRepositoy extends CrudRepository<Account, Long> {
    public Account findByUsername(String username);
    public List<Account> findAll();
}
