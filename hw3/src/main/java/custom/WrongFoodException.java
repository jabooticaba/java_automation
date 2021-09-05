package custom;

public class WrongFoodException extends Exception{

    @Override
    public String getLocalizedMessage() {
        return "WrongFoodException: Пища не подходит животному";
    }
}
