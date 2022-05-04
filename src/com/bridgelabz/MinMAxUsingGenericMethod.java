
package com.bridgelabz;


/**
 * Purpose - To find maximum value using generics
 * @author -Sneha Bhokare
 */
public class MinMAxUsingGenericMethod <T extends Comparable <T>>{
    /**
     * Generic method to compare Float type of data and find maximum
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

        Float pFloat = 12.0f,qFloat = 43.7f,rFloat = 54.0f,sFloat = 39.90f;
        System.out.println("The maximum value between the three Float is :" + max.findMax(pFloat,qFloat,rFloat, sFloat));


    }
}
