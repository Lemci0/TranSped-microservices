package com.transped.parcel_service.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
    private String number;
    private String senderName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryPostalCode;
    private float width;
    private float length;
    private float palletSpace;
    private LocalDate postageDate;
}
