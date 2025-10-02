package org.example.padroesComportamentais.templateMethod.abstractClass;

public abstract class FileProcessor {

    private String nomeArquivo;
    private String texto;


    public FileProcessor(String nomeArquivo, String texto) {
        this.nomeArquivo = nomeArquivo;
        this.texto = texto;
    }

    public final void processarArquivo() {
        abrirArquivo();
        escreverArquivo( texto);
        tipoArquivo();
        fecharArquivo();

    }

    private void abrirArquivo(){
            System.out.println(this.nomeArquivo + " aberta!");
    }

    protected abstract void tipoArquivo();

    private void escreverArquivo(String texto){
        System.out.println(this.nomeArquivo + " escrevendo!: " + texto);
        }

    private void fecharArquivo( ){
        System.out.println(this.nomeArquivo + " fechado!");
    }


}
