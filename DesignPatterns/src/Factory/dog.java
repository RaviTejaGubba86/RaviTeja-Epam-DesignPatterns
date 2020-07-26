package Factory;

public class dog extends Animal {
    @Override
   String getSound() {
        return "Bark";
    }

    @Override
String getFoodType() {
return "Omnivore";
    }

    @Override
String getSize() {
return "Medium";
    }
}
