package logica;

public abstract class Juego {
	
	protected final static int SINCATEGORIA = 0;	
	protected final static int HISTORIA = 1;
	protected final static int DEPORTES = 2;
	protected final static int CINE = 3;
	protected final static int MUSICA = 4;
	protected int categoria;
	
	public abstract void setPregunta(Pregunta p, int i);
	public abstract Pregunta getPregunta(int i);
	public abstract void setCategoria(int categoria);
	public abstract int getCategoria();
	
}
