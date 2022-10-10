package br.com.residencia.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.residencia.biblioteca.entity.Livro;
import br.com.residencia.biblioteca.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	LivroRepository livroRepository;

	public List<Livro> getAllLivros() {
		return livroRepository.findAll();
	}

	public Livro getLivroById(Integer id) {
		// return alunoRepository.findById(id).get();
		return livroRepository.findById(id).orElse(null);
	}

	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);

	}

	public Livro updateLivro(Livro livro, Integer id) {

		Livro livroExistenteNoBanco = getLivroById(id);
		// livroExistenteNoBanco = livro;

		livroExistenteNoBanco.setNomeLivro(livro.getNomeLivro());
		livroExistenteNoBanco.setNomeAutor(livro.getNomeAutor());
		livroExistenteNoBanco.setDataLancamento(livro.getDataLancamento());
		livroExistenteNoBanco.setCodigoIsbn(livro.getCodigoIsbn());

		return livroRepository.save(livroExistenteNoBanco);
	}

	public Livro deleteLivro(Integer id) {

		livroRepository.deleteById(id);
		return getLivroById(id);

		// Poderia ser usado tambem!
		// if(null != getAlunoById(id))
		// return false;
		// else
		// return true;
	}
}
