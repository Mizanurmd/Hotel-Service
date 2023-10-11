package hotel.service.service;

import java.util.List;

import hotel.service.entity.Hotel;

public interface HotelService {
	
	Hotel createhotel(Hotel hotel);
	List<Hotel>getAllHotel(Hotel hotel);
	Hotel getHotelById(int id);
	void deletehotel(int id);

}
