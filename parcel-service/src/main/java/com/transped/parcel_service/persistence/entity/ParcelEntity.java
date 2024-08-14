package com.transped.parcel_service.persistence.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "parcel")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ParcelEntity {

    @Id
    private Long number;
    private String senderName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryPostalCode;
    private float width;
    private float length;
    private float palletSpace;
    private LocalDate postageDate;
}
