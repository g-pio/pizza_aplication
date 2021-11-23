package pl.piotr.pizza.remote.rest.dto.response;

import java.util.List;

public class MenuDto {
    private List<PizzaDto> pizzas;

    public <E> MenuDto(List<E> pizzaDto) {
    }

    public List<PizzaDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }
}


