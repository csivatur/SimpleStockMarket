package com.org.stock.service;

import java.util.List;

import com.org.stock.model.Stock;
import com.org.stock.model.Trade;

/**
 * Stock Service Interface
 * @author Chaitanya Sagar
 */
public interface StockService {

  /**
   * Adds a Stock
   * @param stock
   */
  public void addStock(Stock stock);

  /**
   * Retrives Stock
   * @param symbol
   * @return
   */
  public Stock getStock(String symbol);

  /**
   * Calculate the dividend yield for input stock and price
   * @param stock
   * @param price
   * @return
   */
  public double calculateDividendYield(Stock stock, double price);

  /**
   * Calculate the P/E ration for input stock and price
   * @param stock
   * @param price
   * @return
   */
  public double calculatePERatio(Stock stock, double price);

  /**
   * Calculate the volume weighted stock price on Trades
   * @param trades
   * @return
   */
  public double calculateVolumeWeightedStockPrice(List<Trade> trades);

  /**
   * Calculate the GBCE for Trades
   * @param trades
   * @return
   */
  public double calculateGBCE(List<Trade> trades);
}
