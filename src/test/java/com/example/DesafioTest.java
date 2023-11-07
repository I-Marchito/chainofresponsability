package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DesafioTest {

    NPCBeginner beginner;
    NPCAmateur amateur;
    NPCAce ace;
    NPCPro pro;

    @BeforeEach
    void setUp(){
        pro = new NPCPro(null);
        ace = new NPCAce(pro);
        amateur = new NPCAmateur(ace);
        beginner = new NPCBeginner(amateur);
    }

    @Test
    void deveRetornarJulliusParaDesafioBeginner(){
        assertEquals("Julius: 1 Pokémon", beginner.iniciarDesafio(new Desafio(DesafioRankBeginner.getDesafioRankBeginner())));
    }

    @Test
    void deveRetornarAbelParaDesafioAmateur(){
        assertEquals("Abel: 2 Pokémons", amateur.iniciarDesafio(new Desafio(DesafioRankAmateur.getDesafioRankAmateur())));
    }

    @Test
    void deveRetornarLorelayParaDesafioAce(){
        assertEquals("Lorelay: 3 Pokémons", ace.iniciarDesafio(new Desafio(DesafioRankAce.getDesafioRankAce())));
    }

    @Test
    void deveRetornarLanceParaDesafioPro(){
        assertEquals("Lance: 6 Pokémons", pro.iniciarDesafio(new Desafio(DesafioRankPro.getDesafioRankPro())));
    }

}
