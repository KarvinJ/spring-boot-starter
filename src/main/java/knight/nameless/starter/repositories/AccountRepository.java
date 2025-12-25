package knight.nameless.starter.repositories;

import knight.nameless.starter.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findAccountById(long id);
}
