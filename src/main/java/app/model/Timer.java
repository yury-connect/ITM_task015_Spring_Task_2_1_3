package app.model;

import org.springframework.stereotype.Component;


/*
Если класс Timer помечен аннотацией @Component, то создавать отдельный метод @Bean для его регистрации не нужно.
Аннотация @Component уже регистрирует его в контексте Spring как бин,
поэтому достаточно использовать внедрение зависимостей (@Autowired), чтобы получить экземпляр Timer.
 */
@Component
public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
