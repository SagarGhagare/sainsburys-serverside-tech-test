package com.tech.test.sg.scrapper;

import com.mashape.unirest.http.HttpResponse;
import com.tech.test.sg.scrapper.domain.http.HttpStringGetter;
import com.tech.test.sg.scrapper.domain.price.PriceAndTaxCalculator;
import com.tech.test.sg.scrapper.domain.price.PriceAndTaxInPounds;
import com.tech.test.sg.scrapper.domain.price.PricedPerUnitInPounds;
import com.tech.test.sg.scrapper.domain.products.ProductBaseInformation;
import com.tech.test.sg.scrapper.domain.products.ProductDetails;

import lombok.SneakyThrows;

import java.net.URL;
import java.util.List;
import java.util.stream.Stream;

import static com.tech.test.sg.scrapper.domain.output.OutputFacade.toProgramOutput;
import static com.tech.test.sg.scrapper.domain.products.ProductsFacade.extractProductDetailsFrom;
import static com.tech.test.sg.scrapper.domain.products.ProductsFacade.extractProductsBaseInformation;
import static java.util.stream.Collectors.toList;

public class SainsburysGroceriesScrapperApplication {

    private final static String URL = "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/" +
                                      "webapp/wcs/stores/servlet/gb/groceries/berries-cherries-currants6039.html";

    public static void main(String... args) {
        final HttpStringGetter httpStringGetter = new HttpStringGetter();

        final List<ProductDetails> productsDetails = extractProductsDetails(httpStringGetter, URL);

        final PriceAndTaxInPounds totalPriceAndTax = calculateTotalPriceAndTax(productsDetails);

        final String output = toProgramOutput(productsDetails, totalPriceAndTax);
        System.out.println(output);
    }

    private static List<ProductDetails> extractProductsDetails(HttpStringGetter httpStringGetter, String url) {
        return Stream.of(url)
                     .map(httpStringGetter)
                     .map(HttpResponse::getBody)
                     .flatMap(html -> extractProductsBaseInformation(html).stream())
                     .map(product -> extractProductDetailsFrom(product, getProductDetailsHtml(httpStringGetter, product)))
                     .collect(toList());
    }

    @SneakyThrows
    private static String getProductDetailsHtml(HttpStringGetter httpStringGetter, ProductBaseInformation product) {
        String url = new URL(new URL(URL), product.getDetailsUrl()).toString();
        return httpStringGetter.apply(url)
                               .getBody();
    }

    private static PriceAndTaxInPounds calculateTotalPriceAndTax(List<ProductDetails> productsDetails) {
        return new PriceAndTaxCalculator().calculateTotalOf(productsDetails.stream()
                                                                           .map(product -> (PricedPerUnitInPounds) product::getPricePerUnitInPounds)
                                                                           .collect(toList()));
    }

}
