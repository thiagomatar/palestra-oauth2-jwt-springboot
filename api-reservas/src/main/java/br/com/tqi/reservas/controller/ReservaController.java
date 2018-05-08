package br.com.tqi.reservas.controller;

import java.security.Principal;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tqi.reservas.model.Reserva;

@RestController("api/reservas")
public class ReservaController {
	final List<Reserva> reservas = Collections.synchronizedList(new LinkedList<>());

	@GetMapping
	List<Reserva> listar(Principal principal) {
		return reservas;
	}

	@PostMapping
	Reserva salvar(@RequestBody Reserva reserva) {
		reservas.add(0, reserva);
		return reserva;
	}
}
