package Services;

public class Animals {
    /**
     * Класс принимает название животного
     * и возвращает функцию вызова его голоса.
     */
    public static String animal(String a) {
        switch (a) {
            case "Cow":
                return Voices.cowSay();
            case "Dog":
                return Voices.dogSay();
            case "Cat":
                return Voices.catSay();
            case "Chicken":
                return Voices.chickenSay();
            default:
                return "Меня нет в базе голосов";
        }
    }
}

