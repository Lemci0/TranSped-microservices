package com.transped.parcel_service.service;

import com.transped.parcel_service.domain.Parcel;
import com.transped.parcel_service.mapper.ParcelMapper;
import com.transped.parcel_service.persistence.repository.ParcelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ParcelService {

    private final ParcelRepository parcelRepository;
    private final ParcelMapper parcelMapper;

    public Parcel getParcel(String id) {
        return parcelMapper
                .parcelEntityToParcel(parcelRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Parcel not found")));
    }

    public List<Parcel> getAllParcels() {
        return parcelRepository
                .findAll()
                .stream()
                .map(parcel -> parcelMapper.parcelEntityToParcel(parcel))
                .toList();
    }

    public Parcel createParcel(Parcel parcel) {
        parcelRepository.save(parcelMapper.parcelToParcelEntity(parcel));
        return parcel;
    }
}
