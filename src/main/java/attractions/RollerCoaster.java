package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() >= 12 && visitor.getHeight() > 1.45){
            return true;
        }
        return false;
    }

    public double defaultPrice(){
        return price;
    }
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2.0){
            return price * 2;
        }
        return price;
    }
}
