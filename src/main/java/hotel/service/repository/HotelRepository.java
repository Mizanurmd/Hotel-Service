package hotel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hotel.service.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer>{

}
