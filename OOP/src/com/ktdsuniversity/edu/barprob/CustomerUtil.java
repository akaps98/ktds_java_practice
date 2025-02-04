package com.ktdsuniversity.edu.barprob;

public class CustomerUtil {
    public static boolean isDrunk(Customer customer) {
        return customer.getDrunk_rate() >= 10;
    }

    public static boolean isFull(Customer customer) {
        return customer.getFull_rate() >= 20;
    }
}
