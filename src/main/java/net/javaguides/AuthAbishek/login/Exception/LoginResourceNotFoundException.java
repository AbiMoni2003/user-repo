package net.javaguides.AuthAbishek.login.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class LoginResourceNotFoundException extends RuntimeException {
    public LoginResourceNotFoundException(String message) {
        super(message);
    }
}
