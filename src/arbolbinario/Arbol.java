package arbolbinario;

import java.util.ArrayList;

public class Arbol {

    ArrayList<Nodo> nodos;

    public Arbol(String raiz) {
        this.nodos = new ArrayList();
        this.nodos.add(new Nodo(raiz));
    }

    public void addNodo(String padre, String key, Boolean isRigth) {
        for (Nodo raiz : nodos) {
            if (raiz.getKey().equals(padre)) {
                nodos.add(new Nodo(key));
                if (isRigth) {
                    raiz.RigthNodo = nodos.get(nodos.size() - 1);
                } else {
                    raiz.LeftNodo = nodos.get(nodos.size() - 1);
                }
                break;
            }
        }
    }

    public void Preorden(Nodo raiz) {
        if (raiz != null) {
            System.out.println(raiz.getKey());
            Preorden(raiz.getLeftNodo());
            Preorden(raiz.getRigthNodo());
        }
    }

    public void Inorden(Nodo raiz) {
        if (raiz != null) {

            Inorden(raiz.getLeftNodo());
            System.out.println(raiz.getKey());
            Inorden(raiz.getRigthNodo());
        }
    }

    public void Posorden(Nodo raiz) {
        if (raiz != null) {

            Posorden(raiz.getLeftNodo());
            Posorden(raiz.getRigthNodo());
            System.out.println(raiz.getKey());
        }
    }
}
