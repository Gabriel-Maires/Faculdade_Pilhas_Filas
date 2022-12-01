import java.util.ArrayDeque;
import java.util.ArrayList;

public class JavaPilhasListas {

public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<>(5);
    ArrayDeque<Integer> pilha = new ArrayDeque<>(5);
    ArrayDeque<Integer> fila = new ArrayDeque<>(10);
    
    lista.add(1);
    lista.add(2);
    lista.add(3);
    lista.add(4);
    lista.add(5);

    while(!lista.isEmpty()) {
        int elemento = lista.remove(0);
        pilha.push(elemento);
    }

    while(!pilha.isEmpty()) {
        int elemento = pilha.pop();
        fila.add(elemento);
    }
    lista.add(6);
    lista.add(7);
    lista.add(8);
    lista.add(9);
    lista.add(10);

    while(!lista.isEmpty()) {
        int elemento = lista.remove(0);
        pilha.push(elemento);
    }

    while(!pilha.isEmpty()) {
        int elemento = pilha.pop();
        fila.add(elemento);
    }
    System.out.println(fila);
}   
}
