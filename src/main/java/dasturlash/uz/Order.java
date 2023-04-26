package dasturlash.uz;

import java.util.Set;

public class Order {
    private Integer number;
    private Set<String> items;

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setItems(Set<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" + "number=" + number + ", items=" + items + '}';
    }
}
