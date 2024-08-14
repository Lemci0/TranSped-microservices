package com.transped.parcel_service.mapper;

import com.transped.parcel_service.domain.Parcel;
import com.transped.parcel_service.persistence.entity.ParcelEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring")
public interface ParcelMapper {

    Parcel parcelEntityToParcel(ParcelEntity parcelEntity);

    @Mapping(target = "number", ignore = true)
    ParcelEntity parcelToParcelEntity(Parcel parcel);
}
