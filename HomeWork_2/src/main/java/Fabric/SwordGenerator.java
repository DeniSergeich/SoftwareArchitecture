package Fabric;

import Interface.IGameItem;
import Product.Sword;

public class SwordGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Sword();
    }
}
