import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int buscado;
        int eliminado;

        Scanner leer = new Scanner(System.in);
        SingleLinkList lista = new SingleLinkList();
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.mostrar();

        // System.out.println("Ingresa dato a buscar");
       //  buscado = leer.nextInt();
       //  lista.buscar(buscado);

        System.out.println("Ingresa dato a eliminar");
        eliminado = leer.nextInt();
        lista.eliminar(eliminado);





    }
}
