package pl.rafal.pizza.remote.rest.dto.response;

import pl.rafal.pizza.domain.model.SizeType;

import java.math.BigDecimal;
import java.util.List;

public class SizeDto {

    private Integer id;
    private BigDecimal price;
    private SizeType size;

    public SizeDto(Integer id, BigDecimal price, SizeType size) {
        this.id = id;
        this.price = price;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public SizeType getSize() {
        return size;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }
}