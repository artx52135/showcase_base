package com.example.showcase;

import com.example.showcase.entity.Track;
import com.example.showcase.service.impl.TrackServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class ShowcaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShowcaseApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(TrackServiceImpl trackService) {
		return args -> {
			// Read JSON and write to DB
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Track>> typeReference = new TypeReference<List<Track>>() {
			};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/tracks.json");
			try {
				List<Track> tracks = mapper.readValue(inputStream, typeReference);
				trackService.save(tracks);
				System.out.println("Track Saved!");
			} catch (IOException e) {
				System.out.println("Unable to save Tracks: " + e.getMessage());
			}
		};
	}
}
