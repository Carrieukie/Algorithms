import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Comparable {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop(790, "hp"));
        laptops.add(new Laptop(493, "Acer"));
        laptops.add(new Laptop(247, "Dell"));
        laptops.add(new Laptop(231, "Mac"));
        laptops.add(new Laptop(567, "Omen"));

        Collections.sort(laptops);
        laptops.forEach(System.out::println);
    }
}

class Laptop implements java.lang.Comparable<Laptop> {
    int price;
    String name;

    public Laptop(int price, String name) {
        this.price = price;
        this.name = name;
    }


    @Override
    public int compareTo(Laptop o) {
        return this.price - o.price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}