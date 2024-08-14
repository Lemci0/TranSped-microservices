package com.transped.parcel_service.web.api.v1;

import com.transped.parcel_service.domain.Parcel;
import com.transped.parcel_service.service.ParcelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/")
public class ParcelController {

    private final ParcelService parcelService;

    @GetMapping("/parcels/{id}")
    Parcel getParcel(@PathVariable Long id) {
        return parcelService.getParcel(id);
    }
}
