package org.example.padroesCriacionais.prototype;

import org.example.padroesCriacionais.prototype.classes.Predio;

public class PrototypeMain {
    public static void main(String[] args) {

        Predio original = new Predio(10, 10, "A");
        Predio copy = original.copy();

        System.out.println(original);
        System.out.println(copy);
    }
}
