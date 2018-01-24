package com.org.stock.service.impl;

import java.util.List;

import com.org.stock.model.Stock;
import com.org.stock.model.Trade;
import com.org.stock.persistence.TradePersistence;
import com.org.stock.persistence.impl.TradePersistenceImpl;
import com.org.stock.service.TradeService;

/**
 * Implementation of {@code TradeService}
 * @author Chaitanya Sagar
 */
public class TradeServiceImpl implements TradeService {

  private static TradeServiceImpl instance = null;

  public static TradeService getInstance() {
    if (instance == null) {
      instance = new TradeServiceImpl();
    }
    return instance;
  }

  private TradePersistence tradeDao = new TradePersistenceImpl();

  /**
   * @inheritDoc
   */
  public void recordTrade(Trade trade) {
    if (trade != null && trade.getStock() != null) {
      tradeDao.addTrade(trade);
    }
  }

  /**
   * @inheritDoc
   */
  public List<Trade> getTrades(Stock stock, int minutes) {
    return tradeDao.getTrades(stock, minutes);
  }

  /**
   * @inheritDoc
   */
  public List<Trade> getAllTrades() {
    return tradeDao.getAllTrades();
  }

}
