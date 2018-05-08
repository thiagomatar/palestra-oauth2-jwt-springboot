package br.com.tqi.mensagens.controller;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tqi.mensagens.model.Mensagem;

@RestController("api/messages")
public class MensagemController {

	final List<Mensagem> mensagens = Collections.synchronizedList(new LinkedList<>());
	
	@GetMapping
	List<Mensagem> getMessages(Principal principal) {
		return mensagens;
	}

	@PostMapping
	Mensagem postMessage(Principal principal, @RequestBody Mensagem mensagem) {
		mensagem.setUsuario(principal.getName());
		mensagem.setDataCriacao(LocalDateTime.now());
		mensagens.add(0, mensagem);
		return mensagem;
	}

}
