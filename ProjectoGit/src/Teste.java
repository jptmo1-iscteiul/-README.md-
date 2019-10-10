
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matrix m= new Matrix (2,3);
		
		System.out.println(m);
		System.out.println(m.SaberLinhas());
		System.out.println(m.SaberColunas());
		
		m.AlteraElement(1,2,1);
		System.out.println(m);

		m.sclale(2);
		System.out.println(m);

		m.dimensao(m);
		
	}

}
