package homework3.task1;

import java.util.ArrayList;

public class Atelie {
    private Clothes[] clothes;

    public Atelie(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public Clothes[] getClothes() {
        return this.clothes;
    }

    public void setClothes(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public ArrayList<Clothes> womanChoice() {
        ArrayList<Clothes> woman = new ArrayList<>();
        for (Clothes cloth : this.clothes) {
            if (cloth instanceof WomanClothes) {
                woman.add(cloth);
            }
        }
        return woman;
    }

    public ArrayList<Clothes> manChoice() {
        ArrayList<Clothes> man = new ArrayList<>();
        for (Clothes cloth : this.clothes) {
            if (cloth instanceof ManClothes) {
                man.add(cloth);
            }
        }
        return man;
    }

}

