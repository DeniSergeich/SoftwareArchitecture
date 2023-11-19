package Fabric;

import Interface.IGameItem;
import Product.Horse;

public class HorseGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Horse();
    }
}
