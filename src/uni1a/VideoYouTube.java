package uni1a;

public class VideoYouTube extends ContenidoAudiovisual {
    private String canal;
    private int vistas;

    public VideoYouTube(String titulo, int duracionMinutos, String genero, String canal, int vistas) {
        super(titulo, duracionMinutos, genero);
        this.canal = canal;
        this.vistas = vistas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Video de YouTube: " + getTitulo() + " | Canal: " + canal);
    }
}