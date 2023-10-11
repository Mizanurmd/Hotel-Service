package hotel.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hotel.service.entity.Hotel;
import hotel.service.service.HotelService;

@RestController
@RequestMapping("/api2")
public class HotelController {
	
	@Autowired
	private HotelService hotelSer;
	
	//////////// Save hotel controller here ////////
	@PostMapping("/saveHotel")
	public ResponseEntity<Hotel>savehotel(@RequestBody Hotel hotel){
		Hotel h = hotelSer.createhotel(hotel);
		
		return new ResponseEntity<Hotel>(h, HttpStatus.CREATED);
	}
	
	///////////// Get all hotel controller here////////
	@GetMapping("/hotels")
	public ResponseEntity<List<Hotel>> getAllhotel(Hotel hotel){
		List<Hotel> allHotel = hotelSer.getAllHotel(hotel);
		return new ResponseEntity<List<Hotel>>(allHotel, HttpStatus.OK);
	}
	
	/////////// Get single hotel controller here ////////////
	@GetMapping("/hotels/{id}")
	public ResponseEntity<Hotel>getSingleHotel(@PathVariable("id")int hotelId){
		Hotel h = hotelSer.getHotelById(hotelId);
		
		return new ResponseEntity<Hotel>(h,HttpStatus.OK);
	}
	
	////// Delete Hotel controller here /////////
	@DeleteMapping("/hotels/{id}")
	public ResponseEntity<String>deleteHotelById(@PathVariable("id")int hotelId){
		this.hotelSer.deletehotel(hotelId);
		return new ResponseEntity<String>("hotel Id = "+hotelId +" is deleted.", HttpStatus.OK);
	}

}
