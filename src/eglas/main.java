package eglas;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int stanica;
        ArrayList<Integer> rj = new ArrayList<Integer>();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Unos");
        do{
            System.out.println("Unesi broj stanica:");
            stanica=scanner.nextInt();
        }while (stanica<2 || stanica>1000);
        unos a=new unos();
        Scanner scanner1= new Scanner(System.in);
        int oof=stanica-1;
        for(int i=0;i<stanica;i++){
            if(i==0) {
                do {
                    a.brojevi(scanner1.nextInt(), scanner1.nextInt());
                    if(a.getA()==0 && a.getB()>=0 && a.getB()<=1000){
                        int rezultat = a.oduzimanje();
                        rj.add(rezultat);
                    }
                    i++;
                }while(a.getA()!=0 || a.getB()<0 || a.getB()>1000);
            }
            if(i<oof){
                do {
                    a.brojevi(scanner1.nextInt(), scanner1.nextInt());
                    if(a.getA()>=0 && a.getB()<=1000){
                    int rezultat = a.oduzimanje();
                    rj.add(rezultat);}
                    else System.out.println("Krivi raspon vrijednosti unesen!");
                }while(a.getA()<0 || a.getB()>1000);
            }
            else{
                do{
                    a.brojevi(scanner1.nextInt(), scanner1.nextInt());
                    a.maxsum(rj);
                    if(a.getB()==0 && a.getA()==a.getMaxlast()) {
                        int rezultat = a.oduzimanje();
                        rj.add(rezultat);
                    }
                    else{
                        System.out.println("Treba maknuti "+a.getMaxlast()+" ljudi iz tramvaja. Unesi ponovno!");
                    }
                }while(a.getB()!=0 || a.getA()!=a.getMaxlast());
                System.out.println("Minimalni kapacitet:"+a.maxsum(rj));
            }
        }
    }
}
