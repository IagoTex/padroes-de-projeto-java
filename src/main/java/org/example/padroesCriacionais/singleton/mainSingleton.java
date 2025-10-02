package org.example.padroesCriacionais.singleton;

import org.example.padroesCriacionais.singleton.dbGerenciador.GerenciadorDB;

public class mainSingleton {

    public static void main(String[] args) {

        GerenciadorDB db = GerenciadorDB.getInstance();
        GerenciadorDB db2 = GerenciadorDB.getInstance();

        System.out.println("Verificando se ambos os objetos são a mesma instância: \n");

        if (db == db2) {
            System.out.println("Singleton funcional: ");
        }
        else {
            System.out.println("Não é um singleton: ");
        }
        System.out.println("Objeto db: " + db);
        System.out.println("Objeto db2: " + db2);
    }
}
