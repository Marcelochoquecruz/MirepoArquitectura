public class PilasEstaticas {
    private int[] pila;
    private int tope;
    private int tamanoMaximo;

    // Constructor para inicializar la pila
    public PilasEstaticas(int tamano) {
        this.tamanoMaximo = tamano;
        this.pila = new int[tamanoMaximo];
        this.tope = -1; // Indica que la pila está vacía
    }

    // Método para agregar un elemento a la pila (push)
    public void push(int elemento) {
        if (isFull()) {
            System.out.println("Error: La pila está llena. No se puede agregar el elemento " + elemento);
            return;
        }
        tope++;
        pila[tope] = elemento;
        System.out.println("Elemento agregado: " + elemento);
    }

    // Método para quitar un elemento de la pila (pop)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Error: La pila está vacía. No se puede quitar ningún elemento.");
            // En una implementación real, sería mejor lanzar una excepción
            return -1; 
        }
        int elemento = pila[tope];
        tope--;
        System.out.println("Elemento quitado: " + elemento);
        return elemento;
    }

    // Método para ver el elemento en el tope de la pila sin quitarlo (peek)
    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return -1; // O lanzar excepción
        }
        return pila[tope];
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return tope == -1;
    }

    // Método para verificar si la pila está llena
    public boolean isFull() {
        return tope == tamanoMaximo - 1;
    }

    // Método para mostrar todos los elementos de la pila
    public void mostrarPila() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }
        System.out.print("Elementos en la pila: ");
        for (int i = 0; i <= tope; i++) {
            System.out.print(pila[i] + " ");
        }
        System.out.println("(Tope: " + peek() + ")");
    }

    public static void main(String[] args) {
        System.out.println("Creando una pila estática de tamaño 5...");
        PilasEstaticas miPila = new PilasEstaticas(5);

        miPila.push(10);
        miPila.push(20);
        miPila.push(30);
        miPila.mostrarPila();

        System.out.println("Elemento en el tope: " + miPila.peek());

        miPila.pop();
        miPila.mostrarPila();

        miPila.push(40);
        miPila.push(50);
        miPila.push(60); // Esto dará un error porque la pila está llena
        miPila.mostrarPila();
    }
}
