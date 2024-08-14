package com.transped.parcel_service.web.api.v1;

import com.transped.parcel_service.domain.Parcel;
import com.transped.parcel_service.service.ParcelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/")
public class ParcelController {

    private final ParcelService parcelService;

    @GetMapping("/parcels/{id}")
    Parcel getParcel(@PathVariable String id) {
        return parcelService.getParcel(id);
    }

    @GetMapping("/parcels")
    List<Parcel> getAllParcels() {
        return parcelService.getAllParcels();
    }

    @PostMapping("/parcels")
    Parcel createParcel(@RequestBody Parcel parcel) {
        return parcelService.createParcel(parcel);
    }
}
