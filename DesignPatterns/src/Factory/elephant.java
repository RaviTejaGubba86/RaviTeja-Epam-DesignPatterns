package Factory;

public class elephant extends Animal {

    @Override
    String getSound() {
     return "Trumpet";
    }

    @Override
    String getFoodType() {
return "Herbivore";
    }

    @Override
    String getSize() {
return "Large";
    }
}
