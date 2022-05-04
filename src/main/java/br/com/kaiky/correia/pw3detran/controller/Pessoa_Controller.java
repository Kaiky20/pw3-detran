package br.com.kaiky.correia.pw3detran.controller;

@RestController
@RequestMapping("/Pessoa")
public class Pessoa_Controller {

	@Autowired
	private PessoaRepository repository;
	
	private list<Pessoa> dados = new ArrayList<Pessoa>();

	@GetMapping
	public list<Pessoa> listarTodos(){
		dados = repository.findAll();
		return dados;
		
	}
	@GetMapping("/(id)")
	
	
}
