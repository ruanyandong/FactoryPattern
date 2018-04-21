package com.ai.abstractive.factory;

public class ClientPerson {

    public static void main(String[] args){

        PersonFactory factory=new MCfactory();
        Girl girl=factory.getGirl();
    }

}
