package pl.piotr.pizza.remote.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import pl.piotr.pizza.domain.model.OrderStatusType;
import java.util.Date;

public class OrderStatusDto {
    private OrderStatusType status;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expectedAt;
public OrderStatusDto() {
}
    public OrderStatusDto(OrderStatusType status, Date updateAt, Date expectedAt, Date createdAt) {
        this.status = status;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.expectedAt = expectedAt;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getExpectedAt() {
        return expectedAt;
    }

    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }
}






