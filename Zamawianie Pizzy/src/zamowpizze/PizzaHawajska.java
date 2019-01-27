package zamowpizze;

import java.util.Scanner;

public class PizzaHawajska extends PizzaBuilder { 
    
    @Override
    public void rodzajCiasta(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rodzaj ciasta (1-cienkie, 2-średnie, 3-grube): ");
        boolean switcher = true;
        String wybor="";
        while (switcher){
             wybor = scanner.nextLine();

            switch (wybor){
                case "1": wybor="cienkie"; switcher=false; break;
                case "2": wybor="średnie"; switcher=false; break;
                case "3": wybor="grube"; switcher=false; break;
                default:
                    System.out.println("Podaj odpowienią liczbę");
                    break;
            }
        }
        
        pizza.setCiasto(wybor);
    }

    @Override
    public void rodzajSosu() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rodzaj sosu (1-łagodny, 2-ostry, 3-mieszany): ");
        boolean switcher = true;
        String wybor="";
        while (switcher){
            wybor = scanner.nextLine();
            
            switch (wybor){
                case "1": wybor="łagodny"; switcher=false; break;
                case "2": wybor="ostry"; switcher=false; break;
                case "3": wybor="mieszany"; switcher=false; break;
                default:
                    System.out.println("Podaj odpowienią liczbę");
                    break;
            }
        }
        
        pizza.setSos(wybor);
    }

    @Override
    public void zestawSkladnikow() {
        pizza.setZestawSkladnikow("ananas + szynka");
    }
}
