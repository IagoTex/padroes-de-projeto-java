package org.example.padroesCriacionais.singleton.codigoCliente;

import org.example.padroesCriacionais.singleton.dbGerenciador.GerenciadorDB;

public class mainSingleton {

    public static void main(String[] args) {

        GerenciadorDB db = GerenciadorDB.getInstance();
        GerenciadorDB db2 = GerenciadorDB.getInstance();

        if (db == db2) {
            System.out.println("Singleton funcional");
        }
    }
}
