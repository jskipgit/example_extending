package com.ironyard;

/**
 * Created by jasonskipper on 1/11/17. test commment
 */
public class Animal extends Object{
    public String name;
    public int lbs;

    public boolean equals(Object compareMe){
        Animal a = (Animal)compareMe;
        boolean areTheSame = this.name.equals(a.name);
        return areTheSame;
    }



}
