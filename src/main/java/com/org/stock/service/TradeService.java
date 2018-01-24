package com.org.stock.service;

import java.util.List;

import com.org.stock.model.Stock;
import com.org.stock.model.Trade;

/**
 * Trade service Interface
 * @author Chaitanya Sagar
 */
public interface TradeService {

  /**
   * Record a {@code Trade}
   * @param trade
   */
  public void recordTrade(Trade trade);

  /**
   * Get a list of {@code Trade}s for {@code Stock} within the last x minutes
   * @param stock
   * @param numberOfMinutes
   * @return
   */
  public List<Trade> getTrades(Stock stock, int numberOfMinutes);

  /**
   * Get all {@code Trade}s
   * @return
   */
  public List<Trade> getAllTrades();
}
