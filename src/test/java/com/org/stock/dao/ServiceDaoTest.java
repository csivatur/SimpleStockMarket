package com.org.stock.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.org.stock.model.Stock;
import com.org.stock.model.StockType;
import com.org.stock.persistence.StockPersistence;
import com.org.stock.persistence.impl.StockPersistenceImpl;

/**
 * Tests for {@code StockDao}
 * @author Chaitanya Sagar
 */
public class ServiceDaoTest {

  private StockPersistence stockDao;
  private Stock stock1;

  @Before
  public void setup() {
    stockDao = new StockPersistenceImpl();
    stock1 = new Stock("TEST", StockType.COMMON, 1, 0, 1);
  }

  @Test
  public void testAddAndGetStock() {
    stockDao.addStock(stock1);
    assertEquals(stock1, stockDao.getStock(stock1.getSymbol()));
  }

}
