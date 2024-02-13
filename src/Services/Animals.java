package Services;

public class Animals {
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

