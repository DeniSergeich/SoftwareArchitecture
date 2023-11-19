package Fabric;

import Interface.IGameItem;
import Product.Medal;

public class MedalGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Medal();
    }
}
