package Lista2_Pilhas_estaticas;

import ListaTADPilha.Lista1;
import java.util.Scanner;
import stack.Stack;

public class Lista2 {
    public boolean compararPilhas(Stack s1, Stack s2){
        if(!s1.isEmpty()&&!s2.isEmpty()){
            if(s1.size()<s2.size()){
                return true;
            }
        }
        return false;
    }
    
    public Stack inverterPilha(Stack s){
        Stack sAuxiliar = new Stack();
        Stack sInvertida = new Stack();
        
        
        sAuxiliar=sAuxiliar.clone(s);
        while(!sAuxiliar.isEmpty()){
            sInvertida.push(sAuxiliar.peak());
            sAuxiliar.pop();
        }
        
        return sInvertida;
    }
    
    public void palindromo(){
        Stack s = new Stack();
        Stack sComparacao = new Stack();
        Scanner scan = new Scanner(System.in);
        String texto;
        System.out.println("Informe o texto:");
        texto = scan.nextLine();
        for(int i=0; i < texto.length();i++){
            s.push(texto.charAt(i));
        }
        //Metodo para escrever a pilha de forma inversa:
        Lista1 lista1= new Lista1();
        lista1.descriptografia(s);
        //Fim
        while(!s.isEmpty()){
            s.pop();
        }
        for(int i=0; i < texto.length();i++){
            if(texto.charAt(i)==(' ')){
            } else {
                s.push(texto.charAt(i));
            }
        }
        
        //sComparacao=s.clone(inverterPilha(s));
        sComparacao=s.clone(s);
        sComparacao=inverterPilha(sComparacao);
        if(lista1.equalStacks(s, sComparacao)){
            System.out.println("O texto é um palindromo!");
        }else{
            System.out.println("O texto não é um palindromo");
        }
    }
    
}
