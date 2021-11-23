package pl.rafal.pizza.remote.rest.dto.request;

import java.math.BigDecimal;

public class AddSizeDto {
    private String name;
    private BigDecimal price;

    private AddSizeDto(){

    }

    public AddSizeDto(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
