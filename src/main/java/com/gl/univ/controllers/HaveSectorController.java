package com.gl.univ.controllers;

import java.util.List;
import java.util.Optional;

import com.gl.univ.services.interfaces.HaveSectorService;
import com.gl.univ.models.HaveSector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("haveSector/")
public class HaveSectorController {
	@Autowired
	private HaveSectorService haveSectorService;


	@PostMapping("/")
	public HaveSector create(@RequestBody HaveSector haveSector) {
		return haveSectorService.save(haveSector);
	}


	@GetMapping("/")
	public List<HaveSector> getAll() {
		return haveSectorService.getHave();

	}

	@PutMapping("/update-{id}")
	public HaveSector update(@RequestBody HaveSector haveSector, @PathVariable("id") final Integer id) {
		return haveSectorService.update(id, haveSector);
	}

	@GetMapping("/find-{id}")
	public Optional<HaveSector> findById(@PathVariable("id") final Integer id) {
		return haveSectorService.findById(id);
	}


	@DeleteMapping("/delete-{id}")
	public String delete(@PathVariable("id") final Integer id) {
		return haveSectorService.deleteById(id);


	}
}

