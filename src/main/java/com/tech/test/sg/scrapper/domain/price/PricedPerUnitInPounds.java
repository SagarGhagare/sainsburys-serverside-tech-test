package com.tech.test.sg.scrapper.domain.price;

import java.math.BigDecimal;

/**
 * Represents an item that has a price (in pounds per unit).
 */
public interface PricedPerUnitInPounds {

    BigDecimal getPricePerUnitInPounds();

}
