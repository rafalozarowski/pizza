package pl.rafal.pizza.remote.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import pl.rafal.pizza.domain.model.OrderStatusType;

import java.util.Date;

public class OrderStatusDto {

    private OrderStatusType status;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date upadteAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expectedAt;

    public OrderStatusDto(){

    }

    public OrderStatusDto(OrderStatusType status,Date createdAt, Date upadteAt, Date expectedAt) {
        this.status = status;
        this.createdAt = createdAt;
        this.upadteAt = upadteAt;
        this.expectedAt = expectedAt;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public Date getUpadteAt() {
        return upadteAt;
    }

    public void setUpadteAt(Date upadteAt) {
        this.upadteAt = upadteAt;
    }

    public Date getExpectedAt() {
        return expectedAt;
    }

    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }
}
