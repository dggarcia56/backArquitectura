package com.ecom.controller;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyUtil {
    public static String formatToCOP(Double amount) {
        if (amount == null) {
            return "$0.00";
        }
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        return formatter.format(amount);
    }
}