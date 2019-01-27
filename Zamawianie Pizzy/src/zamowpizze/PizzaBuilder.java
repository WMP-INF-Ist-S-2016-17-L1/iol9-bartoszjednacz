package zamowpizze;

abstract class PizzaBuilder {
    
    protected Pizza pizza;
    
    public void newZestaw() {
        pizza = new Pizza();
    }
    
    public Pizza getZestaw() {
        return pizza;
    }
    
    public abstract void rodzajCiasta();
    public abstract void rodzajSosu();
    public abstract void zestawSkladnikow();
}
