package zamowpizze;

class Kelner {
    
    private PizzaBuilder builder;
    
    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }
    
    public Pizza getZestaw() {
        return builder.getZestaw();
    }
    
    public void zamow() {
        builder.newZestaw();
        builder.rodzajCiasta();
        builder.rodzajSosu();
        builder.zestawSkladnikow();
    }

    public Pizza pobierz(){
        return builder.getZestaw();
    }
}
