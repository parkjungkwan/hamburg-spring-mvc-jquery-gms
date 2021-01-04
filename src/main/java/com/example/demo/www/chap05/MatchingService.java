package com.example.demo.www.chap05;

import java.util.Objects;

import org.springframework.context.annotation.Lazy;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data @Lazy @AllArgsConstructor class Trader {
	private String name, city;
	@Override
	  public int hashCode() {
	    int hash = 17;
	    hash = hash * 31 + (name == null ? 0 : name.hashCode());
	    hash = hash * 31 + (city == null ? 0 : city.hashCode());
	    return hash;
	  }

	  @Override
	  public boolean equals(Object other) {
	    if (other == this) {
	      return true;
	    }
	    if (!(other instanceof Trader)) {
	      return false;
	    }
	    Trader o = (Trader) other;
	    boolean eq = Objects.equals(name,  o.getName());
	    eq = eq && Objects.equals(city, o.getCity());
	    return eq;
	  }

	  @Override
	  public String toString() {
	    return String.format("Trader:%s in %s", name, city);
	  }

}
@Data @Lazy @AllArgsConstructor class Transaction {

	  private Trader trader;
	  private int year, value;


	  @Override
	  public int hashCode() {
	    int hash = 17;
	    hash = hash * 31 + (trader == null ? 0 : trader.hashCode());
	    hash = hash * 31 + year;
	    hash = hash * 31 + value;
	    return hash;
	  }

	  @Override
	  public boolean equals(Object other) {
	    if (other == this) {
	      return true;
	    }
	    if (!(other instanceof Transaction)) {
	      return false;
	    }
	    Transaction o = (Transaction) other;
	    boolean eq = Objects.equals(trader,  o.getTrader());
	    eq = eq && year == o.getYear();
	    eq = eq && value == o.getValue();
	    return eq;
	  }

	  @SuppressWarnings("boxing")
	  @Override
	  public String toString() {
	    return String.format("{%s, year: %d, value: %d}", trader, year, value);
	  }

	}
public class MatchingService {
	
}
