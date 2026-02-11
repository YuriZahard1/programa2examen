package programa2Examen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Alumnos {
	public static void main(String[] args) {
		String[] alumnos = { "Ana", "Luis", "Marta", "Carlos" };
		int[][] notas = { { 7, 8, 6 }, // Ana
				{ 5, 6, 7 }, // Luis
				{ 9, 8, 10 }, // Marta
				{ 4, 4, 6 } // Carlos
		};
		HashMap<String, List<Integer>> mapa = new HashMap<>();
		

		for (int i = 0; i < alumnos.length; i++) {
			List<Integer> notasAlumnos = new ArrayList<>();
			for (int j = 0; j < 3; j++) {
				mapa.put(alumnos[i], notasAlumnos);
				notasAlumnos.add(notas[i][j]);
			}
			
			
		}
		System.out.println(mapa);
		for(String s:mapa.keySet()) {
			double media=((double)mapa.get(s).get(0)+mapa.get(s).get(1)+mapa.get(s).get(2))/3;
			System.out.println(s+" "+String.format("%.2f", media));
		}
	}
}
