package pl.piotr.pizza.remote.rest.dto.request;

import pl.piotr.pizza.domain.model.OrderStatusType;
import pl.piotr.pizza.remote.rest.dto.common.PersonOrderDto;
import pl.piotr.pizza.remote.rest.dto.common.PizzaOrderDto;

import java.util.List;

public class UpdatedOrderDto {
    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private List<PersonOrderDto> person;

    public UpdatedOrderDto(OrderStatusType status, List<PizzaOrderDto> pizzas, List<PersonOrderDto> person) {
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public List<PersonOrderDto> getPerson() {
        return person;
    }

    public void setPerson(List<PersonOrderDto> person) {
        this.person = person;
    }
}
