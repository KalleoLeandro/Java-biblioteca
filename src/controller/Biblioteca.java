package controller;

import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import model.Autor;
import model.Data;
import model.Editora;
import model.Livro;
import model.Locacao;
import model.Usuario;

/**
 * Classe controladora das funções existentes no menu
 * @author Kalleo Leandro dos Santos Leal
 * @since 18/02/2021
 */
public class Biblioteca 
{
	//Atributos da classe
		//Vetor para armazenar os carros cadastrados
		private Livro livros[];
		private Usuario usuarios[];
		private Locacao locacoes[];

		//Variável auxiliar para definir o tamanho do estoque
		private int tamanho = 0;	
		
		//Método construtor da classe
		public Biblioteca()
		{
			processar();
		}
		
		//Método principal do programa
		public void processar()
		{
			//Função para mudar as propriedades de fonte do JoptionPane
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Courier", Font.PLAIN, 18)));
			
			//Função para mudar o texto do ConfirmDialog
			UIManager.put("OptionPane.yesButtonText", "Sim");
			UIManager.put("OptionPane.noButtonText", "Não");
			UIManager.put("OptionPane.okButtonText", "Ok");
			UIManager.put("OptionPane.cancelButtonText", "Cancelar");			
			
			
			//Em caso de teste comentar desta linha
			
			//Capturando do usuário o tamanho do espaço da Biblioteca
			tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de livros que a biblioteca comporta"));		
			//Definindo o tamanho do espaço
			livros = new Livro[tamanho];
			
			//Capturando do usuário a quantidade de Usuarios
			tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de usuários que frequentam a biblioteca"));
			
			//Definindo a quantidade de Usuarios
			usuarios = new Usuario[tamanho];
			
			//Capturando do usuário a quantidade de Locações possíveis
			tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de locações permitidas"));
			
			//Definindo a quantidade de Usuarios
			 locacoes = new Locacao[tamanho];
			 
			 
			 
			/*
			//Preenchimento de array para teste
			Autor autorTeste = new Autor();
			Autor autorTeste2 = new Autor();
			Editora editoraTeste = new Editora();
			Editora editoraTeste2 = new Editora();
			Data dataTeste =  new Data();
			Data dataTeste2 =  new Data();
			Data dataTeste3 =  new Data();
			Data dataTeste4 =  new Data();
			Livro[] emprestimo = new Livro[1];
			Livro livroTeste = new Livro(); 
			Livro livroTeste2 = new Livro(); 
			Usuario usuarioTeste = new Usuario();
			Usuario usuarioTeste2 = new Usuario();
			Locacao locacaoTeste = new Locacao();
			livros = new Livro[3];
			usuarios = new Usuario[3];
			locacoes = new Locacao[3];
			
			livroTeste.setCodigo(1);
			livroTeste.setTitulo("Os Contos de Grimm");
			autorTeste.setCodigo(1);
			autorTeste.setNome("Jacob e Wilhelm Grimm");
			autorTeste.setNacionalidade("Alemão");
			livroTeste.setAutor(autorTeste);
			editoraTeste.setCodigo(1);
			editoraTeste.setNome("Paulinas");
			editoraTeste.setPais("Brasil");			
			livroTeste.setEditora(editoraTeste);
			livroTeste.setAnoPublicacao(1985);
			livroTeste.setDisponivel(false);
			livros[0] = livroTeste;
			
			
			livroTeste2.setCodigo(2);
			livroTeste2.setTitulo("Alice");
			autorTeste2.setCodigo(2);
			autorTeste2.setNome("Lewis Carroll");
			autorTeste2.setNacionalidade("Britânico");
			livroTeste2.setAutor(autorTeste2);
			editoraTeste2.setCodigo(2);
			editoraTeste2.setNome("Atica");
			editoraTeste2.setPais("Brasil");			
			livroTeste2.setEditora(editoraTeste2);
			livroTeste2.setAnoPublicacao(1990);
			livroTeste2.setDisponivel(true);
			livros[1] = livroTeste2;
			
			
			
			usuarioTeste.setCodigo(1);
			usuarioTeste.setNome("Kalleo Leandro dos Santos Leal");
			usuarioTeste.setTelefone("(99) 9999-9999");
			usuarioTeste.setEmail("@example.com");
			dataTeste.setDia(28);
			dataTeste.setMes(10);
			dataTeste.setAno(1988);
			usuarioTeste.setDataNascimento(dataTeste);
			usuarios[0] = usuarioTeste;
			
			usuarioTeste2.setCodigo(2);
			usuarioTeste2.setNome("Marcos Antonio Fernandes Leal");
			usuarioTeste2.setTelefone("(88) 8888-8888");
			usuarioTeste2.setEmail("@example2.com");
			dataTeste2.setDia(04);
			dataTeste2.setMes(11);
			dataTeste2.setAno(1965);
			usuarioTeste2.setDataNascimento(dataTeste2);
			usuarios[1] = usuarioTeste2;
			
			
			locacaoTeste.setCodigo(1);
			locacaoTeste.setUsuario(usuarios[0]);
			emprestimo[0] = livros[0];	
			locacaoTeste.setLivros(emprestimo);
			dataTeste3.setDia(21);
			dataTeste3.setMes(02);
			dataTeste3.setAno(2021);
			locacaoTeste.setDataLocacao(dataTeste3);
			dataTeste4.setDia(22);
			dataTeste4.setMes(02);
			dataTeste4.setAno(2021);
			locacaoTeste.setDataDevolucao(dataTeste4);
			locacoes[0] = locacaoTeste; 
			*/
			
			
			
			 
			 
			//Processamento de looping do programa
			while(true)
			{
				escolhaUsuario();
			}
		}
		
