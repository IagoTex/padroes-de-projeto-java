package org.example.padroesComportamentais.observer;

import org.example.padroesComportamentais.observer.classes.Item;
import org.example.padroesComportamentais.observer.classes.Livro;
import org.example.padroesComportamentais.observer.classes.User;
import org.example.padroesComportamentais.observer.observer.UserObserver;
import org.example.padroesComportamentais.observer.subject.ControleEstoque;
import org.example.padroesComportamentais.observer.subject.Subject;

public class mainObserver {

    public static void main(String[] args) {

        User user = new User("Pedro", "pedro@gmail.com");
        User user1 = new User("Iago", "iago@gmail.com");

        Item livro = new Livro("Mobdick", "Doido", "Editora", 23.49, 3);

        UserObserver userObserver = new UserObserver(user);
        UserObserver userObserver1 = new UserObserver(user1);

        Subject controleEstoque = new ControleEstoque(livro);

        controleEstoque.addObserver(userObserver);
        controleEstoque.addObserver(userObserver1);

        controleEstoque.notifyObservers();


    }
}
