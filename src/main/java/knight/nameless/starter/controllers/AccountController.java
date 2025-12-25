package knight.nameless.starter.controllers;

import knight.nameless.starter.entities.Account;
import knight.nameless.starter.models.AccountDto;
import knight.nameless.starter.services.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAll() {
        return accountService.getAll();
    }

    @PostMapping
    public Account save(@RequestBody AccountDto account) {
        return accountService.save(account);
    }

    @GetMapping("/{id}")
    public Account getById(@PathVariable long id) {
        return accountService.getById(id);
    }

    @DeleteMapping
    public ResponseEntity<String> DeleteById(long id) {

        accountService.deleteById(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }
}
