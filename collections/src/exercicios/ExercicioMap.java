package exercicios;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExercicioMap {
    public static void main(String[] args) {
        
        Map<String, Long> estadosNEPopulacao = new HashMap<>();
        estadosNEPopulacao.put("PE",9616621L);
        estadosNEPopulacao.put("AL",3351543L);
        estadosNEPopulacao.put("CE",9187103L);
        estadosNEPopulacao.put("RN",3534265L);

        System.out.println(estadosNEPopulacao);

        estadosNEPopulacao.put("RN", 3534165L);
        System.out.println(estadosNEPopulacao);

        if(!estadosNEPopulacao.containsKey("PB")) estadosNEPopulacao.put("PB", 4039277L);
        System.out.println(estadosNEPopulacao);

        System.out.println(estadosNEPopulacao.get("PE"));

        Map<String, Long> estadosNEPopulacao2 = new LinkedHashMap<>();
        estadosNEPopulacao2.put("PE",9616621L);
        estadosNEPopulacao2.put("AL",3351543L);
        estadosNEPopulacao2.put("CE",9187103L);
        estadosNEPopulacao2.put("RN",3534265L);
        for(Map.Entry<String, Long> entry : estadosNEPopulacao2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Map<String, Long> estadosNEPopulacao3 = new TreeMap<>();
        estadosNEPopulacao3.put("PE",9616621L);
        estadosNEPopulacao3.put("AL",3351543L);
        estadosNEPopulacao3.put("CE",9187103L);
        estadosNEPopulacao3.put("RN",3534265L);
        System.out.println("Ordem alfabetica");
        for(Map.Entry<String, Long> entry : estadosNEPopulacao3.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("Estado com menor população: ");
        Long menorPopulacao = Collections.min(estadosNEPopulacao.values());
        for(Map.Entry<String, Long> entry : estadosNEPopulacao.entrySet()) {
            if(entry.getValue() == menorPopulacao) System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("Estado com a maior população: ");
        Long maiorPopulacao = Collections.max(estadosNEPopulacao.values());
        for(Map.Entry<String, Long> entry : estadosNEPopulacao.entrySet()) {
            if(entry.getValue() == maiorPopulacao) System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Long somaPopulacao = 0L;
        Iterator<Long> iteratorEstados = estadosNEPopulacao.values().iterator();
        while(iteratorEstados.hasNext()) {
        	somaPopulacao += iteratorEstados.next();
        }
        System.out.println("Soma da população dos estados: " + somaPopulacao);
        
        System.out.println("Media das populações dos estados: " + somaPopulacao / estadosNEPopulacao.size());
        
        Iterator<Long> iteratorEstados2 = estadosNEPopulacao.values().iterator();
        while(iteratorEstados2.hasNext()) {
        	if(iteratorEstados2.next() < 4000000) iteratorEstados2.remove();
        }
        System.out.println(estadosNEPopulacao);
        
        estadosNEPopulacao.clear();
        
        System.out.println("Dicionário está vazio: " + estadosNEPopulacao.isEmpty());
        



    }
}
