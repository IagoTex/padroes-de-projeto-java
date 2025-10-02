package org.example.padroesComportamentais.observer.observer;

import org.example.padroesComportamentais.observer.classes.User;

public class UserObserver implements Observer {

    private User user;

    public UserObserver(User user) {
        this.user = user;
    }

    @Override
    public void update(String message) {
        System.out.println(user.getNome() + " - " + message);
    }
}
