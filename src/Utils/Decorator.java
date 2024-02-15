package Utils;

public class Decorator {
    /**
     * Класс декорирует вывод сообщения в консоль
     */
    public static String decorate(String animal, String voice) {
        return animal + " Говорит: " + voice;
    }
}
