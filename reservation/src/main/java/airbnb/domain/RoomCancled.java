package airbnb.domain;

import airbnb.domain.*;
import airbnb.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RoomCancled extends AbstractEvent {

    private Long id;
    private String customerId;
    private Long roomId;
    private Date date;
    private Integer price;

    public RoomCancled(Reservation aggregate) {
        super(aggregate);
    }

    public RoomCancled() {
        super();
    }
}
//>>> DDD / Domain Event
