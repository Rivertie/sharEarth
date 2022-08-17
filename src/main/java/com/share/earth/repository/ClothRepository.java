package com.share.earth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.share.earth.entity.Cloth;

@Repository
public interface ClothRepository extends JpaRepository<Cloth, Long> {

}
