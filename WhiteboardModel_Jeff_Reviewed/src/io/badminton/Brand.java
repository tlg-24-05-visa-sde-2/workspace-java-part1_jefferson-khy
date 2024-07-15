package io.badminton;

public enum Brand {
    YONEX("Yonex"),
    VICTOR("Victor"),
    LI_NING("Li-Ning");

    private final String brand;

    private Brand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String toString() {
        return getBrand();
    }
}