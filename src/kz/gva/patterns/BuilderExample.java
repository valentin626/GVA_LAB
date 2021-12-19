package kz.gva.patterns;

class Drink {
    private String view;
    private String compound;
    private int price;
    private int number;

    public static class Builder {

        private Drink drink;

        public Builder() {
            drink = new Drink();
        }

        public Builder withView(String view) {
            drink.view = view;
            return this;
        }

        public Builder withCompaund(String compound) {
            drink.compound = compound;
            return this;
        }

        public Builder withPrice(int price) {
            drink.price = price;
            return this;
        }

        public Builder withNumber(int number) {
            drink.number = number;
            return this;
        }


        public Drink build() {
            return drink;
        }

    }

    @Override
    public String toString() {
        return "Drink_Price{" + "Вид=" + view + ", Состав=" + compound + ", Цена=" + price + ", Кол-во=" + number + '}';
    }
    

}

public class BuilderExample {

    public static void main(String[] args) {
        Drink myDrrink_one = new Drink.Builder()
                .withView("Лонг Айленд")
                .withCompaund("Ром, Вода, Текила, Ликер, Пепси")
                .withPrice(250*3)
                .withNumber(3)
                .build();
        Drink myDrrink_two = new Drink.Builder()
                .withView("Клубничная Маргарита")
                .withCompaund("Текила, ликер, апельсин")
                .withPrice(310)
                .withNumber(1)
                .build();
        Drink myDrrink_three = new Drink.Builder()
                .withView("Кола")
                .withCompaund("Напиток")
                .withPrice(100)
                .withNumber(1)
                .build();
        Drink myDrrink_four = new Drink.Builder()
                .withView("Мохито")
                .withCompaund("Напиток")
                .withPrice(80)
                .withNumber(1)
                .build();
        System.out.println(myDrrink_one); 
        System.out.println(myDrrink_two); 
        System.out.println(myDrrink_three); 
        System.out.println(myDrrink_four); 
        
        }
 
    

}
