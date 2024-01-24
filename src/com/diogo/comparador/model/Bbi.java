package com.diogo.comparador.model;

import java.util.List;

public class Bbi {


    private String id;
    private String tipo_oferta;
    private String nome_empresa;
    private String file_category;
    private String title;
    private List<Bbi> listSecondaryBBI;

    public Bbi(String id, String tipo_oferta, String nome_empresa, String file_category, String title, List<Bbi> listSecondaryBBI) {
        this.id = id;
        this.tipo_oferta = tipo_oferta;
        this.nome_empresa = nome_empresa;
        this.file_category = file_category;
        this.title = title;
        this.listSecondaryBBI = listSecondaryBBI;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo_oferta() {
        return tipo_oferta;
    }

    public void setTipo_oferta(String tipo_oferta) {
        this.tipo_oferta = tipo_oferta;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }
    public String getFile_category() {
        return file_category;
    }
    public void setFile_category(String file_category) {
        this.file_category = file_category;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<Bbi> getListSecondaryBBI() {
        return listSecondaryBBI;
    }
    public void setListSecondaryBBI(List<Bbi> listSecondaryBBI) {
        this.listSecondaryBBI = listSecondaryBBI;
    }

    @Override
    public String toString() {
        return "Bbi{" +
                "id='" + id + '\'' +
                ", tipo_oferta='" + tipo_oferta + '\'' + "\n" +
                ", nome_empresa='" + nome_empresa + '\'' + "\n" +
                ", file_category='" + file_category + '\'' + "\n" +
                ", title='" + title + '\'' + "\n" +
                ", listSecondaryBBI=" + listSecondaryBBI + "\n" +
                '}';
    }
}
