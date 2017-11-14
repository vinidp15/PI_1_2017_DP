/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marcos Vinicius de Paula Valério Santos
 */
public class Pi_1 {

    public static void populaAlfabeto(char[] alfabeto) {

        alfabeto[0] = 'a';
        alfabeto[1] = 'b';
        alfabeto[2] = 'c';
        alfabeto[3] = 'd';
        alfabeto[4] = 'e';
        alfabeto[5] = 'f';
        alfabeto[6] = 'g';
        alfabeto[7] = 'h';
        alfabeto[8] = 'i';
        alfabeto[9] = 'j';
        alfabeto[10] = 'k';
        alfabeto[12] = 'l';
        alfabeto[13] = 'm';
        alfabeto[14] = 'n';
        alfabeto[15] = 'o';
        alfabeto[16] = 'p';
        alfabeto[17] = 'q';
        alfabeto[18] = 'r';
        alfabeto[19] = 's';
        alfabeto[20] = 't';
        alfabeto[21] = 'u';
        alfabeto[22] = 'v';
        alfabeto[23] = 'w';
        alfabeto[24] = 'x';
        alfabeto[25] = 'y';
        alfabeto[26] = 'z';

    }

    public static void conversao(int numero, int base) {

    }

    public static void descriptografaTxt() {
        System.out.println("");

    }

    public static void criptografaTxt() {
        System.out.println("");

    }

    public static void descriptografaTexto() {
        System.out.println("");

    }

    public static void criptografaTexto(int deslocamento, String texto, char[] alfabeto) {
        System.out.println("");
        int deslocamentoPadrao = 3;

        char[] letra = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) == ' ' && deslocamento != 3) {

                letra[i] = '#';

            } else {

                if (texto.charAt(i) == ' ') {
                    letra[i] = ' ';
                } else {
                    letra[i] = texto.toLowerCase().charAt(i);
                }
            }

        }

        for (int i = 0; i < letra.length; i++) {

            for (int j = 0; j < alfabeto.length; j++) {
                if (alfabeto[j] == letra[i]) {
                    System.out.print(alfabeto[j + (deslocamentoPadrao - deslocamento)]);
                    break;
                } else {
                    if (letra[i] == '#' && deslocamento != 3) {
                        System.out.print(letra[i]);
                        break;
                    } else {
                        if (letra[i] == ' ') {
                            System.out.print(letra[i]);
                            break;
                        }
                    }
                }
            }

        }

    }

    public static boolean resetarSaida(boolean sair) {

        sair = false;
        return sair;
    }

    public static void main(String[] args) {

        Scanner tecladoLine = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        boolean encerrar = false;
        boolean sair = false;

        String voltar;
        String texto;

        int modulo;
        int funcionalidade;
        int numero;
        int base;
        int deslocamento;

        char[] alfabeto = new char[27];

        populaAlfabeto(alfabeto);

        do {
            System.out.println("Bem vindo ao menu de Módulos");
            System.out.println("");
            System.out.println("Digite o nº1 para o módulo de Criptografia :");
            System.out.println("Digite o nº2 para o módulo de Conversão :");
            System.out.println("Digite o nº0 para encerrar o programa :");

            modulo = teclado.nextInt();

            switch (modulo) {

                case 1:

                    while (sair == false) {

                        System.out.println("");
                        System.out.println("Bem vindo ao modo de Criptografia, escolha uma das oppções a seguir");
                        System.out.println("");
                        System.out.println("Digite o nº 1 para Criptografar um texto digitado :");
                        System.out.println("Digite o nº 2 para Descriptografar um texto digitado :");
                        System.out.println("Digite o nº 3 para Criptografar um texto gravado em .txt :");
                        System.out.println("Digite o nº 4 para Descriptografar um texto gravado em .txt :");
                        System.out.println("Digite o nº 0 para voltar ao menu do Módulos :");
                        System.out.println("");

                        funcionalidade = teclado.nextInt();

                        switch (funcionalidade) {

                            case 1:

                                System.out.println("Digite o texto a ser criptografado :");
                                texto = tecladoLine.nextLine();

                                System.out.println("Digite o deslocamento a ser utilizado :");
                                deslocamento = teclado.nextInt();

                                criptografaTexto(deslocamento, texto, alfabeto);
                                break;
                            case 2:
                                System.out.println("Digite o deslocamento a ser utilizado :");
                                System.out.println("Digite o texto a ser descriptografado :");
                                //Passar valores no parametro 
                                descriptografaTexto();
                                break;
                            case 3:
                                System.out.println("Digite o deslocamento a ser utilizado :");
                                System.out.println("Digite o caminho do arquivo .txt para ser criptografado :");
                                //Passar valores no parametro
                                criptografaTxt();
                                break;
                            case 4:
                                System.out.println("Digite o deslocamento a ser utilizado :");
                                System.out.println("Digite o caminho do arquivo .txt para ser descriptografado :");
                                //Passar valores no parametro
                                descriptografaTxt();
                                break;
                            case 0:
                                sair = true;
                            default:
                                System.out.println("Valor escolhido é inválido, tente novamente.");
                                System.out.println("");
                        }
                    }
                    sair = resetarSaida(sair);
                    break;

                case 2:

                    while (sair == false) {
                        System.out.println("");
                        System.out.println("Bem vindo ao modo de Conversão");
                        System.out.println("");

                        System.out.println("Digite deu numéro a ser convertido :");
                        numero = teclado.nextInt();
                        System.out.println("");

                        System.out.println("Digite a base em que o número deverá ser convertido :");
                        base = teclado.nextInt();
                        System.out.println("");

                        conversao(numero, base);

                        System.out.println("Caso queria retornar ao menu de módulo digite o SIM :");
                        voltar = teclado.next();

                        if (voltar.equalsIgnoreCase("Sim")) {
                            sair = true;
                        } else {
                            System.out.println("Valor digitado é inválido, você continuará no mesmo módulo");
                            sair = resetarSaida(sair);
                            System.out.println("");
                        }
                    }
                    sair = resetarSaida(sair);
                    break;

                case 0:
                    System.out.println("Programa encerrado com sucesso!");
                    System.out.println("");
                    encerrar = true;
                    break;

                default:
                    System.out.println("Valor escolhido é inválido, tente novamente.");
                    System.out.println("");
            }

        } while (!encerrar);

    }
}
