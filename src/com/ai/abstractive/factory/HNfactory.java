package com.ai.abstractive.factory;

public class HNfactory implements PersonFactory{
    @Override
    public Girl getGirl() {
        return new HNGirl();
    }

    @Override
    public Boy getBoy() {
        return new HNBoy();
    }
}
