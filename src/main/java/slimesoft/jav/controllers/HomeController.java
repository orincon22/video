package slimesoft.jav.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import slimesoft.jav.models.Video;

public class HomeController {
	
	@GetMapping("/")
	public String mostrarIndex() {
		return "index";
	}
	
	private List<Video> getVideos(){
		List<Video> lista = new LinkedList<Video>();
		Video video1 = new Video();
		video1.setId(1);
		video1.setTitle("prueba 1");
		video1.setDescription("prueba 1");
		video1.setUrl("<iframe src="https://www.youtube.com/embed/pWahNIMRxR0"
				frameborder="0"
				allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
				allowfullscreen></iframe>");
		
		lista.add(video1);
		return lista;
	}
}
