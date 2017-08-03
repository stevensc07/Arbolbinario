package arbolbinario;

import java.util.Scanner;

public class ArbolBinario {

    static Arbol arbol;

    public static void main(String[] args) {
        CrearArbol();
        System.out.println("Preorden");
        arbol.Preorden(arbol.nodos.get(0));
        System.out.println("Inorden");
        arbol.Inorden(arbol.nodos.get(0));
        System.out.println("Posorden");
        arbol.Posorden(arbol.nodos.get(0));
    }

    public static void CrearArbol() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----MENÚ-----");
        System.out.println("1. Crear arbol ");
        System.out.println("2. Salir ");
        System.out.println("Escoja una oppcion ");
        int opc = sc.nextInt();
        if (opc == 1) {
            System.out.println("Escriba la llave de la raiz");
            String key = sc.next();
            arbol = new Arbol(key);
            while (opc != 3) {
                System.out.println("-----MENÚ-----");
                System.out.println("1. Insertar un hijo derecho");
                System.out.println("2. Insertar un hijo izquierdo ");
                System.out.println("3. Salir");
                System.out.println("Escoja una oppcion ");
                opc = sc.nextInt();
                if (opc == 1 || opc == 2) {
                    System.out.println("Escriba la clave del padre");
                    String padre = sc.next();
                    System.out.println("Escriba la clave del hijo");
                    String newkey = sc.next();
                    if (opc == 1) {
                        arbol.addNodo(padre, newkey, true);
                    } else {
                        arbol.addNodo(padre, newkey, false);
                    }
                }
            }
        }

    }

}
