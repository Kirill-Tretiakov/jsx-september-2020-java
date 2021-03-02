package homework3.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dress dress = new Dress(100, "red", ClothesSize.XS, "veshernee");
        TShirt tShirt = new TShirt(400, "white", ClothesSize.S, "gucci");
        Tie tie = new Tie(120, "black", ClothesSize.L, "arber");
        Pants pants = new Pants(300, "yellow", ClothesSize.M, "versachi");

        Clothes[] clothes = {dress, tShirt, pants, pants, tie};

        Atelie atelie = new Atelie(clothes);

        ArrayList<Clothes> womans = atelie.womanChoice();
        System.out.println(womans.toString());
        ArrayList<Clothes> mans = atelie.manChoice();
        System.out.println(mans.toString());
    }
}
