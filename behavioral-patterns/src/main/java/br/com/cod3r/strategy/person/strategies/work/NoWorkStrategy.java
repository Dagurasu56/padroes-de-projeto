package br.com.cod3r.strategy.person.strategies.work;

public class NoWorkStrategy implements WorkStrategy {

	@Override
	public void work() {
		System.out.println("I don't work");
	}
}
