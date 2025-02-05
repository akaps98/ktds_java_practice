package com.ktdsuniversity.edu.barprob;

public class CustomerUtil {
    public static boolean isDrunk(Customer customer) {
        return customer.getDrunkRate() >= 10;
    }

    public static boolean isFull(Customer customer) {
        return customer.getFullRate() >= 20;
    }
}
