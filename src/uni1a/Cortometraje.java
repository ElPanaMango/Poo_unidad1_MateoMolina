package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String festival;

    public Cortometraje(String titulo, int duracionMinutos, String genero, String festival) {
        super(titulo, duracionMinutos, genero);
        this.festival = festival;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cortometraje: " + getTitulo() + " | Festival: " + festival);
    }
}