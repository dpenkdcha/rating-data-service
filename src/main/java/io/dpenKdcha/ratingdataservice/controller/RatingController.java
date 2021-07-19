package io.dpenKdcha.ratingdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.dpenKdcha.ratingdataservice.model.RatingDto;

@RestController()
@RequestMapping("/api/v1")
public class RatingController {
	
	@PostMapping("/ratings")
	public RatingDto getCatelog(@RequestBody RatingDto rating) {
		
		/*List<RatingDto> ratings = Arrays.asList(
				new RatingDto("123", 1),
				new RatingDto("456", 4)
			);*/
		RatingDto ratings = new RatingDto(rating.getMovidId(), rating.getRating());
		
		return ratings;
	}

}
	