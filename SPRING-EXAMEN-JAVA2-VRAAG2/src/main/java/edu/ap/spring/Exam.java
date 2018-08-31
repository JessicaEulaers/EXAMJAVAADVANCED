package edu.ap.spring;

import java.awt.Point;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	// Maak gebruik van lambdas en streams om een array met alle
	// getallen terug te geven die deelbaar zijn door twee
	// 2 punten
	public int[] getTimesTwo(int[] numbers) {
		
		numbers = Arrays.stream(numbers).filter(x ->  x % 2 ==0).toArray();
		return numbers;
	}
	
	// Maak gebruik van lambdas en streams om alle uppercase characters
	// te tellen in de gegeven string
	// 1 punt
	public int countUppercaseCharacters(String sentence) {
		 Objects.requireNonNull(sentence);
		 
		 return (int) Stream.of(sentence.split("\\s")) 
	               // we create a second stream that match the predicate passed throw the method filter
	               .filter(word -> word.equals(word.toUpperCase())) 
	               // finally we want to count how many words match this predicate
	               .count();
	}
	
	// Maak gebruik van lambdas en streams om het aantal keren te tellen
	// dat string s voorkomt (zowel uppercase als lowercase) in de lijst names
	// 1 punt
	public int countChar(List<String> names, String s) {
		
		return (int) names.stream()
				  .filter(customer -> names.equals(s))
				  .count();
				  
				  
	}
	
	// Maak gebruik van lambdas en streams om het hoogste Y coordinaat
	// te vinden
	// 2 punten
	public int getMaxY(List<Point> points) {
		return Stream.of(points).max(Comparator.naturalOrder())
		.ifPresent(maxInt->System.out.println("Maximum number in the set is " + maxInt));
	}	
}