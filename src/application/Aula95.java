package application;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Aula95 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		list.add("renata");
		list.add("sara");
		list.add("italo");
		list.add("ivo");
		list.add("maria");
		list.add(3,"paula");
		for(String names : list) {
			System.out.println(names);
		}
		System.out.println(list.size());
		System.out.println("--------------------");
		
		list.removeIf(x -> x.charAt(0) == 's');
		for(String names : list) {
			System.out.println(names);
		}
		System.out.println(list.size());
		
		System.out.println("--------------------");
		System.out.println("indexOf: italo " + list.indexOf("italo"));
		System.out.println("indexOf: jonas " + list.indexOf("jonas"));
		
		System.out.println("--------------------");
		List<String> seleto = list.stream().filter(n -> n.charAt(0) != 'i').collect(Collectors.toList());
		for(String names : seleto) {
			System.out.println(names);
		}
		System.out.println(seleto.size());
		System.out.println("--------------------");
		
		String nomes = list.stream().filter(nome -> nome.charAt(0) == 'i').findFirst().orElse(null);
		System.out.println(nomes);
		
		
		
		
		
		
		
		
		
	}
}
