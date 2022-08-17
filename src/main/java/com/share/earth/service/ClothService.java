package com.share.earth.service;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.share.earth.entity.Cloth;
import com.share.earth.entity.Person;
import com.share.earth.entity.Status;
import com.share.earth.repository.ClothRepository;

@Service
@Transactional
public class ClothService {
	
	private ClothRepository clothRepository;

	public ClothService(ClothRepository clothRepository) {
		this.clothRepository = clothRepository;
	}
	
	/**
	 * Share cloth
	 */
	public void shared(Cloth cloth, Person sharer) {
		// TODO how do the system know if this cloth is already registered or not?
		cloth.setStatus(Status.SHARED);
		cloth.setSharer(sharer);
		this.merge(cloth); 
	}
	
	/**
	 * Cloth can be edited or created in this method
	 */
	public Cloth merge(Cloth cloth) {	
		Cloth newCloth =
				Optional.ofNullable(cloth)
				.map(c -> this.findById(c.getId()))
				.orElse(new Cloth());
		
		return clothRepository.save(newCloth);
	}

	private Cloth findById(Long id) {
		return clothRepository.getOne(id);
	}
	
	/**
	 * Rent cloth
	 */
	public void rent(Cloth cloth, Person renter) {
		this.checkAvailable(cloth);
		cloth.setStatus(Status.RENTED);
		cloth.setRenter(renter);
	}
	
	
	private boolean checkAvailable(Cloth cloth) {
		if(cloth.getStatus().equals(Status.SHARED)) {
			return true;
		}else {
			throw new IllegalArgumentException("Not available");
		}
	}
	
}
