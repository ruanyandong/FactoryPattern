package com.ai.factory.method;

import java.util.Map;

/**
 * 发型工厂
 *
 * =======================工厂方法模式=============================
 */
public class HairFactory {

    /**
     * 根据类的名称生成对象
     * @param className
     * @return
     */
    public HairInterface getHairByClassKey(String className){

        HairInterface hair=null;
        try {
            Map<String,String> map=new PropertiesReader().getProperties();

            hair=(HairInterface)Class.forName(map.get(className)).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hair;

    }
}
