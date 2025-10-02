package org.example.padroesComportamentais.observer.subject;

import org.example.padroesComportamentais.observer.classes.Item;
import org.example.padroesComportamentais.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ControleEstoque  implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private Item item;

    public ControleEstoque(Item item) {
        this.item = item;
        notifyObservers();
    }

    private void setItem(Item item) {
        this.item = item;
    }

    @Override
    public void notifyObservers() {
        if (item.getEstoque() > 0) {
            for (Observer observer : observers) {
                observer.update("Item dentro do estoque: " + item.getEstoque());
            }
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}
