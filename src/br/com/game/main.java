package br.com.game;

import br.com.game.controller.Controller;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        int j1 = 0, j2 = 0, empate = 0, ganhosJ1 = 0, ganhosJ2 = 0;

        System.out.println("Escolha 0, 1 ou 2");
        System.out.println("Pedra = 0");
        System.out.println("Papel = 1");
        System.out.println("Tesoura = 2");

        if (controller.modoJogo()) {
            do {
                System.out.println("Jogador 1: ");
                j1 = controller.jogada(j1);
                System.out.println("Jogador 2: ");
                j2 = controller.jogada(j2);

                switch (j1) {
                    case 0:
                        switch (j2) {
                            case 0:
                                System.out.println("Jogo empatado");
                                empate++;
                                break;
                            case 1:
                                System.out.println("Jogador 2 venceu");
                                ganhosJ2++;
                                break;
                            case 2:
                                System.out.println("Jogador 1 venceu");
                                ganhosJ1++;
                                break;
                            default:
                        }
                        break;
                    case 1:
                        switch (j2) {
                            case 0:
                                System.out.println("Jogador 1 venceu");
                                ganhosJ1++;
                                break;
                            case 1:
                                System.out.println("Jogo empatado");
                                empate++;
                                break;
                            case 2:
                                System.out.println("Jogador 2 venceu");
                                ganhosJ2++;
                                break;
                            default:
                        }
                        break;
                    case 2:
                        switch (j2) {
                            case 0:
                                System.out.println("Jogador 2 venceu");
                                ganhosJ2++;
                                break;
                            case 1:
                                System.out.println("Jogador 1 venceu");
                                ganhosJ1++;
                                break;
                            case 2:
                                System.out.println("Jogo empatado");
                                empate++;
                                break;
                            default:
                        }
                        break;
                    default:
                }

            } while(controller.jogarNovamente());
            System.out.println("Empates: " + empate);
            System.out.println("Jogador 1 venceu : " + ganhosJ1 + " vezes");
            System.out.println("Jogador 2 venceu : " + ganhosJ2 + " vezes");
        } else {
            do {
                System.out.println("Jogador 1: ");
                j1 = controller.jogada(j1);
                System.out.println("Jogador 2: ");
                j2 = controller.jogadaMachine();
                System.out.println("Máquina: " + j2);

                switch (j1) {
                    case 0:
                        switch (j2) {
                            case 0:
                                System.out.println("Jogo empatado");
                                empate++;
                                break;
                            case 1:
                                System.out.println("Jogador 2 venceu");
                                ganhosJ2++;
                                break;
                            case 2:
                                System.out.println("Jogador 1 venceu");
                                ganhosJ1++;
                                break;
                            default:
                        }
                        break;
                    case 1:
                        switch (j2) {
                            case 0:
                                System.out.println("Jogador 1 venceu");
                                ganhosJ1++;
                                break;
                            case 1:
                                System.out.println("Jogo empatado");
                                empate++;
                                break;
                            case 2:
                                System.out.println("Jogador 2 venceu");
                                ganhosJ2++;
                                break;
                            default:
                        }
                        break;
                    case 2:
                        switch (j2) {
                            case 0:
                                System.out.println("Jogador 2 venceu");
                                ganhosJ2++;
                                break;
                            case 1:
                                System.out.println("Jogador 1 venceu");
                                ganhosJ1++;
                                break;
                            case 2:
                                System.out.println("Jogo empatado");
                                empate++;
                                break;
                            default:
                        }
                        break;
                    default:
                }
            } while(controller.jogarNovamente());
            System.out.println("Empates: " + empate);
            System.out.println("Jogador 1 venceu : " + ganhosJ1 + " vezes");
            System.out.println("Jogador 2 venceu : " + ganhosJ2 + " vezes");
        }
    }
}
