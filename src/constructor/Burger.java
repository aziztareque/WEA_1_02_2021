package constructor;

public class Burger {


    String nameOfBurger;
    char size;
    String topping;
    double priceOfBurger;
    int quantityOfBurger;
    double totalValue;
    boolean isBurgerAvailable;

    public Burger () {
    }

    public Burger (String nameOfBurger){
        this.nameOfBurger = nameOfBurger;

        System.out.println("Burger name is" + this.nameOfBurger);

        }

    public static void main(String[]args){
        Burger myBurger = new Burger();

        Burger yourBurger = new Burger("Dominoes");

        System.out.println(yourBurger.nameOfBurger);

        Burger herBurger = new Burger("FiveGuys");

        System.out.println(herBurger.nameOfBurger);

        }


    }

