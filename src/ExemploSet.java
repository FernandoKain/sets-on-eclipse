import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		
		System.out.println("Crie um conjunto e adicione as notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		
		System.out.println(notas.toString());
		System.out.println("--------------------------------------------");
		
		System.out.println("Exiba a menor nota : " + Collections.min(notas));
		
		System.out.println("Exiba a maior nota : " + Collections.max(notas));
		
		System.out.println("--------------------------------------------");

		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma = soma + next;
		}
		
		System.out.println("Exiba a soma dos valores: " + soma);
		System.out.println("--------------------------------------------");

		System.out.println("Exiba a m�dia das notas " + soma/notas.size());
		System.out.println("--------------------------------------------");

		System.out.println("Remova a nota 0 (zero)");
		notas.remove(0d);
		System.out.println(notas);
		System.out.println("--------------------------------------------");

		System.out.println("Remova as notas menores que 7 e exiba na lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7) iterator1.remove();
		}
		System.out.println(notas);
		System.out.println("--------------------------------------------");

		System.out.println("Exiba todas as notas na ordem que foram informadas: ");
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println(notas2);
		System.out.println("--------------------------------------------");

		System.out.println("Exiba todas as notas na ordem crescente");
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		System.out.println("--------------------------------------------");

		System.out.println("Apague todo o conjunto: ");
		notas.clear();
		System.out.println("Conferindo se est� vazio: " + notas.isEmpty());
		System.out.println("Conferindo se est� vazio: " + notas2.isEmpty());
		System.out.println("Conferindo se est� vazio: " + notas3.isEmpty());
		System.out.println("--------------------------------------------");

		
		
		
		
		

	}

}
