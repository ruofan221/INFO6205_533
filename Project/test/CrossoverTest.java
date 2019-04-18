package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;

import GeneticObjects.Chromosome;
import GeneticObjects.Population;
import GeneticObjects.City;
import GeneticAlgorithms.Crossover;
class CrossoverTest {

	@Test
	void uniformOrdertest() {
		Population pop = Population.getRandomPopulation(10, 10, new Random());
        Chromosome c1 = new Chromosome(pop.getCities(), new Random());
        Chromosome c2 = new Chromosome(pop.getCities(), new Random());

        System.out.println("Children:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println();

        ArrayList<Chromosome> list = Crossover.uniformOrder(c1, c2, new Random());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
	}
	
	@Test
	void onepointtest() {
		boolean flag = true;
		int randomPoint = 4;
		Population pop = Population.getRandomPopulation(10, 10, new Random());
		Chromosome c1 = new Chromosome(pop.getCities(), new Random());
		Chromosome c2 = new Chromosome(pop.getCities(), new Random());
		City[] origincities1 = new City[10];
		City[] origincities2 = new City[10];
		City[] copycities1 = new City[10];
		City[] copycities2 = new City[10];
		origincities1 = c1.getArray();
		origincities2 = c2.getArray();
		for(int i = 4; i < 10 ; i++) {
			copycities1[i] = origincities1[i];
			copycities2[i] = origincities2[i];
		}
		 City[] cities1 = new City[10];
       City[] cities2 = new City[10];
       ArrayList<Chromosome> list = Crossover.onePointCrossover(c1, c2, new Random());
       cities1 = list.get(0).getArray();
       cities2 = list.get(1).getArray();
       for(int i = 4; i < 10 ; i++) {
			if(!Arrays.asList(cities1).contains(copycities2[i]) && 
					!Arrays.asList(cities2).contains(copycities1[i])) flag = false;
		}
       assertEquals(flag,true);
	}
	
	
	@Test
	void orderCrossovertest() {
		int firstPoint = 2;
        int secondPoint = 4;
        boolean flag = true;
		int randomPoint = 4;
		Population pop = Population.getRandomPopulation(10, 10, new Random());
		Chromosome c1 = new Chromosome(pop.getCities(), new Random());
		Chromosome c2 = new Chromosome(pop.getCities(), new Random());
		City[] origincities1 = new City[10];
		City[] origincities2 = new City[10];
		City[] copycities1 = new City[10];
		City[] copycities2 = new City[10];
		origincities1 = c1.getArray();
		origincities2 = c2.getArray();
		for(int i = 4; i < 8 ; i++) {
			copycities1[i] = origincities1[i];
			copycities2[i] = origincities2[i];
		}
	City[] cities1 = new City[10];
       City[] cities2 = new City[10];
       ArrayList<Chromosome> list = Crossover.onePointCrossover(c1, c2, new Random());
       cities1 = list.get(0).getArray();
       cities2 = list.get(1).getArray();
       for(int i = 4; i < 8 ; i++) {
    	   if(!Arrays.asList(cities1).contains(copycities2[i]) && 
					!Arrays.asList(cities2).contains(copycities1[i])) flag = false;
		}
       assertEquals(flag,true);

       
	}

}
