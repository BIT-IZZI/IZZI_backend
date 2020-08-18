package com.team.web.order;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrder is a Querydsl query type for Order
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrder extends EntityPathBase<Order> {

    private static final long serialVersionUID = 1367148976L;

    public static final QOrder order = new QOrder("order1");

    public final DatePath<java.time.LocalDate> movingDate = createDate("movingDate", java.time.LocalDate.class);

    public final StringPath movingFrom = createString("movingFrom");

    public final StringPath movingName = createString("movingName");

    public final StringPath movingPhone = createString("movingPhone");

    public final StringPath movingPrice = createString("movingPrice");

    public final StringPath movingTo = createString("movingTo");

    public final StringPath movingType = createString("movingType");

    public final StringPath optionalAddrFrom = createString("optionalAddrFrom");

    public final StringPath optionalAddrTo = createString("optionalAddrTo");

    public final DatePath<java.time.LocalDate> orderDate = createDate("orderDate", java.time.LocalDate.class);

    public final NumberPath<Long> orderId = createNumber("orderId", Long.class);

    public final DatePath<java.time.LocalDate> paymentDate = createDate("paymentDate", java.time.LocalDate.class);

    public final StringPath paymentMethod = createString("paymentMethod");

    public final StringPath paymentStatus = createString("paymentStatus");

    public final NumberPath<Integer> square = createNumber("square", Integer.class);

    public QOrder(String variable) {
        super(Order.class, forVariable(variable));
    }

    public QOrder(Path<? extends Order> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrder(PathMetadata metadata) {
        super(Order.class, metadata);
    }

}

