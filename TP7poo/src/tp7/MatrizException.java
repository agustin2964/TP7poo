package tp7;

public class MatrizException extends Exception{
	private static final String[] ERRORES = {
			 "El número de columnas excede el máximo permitido.",
			 "El número de filas excede el máximo permitido.",
			 "Las dimensiones de la matriz deben ser positivas.",
			 "El índice de la fila está fuera de rango.",
			 "El índice de la columna está fuera de rango.",
			 "el indice esta vacio"
			 };
	 private String name;
	 public MatrizException(String nom){ name = nom; }
	 public MatrizException( int numError){ name = ERRORES[numError] ; }
	 public String toString() { return "ERROR MATRIZ :"+name; }
	 public static final int ERR_COLUMNAS_EXCEDIDAS = 0;
	 public static final int ERR_FILAS_EXCEDIDAS = 1;
	 public static final int ERR_DIMENSIONES_NO_POSITIVAS = 2;
	 public static final int ERR_FILA_FUERA_DE_RANGO = 3;
	 public static final int ERR_COLUMNA_FUERA_DE_RANGO = 4;
	 public static final int ERR_INDICE_VACIO = 5;

	}