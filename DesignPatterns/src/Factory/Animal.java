package Factory;

public abstract  class Animal {
    protected String animalSound;
    protected String animalFoodType;
    protected String animalSize;
    abstract String getSound();
    abstract String getFoodType();
    abstract String getSize();
}
