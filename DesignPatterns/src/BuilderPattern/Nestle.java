package BuilderPattern;

public class Nestle extends  Company {
    @Override
    public int price(){
        return 20;
    }
    @Override
    public String pack(){
        return "Nestle Kitkat";
    }
}
