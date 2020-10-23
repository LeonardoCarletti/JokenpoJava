package br.com.game.controller;

import java.util.Random;
import java.util.Scanner;

public class Controller {

    Scanner sc = new Scanner(System.in);
    Random gerador = new Random();
    public int jogada(int jogador){
        try {
            System.out.print("Escolha: ");
            jogador = sc.nextInt();
        } catch (Exception e){
            System.out.println("É NUMERO BURRO!");
            jogada(jogador);
        }
        return jogador;
    }

    public int jogadaMachine(){
        return gerador.nextInt(3);
    }

    public boolean jogarNovamente(){
        System.out.println("Jogar novamente? 1-SIM 2-NÃO");
        int decisao = sc.nextInt();
        if(decisao == 1){
            return true;
        } else if(decisao == 2){
            return false;
        } else {
            System.out.println("ESCOLHE DIREITO!!!!!!!");
            return jogarNovamente();
        }
    }

    public boolean modoJogo(){
        System.out.println("Escolha o modo de jogo!");
        System.out.println("Sendo:");
        System.out.println("1 - Jogador VS Jogador");
        System.out.println("2 - Jogador VS Máquina");
        int modo = sc.nextInt();
        if(modo == 1){
            return true;
        } else if(modo == 2){
            return false;
        } else {
            System.out.println("ESCOLHE DIREITO!!!!!!!");
            return modoJogo();
        }
    }
}
