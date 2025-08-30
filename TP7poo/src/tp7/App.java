package tp7;

class App {
	public static void main(String args[]) throws MatrizException{
		System.out.println("matriz de dimensiones invalidas");
		try {
			MatrizObjetos ma = new MatrizObjetos(402,2);
		}
		catch(MatrizException e) {
			System.out.println( e );
		}
		
		try {
			MatrizObjetos ma = new MatrizObjetos(7,-3);
		}
		catch(MatrizException e) {
			System.out.println( e );
		}
		System.out.println();
		
		MatrizObjetos ma = new MatrizObjetos(10,5);
		String st1 = new String(" esto es un String ");
		int entero = 10;
		
		System.out.println("setRowCol con indice de fila invalido");
		try {
			ma.SetRowCol(11, 1, st1);
		}
		catch(MatrizException e) {
			System.out.println( e );
		}
		try {
			ma.SetRowCol(-2, 1, entero);
		}
		catch(MatrizException e) {
			System.out.println( e );
		}
		System.out.println();
		
		ma.SetRowCol(0, 0, st1);
		ma.SetRowCol(2, 0, entero);
		
		System.out.println("getRowCol con indice de columna invalido");
		try {
			System.out.println(ma.GetRowCol(0,1));
		}
		catch(MatrizException e) {
			System.out.println( e );
		}
		try {
			System.out.println(ma.GetRowCol(2,3));
		}
		catch(MatrizException e) {
			System.out.println( e );
		}
		
		System.out.println();
		
		System.out.println( ma.GetRowCol(0,0) );
		ma.SetRowCol(10,0,st1);
	}
}