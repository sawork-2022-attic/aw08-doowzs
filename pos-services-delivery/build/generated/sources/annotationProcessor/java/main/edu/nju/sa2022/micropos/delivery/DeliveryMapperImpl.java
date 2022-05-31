package edu.nju.sa2022.micropos.delivery;

import edu.nju.sa2022.micropos.delivery.dto.DeliveryDto;
import edu.nju.sa2022.micropos.models.Delivery;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-09T16:50:11+0800",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 11.0.15 (Amazon.com Inc.)"
)
@Component
public class DeliveryMapperImpl implements DeliveryMapper {

    @Override
    public List<DeliveryDto> toDeliveryDtos(List<Delivery> deliveries) {
        if ( deliveries == null ) {
            return null;
        }

        List<DeliveryDto> list = new ArrayList<DeliveryDto>( deliveries.size() );
        for ( Delivery delivery : deliveries ) {
            list.add( toDeliveryDto( delivery ) );
        }

        return list;
    }

    @Override
    public DeliveryDto toDeliveryDto(Delivery delivery) {
        if ( delivery == null ) {
            return null;
        }

        DeliveryDto deliveryDto = new DeliveryDto();

        deliveryDto.setId( delivery.getId() );
        deliveryDto.setOrderId( delivery.getOrderId() );
        deliveryDto.setDelivered( delivery.getDelivered() );

        return deliveryDto;
    }
}
