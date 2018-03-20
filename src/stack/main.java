package stack;

import Lista2_Pilhas_estaticas.Lista2;
import ListaTADPilha.Lista1;
import java.util.Scanner;


public class main {
    public static void main(String[] args){
        
        Lista1 list = new Lista1();
        Lista2 list2 = new Lista2();
        Scanner scan = new Scanner(System.in);
        Stack pilha1 = new Stack();
        Stack pilha2 = new Stack();
        Stack pilha3 = new Stack();
        Stack pilha5 = new Stack();
        int menu =-1;
        while(menu!=0){
        System.out.println("Informe o numero do exercicio: \n"
        +"1 - Exercicio1;\n"
        +"2 - Exercicio2;\n"
        +"3 - Exercicio3;\n"
        +"4 - Exercicio4;\n"
        +"5 - Exercicio5;\n"
        +"6 - Exercicio 1 -Lista2;\n"
        +"7 - Exercicio 2 -Lista2;\n"
        +"8 - Exercicio 3 -Lista2;\n"
        +"0 - Sair; \n");
        menu = scan.nextInt();
        scan.reset();
        switch (menu){
            case 1:
                for(int i = 0;i<5;i++){
                    pilha1.push(i);
                    pilha2.push(i);
                }
                for(int i = 5;i<0;i--){
                    pilha1.push(i);
                }

                if(list.equalStacks(pilha1, pilha2)){
                    System.out.println("Pilhas Iguais");
                }else{
                    System.out.println("Pilhas diferentes");
                }
            break;
            case 2:
            case 3:
               //alterar entre 7, 5, 3 para testar 
                pilha3.push(7);
                pilha3.push(5);
                pilha3.push(3);
                pilha3.push(5);

                pilha3 = list.chegaNoDeposito(pilha3);
                pilha3.printStack();
            break;
            case 4:
                Stack estacionamento = new Stack(10);
                boolean continua=true;
                Scanner sc = new Scanner(System.in);
                    int s = 0;
                while(continua==true){
                    System.out.println("Informe -1 para sair do sistema:");
                    s = sc.nextInt();
                    if(s!=-1){
                        list.EstacionamentoDaVanessa(estacionamento);
                    }else
                        continua = false;
                }
            break;
            case 5:
                Scanner scaner5 = new Scanner(System.in);
                String TEXTO;
                System.out.println("informe a frase:");
                TEXTO = scaner5.nextLine();
                pilha5 = list.criptografia(TEXTO);
                list.descriptografia(pilha5);
                scaner5.reset();
            break;
            case 0:
            break;
            case 6:
                if(list2.compararPilhas(pilha1, pilha2)){
                    System.out.println("A pilha 1 é maior do que a pilha 2");
                }else{
                    System.out.println("A pilha 1 não é maior.");
                }
            break;
            case 7:
                Stack pilha7 = new Stack();
                pilha7.push("s");
                pilha7.push("o");
                pilha7.push("c");
                pilha7.push("o");
                pilha7.push("r");
                pilha7.push("r");
                pilha7.push("o");
                pilha7.printStack();
                pilha7=list2.inverterPilha(pilha7);
                pilha7.printStack();
            break;
            case 8:
                list2.palindromo();
            break;
        }
        
        
        
        
        }
    }
}
