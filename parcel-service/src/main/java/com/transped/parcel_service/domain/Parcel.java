package com.transped.parcel_service.domain;

public record Parcel(String senderName,
        String deliveryStreet,
        String deliveryCity,
        String deliveryPostalCode,
        float width,
        float length) {
}
