package br.com.cod3r.strategy.person.strategies.transportation;

public class BikeStrategy implements TransportationStrategy {

	@Override
	public void move() {
		System.out.println("I use bike to go anywhere");
	}
}
