package pl.piotr.pizza.remote.rest.dto.response;

import pl.piotr.pizza.domain.model.SizeType;

import java.math.BigDecimal;

public class SizeDto {

    private Integer id;
    private SizeType size;
    private BigDecimal price;

    public SizeDto(int i, SizeType s, BigDecimal bigDecimal){

    }
}
