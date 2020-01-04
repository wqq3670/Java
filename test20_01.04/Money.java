package com;

/**
 * Created with IntelliJ IDEA.
 * Description: Money类 实现 Cloneable接口（只有简单类型）
 * User: dell
 * Date: 2019-11-24
 * Time: 10:15
 **/
public class Money implements Cloneable{
    public double m = 4.12;

    /**
     * 在Money 中只有简单类型，所以直接重写Object clone()
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
