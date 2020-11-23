package com.tech.test.sg.scrapper.domain.output;

import com.tech.test.sg.scrapper.domain.price.PriceAndTaxInPounds;
import com.tech.test.sg.scrapper.domain.products.ProductDetails;

import java.util.Collection;

import static java.util.stream.Collectors.toList;

class OutputBuilder {

    OutputData buildFrom(Collection<ProductDetails> productDetails, PriceAndTaxInPounds priceAndTaxInPounds) {
        return OutputData.builder()
                         .results(productDetails.stream()
                                                .map(OutputData.ProductDetailsData::new)
                                                .collect(toList()))
                         .total(new OutputData.PriceAndTaxInPoundsData(priceAndTaxInPounds))
                         .build();
    }

}
