package pro.sky.telegrambot.exception;

public class CommandNotFoundException extends RuntimeException {
    public CommandNotFoundException(String message) {
        super(message);
    }
}