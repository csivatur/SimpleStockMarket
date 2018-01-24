package com.org.stock.persistence;

import com.org.stock.model.Stock;

/**
 * Interface for {@code Stock} database implementation.
 * @author Chaitanya Sagar
 */
public interface StockPersistence {

  /**
   * Add new {@code Stock} item to the db.
   * @param stock
   */
  void addStock(Stock stock);

  /**
   * Get {@code Stock} by stock symbol.
   * @param symbol
   * @return
   */
  Stock getStock(String symbol);

}
