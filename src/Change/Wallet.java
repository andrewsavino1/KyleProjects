package Change;

import java.util.HashMap;
import java.util.Map;

public class Wallet {
    private Map<Coin, Integer> THE_COINS;

    public Wallet() {
        THE_COINS = new HashMap<>();
        THE_COINS.put(new Quarter(), 0);
        THE_COINS.put(new Dime(), 0);
        THE_COINS.put(new Nickel(), 0);
        THE_COINS.put(new Penny(), 0);
    }

    public void addQuarter(){
        THE_COINS.compute(new Quarter(), (k,v) -> v + 1);
    }

    public void addDime(){
        THE_COINS.compute(new Dime(), (k,v) -> v + 1);
    }

    public void addNickel(){
        THE_COINS.compute(new Nickel(), (k,v) -> v + 1);
    }

    public void addPenny(){
        THE_COINS.compute(new Penny(), (k,v) -> v + 1);
    }

    public int getNumberOfCoins(){
        return THE_COINS.values().stream().reduce(Integer::sum).orElse(0);
    }

    public int getTotalCoinValue(){
      return THE_COINS.entrySet().stream()
              .mapToInt(aEntry -> aEntry.getValue() * aEntry.getKey().getValue())
              .sum();

    }
}
