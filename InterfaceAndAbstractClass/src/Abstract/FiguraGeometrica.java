package Abstract;

public abstract class FiguraGeometrica {

	private int base;
	private int altura;

	public FiguraGeometrica(int base, int altura) {
		super();
		this.altura = altura;
		this.base = base;
	}


	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	
}
