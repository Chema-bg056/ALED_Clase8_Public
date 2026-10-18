package equals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Equals {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		// char / double / float / long...
		// System.out.println(a == b);
		
		String s1 = "Hola";
		String s2 = "Hola";
		// String s1 = new String("Hola");
		// String s2 = new String("Hola");
		
		// System.out.println(s1 == s2);
		// System.out.println(s1.equals(s2));
		
		// Wrappers: Double / Integer / Long
		Integer i1 = 1000;
		Integer i2 = 1000;
		// Integer i1 = new Integer(1000);
		// Integer i2 = new Integer(1000);
		
		// System.out.println(i1 == i2); // Si el Integer es pequeño, i1 == i2 podría devolver true.
		// System.out.println(i1.equals(i2));
		
		// Alumno
		Alumno a1 = new Alumno("Ana", 9.0);
		Alumno a2 = new Alumno("Ana", 9.0);
		System.out.println(a1.equals(a2)); // true
		
		Alumno a3 = a1;
		Alumno a4 = new Alumno("Ana", 8.99);
		
		System.out.println(a3 == a1); // true
		System.out.println(a3.equals(a1)); // true
		System.out.println(a1.equals("Ana")); // false
		System.out.println(a1.equals(null)); // false
		
		// List -> ArrayList
		List<Alumno> alumnos = new ArrayList<>();
		alumnos.add(a1);
		System.out.println(alumnos.contains(a2));
		
		// Set -> HashSet
		Set<Alumno> alumnosSet = new HashSet<>();
		alumnosSet.add(a1);
		System.out.println(alumnosSet.contains(a2));
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a4.hashCode());
		
	}
}
