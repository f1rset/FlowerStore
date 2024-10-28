package flower.store;

import lombok.Getter;
import lombok.Setter;
@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower1, int quantity1){
        this.flower = flower1;
        this.quantity = quantity1;
    }

    public Flower getFlower(){
        return this.flower;
    }
    public double getPrice(){
        return flower.getPrice()*quantity;
    }
}
