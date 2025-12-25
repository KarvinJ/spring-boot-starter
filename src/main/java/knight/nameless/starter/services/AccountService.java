package knight.nameless.starter.services;

import knight.nameless.starter.entities.Account;
import knight.nameless.starter.repositories.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account save(Account account){

        return accountRepository.save(account);
    }

    public List<Account> getAll(){

        return accountRepository.findAll();
    }

    public Account getById(long id){

        return accountRepository.findAccountById(id);
    }


    public void deleteById(Long id){

        accountRepository.deleteById(id);
    }
}
