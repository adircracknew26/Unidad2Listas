public class SingleLinkList {
    Nodo cabeza;
    public SingleLinkList(){
        this.cabeza = null;
    }

    public void insertar(Integer dato){
        //Crear nuevo nodo
        Nodo nuevoNodo = new Nodo(dato);
        //verificar si la lista esta vacia
        if(cabeza == null){
            //coloca el nuevo nodo como cabeza
            cabeza = nuevoNodo;
        }
        else{
            //inicializamos la cabeza (el primero)
            Nodo temp = cabeza;
            //recorremos todos los nodos hasta encontrar un null en las referencias
            while (temp.siguiente != null) {
                temp=temp.siguiente;
                
            } 
            temp.siguiente = nuevoNodo;
        }
    }

    public void mostrar(){
            Nodo temp = cabeza;
            //mientras que temp no sea nulo
            while (temp!= null) {
                System.out.print(temp.dato + "->");
                temp = temp.siguiente;  
            }
            System.out.println("null");
        }
        public boolean buscar(Integer buscado){
            if(cabeza == null){
                System.out.println("El valor no existe en la lista");

            }else{
                Nodo temp = cabeza;
                while(temp.siguiente != null){
                    if( temp.dato == buscado){
                        System.out.println("Dato encontrado");
                        return true;
                    }
                    temp = temp.siguiente;
                }
                System.out.println("El nodo con el valor buscado no está presente en la lista.");
            }
            return false;
        }

        public void eliminar(Integer valor){
            if(cabeza == null){
                System.out.println("La lista esta vacia");
            }
            if( cabeza.dato == valor){
                cabeza=cabeza.siguiente;
            }
            Nodo temp=cabeza;
             Nodo anterior=null;
             while(temp!=null && temp.dato!=valor){// recorrer hasta encontrar el nodo con el valor
                anterior=temp;
                temp=temp.siguiente;
             }
             if(temp==null){
                System.out.println("No se encontro el valor");
                return;
             }
             anterior.siguiente=temp;
        
             System.out.println("Se elimino correctamente " + valor);

        }


    
    
}
