package org.example.app.utils;

public class PriceValidator {

    private final static String PRICE_RGX =
            "\\d+(\\.\\d{1,2})?";

    private PriceValidator() {
    }

    public static boolean isPriceValid(Double price) {
        return price == null || !String.valueOf(price).matches(PRICE_RGX);
    }
}
