package com.test;

import java.math.BigDecimal;

public class Pay {
    private BigDecimal value;

    public Pay(BigDecimal value) {
        this.value = value;
    }

    public Pay(Builder builder) {
        this.value = builder.value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public static class Builder {
        private BigDecimal value;

        private Builder() {

        }

        public Builder setValue(BigDecimal value) {
            this.value = value;
            return this;
        }

        public Pay build() {
            return new Pay(this);
        }
    }

}
