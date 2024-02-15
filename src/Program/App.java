package Program;

import Services.Animals;
import Utils.Decorator;


public class App {
    /**
     * Основной класс приложения.
     * Здесь мы определяем голоса животных, записанных в БД
     */
    public static void main(String[] args) {
        String a = "Dog";
        String AnimalVoice = Animals.animal(a);
        System.out.println(Decorator.decorate(a, AnimalVoice));
        a = "Cat";
        AnimalVoice = Animals.animal(a);
        System.out.println(Decorator.decorate(a, AnimalVoice));
        a = "Chicken";
        AnimalVoice = Animals.animal(a);
        System.out.println(Decorator.decorate(a, AnimalVoice));
        a = "Cow";
        AnimalVoice = Animals.animal(a);
        System.out.println(Decorator.decorate(a, AnimalVoice));
        a = "Fish";
        AnimalVoice = Animals.animal(a);
        System.out.println(Decorator.decorate(a, AnimalVoice));

    }
}
