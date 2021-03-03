package eglas;

import java.util.ArrayList;

public class unos {
    private int a,b;
    private int maxlast=0;
    private int counter=0;
    public void brojevi(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int oduzimanje(){
        return b-a;
    }
    //Kadane algoritam
    public int maxsum(ArrayList<Integer> a){
        int size=a.size();
        int max=0, maxzadnji=0;
        for(int i=0; i<size; i++){
            maxzadnji = maxzadnji+ a.get(i);
            maxlast=maxzadnji;
            if (max<maxzadnji){
                max=maxzadnji;}
            if (maxzadnji<0){
                maxzadnji=0;}
        }
        return max;
    }

    public int getMaxlast() {
        return maxlast;
    }
}
