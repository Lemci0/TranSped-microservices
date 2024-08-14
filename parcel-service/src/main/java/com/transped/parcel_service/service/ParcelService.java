package com.transped.parcel_service.service;

import com.transped.parcel_service.domain.Parcel;
import com.transped.parcel_service.mapper.ParcelMapper;
import com.transped.parcel_service.persistence.repository.ParcelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ParcelService {

    private final ParcelRepository parcelRepository;
    private final ParcelMapper parcelMapper;

    public Parcel getParcel(Long id) {
        return parcelMapper
                .parcelEntityToParcel(parcelRepository
                .findById(id)
                .orElseThrow());
    }
}
