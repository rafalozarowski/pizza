package pl.rafal.pizza.remote.rest.dto.request;

import pl.rafal.pizza.remote.rest.dto.common.PersonOrderDto;
import pl.rafal.pizza.remote.rest.dto.common.PizzaOrderDto;

import java.util.List;

public class AddOrderDto {
    private PersonOrderDto person;
    private List<PizzaOrderDto> pizzas;

}
