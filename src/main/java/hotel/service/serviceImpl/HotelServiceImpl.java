package hotel.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import hotel.service.entity.Hotel;
import hotel.service.exception.ResourceNotFoundException;
import hotel.service.repository.HotelRepository;
import hotel.service.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepo;

	@Override
	public Hotel createhotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepo.findAll();
	}

	@Override
	public Hotel getHotelById(int id) {
		// TODO Auto-generated method stub
		return hotelRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Hotel with given id is not founed on server !!!" + id));
	}

	@Override
	public void deletehotel(int id) {
		this.hotelRepo.deleteById(id);

	}

}
