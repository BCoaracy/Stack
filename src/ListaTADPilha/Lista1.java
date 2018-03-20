package ListaTADPilha;

import java.util.Scanner;
import stack.Stack;

public class Lista1 {
    
    //Exercicio 1
    
    public boolean equalStacks(Stack stack1, Stack stack2){
        Stack auxP1 = new Stack();        
        Stack auxP2 = new Stack();
        auxP1=stack1;
        auxP2=stack2;
        if(stack1.size()!=stack2.size())
            return false;
        int i = auxP1.size();

        while(i<0){
            if(auxP1.peak()!=auxP2.peak()){
                return false;
            }else{
                auxP1.pop();
                auxP2.pop();
            }
            i--;
        }
        return true;
    }
    //--------------------------------------------------------------------------
    //Exercicio 3 - Estacionamento arquitetado pela professora de ED

    public void EstacionamentoDaVanessa(Stack est){
        Scanner sc = new Scanner(System.in);
        Carros estacionado = new Carros();
        Stack estacionamento = new Stack(10);
        estacionamento = est;
        String placa;
        boolean sair = true;
        System.out.println("Entrada, ou saída:");
        String Es = sc.next();
        if(Es.equals("e")){
            if(estacionamento.isFull()){
                System.out.println("Desculp, tam lotadim, lotadim");//mineir fala assim
            }else{
                sc.reset();
                System.out.println("Informe a placa do carro.");
                estacionado.setES("e");
                estacionado.setPlaca(sc.next());
                sc.reset();
                estacionamento.push(estacionado);
            }
        }if(Es.equals("s")){
            System.out.println("Informe a placa do carro.");
            placa=sc.next();
            sc.reset();
            int iterador = 0;
            while(sair==true){
                estacionado = (Carros)estacionamento.peak();
                if(estacionado.getPlaca().equals(placa)){
                    est.pop();
                    iterador++;
                    System.out.println("O carro foi manobrado " + iterador + " vez");
                    sair=false;
                }else{
                    estacionamento.pop();
                    iterador++;
                }
            }
        }
    }
    
    //--------------------------------------------------------------------------
    
    //Exercicio 4 - pilhas malucas da Vanessa
    
    public Stack chegaNoDeposito(Stack pilha){
        Stack pilhaA = new Stack();
        Stack pilhaB = new Stack();
        Stack pilhaC = new Stack();
        
        int aux =0, topoA=0;
        
        while(!pilha.isEmpty()){
            aux = (int)pilha.peak();
            if(pilhaA.isEmpty()||(aux<=(int)pilhaA.peak())){
                pilhaA.push(aux);
                pilha.pop();
            }else{      
                
                topoA = (int)pilhaA.peak();
                //desempilhar valores maiores que a variável auxiliar.
                while(aux<topoA||!pilhaA.isEmpty()){
                    if(topoA==5){
                        pilhaB.push(topoA);
                        pilhaA.pop();
                    }if(topoA==3){
                        pilhaC.push(topoA);
                        pilhaA.pop();
                    }
                    if(!pilhaA.isEmpty()){
                        topoA = (int)pilhaA.peak();
                    }
                }
                pilhaA.push(aux);
                // Desempilhadoramento da pilha b e c
                while(!pilhaB.isEmpty()){
                    pilhaA.push(pilhaB.peak());
                    pilhaB.pop();
                }
                while(!pilhaC.isEmpty()){
                    pilhaA.push(pilhaC.peak());
                    pilhaC.pop();
                }
                pilha.pop();
            }
            
        }
        
        return pilhaA;
    }
    //Fim da função do 4 exercicio
    
    //Exercicio 5
    public Stack criptografia(String texto){
        Stack stack = new Stack();
        for(int i=0; i < texto.length();i++){
            stack.push(texto.charAt(i));
        }
        return stack;
    }
    
    public void descriptografia(Stack stack2){
        Stack s = new Stack();
        s=stack2;
        while(!s.isEmpty()){
            System.out.print(s.peak());
            s.pop();
        }
        System.out.println("");
    }
    //--------------------------------------------------------------------------
    
   
    
}
