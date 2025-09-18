package org.example.padroesCriacionais.singleton.dbGerenciador;

public class GerenciadorDB {

    private static GerenciadorDB instance;

    private GerenciadorDB() {}

    public static GerenciadorDB getInstance() {
        if (instance == null) {
            instance = new GerenciadorDB();
        }
        return instance;

    }
}
