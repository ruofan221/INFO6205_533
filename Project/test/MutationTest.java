package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import GeneticObjects.Chromosome;
import GeneticObjects.Population;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;
import GeneticObjects.City;
import GeneticAlgorithms.Mutation;
class MutationTest {

	@Test
	void Insertiontest() {
		boolean flag = false;
		Population pop = Population.getRandomPopulation(10, 10, new Random());
		 City[] cities = new City[10];
        Chromosome c = new Chromosome(pop.getCities(), new Random());
        cities = c.getArray();
        Chromosome mutationc = Mutation.insertion(c, new Random());
        City[] mutationCities = new City[10];
        mutationCities = mutationc.getArray();
        for(int i = 0; i < 10; i++) {
        	if (cities[i] != mutationCities[i]) flag = true;
        }
        
        assertEquals(flag,true);
        
	}
	
	@Test
	void ReciprocalExchangetest() {
		boolean flag = false;
		Population pop = Population.getRandomPopulation(10, 10, new Random());
		 City[] cities = new City[10];
        Chromosome c = new Chromosome(pop.getCities(), new Random());
        cities = c.getArray();
        Chromosome mutationc = Mutation.reciprocalExchange(c, new Random());
        City[] mutationCities = new City[10];
        mutationCities = mutationc.getArray();
        for(int i = 0; i < 10; i++) {
        	if (cities[i] != mutationCities[i]) flag = true;
        }
        
        assertEquals(flag,true);
        
	}
	
	@Test
	void Scrambletest() {
		boolean flag = false;
		Population pop = Population.getRandomPopulation(10, 10, new Random());
		 City[] cities = new City[10];
        Chromosome c = new Chromosome(pop.getCities(), new Random());
        cities = c.getArray();
        Chromosome mutationc = Mutation.scrambleMutation(c, new Random());
        City[] mutationCities = new City[10];
        mutationCities = mutationc.getArray();
        for(int i = 0; i < 10; i++) {
        	if (cities[i] != mutationCities[i]) flag = true;
        }
        assertEquals(flag,true);
        
	}

}
