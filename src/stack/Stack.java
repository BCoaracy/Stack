package stack;

import stack.Peca;

public class Stack {
    
    public int tam = 100;
    public int stackPosition = -1;
    public Object[] obj = new Object[tam];
    
    public Stack(){
        
    }
    
    public Stack(int tam){
        this.tam=tam;
    }
    
    public boolean isFull(){
        if(stackPosition==tam){
            return true;
        }
        return false;
    }
    
    public void push(Object obj){
        if(!isFull()){
            this.obj[++stackPosition] = obj;
        }else
            System.out.println("Pilha cheia");
    }
    
    public void pop(){
        try{
            if(!isEmpty()){
                stackPosition--;
            }else
                System.out.println("Pilha vazia!");
        }catch(Exception e){
        }
    }
    
    public Object popR(){
        if(!isEmpty()){
                stackPosition--;
                return obj[stackPosition+1];
            }else
                System.out.println("Pilha vazia!");
        return null;
    }
    
    public boolean isEmpty(){
        if(stackPosition==-1)
            return true;
        return false;
    }
    
    public Object peak(){
        if(!isEmpty())
            return obj[stackPosition];
        return null;
    }
    
    public int size(){
        if(this.isEmpty())
            return 0;
        return this.stackPosition+1;
    }
    
    public Stack clone(Stack stack){
        Stack sClone = new Stack();
        Stack sCloneAux = new Stack();
        
        while(!stack.isEmpty()){
            sCloneAux.push(stack.popR());
        }
        while(!sCloneAux.isEmpty()){
            sClone.push(sCloneAux.peak());
            stack.push(sCloneAux.popR());
        }
        return sClone;
    }
    
    public void printStack(){
        Stack aux = new Stack();
        aux=aux.clone(this);
        while(!aux.isEmpty()){
            System.out.print(aux.peak());
            aux.pop();
        }
        System.out.println("");
    }
}
