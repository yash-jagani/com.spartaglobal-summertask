package org.spartaglobal.summertask;

public class Summer {
    public static void main(String[] args) {
        int[] myInts = {1, 2, 3, 4, 5};
        Summer summer = new Summer();
        System.out.println(summer.sumArray(myInts));
    }
    public int sumArray(int[] theInts){
        int total = 0;
        for (int numbers: theInts){
            total+= numbers;
        }
        return total;
    }
}
