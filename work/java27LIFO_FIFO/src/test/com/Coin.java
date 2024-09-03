package test.com;

import java.util.Objects;

public class Coin {

    private int value;

    @Override
    public String toString() {
        return "Coin{" +
                "value=" + value +
                '}';
    }

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return value == coin.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
