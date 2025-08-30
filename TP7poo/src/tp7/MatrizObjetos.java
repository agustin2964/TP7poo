package tp7;

import java.util.*;

public class MatrizObjetos {
	static int max_rows = 200;
	static int max_cols = 200;
	private int rows;
	private int cols;
	
	private Vector cuerpo[];
	MatrizObjetos(int filas, int columnas) throws MatrizException {
		 if(columnas > max_cols) {
			throw new MatrizException(0);
		 } 
		 else if(filas > max_rows) {
			 throw new MatrizException(1);			 
		 }
		 else if(filas<=0||columnas<=0)
			 throw new MatrizException(2);			 
		 else {
			 cuerpo = new Vector[filas];
			 for(int i=0; i<filas; i++) {
				 cuerpo[i]= new Vector(columnas);
				 rows=filas;
				 cols=columnas;
			 }
		 }
	}
	public void SetRowCol(int row, int col, Object obj) throws MatrizException{
		if(col >= cols||col<0) {
			throw new MatrizException(3);
		} 
		else if(row >= rows||row<0) {
			throw new MatrizException(4);			 
		}		 
		else {
			cuerpo[row].add(col,obj);
		}
	}
	public Object GetRowCol(int row, int col) throws MatrizException{
		if(col >= cols||col<0) {
			throw new MatrizException(3);
		} 
		else if(row >= rows||row<0) {
			throw new MatrizException(4);			 
		}		 
		else {		 
			Object obj = new Object();
			try {
				obj = cuerpo[row].elementAt(col);
			}
			catch(Exception e) {
				obj=null;
				throw new MatrizException(5);
			}
			return obj;
		}
	
	}
	public String toString(){
		String staux = new String("");
		for(int i=0;i<cuerpo.length;i++)
			for(int j=0;j< cuerpo[i].size();j++){
				staux = staux + cuerpo[i].elementAt(j);
			}
		return staux;
	}
}

