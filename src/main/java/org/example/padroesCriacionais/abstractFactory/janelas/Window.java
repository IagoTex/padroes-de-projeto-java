package org.example.padroesCriacionais.abstractFactory.janelas;

public abstract class Window {

    private String title;

    public Window(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
