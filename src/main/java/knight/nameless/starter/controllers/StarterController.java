package knight.nameless.starter.controllers;

import knight.nameless.starter.models.Starter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/starters")
public class StarterController {

    @GetMapping
    public List<Starter> getAllStarters() {

        return List.of(
                new Starter(1, "test", 20),
                new Starter(2, "test1", 22)
        );
    }
}
