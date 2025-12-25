package knight.nameless.starter.models;

//Records automatically generate the constructors, getters and setters, significantly reducing the boilerplate code
public record AccountDto(
        String username,
        String password
) {

}
