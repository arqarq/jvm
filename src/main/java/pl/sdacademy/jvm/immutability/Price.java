package pl.sdacademy.jvm.immutability;

class Price {
    private int value;
    private Currency currency;

    Price(int value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }
}