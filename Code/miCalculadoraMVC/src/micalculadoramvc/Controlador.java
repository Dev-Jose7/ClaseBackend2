
package micalculadoramvc;

public class Controlador {
    // Aquí confluyen el modelo y vista
    Modelo modelo;
    Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void hacerSuma(){
        int valor1 = vista.getValor1();
        int valor2 = vista.getValor2();
        int resultado = modelo.Sumar(valor1, valor2);
        vista.setResultado(resultado);
    }
    
    public void hacerResta(){
        int valor1 = vista.getValor1();
        int valor2 = vista.getValor2();
        int resultado = modelo.Restar(valor1, valor2);
        vista.setResultado(resultado);
    }
    
    
    
}
