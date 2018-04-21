package com.ai.abstractive.factory;

public class MCfactory implements PersonFactory{

    @Override
    public Boy getBoy() {
        return new MCBoy();
    }

    @Override
    public Girl getGirl() {
        return new MCGirl();
    }

}
