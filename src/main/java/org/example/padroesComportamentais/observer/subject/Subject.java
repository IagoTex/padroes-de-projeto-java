package org.example.padroesComportamentais.observer.subject;

import org.example.padroesComportamentais.observer.observer.Observer;

public interface Subject {

    void notifyObservers();

    void addObserver(Observer o);

    void removeObserver(Observer o);
}
