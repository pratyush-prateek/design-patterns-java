package com.designpatters.builder;

public class LunchOrder {

    public static class Builder {
        private String bread;
        private String condiment;
        private String meat;
        private String dressing;

        public Builder() {}
        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiment(String condiment) {
            this.condiment = condiment;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }
    }

    private final String bread;
    private final String condiment;
    private final String meat;
    private final String dressing;

    public LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiment = builder.condiment;
        this.meat = builder.meat;
        this.dressing = builder.dressing;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiment() {
        return condiment;
    }

    public String getMeat() {
        return meat;
    }

    public String getDressing() {
        return dressing;
    }
}
