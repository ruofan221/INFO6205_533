package test;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import GeneticObjects.Population;
import GeneticObjects.City;
import GeneticObjects.Chromosome;
import GeneticAlgorithms.Selection;

import org.junit.jupiter.api.Test;

class SelectionTest {

	@Test
	void test() {
		boolean flag = true;
		Population pop = Population.getRandomPopulation(10, 10, new Random());
		 Chromosome[] populationAsArray = pop.getChromosomes();
		 Chromosome c = Selection.tournamentSelection(pop,10,new Random());
		 int[] distance = new int[10];
		 for(int i = 0; i < 10; i++) {
			distance[i] = populationAsArray[i].getDistance();
		 }
		 for(int i = 0; i < 10; i++) {
			if(distance[i] < c.getDistance()) flag = false;
		 }
		 assertEquals(flag,true);
	}

}
