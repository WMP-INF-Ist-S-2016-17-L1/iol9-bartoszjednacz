package zamowpizze;

public class Main {
    
    public static void main(String[] args) {
        
        Kelner kelner = new Kelner();
        PizzaBuilder builder = new PizzaPeperoni();
        System.out.println("\nZamów: Pizza Peperoni");
        kelner.setBuilder(builder);
        kelner.zamow();
        Pizza pizza = kelner.getZestaw();

        System.out.println("\nOdbierz zamówienie: Peperoni");
        System.out.println(pizza.toString());
    }
}
