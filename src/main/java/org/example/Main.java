package org.example;

public class Main{

        public static void main(String[] args) {

            // Criando a Sakura
            Ninja sakura = new Ninja();
            sakura.nome = "Sakura Haruno";
            sakura.aldeia = "Aldeia da Folha";
            sakura.idade = 17;

            // Criando a Hinata
            Ninja hinata = new Ninja();
            hinata.nome = "Hinata Hyuga";
            hinata.aldeia = "Aldeia da Folha";
            hinata.idade = 16;
            hinata.byakuganAtividado();

            // Criando o Sasuke
            uchiha sasuke = new uchiha();
            sasuke.nome = "Sasuke Uchiha";
            sasuke.aldeia = "Aldeia da Folha";
            sasuke.idade = 17;
            sasuke.sharinganAtivado();
        }
    }