		//Método para capturar do usuário a opção
		public void escolhaUsuario()
		{
			String menu = "Informe a opção desejada:"+
						"\nOPÇÃO 1: Cadastrar Livro" +
						"\nOPÇÃO 2: Cadastrar Usuario" +
						"\nOPÇÃO 3: Efetuar Locação de Livros" +		
						"\nOPÇÃO 4: Efetuar Devolução de Livros" +
						"\nOPÇÃO 5: Listar Todos os Livros Cadastrados" +
						"\nOPÇÃO 6: Listar Todos os Usuários Cadastrados" +
						"\nOPÇÃO 7: Pesquisar Livros por Editora" +
						"\nOPÇÃO 8: Pesquisar Livros por Autor" +
						"\nOPÇÃO 9: Pesquisar Locações" +						
						"\nOPÇÃO 10: Sair dos Sistema";
			int escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));
			escolhaProcessamento(escolha);
			
		}
		
		//Método para seleção das opções do programa
		public void escolhaProcessamento(int opcao)
		{
			switch(opcao)
			{
				//Menu
				case 1:
					cadastrarLivro();
					break;
				case 2:
					cadastrarUsuario();
					break;
				case 3:
					locacaoLivro();
					break;
				case 4:
					devolucaoLivro();
					break;
				case 5:
					listarLivros();
					break;
				case 6:
					listarUsuarios();
					break;
				case 7:
					pesquisarLivrosPorEditora();
					break;
				case 8:
					pesquisarLivrosPorAutor();
					break;
				case 9:
					pesquisarLocacoesPorData();
					break;
				case 10:
					sairDoSistema();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Erro!!! Opção inválida", "Biblioteca", JOptionPane.ERROR_MESSAGE);//Mensagem de erro em caso de opção inválida
					break;
			}
		}
		
		//Método para cadastrar um livro na biblioteca
		
		public void cadastrarLivro()
		{
			//Variável auxiliar para verificar se gravou o livro na biblioteca
			boolean gravado,teste = false;
			do
			{
				gravado = false;
				for(int i=0;i<livros.length;i++)
				{//inicio do for
					if(livros[i] == null)//Se houver espaço, gravar livro
					{
						livros[i]= criarLivro();
						gravado = true;
						break;				
					}			
				}//fim do for
					
				//Exibindo o resultado para o usuário
				if(gravado)
				{
					JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!", "Biblioteca", JOptionPane.PLAIN_MESSAGE);
					
					//Perguntando ao usuário se deseja cadastrar mais livros
					if(JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro livro?","Biblioteca",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
					{
						teste=true;
					}				
				}
				else
				{//Caso não tenha mais espaço para gravações, informar ao usuário
					JOptionPane.showMessageDialog(null, "Não há espaço nos registros para armazenar novo livro!", "Biblioteca", JOptionPane.ERROR_MESSAGE);
					teste=true;					
				}
			}while(!teste);
		}
		
		//Método para devolver um carro para devolver um livro para cadastro no estoque
		public Livro criarLivro()
		{
			//Declaração de objetos para nova criação
			Livro livro = new Livro();
			Editora editora = new Editora();
			Autor autor = new Autor();
			
			boolean teste; //Variável para controle de teste

			int codigo = 0;//Variável para recebimento código
			
			//Lista auxiliar para cadastro
			
			String mensagem = listaLivrosCadastro(livros);
			
			//Recebendo do usuário o código do livro
			do
			{
				teste=false;				
				codigo = Integer.parseInt(JOptionPane.showInputDialog(mensagem + "\nInforme o código do livro"));
				for(int i = 0;i< livros.length;i++)
				{//inicio do for
					if(livros[i]!= null && livros[i].getCodigo() == codigo)//Se encontrar código já utilizado, setar true para informar o usuário depois
					{
						teste=true;
					}
				}//fim do for
				if(teste)
				{
					JOptionPane.showMessageDialog(null, "Código Já Utilizado!", "Biblioteca", JOptionPane.ERROR_MESSAGE);
				}				
			}while(teste);
			
			livro.setCodigo(codigo);
			
			//Recebendo do usuário o título do livro
			
			livro.setTitulo(JOptionPane.showInputDialog("Informe o título do livro"));
			
			//Recebendo do usuário a editora do livro
			
			teste=false;
			String lista = retornarEditora(livros);//Listar personalizada com as editoras cadastradas
			
			codigo = (Integer.parseInt(JOptionPane.showInputDialog(lista + "\n" + "\nInforme o código da editora, ao digitar um valor novo, será feito um novo cadastro de editora\n")));
			for(int i =0;i<livros.length;i++)
			{//inicio do for
				//Se já houver uma editora com o código informado, apenas preencher os dados copiando os valores
				if(livros[i] != null && livros[i].getEditora().getCodigo() == codigo)
				{
					editora.setCodigo(livros[i].getEditora().getCodigo());
					editora.setNome(livros[i].getEditora().getNome());
					editora.setPais(livros[i].getEditora().getPais());
					teste=true;					
				}
			}//fim do for
			if(!teste)
			{
				//Se não houver editora com o código informado, cadastrar uma nova
				editora.setCodigo(codigo);
				editora.setNome(JOptionPane.showInputDialog("Informe o nome da editora do livro"));
				editora.setPais(JOptionPane.showInputDialog("Informe o país da edição"));
			}
						
			
			//Recebendo do usuário o autor do livro
			teste=false;
			lista = retornarAutor(livros);
			codigo = (Integer.parseInt(JOptionPane.showInputDialog(lista + "\n" + "\nInforme o código do autor, ao digitar um valor novo, será feito um novo cadastro de autor\n")));
			for(int i =0;i<livros.length;i++)
			{//inicio do for
				if(livros[i] != null && livros[i].getAutor().getCodigo() == codigo)
				{
					//Se já houver um autor com o código informado, apenas preencher os dados copiando os valores
					autor.setCodigo(livros[i].getAutor().getCodigo());
					autor.setNome(livros[i].getAutor().getNome());
					autor.setNacionalidade(livros[i].getAutor().getNacionalidade());
					teste=true;					
				}
			}//fim do for
			if(!teste)
			{
				//Se não houver autor com o código informado, cadastrar um novo
				autor.setCodigo(codigo);
				autor.setNome((JOptionPane.showInputDialog("Informe o nome do autor")));
				autor.setNacionalidade(JOptionPane.showInputDialog("Informe a nacionalidade do autor"));
			}
			
			//Recebendo do usuário a data de publicação do livro
			livro.setAnoPublicacao(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de publicação da obra")));	

			//Atribuindo os valores de autor e editora no livro
			livro.setAutor(autor);
			livro.setEditora(editora);
			
			//Atribuindo o valor de disponível ao livro no momento de sua geração
			livro.setDisponivel(true);
			
			//Retornando o livro criado
			return livro;
		}
		
		//Método para cadastrar um usuário na biblioteca
		
		public void cadastrarUsuario()
		{
			//Variável auxiliar para verificar se gravou o usuario na biblioteca
			boolean gravado, teste;
			do
			{
				gravado=false;
				for(int i=0;i<usuarios.length;i++)
				{//inicio do for
					if(usuarios[i] == null)
					{
						usuarios[i]= criarUsuario();
						gravado = true;
						break;				
					}			
				}//fim do for
				
				//Exibindo o resultado para o usuário
				if(gravado)
				{
					JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!", "Biblioteca", JOptionPane.PLAIN_MESSAGE);
					
					//Perguntando ao usuário se deseja cadastrar mais usuários
					if(JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro usuário?","Biblioteca",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
					{
						teste=true;
					}
					else
					{
						teste = false;
					}
				}
				else
				{//Caso não tenha mais espaço para gravações, informar ao usuário
					JOptionPane.showMessageDialog(null, "Não há espaço nos registros para armazenar um novo usuário!", "Biblioteca", JOptionPane.ERROR_MESSAGE);
					teste = true;
				}
			}while(!teste);
		}
		
		//Método para devolver um usuario para cadastro na biblioteca
		public Usuario criarUsuario()
		{
			//Declaração de objetos para nova criação
			Usuario usuario = new Usuario();
			Data dataNascimento = new Data();		
			
			boolean teste;
			
			int codigo;
			
			//Lista auxiliar para cadastro
			String mensagem = listaUsuariosCadastro(usuarios);
			
			//Recebendo do usuário o código do usuário a ser cadastrado
			
			do
			{
				teste=false;
				codigo = Integer.parseInt(JOptionPane.showInputDialog(mensagem + "\nInforme o código do novo usuário"));
				for(int i = 0;i< usuarios.length;i++)
				{//inicio do for
					//Verificar se o código já existe
					if(usuarios[i] != null && usuarios[i].getCodigo() == codigo)
					{
						teste=true;
					}
				}//fim do for
				if(teste)
				{//Caso o código já esteja sendo usado, informar ao usuário
					JOptionPane.showMessageDialog(null, "Código Já Utilizado!", "Biblioteca", JOptionPane.ERROR_MESSAGE);
				}
			}while(teste);
			
			
			usuario.setCodigo(codigo);
			
			//Recebendo do usuário o nome do usuário a ser cadastrado
			
			usuario.setNome(JOptionPane.showInputDialog("Informe o nome do novo usuário"));
			
			//Recebendo do usuário o telefone do usuário a ser cadastrado
			
			usuario.setTelefone(JOptionPane.showInputDialog("Informe o telefone do novo usuário"));
			
			//Recebendo do usuário o email do usuário a ser cadastrado
			
			usuario.setEmail(JOptionPane.showInputDialog("Informe o email do novo usuário"));
			
			//Recebendo do usuário a data de nascimento
			/*Variáveis auxiliares para recepção de data*/
			
			String data;
			teste = false;
			LocalDateTime now = LocalDateTime.now();					
			LocalDateTime dateTime;	
			
			//Formatador de Data e Hora
			
			DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			
			do
			{
				data = JOptionPane.showInputDialog("Informe a data de nascimento com dia mes e ano separados por '/'");
				String vetor[] = data.split("/"); //Receber a data de uma única vez e quebra-lá em 3 partes				
				
				if(vetor.length == 3)//Verificar se algum algarismo não foi recebido e se o ano de nascimento é igual ou menor que a data atual
				{
					//Receber a data formatada no objeto de data
					dateTime = LocalDateTime.parse(vetor[2] + "-" + vetor[1] + "-"+ vetor[0] + " 00:00",formatador);
					
					if(dateTime.isBefore(now))//Testar para verificar se a data informada é anterior a data atual, somente no caso de sim, cadastrar os dados
					{
						//Atribuindo os valores de data ao objeto Data, desde que atendam aos requisitos de data
						dataNascimento.setDia(dateTime.getDayOfMonth());
						dataNascimento.setMes(dateTime.getMonthValue());
						dataNascimento.setAno(dateTime.getYear());
						teste = true; 
					}
					else
					{
						//Caso o critério de data não atenda os requisitos, informar ao usuário
						JOptionPane.showMessageDialog(null, "Data Inválida","Biblioteca", JOptionPane.ERROR_MESSAGE);
					}
				}
			}while(!teste); //Teste por negação			
			
			
			//Atribuindo a data de nascimento do usuário ao objeto usuário	
			usuario.setDataNascimento(dataNascimento);
						
			//Retornando o usuario criado
			return usuario;
		}
				
		//Método para efetuar uma locação de livros na biblioteca
		public void locacaoLivro()
		{							
			/*para realizar um empréstimo, é necessário que haja pelo menos um usuário cadastrado e um livro*/
			//Variável auxiliar para verificar se é possível realizar o empréstimo de algum livro, aqui testamos também se algum livro ESTÁ disponível
			boolean gravado = false,teste =false;
			do
			{
				teste=false;
				for(int i =0;i<livros.length;i++)//Varrer array para encontrar livros disponíveis
				{//inicio do for
					//Se encontrar livros disponíveis, setar a variável de teste
					if(livros[i]!= null && livros[i].isDisponivel())
					{
						teste = true;
					}
				}//fim do for
				
				if(teste)//Caso haja livro disponível na biblioteca, verificar se é possível fazer empréstimo 
				{						
					teste=false;//Resetando variável para novo teste
					for(int i =0;i<usuarios.length;i++) 
					{//inicio do for
						//Se encontrar usuários cadastrados, setar a variável de teste
						if(usuarios[i]!= null)
						{
							teste = true;
						}					
					}//fim do for
					if(teste)
					{//Somente se houverem usuários e livros disponíveis, continuar com o processo de locação
						gravado = false;//Variável auxiliar para verificar se gravou o empréstimo na biblioteca
						for(int i=0;i<locacoes.length;i++)
						{//inicio do for
							//Se houver espaço, gravar uma locação
							if(locacoes[i] == null)
							{
								locacoes[i]= criarLocacao();
								gravado = true;							
								break;				
							}			
						}//fim do for
						if(gravado)
						{
							//Caso seja efetuada a locação, informar ao usuário
							JOptionPane.showMessageDialog(null, "Locação cadastrada com sucesso!", "Biblioteca", JOptionPane.PLAIN_MESSAGE);
							//Perguntar ao usuário se deseja continuar o processo de cadastro
							if(JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro empréstimo?","Biblioteca",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
							{
								teste=false;
							}	
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Não há espaço nos registros para armazenar um novo empréstimo!", "Biblioteca", JOptionPane.ERROR_MESSAGE);
							teste = true;
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Não há usuários cadastrados na biblioteca", "Biblioteca", JOptionPane.ERROR_MESSAGE);
						teste = true;
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Não há livros disponíveis para empréstimo na biblioteca", "Biblioteca", JOptionPane.ERROR_MESSAGE);
					teste = true;
				}
			}while(!teste);
		}
		
		//Método para criar uma locação de livros na biblioteca
		
		public Locacao criarLocacao()
		{
			//Declaração de objetos para nova criação
			Locacao locacao = new Locacao();
			
			boolean teste;
			int codigo=0;
			
			//Recebimento do código da locação
			do
			{
				teste = false;
				codigo = (Integer.parseInt(JOptionPane.showInputDialog("Informe o código da locação")));
				for(int i=0;i<locacoes.length;i++)
				{
					if(locacoes[i] != null && locacoes[i].getCodigo() == codigo)
					{
						teste = true;
					}
				}
				if(teste)
				{
					JOptionPane.showMessageDialog(null, "Código já utilizado", "Biblioteca", JOptionPane.ERROR_MESSAGE);
				}
			}while(teste);
			
			
			//Atribuindo o valor codigo a locação
			locacao.setCodigo(codigo);
			
			
			//Recebimento do usuário que emprestará o livro
			/*variável de controle para o recebimento de um usuário válido*/
			teste = false;			
			String lista;
			do
			{
				lista = retornarUsuarios(usuarios);
				//Solicitar o código do usuário para empréstimo				
				codigo = Integer.parseInt(JOptionPane.showInputDialog(lista + "\n" + "\nInforme o código do usuário"));
				for(int i = 0; i < usuarios.length;i++)//Procurar o usuário em questão
				{
					if(usuarios[i] != null && usuarios[i].getCodigo() == codigo)//Caso localizado, setar variável booleana
					{
						
						locacao.setUsuario(usuarios[i]);						
						teste = true;
					}				
				}
				
				if(!teste)//Caso não tenha sido encontrado, exibir mensagem de erro e continuar a pedir o nome
				{
					JOptionPane.showMessageDialog(null, "Usuário não localizado na base de dados", "Biblioteca", JOptionPane.ERROR_MESSAGE);					
				}				
			}while(!teste);
			
			teste = false;//Variável para controlar o laço while
			
			Livro emprestimos[];//Vetor que conterá os livros a serem emprestados pelo usuário
			int tamanho=0;//Variável que conterá a quantidade de livros a ser emprestada
			
			int contador=0;//Variável para controlar contagem de tamanhos e quantidades nos laços
			
			//Verificar se existem tantos livros quanto se deseja emprestar
		
			do//Laço para solicitar livros ao usuário
			{				
				//Solicitar ao usuário a quantidade de livros a serem emprestados
				tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de livros que deseja emprestar"));				
				for(int i = 0;i < livros.length;i++)
				{//Início do laço for
					if(livros[i]!=null && livros[i].isDisponivel())
					{
						contador++;
					}
				}//Fim do laço for
				if(contador >= tamanho || tamanho < 1)
				{					
					teste = true;					
				}
				else
				{
					contador=0;
					JOptionPane.showMessageDialog(null, "Não é possível emprestar esta quantia de livros. Informe nova quantidade", "Biblioteca", JOptionPane.ERROR_MESSAGE);					
				}
			}while(!teste);			
			
			//Inicializando o vetor
			emprestimos = new Livro[tamanho];
			
			contador=0; //Variável de controle do while
			
			do//Solicitar os livros para empréstimo(poderão ser mais que 1)				
			{		
				//Usaremos a mesma variável código para realizar a solicitação do livro
				teste = false;
				lista = retornarLivros(livros);
				codigo = Integer.parseInt(JOptionPane.showInputDialog(lista + "\nInforme o código do livro"));//Receber o código do livro do usuário			
				for(int i = 0;i< livros.length;i++)
				{
					if(livros[i] != null && livros[i].getCodigo() == codigo)	//Verificar se possui livro com o código fornecido					
					{
						teste=true;
						if(livros[i].isDisponivel())
						{
							for(int j =0; j < emprestimos.length;j++) //Colocar o livro no array de empréstimos
							{
								if(emprestimos[j] == null)//Localizar um setor vazio no array  para guardar o livro
								{
									emprestimos[j] = livros[i]; 
									contador++;
									livros[i].setDisponivel(false);
								}
							}
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Livro indisponível", "Biblioteca", JOptionPane.ERROR_MESSAGE);
						}
					}					
				}
				if(!teste)
				{
					JOptionPane.showMessageDialog(null, "Código inválido ", "Biblioteca", JOptionPane.ERROR_MESSAGE);
				}
			}while(contador != tamanho);			
			
			//Atribuindo array de emprestimos a locação
			
			locacao.setLivros(emprestimos);
			
			
			//Recebimento da da de locação e da data de devolução do livro
			//Declaração das variáveis de data
			
			LocalDateTime relogio = LocalDateTime.now();
			
			Data dataLocacao = new Data();			
			dataLocacao.setDia(relogio.getDayOfMonth());
			dataLocacao.setMes(relogio.getMonthValue());
			dataLocacao.setAno(relogio.getYear());
			
			//Formatador de Data e Hora
			
			DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			
			//Atribuindo a data de locação
			locacao.setDataLocacao(dataLocacao);
			
			Data dataDevolucao = new Data();
			
			String data; //Variável de recebimento de valor data
			
			teste = false;//Controle de recebimento de data			
			LocalDateTime dataInformada;
			
			do
			{
				data = JOptionPane.showInputDialog("Informe a data de devolução com dia mes e ano separados por /");
				String vetor[] = data.split("/"); //Receber a data de uma única vez e quebra-lá em 3 partes		
				if(vetor.length == 3)//Verificar se algum algarismo não foi recebido
				{
					dataInformada = LocalDateTime.parse(vetor[2] + "-" + vetor[1] + "-"+ vetor[0] + " 00:00",formatador);
					if(dataInformada.isAfter(relogio))
					{						
						dataDevolucao.setDia(Integer.parseInt(vetor[0]));
						dataDevolucao.setMes(Integer.parseInt(vetor[1]));
						dataDevolucao.setAno(Integer.parseInt(vetor[2]));
						teste = !teste; //Atribuição por negação
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Data Inválida","Biblioteca", JOptionPane.ERROR_MESSAGE);
					}
				}
			}while(!teste); //Teste por negação
			
			//Atribuindo as datas a locação
			
			
			locacao.setDataDevolucao(dataDevolucao);			

			//Retornando livro para cadastro
			return locacao;
		}
		
		//Método para efetuar uma devolução de livro na biblioteca
		
		public void devolucaoLivro()
		{
			//Recebimento de código do empréstimo a devolver os livros
			
			String mensagem = retornarUsuariosComEmprestimos(locacoes);			
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(mensagem + "\nInforme o código do usuário a realizar devolução"));
			int posicao=0;
			boolean teste = false;//Variável de controle para localização de informações			
			//Verificar se existe empréstimo com o código informado
			for(int i = 0;i< locacoes.length;i++)
			{
				if(locacoes[i] != null && locacoes[i].getCodigo() == codigo)
				{
					teste = true;
					posicao = i;
				}
			}
			
			if(teste)//SE houver empréstimo no nome do usuário fornecido, varrer array de empréstimo fazendo a exclusão das locações
			{
				Livro devolucao[] = new Livro[locacoes[posicao].getLivros().length];
				devolucao = locacoes[posicao].getLivros();
				
				for(int i =0;i<devolucao.length;i++)
				{
					for(int j=0;j<livros.length;j++)
					{
						if(livros[j].getCodigo() == devolucao[i].getCodigo())
						{
							livros[j].setDisponivel(true);
						}
					}
				}
				
				locacoes[posicao]= null;
				
				//Informando ao usuário que as devoluções foram realizadas
				
				/*Nota: Não há validação de atraso no empréstimo*/
				JOptionPane.showMessageDialog(null, "Devoluções efetuadas com sucesso", "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				//Caso não haja empréstimo com o código informado, avisar ao usuário
				JOptionPane.showMessageDialog(null, "Não há empréstimo vinculado ao usuário solicitado", "Biblioteca", JOptionPane.WARNING_MESSAGE);
			}
			
		}
		
		//Método para listar os livros da biblioteca
		
		public void listarLivros()
		{
			//Variáveis auxiliares para exibir os livros cadastrados na biblioteca para o usuário
			String mensagem = "";
			boolean teste = false;
			//Varrendo a biblioteca para verificar se existe livros cadastrados
			for(int i=0;i<livros.length;i++)
			{//inicio do for
				if(livros[i] != null)
				{
					mensagem += livros[i].toString() + "\n";
					teste = true;
				}
			}//fim do for
			
			if(teste)//Se houver livros, imprimir livros, senão, emitir alerta
			{
				JOptionPane.showMessageDialog(null, mensagem, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Não há livros cadastrados no momento", "Biblioteca", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		//Método para listar livros para cadastro
		
		public String listaLivrosCadastro(Livro livro[])
		{
			//Variáveis auxiliares para exibir os livros cadastrados na biblioteca para o usuário
			String mensagem = "";
			
			//Varrendo a biblioteca para verificar se existe livros cadastrados
			for(int i=0;i<livros.length;i++)
			{//inicio do for
				if(livros[i] != null)
				{
					mensagem += livros[i].toString() + "\n\n";					
				}
			}//fim do for
			
			return mensagem;						
		}
		
		//Método para listar usuários para cadastro
		
		public String listaUsuariosCadastro(Usuario usuario[])
		{
			//Variáveis auxiliares para exibir os livros cadastrados na biblioteca para o usuário
			String mensagem = "";
			
			//Varrendo a biblioteca para verificar se existe livros cadastrados
			for(int i=0;i<usuarios.length;i++)
			{//inicio do for
				if(usuarios[i] != null)
				{
					mensagem += usuarios[i].toString() + "\n\n";					
				}
			}//fim do for
			
			return mensagem;						
		}
		
		
		
		//Método para listar os usuários da biblioteca
		
		public void listarUsuarios()
		{
			//Variáveis auxiliares para exibir os usuários cadastrados na biblioteca para o usuário
			String mensagem = "";
			boolean teste = false;
			
			//Varrendo a biblioteca para verificar se existe usuários cadastrados
			for(int i=0;i<usuarios.length;i++)
			{//inicio do for
				if(usuarios[i] != null)
				{
					mensagem += usuarios[i].toString() + "\n";
					teste = true;
				}
			}//fim do for
			
			if(teste)//Se houver usuários, imprimir usuários, senão, emitir alerta
			{
				JOptionPane.showMessageDialog(null, mensagem, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Não há usuários cadastrados no momento", "Biblioteca", JOptionPane.WARNING_MESSAGE);
			}
		}		
		
		//Método para pesquisar os livros da biblioteca pelo atributo Editora
		
		public void pesquisarLivrosPorEditora()
		{
			// Recebendo do usuário qual a editora a ser pesquisada
			String editora = JOptionPane.showInputDialog("Informe a editora para pesquisa");

			// Variável auxiliar para exibir a mensagem do resultado pesquisado
			String mensagem = "";

			// Variável auxiliar para verificar se existe o autor cadastrado
			boolean existe = false;
			
			// Varrendo o vetor e verificando os livros cadastrados pela editora
			for (int i = 0; i < livros.length; i++) 
			{//inicio do for
				if (livros[i] != null && livros[i].getEditora().getNome().equals(editora)) 
				{
					mensagem += mensagem + (i + 1) + " - " + livros[i].getTitulo() + "\n";
					existe = true;
				}
			} // fim do for

						
			// Exibindo o resultado da pesquisa
			if (existe) //Se existir, exibir os resgistros, senão exibir alerta
			{
				JOptionPane.showMessageDialog(null, "Pesquisar por Editora: \n\n"  + mensagem, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Não existe livro cadastrado com a editora informada", "Biblioteca",JOptionPane.WARNING_MESSAGE);
			}
		}
		
		//Método para pesquisar os livros da biblioteca pela atributo Autor
		
		public void pesquisarLivrosPorAutor()
		{
			// Recebendo do usuário qual o autor a ser pesquisado
			String autor = JOptionPane.showInputDialog("Informe o autor para pesquisa");

			// Variável auxiliar para exibir a mensagem do resultado pesquisado
			String mensagem = "";

			// Variável auxiliar para verificar se existe o autor cadastrado
			boolean existe = false;

			// Varrendo o vetor e verificando os livros cadastrados por Autor
			for (int i = 0; i < livros.length; i++) 
			{//inicio do for
				if (livros[i] != null && livros[i].getAutor().getNome().equals(autor)) 
				{
					mensagem += mensagem + (i + 1) + " - " +  livros[i].getTitulo()+ "\n";
					existe = true;
				}
			} // fim do for

			
			// Exibindo o resultado da pesquisa
			if (existe) //Se existir, exibir os registros, senão exibir alerta
			{
				JOptionPane.showMessageDialog(null, "Pesquisar por Autor: \n\n" + mensagem, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Não existe livro cadastrado com o autor informado", "Biblioteca",JOptionPane.WARNING_MESSAGE);
			}
		}
		
		//Método para pesquisar as locações efetuadas na biblioteca filtradas por data
		
		public void pesquisarLocacoesPorData()
		{
			
			
			//Array contendo oopções de escolha do usuário
			String[] opcoes = {"Por data de locação", "Por data de devolução","Todas as locações"};
			
			//Recebimento de data por meio de String
			String data;
			Data dataPesquisa = new Data();
			String mensagem = "";
			boolean teste = false;
			
			//Variável para receber a opção de escolha do usuário
			
			int x = JOptionPane.showOptionDialog(null, "De qual modo deseja efetuar a pesquisa?", "Biblioteca", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			//Se usuário escolher a opção "Por data de locação"
			if(x == 0)
			{
				do
				{
					data = JOptionPane.showInputDialog("Informe a data de locação com dia mes e ano separados por /");
					String vetor[] = data.split("/"); //Receber a data de uma única vez e quebra-lá em 3 partes				
					if(vetor.length == 3)//Verificar se algum algarismo não foi recebido
					{
						dataPesquisa.setDia(Integer.parseInt(vetor[0]));
						dataPesquisa.setMes(Integer.parseInt(vetor[1]));
						dataPesquisa.setAno(Integer.parseInt(vetor[2]));
						teste = !teste; //Atribuição por negação
					}			
					teste = true;
				}while(!teste); //Teste por negação				
					
				teste = false;
					
				//Tendo a data já convertida, efetuar a busca própriamente dita
					
				for(int i = 0;i<locacoes.length;i++)
				{
					//Concatenar os dados de todos empréstimos efetuados com a condição de locação igual a data informada
					if(locacoes[i] != null && locacoes[i].getDataLocacao().toString().equals(dataPesquisa.toString()))
					{
						
						mensagem += "Código              : " + locacoes[i].getCodigo() +
								    "\nUsuário           : " + locacoes[i].getUsuario().getNome() +
								    "\nData de Locação   : " + locacoes[i].getDataLocacao().toString() +
								    "\nData de Devolução : " + locacoes[i].getDataDevolucao().toString()+ 
								    "\n         Livros    \n" + retornarLivrosEmprestados(locacoes[i].getLivros());
						teste = true;
					}
				}			
					
				//Se houver um empréstimo na data selecionada, exibir resultado. Senão, exibir alerta 
				if(teste)
				{
					JOptionPane.showMessageDialog(null, mensagem, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Não existem empréstimos na data informada", "Biblioteca",JOptionPane.WARNING_MESSAGE);
				}
			}
			//Se usuário escolher a opção "Por data de devolução"
			else if(x == 1)
			{
				do
				{
					data = JOptionPane.showInputDialog("Informe a data de devolução com dia mes e ano separados por /");
					String vetor[] = data.split("/"); //Receber a data de uma única vez e quebra-lá em 3 partes				
					if(vetor.length == 3)//Verificar se algum algarismo não foi recebido
					{
						dataPesquisa.setDia(Integer.parseInt(vetor[0]));
						dataPesquisa.setMes(Integer.parseInt(vetor[1]));
						dataPesquisa.setAno(Integer.parseInt(vetor[2]));
						teste = !teste; //Atribuição por negação
					}			
					teste = true;
				}while(!teste); //Teste por negação						
			
				teste = false;
				
				//Tendo a data já convertida, efetuar a busca própriamente dita
				
				for(int i = 0;i<locacoes.length;i++)
				{//inicio do for
					//Concatenar os dados de todos empréstimos efetuados com a condição de devolução igual a data informada
					if(locacoes[i] != null && locacoes[i].getDataDevolucao().toString().equals(dataPesquisa.toString()))
					{
						mensagem +=  "Código              : " + locacoes[i].getCodigo() +
								     "\nUsuário           : " + locacoes[i].getUsuario().getNome() +
								     "\nData de Locação   : " + locacoes[i].getDataLocacao().toString() +
								     "\nData de Devolução : " + locacoes[i].getDataDevolucao().toString()+
								     "\n         Livros    \n" + retornarLivrosEmprestados(locacoes[i].getLivros());								
						teste = true;
					}
				}//fim do for
				
				//Se houver um empréstimo na data selecionada, exibir resultado. Senão, exibir alerta 
				if(teste)
				{
					JOptionPane.showMessageDialog(null, mensagem, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Não existem empréstimo na data informada", "Biblioteca",JOptionPane.WARNING_MESSAGE);
				}
			}
			//Se usuário escolher a opção "Todas as locações"
			else
			{
				for(int i = 0;i<locacoes.length;i++)
				{//inicio do for
					//Concatenar os dados de todos empréstimos efetuados
					if(locacoes[i] != null)
					{
						mensagem +=  "Código              : " + locacoes[i].getCodigo() +
								     "\nUsuário           : " + locacoes[i].getUsuario().getNome() +
								     "\nData de Locação   : " + locacoes[i].getDataLocacao().toString() +
								     "\nData de Devolução : " + locacoes[i].getDataDevolucao().toString()+ 
									 "\n         Livros    \n" + retornarLivrosEmprestados(locacoes[i].getLivros());
						teste = true;
					}
				}//fim do for
				
				//Se houver um empréstimo pelo menos, exibir resultado. Senão, exibir alerta 
				if(teste)
				{
					JOptionPane.showMessageDialog(null, mensagem, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Não existe empréstimos efetuados", "Biblioteca",JOptionPane.WARNING_MESSAGE);					
				}
			}		
		}	
		
		
		//Método para retornar mensagem contendo todos os usuários do array solicitado
		
		public String retornarUsuarios(Usuario usuario[])
		{
			//Declaração de variável que conterá a lista
			String mensagem = "Lista de Usuários\n";
			//Varrer o array e procurar todos os usuários
			for(int i =0;i<usuario.length;i++)
			{//inicio do for
				//Concatenar os dados dos usuários
				if(usuario[i] != null)
				{
					mensagem +=   "Código :" +  usuario[i].getCodigo() +
						    	"\nNome   :" + usuario[i].getNome() + "\n-----------\n";
				}
			}//fim do for
			return mensagem;
		}
		
		//Método para retornar mensagem contendo todos os livros do array informado
		
		public String retornarLivros(Livro livro[])
		{
			//Declaração de variável que conterá a lista de livros
			String mensagem = "Lista de Livros\n";
			//Varrer o array e procurar todos os livros disponíveis
			for(int i =0;i<livro.length;i++)
			{//inicio do for
				//Como esta listagem será usada para mostrar os livros disponíveis para empréstimo, será filtrado por disponibilidade
				if(livro[i] != null && livro[i].isDisponivel())
				{
					//Concatenar os dados dos livros
					mensagem +=   "Código : " +  livro[i].getCodigo() +
						    	"\nTítulo : " + livro[i].getTitulo() + "\n-----------\n";
				}
			}//fim do for
			return mensagem;
		}
		
		//Método para retornar mensagem contendo todos os autores do array informado
		
		public String retornarAutor(Livro livro[])
		{
			//Declaração de variável que conterá a lista de autores		
			String mensagem = "Lista de Autores cadastrados\n";	
			
			for(int i =0;i<livro.length;i++)
			{//inicio do for
				//Concatenar os dados dos autores
				if(livro[i] != null)
				{
					mensagem += "Código  : " +  livro[i].getAutor().getCodigo() +
						    	"\nAutor : " + livro[i].getAutor().getNome() + "\n-----------\n";					
				}
			}//fim do for
			return mensagem;
		}
		
		public String retornarEditora(Livro livro[])
		{		
			//Declaração de variável que conterá a lista de editoras
			String mensagem = "Lista de Editoras cadastradas\n";
			for(int i =0;i<livro.length;i++)
			{//inicio do for
				if(livro[i] != null)
				{ //Concatenar os dados das editoras
					mensagem += "Código  : " +  livro[i].getEditora().getCodigo() +
						   	  "\nEditora : " + livro[i].getEditora().getNome() + "\n-----------\n";					
				}
			}//fim do for
			return mensagem;
		}		
		
		//Método para retornar livros emprestar por usuário
		public String retornarLivrosEmprestados(Livro livro[])
		{
			//Declaração de variável que receberá a mensagem
			
			String mensagem= "";			
			for(int i = 0;i<livro.length;i++)
			{
				mensagem +=   "Código             : " + livro[i].getCodigo() +
						    "\nTítulo             : " + livro[i].getTitulo() + "\n-----------\n";
			}
			return mensagem;
		}
		
		//Método para retornar usuários com empréstimos realizados
		public String retornarUsuariosComEmprestimos(Locacao locacao[])		
		{
			String mensagem = "";
			for(int i =0; i < locacao.length;i++)
			{
				mensagem += "Código          : " + locacao[i].getUsuario().getCodigo() +
						  "\nUsuário         : " + locacao[i].getUsuario().getNome() +
						  "\nData de Entrega : " + locacao[i].getDataDevolucao().toString() + "\n-----------\n";
			}
			return mensagem;
		}
		
		
		//Método para sair do sistema
		
		public void sairDoSistema()
		{
			//Efetuar o questionamento ao usuário, se responder sim, executar a operação
			if(JOptionPane.showConfirmDialog(null, "Deseja sair?","Biblioteca", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			{
				System.exit(0); //Comando de quebra de execução
			}
		}
}
