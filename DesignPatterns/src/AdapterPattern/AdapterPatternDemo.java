package AdapterPattern;

public class AdapterPatternDemo {
    public static void main(String args[]){
        Menu customer=new PizzaCustomer();
        customer.getPizza();
        System.out.print(customer.getPizzaToppings());
    }
}
