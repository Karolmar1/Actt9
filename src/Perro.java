public record Perro(String nombre) {
    // Constructor

    // Método comer
    public void comer(String tipoComida, double cantidadGramos) {
        System.out.println(nombre + " está comiendo " + cantidadGramos + " gramos de " + tipoComida);
        // Puedes agregar más lógica aquí si es necesario
    }

    // Método ladrar
    public String ladrar() {
        return "guau guau";
    }

}
