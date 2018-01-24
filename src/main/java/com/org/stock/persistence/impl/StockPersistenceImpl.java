package com.org.stock.persistence.impl;

import java.util.HashMap;
import java.util.Map;

import com.org.stock.model.Stock;
import com.org.stock.persistence.StockPersistence;

/**
 * In memory implementation of {@code StockDao}
 * @author Chaitanya Sagar
 */
public class StockPersistenceImpl implements StockPersistence {

  private Map<String, Stock> stockMap = new HashMap<String, Stock>();

  /**
   * @inheritDoc
   */
  public void addStock(Stock stock) {
    stockMap.put(stock.getSymbol(), stock);
  }

  /**
   * @inheritDoc
   */
  public Stock getStock(String symbol) {
    return stockMap.get(symbol);
  }

}
