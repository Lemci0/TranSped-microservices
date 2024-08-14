package com.transped.parcel_service.persistence.repository;

import com.transped.parcel_service.persistence.entity.ParcelEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelRepository extends MongoRepository<ParcelEntity, String> {
}
