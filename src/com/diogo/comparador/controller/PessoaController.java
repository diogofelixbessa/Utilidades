package com.diogo.comparador.controller;

import com.diogo.comparador.model.Bbi;

import java.util.ArrayList;
import java.util.List;

public class PessoaController {

    public void comparaPessoa(){

        List<Bbi> a = new ArrayList<>();
        List<Bbi> b = new ArrayList<>();
        List<Bbi> c = new ArrayList<>();
        List<Bbi> d = new ArrayList<>();
        List<Bbi> e = new ArrayList<>();
        List<Bbi> f = new ArrayList<>();
        List<Bbi> g = new ArrayList<>();
        List<Bbi> h = new ArrayList<>();
        List<Bbi> i = new ArrayList<>();



        Bbi p0 = new Bbi("0","Ações", "Bradesco","Ofertas Ativas","a",a);
        Bbi p1 = new Bbi("1","Ações", "Bradesco","Ofertas Ativas","b",b);
        Bbi p2 = new Bbi("2","Ações", "Bradesco","Ofertas Ativas","c",c);
        Bbi p3 = new Bbi("3","Ações", "Ambipar","Ofertas Ativas","d",d);
        Bbi p4 = new Bbi("4","Ações", "Ambipar2","Ofertas Ativas","e",e);
        Bbi p5 = new Bbi("5","Ações", "Ambipar2","Ofertas Ativas","f",f);
        Bbi p6 = new Bbi("6","Ações", "Ambipar","Ofertas Ativas","g",g);
        Bbi p7 = new Bbi("7","Ações", "Ambipar","Ofertas Ativas","h",h);
        Bbi p8 = new Bbi("8","Ações", "Ambipar","Ofertas Ativas","i",i);


        List<Bbi> bbiListPrimeira = new ArrayList<>();
        bbiListPrimeira.add(p0);
        bbiListPrimeira.add(p1);
        bbiListPrimeira.add(p2);
        bbiListPrimeira.add(p3);
        bbiListPrimeira.add(p4);
        bbiListPrimeira.add(p5);
        bbiListPrimeira.add(p6);
        bbiListPrimeira.add(p7);
        bbiListPrimeira.add(p8);

        List<Bbi> bbiListPronta = new ArrayList<>();
        List<Bbi> listBbiJaUtilizadas = new ArrayList<>();

        for (Bbi bbiPrimeira: bbiListPrimeira) {
            String chave1 = bbiPrimeira.getNome_empresa() + bbiPrimeira.getFile_category() + bbiPrimeira.getTipo_oferta();

            if (listBbiJaUtilizadas.contains(bbiPrimeira)) { continue; }
            //}
            for(Bbi bbiSegunda : bbiListPrimeira) {
                String chave2 = bbiSegunda.getNome_empresa() + bbiSegunda.getFile_category() + bbiSegunda.getTipo_oferta();

                if (chave1.equals(chave2) && !bbiPrimeira.getId().equals(bbiSegunda.getId()) ) {

                    listBbiJaUtilizadas.add(bbiSegunda);

                    for(Bbi pronta : bbiListPronta) {
                        String chavepronta = pronta.getNome_empresa() + pronta.getFile_category() + pronta.getTipo_oferta();
                        if(chavepronta.equals(chave2)){
                            pronta.getListSecondaryBBI().add(bbiSegunda);
                        }
                    }
                }
                if (chave1.equals(chave2) && bbiPrimeira.getId().equals(bbiSegunda.getId()) ) {
                    bbiListPronta.add(bbiPrimeira);
                    listBbiJaUtilizadas.add(bbiPrimeira);
                }

            }
        }
        System.out.println(bbiListPronta);
    }

}