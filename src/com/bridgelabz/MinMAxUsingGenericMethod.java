
package com.bridgelabz;


/**
 * Purpose - To find maximum value using generics method
 * @author -Sneha Bhokare
 */
public class MinMAxUsingGenericMethod {
    /**
     * Generic method to compare any type of data and find maximum
     * @param x : First value to compare
     * @param y : Second value to compare
     * @param z : Third value to compare
     * @return max : Maximum of three values
     */
    public <T extends Comparable> T findMax(T x,T y,T z,T n){
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        if (n.compareTo(max) > 0)
            max = n;

        return max;
    }
    public static void main(String[] args) {
        MinMAxUsingGenericMethod max = new MinMAxUsingGenericMethod();

        Integer aInt = 10,bInt = 32,cInt = 211, dInt = 45;
        System.out.println("The maximum value between the three Integers is :" + max.findMax(aInt,bInt,cInt,dInt));


    }
}
