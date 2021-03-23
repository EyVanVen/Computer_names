package comp_store;

import java.lang.reflect.Array;
import java.util.*;

class main {


    public static void main(String[] args) {

        Computers[] computer_names = new Computers [5];

        String[] computers_arr = new String[5];

        computer_names[0] = new Computers("Alfa");
        computer_names[1] = new Computers("Beta");
        computer_names[2] = new Computers("Gama");
        computer_names[3] = new Computers("Zeta");
        computer_names[4] = new Computers("Omega");

        for (int i = 0; i < computers_arr.length; i++) {
            computers_arr[i] = computer_names[i].name;
            System.out.println(Arrays.toString(computers_arr));
        }
    }
}

class Computers{
    String name;

    public Computers (String name){
        this.name = name;
    }
}

