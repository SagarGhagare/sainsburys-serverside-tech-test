package com.github.jezorko.scrapper.domain.products

import groovy.transform.Immutable

final class TestData {

    static EXAMPLE_PRODUCTS_LIST_PAGE = fileAsString "src/test/resources/example_products_list_page.html"

    static EXAMPLE_PRODUCTS_LIST_DATA = [
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Strawberries 400g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-british-strawberries-400g.html")
                                  .pricePerUnitInPounds(1.75G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Blueberries 200g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-blueberries-200g.html")
                                  .pricePerUnitInPounds(1.75G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Raspberries 225g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-raspberries-225g.html")
                                  .pricePerUnitInPounds(1.75G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Blackberries, Sweet 150g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-blackberries--sweet-150g.html")
                                  .pricePerUnitInPounds(1.50G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Blueberries 400g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-blueberries-400g.html")
                                  .pricePerUnitInPounds(3.25G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Blueberries, SO Organic 150g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-blueberries--so-organic-150g.html")
                                  .pricePerUnitInPounds(2.00G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Raspberries, Taste the Difference 150g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-raspberries--taste-the-difference-150g.html")
                                  .pricePerUnitInPounds(2.50G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Cherries 400g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-cherries-350g.html")
                                  .pricePerUnitInPounds(2.50G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Blackberries, Tangy 150g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-blackberries--tangy-150g.html")
                                  .pricePerUnitInPounds(1.50G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Strawberries, Taste the Difference 300g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-strawberries--taste-the-difference-300g.html")
                                  .pricePerUnitInPounds(2.50G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Cherry Punnet 200g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-cherry-punnet-200g-468015-p-44.html")
                                  .pricePerUnitInPounds(1.50G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Mixed Berries 300g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-mixed-berries-300g.html")
                                  .pricePerUnitInPounds(3.50G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Mixed Berry Twin Pack 200g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-mixed-berry-twin-pack-200g-7696255-p-44.html")
                                  .pricePerUnitInPounds(2.75G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Redcurrants 150g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-redcurrants-150g.html")
                                  .pricePerUnitInPounds(2.50G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Cherry Punnet, Taste the Difference 200g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-cherry-punnet--taste-the-difference-250g.html")
                                  .pricePerUnitInPounds(2.50G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's Blackcurrants 150g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-blackcurrants-150g.html")
                                  .pricePerUnitInPounds(1.75G),
            ProductBaseInformation.builder()
                                  .name("Sainsbury's British Cherry & Strawberry Pack 600g")
                                  .detailsUrl(
                    "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/shop/gb/groceries/berries-cherries-currants/sainsburys-british-cherry---strawberry-pack-600g.html")
                                  .pricePerUnitInPounds(4.00G)
    ].collect { it.build() }

    static EXAMPLE_PRODUCT_DETAILS_PAGES_AND_DATA = [
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_mixed_berry_twin_pack.html"),
                                              ProductDetails.builder().description("Mixed Berries").caloriesPer100Grams(null).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_blueberries_so_organic.html"),
                                              ProductDetails.builder().description("So Organic blueberries Plump and Refreshing").caloriesPer100Grams(45G).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_raspberries.html"),
                                              ProductDetails.builder().description("by Sainsbury's raspberries").caloriesPer100Grams(32G).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_blackberries_sweet.html"),
                                              ProductDetails.builder().description("by Sainsbury's blackberries").caloriesPer100Grams(32G).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_blackberries_tangy.html"),
                                              ProductDetails.builder().description("by Sainsbury's blackberries").caloriesPer100Grams(32G).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_strawberries.html"),
                                              ProductDetails.builder().description("by Sainsbury's strawberries").caloriesPer100Grams(33G).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_cherry_punnet.html"),
                                              ProductDetails.builder().description("Cherries").caloriesPer100Grams(null).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_cherries.html"),
                                              ProductDetails.builder().description("by Sainsbury's Family Cherry Punnet").caloriesPer100Grams(52G).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_mixed_berries.html"),
                                              ProductDetails.builder().description("by Sainsbury's mixed berries").caloriesPer100Grams(null).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_blackcurrants.html"),
                                              ProductDetails.builder().description("Union Flag").caloriesPer100Grams(null).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_redcurrants.html"),
                                              ProductDetails.builder().description("by Sainsbury's redcurrants").caloriesPer100Grams(71G).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_raspberries_taste_the_difference.html"),
                                              ProductDetails.builder().description("Ttd raspberries").caloriesPer100Grams(32G).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_blueberries.html"),
                                              ProductDetails.builder().description("by Sainsbury's blueberries").caloriesPer100Grams(45G).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_strawberries_taste_the_difference.html"),
                                              ProductDetails.builder().description("Ttd strawberries").caloriesPer100Grams(33G).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_british_cherry_and_strawberry_pack.html"),
                                              ProductDetails.builder().description("British Cherry & Strawberry Mixed Pack").caloriesPer100Grams(null).build()),
            new HtmlAndExpectedProductDetails(fileAsString("src/test/resources/examples_products_details_pages/example_sainsburys_cherry_punnet_taste_the_difference.html"),
                                              ProductDetails.builder().description("Cherry Punnet").caloriesPer100Grams(48G).build())
    ]


    @Immutable(knownImmutableClasses = [ProductDetails])
    static class HtmlAndExpectedProductDetails {
        String html
        ProductDetails details
    }

    static fileAsString(String filePath) {
        new String(new File(filePath).readBytes())
    }

}
