package ejemploClase;

import java.util.Arrays;

public class ordenarArraysAlreves {

	public static void main(String[] args) {
		int []v={4,7,3,8,1,5,9,2};
		int aux=0;
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));
		//cambiar de orden
		for (int i=0;i<v.length/2;i++) {//Recorro la mitad del array
			//Cambiar el elemento v [i] v [v.length-1-i]
			aux=v[i];
			v[i]=v[v.length-1-i];
			v[v.length-1-i]=aux;
		}
		System.out.println(Arrays.toString(v));

	}

}
