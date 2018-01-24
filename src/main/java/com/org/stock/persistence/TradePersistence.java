package com.org.stock.persistence;

import java.util.List;

import com.org.stock.model.Stock;
import com.org.stock.model.Trade;

/**
 * Interface for {@code Stock} database implementation.
 * @author Chaitanya Sagar
 */
public interface TradePersistence {

  /**
   * Add {@code Trade} to the db
   * @param trade
   */
  void addTrade(Trade trade);

  /**
   * Get all {@code Trade} for supplied stock in the last x minutes
   * @param stock
   * @param minutes
   * @return
   */
  List<Trade> getTrades(Stock stock, int minutes);

  /**
   * Get all {@code Trade} for all stocks
   * @return
   */
  List<Trade> getAllTrades();

}
