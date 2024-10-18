package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog") // Указываем, что должен использоваться бин с именем "dog"
    private Animal animal;

    @Autowired
    private Timer timer; // Добавляю поле   /   Внедрение бина Timer через Spring


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
//        System.out.println(new Timer().getTime()); // Так было в задании, изменяю на строчку ниже
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    // Возврат добавленного поля   /   бина Timer
    public Timer getTimer() {
        return timer;
    }
}
