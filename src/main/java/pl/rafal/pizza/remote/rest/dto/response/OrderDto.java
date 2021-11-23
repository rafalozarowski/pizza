package pl.rafal.pizza.remote.rest.dto.response;

import pl.rafal.pizza.domain.model.OrderStatusType;
import pl.rafal.pizza.remote.rest.dto.common.PersonOrderDto;
import pl.rafal.pizza.remote.rest.dto.common.PizzaOrderDto;

import java.util.List;

public class OrderDto {

    private Integer id;
    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;

    public OrderDto(Integer id, OrderStatusType status, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}
