import Abstract.FiguraGeometrica;
import Interface.CalculoArea;

public class Quadrado extends FiguraGeometrica implements CalculoArea{

	

	public Quadrado(int base, int altura) {
		super(base, altura);
	}

	@Override
	public double CalculoArea() {
		
		return 0;
		
		}
	}


