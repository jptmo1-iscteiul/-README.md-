import java.util.Arrays;

public class Matrix {
	private int[][] elements;
	
	public Matrix(int lines, int cols) {
		elements = new int[lines][cols];
	}
	
	public Matrix( int n) {
		this(n,n);
	}
	public int SaberLinhas() {
		return elements.length ;
	}
	public int SaberColunas( ) {
		int colunas = elements[0].length; 
		return colunas ;
	}

	public void AlteraElement(int l, int c, int n ) {
		this.elements[l][c]=n;
	}
	
	public boolean dimensao(Matrix m) {
		if(m.equals(elements)) {
		
			return true;
		}
		return false;
	}
	
	public String toString() {
		return Arrays.deepToString(elements).replace("],","],\n");
	}
	
	
	
	
	
	
	
	public void sclale( int s) {
		for(int i=0; i< elements.length; i++) {
			for(int j=0; j< elements[i].length; j++) {
				elements[i][j]*=s;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("yoooooooo");
	}
}
