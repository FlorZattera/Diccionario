import domain.Palabra;
import service.Diccionario;

public class App {
    public static void main(String[] args) {

        Diccionario diccionarioEspaniol = new Diccionario("Español");
        diccionarioEspaniol.registrarPalabra(new Palabra("Programación", "Acción y efecto programar", "Español"));
        diccionarioEspaniol.registrarPalabra(new Palabra("Saludo", "Acción y efecto de saludar", "Español"));
        diccionarioEspaniol.registrarPalabra(new Palabra("Abeja", "Insecto himenóptero", "Español"));
        diccionarioEspaniol.registrarPalabra(new Palabra("Programación", "Acción", "Español"));

        diccionarioEspaniol.buscarPalabra("Saludo");
        diccionarioEspaniol.imprimirPalabras();
        diccionarioEspaniol.removerPalabra("Abeja");
        diccionarioEspaniol.removerPalabra("Manzana");
    }
}
