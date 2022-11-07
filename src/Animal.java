public class Animal {
    private String name;
    private int age;
    private short health;
    private short hungerLevel;
    private short mood;
    private String favouriteFood;
    private String favouriteActivity;

    public void setName(String name) {
        this.name = name;
    }

    public String getName();

    {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAge();

    {
        return age;
    }

    public void setHealth(short health) {
        this.health = health;
    }

    public short getHealth();

    {
        return health;
    }

    public void setHungerLevel(short hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public short getHungerLevel();

    {
        return hungerLevel;
    }

    public void setMood(short mood) {
        this.mood = mood;
    }

    public short getMood();

    {
        return mood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood();

    {
        return favouriteFood;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }

    public String getFavouriteActivity();

    {
        return favouriteActivity;
    }


    public Animal(String this.name, int this.age, short this.health, short this.hungerLevel,
                  short this.mood, String this.favouriteFood, String this.favouriteActivity) {

    }
}

