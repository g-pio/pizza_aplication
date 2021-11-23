package pl.jakub.pizza.data.entity.orderSize;

import pl.jakub.pizza.data.entity.order.OrderEntity;

import javax.persistence.*;

@Entity
@Table(name ="orders")
public class OrderSizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Integer id;

    @Column(name= "order_id")
    private String orderId;

    @Column(name= "size_id")
    private String sizeId;

    @Column(name= "size_count")
    private String sizeCount;

    @ManyToOne
    @JoinColumn(name="order_id",insertable = false, updatable = false)
    private OrderEntity order;

    @ManyToOne
    @JoinColumn(name="size_id",insertable = false, updatable = false)
    private OrderEntity pizza;
}
