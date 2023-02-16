package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {

	public static void main(String[] args) {
		
		List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		System.out.println("Imprimir todos os elementos da lista: ");
		numerosAleatorios.stream().forEach(System.out::println);
		
		System.out.println("pegue os 5 primeiros numeros e coloque dentro de um set");
		numerosAleatorios.stream()
			.limit(5)
			.collect(Collectors.toSet())
			.forEach(System.out::println);

	}

}
