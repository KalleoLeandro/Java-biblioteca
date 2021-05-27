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
 * Classe controladora das fun��es existentes no menu
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

		//Vari�vel auxiliar para definir o tamanho do estoque
		private int tamanho = 0;	
		
		//M�todo construtor da classe
		public Biblioteca()
		{
			processar();
		}
		
		//M�todo principal do programa
		public void processar()
		{
			//Fun��o para mudar as propriedades de fonte do JoptionPane
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Courier", Font.PLAIN, 18)));
			
			//Fun��o para mudar o texto do ConfirmDialog
			UIManager.put("OptionPane.yesButtonText", "Sim");
			UIManager.put("OptionPane.noButtonText", "N�o");
			UIManager.put("OptionPane.okButtonText", "Ok");
			UIManager.put("OptionPane.cancelButtonText", "Cancelar");			
			
			
			//Em caso de teste comentar desta linha
			
			//Capturando do usu�rio o tamanho do espa�o da Biblioteca
			tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de livros que a biblioteca comporta"));		
			//Definindo o tamanho do espa�o
			livros = new Livro[tamanho];
			
			//Capturando do usu�rio a quantidade de Usuarios
			tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de usu�rios que frequentam a biblioteca"));
			
			//Definindo a quantidade de Usuarios
			usuarios = new Usuario[tamanho];
			
			//Capturando do usu�rio a quantidade de Loca��es poss�veis
			tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de loca��es permitidas"));
			
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
			autorTeste.setNacionalidade("Alem�o");
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
			autorTeste2.setNacionalidade("Brit�nico");
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
		
		//M�todo para capturar do usu�rio a op��o
		public void escolhaUsuario()
		{
			String menu = "Informe a op��o desejada:"+
						"\nOP��O 1: Cadastrar Livro" +
						"\nOP��O 2: Cadastrar Usuario" +
						"\nOP��O 3: Efetuar Loca��o de Livros" +		
						"\nOP��O 4: Efetuar Devolu��o de Livros" +
						"\nOP��O 5: Listar Todos os Livros Cadastrados" +
						"\nOP��O 6: Listar Todos os Usu�rios Cadastrados" +
						"\nOP��O 7: Pesquisar Livros por Editora" +
						"\nOP��O 8: Pesquisar Livros por Autor" +
						"\nOP��O 9: Pesquisar Loca��es" +						
						"\nOP��O 10: Sair dos Sistema";
			int escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));
			escolhaProcessamento(escolha);
			
		}
		
		//M�todo para sele��o das op��es do programa
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
					JOptionPane.showMessageDialog(null, "Erro!!! Op��o inv�lida", "Biblioteca", JOptionPane.ERROR_MESSAGE);//Mensagem de erro em caso de op��o inv�lida
					break;
			}
		}
		
		//M�todo para cadastrar um livro na biblioteca
		
		public void cadastrarLivro()
		{
			//Vari�vel auxiliar para verificar se gravou o livro na biblioteca
			boolean gravado,teste = false;
			do
			{
				gravado = false;
				for(int i=0;i<livros.length;i++)
				{//inicio do for
					if(livros[i] == null)//Se houver espa�o, gravar livro
					{
						livros[i]= criarLivro();
						gravado = true;
						break;				
					}			
				}//fim do for
					
				//Exibindo o resultado para o usu�rio
				if(gravado)
				{
					JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!", "Biblioteca", JOptionPane.PLAIN_MESSAGE);
					
					//Perguntando ao usu�rio se deseja cadastrar mais livros
					if(JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro livro?","Biblioteca",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
					{
						teste=true;
					}				
				}
				else
				{//Caso n�o tenha mais espa�o para grava��es, informar ao usu�rio
					JOptionPane.showMessageDialog(null, "N�o h� espa�o nos registros para armazenar novo livro!", "Biblioteca", JOptionPane.ERROR_MESSAGE);
					teste=true;					
				}
			}while(!teste);
		}
		
		//M�todo para devolver um carro para devolver um livro para cadastro no estoque
		public Livro criarLivro()
		{
			//Declara��o de objetos para nova cria��o
			Livro livro = new Livro();
			Editora editora = new Editora();
			Autor autor = new Autor();
			
			boolean teste; //Vari�vel para controle de teste

			int codigo = 0;//Vari�vel para recebimento c�digo
			
			//Lista auxiliar para cadastro
			
			String mensagem = listaLivrosCadastro(livros);
			
			//Recebendo do usu�rio o c�digo do livro
			do
			{
				teste=false;				
				codigo = Integer.parseInt(JOptionPane.showInputDialog(mensagem + "\nInforme o c�digo do livro"));
				for(int i = 0;i< livros.length;i++)
				{//inicio do for
					if(livros[i]!= null && livros[i].getCodigo() == codigo)//Se encontrar c�digo j� utilizado, setar true para informar o usu�rio depois
					{
						teste=true;
					}
				}//fim do for
				if(teste)
				{
					JOptionPane.showMessageDialog(null, "C�digo J� Utilizado!", "Biblioteca", JOptionPane.ERROR_MESSAGE);
				}				
			}while(teste);
			
			livro.setCodigo(codigo);
			
			//Recebendo do usu�rio o t�tulo do livro
			
			livro.setTitulo(JOptionPane.showInputDialog("Informe o t�tulo do livro"));
			
			//Recebendo do usu�rio a editora do livro
			
			teste=false;
			String lista = retornarEditora(livros);//Listar personalizada com as editoras cadastradas
			
			codigo = (Integer.parseInt(JOptionPane.showInputDialog(lista + "\n" + "\nInforme o c�digo da editora, ao digitar um valor novo, ser� feito um novo cadastro de editora\n")));
			for(int i =0;i<livros.length;i++)
			{//inicio do for
				//Se j� houver uma editora com o c�digo informado, apenas preencher os dados copiando os valores
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
				//Se n�o houver editora com o c�digo informado, cadastrar uma nova
				editora.setCodigo(codigo);
				editora.setNome(JOptionPane.showInputDialog("Informe o nome da editora do livro"));
				editora.setPais(JOptionPane.showInputDialog("Informe o pa�s da edi��o"));
			}
						
			
			//Recebendo do usu�rio o autor do livro
			teste=false;
			lista = retornarAutor(livros);
			codigo = (Integer.parseInt(JOptionPane.showInputDialog(lista + "\n" + "\nInforme o c�digo do autor, ao digitar um valor novo, ser� feito um novo cadastro de autor\n")));
			for(int i =0;i<livros.length;i++)
			{//inicio do for
				if(livros[i] != null && livros[i].getAutor().getCodigo() == codigo)
				{
					//Se j� houver um autor com o c�digo informado, apenas preencher os dados copiando os valores
					autor.setCodigo(livros[i].getAutor().getCodigo());
					autor.setNome(livros[i].getAutor().getNome());
					autor.setNacionalidade(livros[i].getAutor().getNacionalidade());
					teste=true;					
				}
			}//fim do for
			if(!teste)
			{
				//Se n�o houver autor com o c�digo informado, cadastrar um novo
				autor.setCodigo(codigo);
				autor.setNome((JOptionPane.showInputDialog("Informe o nome do autor")));
				autor.setNacionalidade(JOptionPane.showInputDialog("Informe a nacionalidade do autor"));
			}
			
			//Recebendo do usu�rio a data de publica��o do livro
			livro.setAnoPublicacao(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de publica��o da obra")));	

			//Atribuindo os valores de autor e editora no livro
			livro.setAutor(autor);
			livro.setEditora(editora);
			
			//Atribuindo o valor de dispon�vel ao livro no momento de sua gera��o
			livro.setDisponivel(true);
			
			//Retornando o livro criado
			return livro;
		}
		
		//M�todo para cadastrar um usu�rio na biblioteca
		
		public void cadastrarUsuario()
		{
			//Vari�vel auxiliar para verificar se gravou o usuario na biblioteca
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
				
				//Exibindo o resultado para o usu�rio
				if(gravado)
				{
					JOptionPane.showMessageDialog(null, "Usu�rio cadastrado com sucesso!", "Biblioteca", JOptionPane.PLAIN_MESSAGE);
					
					//Perguntando ao usu�rio se deseja cadastrar mais usu�rios
					if(JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro usu�rio?","Biblioteca",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
					{
						teste=true;
					}
					else
					{
						teste = false;
					}
				}
				else
				{//Caso n�o tenha mais espa�o para grava��es, informar ao usu�rio
					JOptionPane.showMessageDialog(null, "N�o h� espa�o nos registros para armazenar um novo usu�rio!", "Biblioteca", JOptionPane.ERROR_MESSAGE);
					teste = true;
				}
			}while(!teste);
		}
		
		//M�todo para devolver um usuario para cadastro na biblioteca
		public Usuario criarUsuario()
		{
			//Declara��o de objetos para nova cria��o
			Usuario usuario = new Usuario();
			Data dataNascimento = new Data();		
			
			boolean teste;
			
			int codigo;
			
			//Lista auxiliar para cadastro
			String mensagem = listaUsuariosCadastro(usuarios);
			
			//Recebendo do usu�rio o c�digo do usu�rio a ser cadastrado
			
			do
			{
				teste=false;
				codigo = Integer.parseInt(JOptionPane.showInputDialog(mensagem + "\nInforme o c�digo do novo usu�rio"));
				for(int i = 0;i< usuarios.length;i++)
				{//inicio do for
					//Verificar se o c�digo j� existe
					if(usuarios[i] != null && usuarios[i].getCodigo() == codigo)
					{
						teste=true;
					}
				}//fim do for
				if(teste)
				{//Caso o c�digo j� esteja sendo usado, informar ao usu�rio
					JOptionPane.showMessageDialog(null, "C�digo J� Utilizado!", "Biblioteca", JOptionPane.ERROR_MESSAGE);
				}
			}while(teste);
			
			
			usuario.setCodigo(codigo);
			
			//Recebendo do usu�rio o nome do usu�rio a ser cadastrado
			
			usuario.setNome(JOptionPane.showInputDialog("Informe o nome do novo usu�rio"));
			
			//Recebendo do usu�rio o telefone do usu�rio a ser cadastrado
			
			usuario.setTelefone(JOptionPane.showInputDialog("Informe o telefone do novo usu�rio"));
			
			//Recebendo do usu�rio o email do usu�rio a ser cadastrado
			
			usuario.setEmail(JOptionPane.showInputDialog("Informe o email do novo usu�rio"));
			
			//Recebendo do usu�rio a data de nascimento
			/*Vari�veis auxiliares para recep��o de data*/
			
			String data;
			teste = false;
			LocalDateTime now = LocalDateTime.now();					
			LocalDateTime dateTime;	
			
			//Formatador de Data e Hora
			
			DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			
			do
			{
				data = JOptionPane.showInputDialog("Informe a data de nascimento com dia mes e ano separados por '/'");
				String vetor[] = data.split("/"); //Receber a data de uma �nica vez e quebra-l� em 3 partes				
				
				if(vetor.length == 3)//Verificar se algum algarismo n�o foi recebido e se o ano de nascimento � igual ou menor que a data atual
				{
					//Receber a data formatada no objeto de data
					dateTime = LocalDateTime.parse(vetor[2] + "-" + vetor[1] + "-"+ vetor[0] + " 00:00",formatador);
					
					if(dateTime.isBefore(now))//Testar para verificar se a data informada � anterior a data atual, somente no caso de sim, cadastrar os dados
					{
						//Atribuindo os valores de data ao objeto Data, desde que atendam aos requisitos de data
						dataNascimento.setDia(dateTime.getDayOfMonth());
						dataNascimento.setMes(dateTime.getMonthValue());
						dataNascimento.setAno(dateTime.getYear());
						teste = true; 
					}
					else
					{
						//Caso o crit�rio de data n�o atenda os requisitos, informar ao usu�rio
						JOptionPane.showMessageDialog(null, "Data Inv�lida","Biblioteca", JOptionPane.ERROR_MESSAGE);
					}
				}
			}while(!teste); //Teste por nega��o			
			
			
			//Atribuindo a data de nascimento do usu�rio ao objeto usu�rio	
			usuario.setDataNascimento(dataNascimento);
						
			//Retornando o usuario criado
			return usuario;
		}
				
		//M�todo para efetuar uma loca��o de livros na biblioteca
		public void locacaoLivro()
		{							
			/*para realizar um empr�stimo, � necess�rio que haja pelo menos um usu�rio cadastrado e um livro*/
			//Vari�vel auxiliar para verificar se � poss�vel realizar o empr�stimo de algum livro, aqui testamos tamb�m se algum livro EST� dispon�vel
			boolean gravado = false,teste =false;
			do
			{
				teste=false;
				for(int i =0;i<livros.length;i++)//Varrer array para encontrar livros dispon�veis
				{//inicio do for
					//Se encontrar livros dispon�veis, setar a vari�vel de teste
					if(livros[i]!= null && livros[i].isDisponivel())
					{
						teste = true;
					}
				}//fim do for
				
				if(teste)//Caso haja livro dispon�vel na biblioteca, verificar se � poss�vel fazer empr�stimo 
				{						
					teste=false;//Resetando vari�vel para novo teste
					for(int i =0;i<usuarios.length;i++) 
					{//inicio do for
						//Se encontrar usu�rios cadastrados, setar a vari�vel de teste
						if(usuarios[i]!= null)
						{
							teste = true;
						}					
					}//fim do for
					if(teste)
					{//Somente se houverem usu�rios e livros dispon�veis, continuar com o processo de loca��o
						gravado = false;//Vari�vel auxiliar para verificar se gravou o empr�stimo na biblioteca
						for(int i=0;i<locacoes.length;i++)
						{//inicio do for
							//Se houver espa�o, gravar uma loca��o
							if(locacoes[i] == null)
							{
								locacoes[i]= criarLocacao();
								gravado = true;							
								break;				
							}			
						}//fim do for
						if(gravado)
						{
							//Caso seja efetuada a loca��o, informar ao usu�rio
							JOptionPane.showMessageDialog(null, "Loca��o cadastrada com sucesso!", "Biblioteca", JOptionPane.PLAIN_MESSAGE);
							//Perguntar ao usu�rio se deseja continuar o processo de cadastro
							if(JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro empr�stimo?","Biblioteca",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
							{
								teste=false;
							}	
						}
						else
						{
							JOptionPane.showMessageDialog(null, "N�o h� espa�o nos registros para armazenar um novo empr�stimo!", "Biblioteca", JOptionPane.ERROR_MESSAGE);
							teste = true;
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "N�o h� usu�rios cadastrados na biblioteca", "Biblioteca", JOptionPane.ERROR_MESSAGE);
						teste = true;
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "N�o h� livros dispon�veis para empr�stimo na biblioteca", "Biblioteca", JOptionPane.ERROR_MESSAGE);
					teste = true;
				}
			}while(!teste);
		}
		
		//M�todo para criar uma loca��o de livros na biblioteca
		
		public Locacao criarLocacao()
		{
			//Declara��o de objetos para nova cria��o
			Locacao locacao = new Locacao();
			
			boolean teste;
			int codigo=0;
			
			//Recebimento do c�digo da loca��o
			do
			{
				teste = false;
				codigo = (Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo da loca��o")));
				for(int i=0;i<locacoes.length;i++)
				{
					if(locacoes[i] != null && locacoes[i].getCodigo() == codigo)
					{
						teste = true;
					}
				}
				if(teste)
				{
					JOptionPane.showMessageDialog(null, "C�digo j� utilizado", "Biblioteca", JOptionPane.ERROR_MESSAGE);
				}
			}while(teste);
			
			
			//Atribuindo o valor codigo a loca��o
			locacao.setCodigo(codigo);
			
			
			//Recebimento do usu�rio que emprestar� o livro
			/*vari�vel de controle para o recebimento de um usu�rio v�lido*/
			teste = false;			
			String lista;
			do
			{
				lista = retornarUsuarios(usuarios);
				//Solicitar o c�digo do usu�rio para empr�stimo				
				codigo = Integer.parseInt(JOptionPane.showInputDialog(lista + "\n" + "\nInforme o c�digo do usu�rio"));
				for(int i = 0; i < usuarios.length;i++)//Procurar o usu�rio em quest�o
				{
					if(usuarios[i] != null && usuarios[i].getCodigo() == codigo)//Caso localizado, setar vari�vel booleana
					{
						
						locacao.setUsuario(usuarios[i]);						
						teste = true;
					}				
				}
				
				if(!teste)//Caso n�o tenha sido encontrado, exibir mensagem de erro e continuar a pedir o nome
				{
					JOptionPane.showMessageDialog(null, "Usu�rio n�o localizado na base de dados", "Biblioteca", JOptionPane.ERROR_MESSAGE);					
				}				
			}while(!teste);
			
			teste = false;//Vari�vel para controlar o la�o while
			
			Livro emprestimos[];//Vetor que conter� os livros a serem emprestados pelo usu�rio
			int tamanho=0;//Vari�vel que conter� a quantidade de livros a ser emprestada
			
			int contador=0;//Vari�vel para controlar contagem de tamanhos e quantidades nos la�os
			
			//Verificar se existem tantos livros quanto se deseja emprestar
		
			do//La�o para solicitar livros ao usu�rio
			{				
				//Solicitar ao usu�rio a quantidade de livros a serem emprestados
				tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de livros que deseja emprestar"));				
				for(int i = 0;i < livros.length;i++)
				{//In�cio do la�o for
					if(livros[i]!=null && livros[i].isDisponivel())
					{
						contador++;
					}
				}//Fim do la�o for
				if(contador >= tamanho || tamanho < 1)
				{					
					teste = true;					
				}
				else
				{
					contador=0;
					JOptionPane.showMessageDialog(null, "N�o � poss�vel emprestar esta quantia de livros. Informe nova quantidade", "Biblioteca", JOptionPane.ERROR_MESSAGE);					
				}
			}while(!teste);			
			
			//Inicializando o vetor
			emprestimos = new Livro[tamanho];
			
			contador=0; //Vari�vel de controle do while
			
			do//Solicitar os livros para empr�stimo(poder�o ser mais que 1)				
			{		
				//Usaremos a mesma vari�vel c�digo para realizar a solicita��o do livro
				teste = false;
				lista = retornarLivros(livros);
				codigo = Integer.parseInt(JOptionPane.showInputDialog(lista + "\nInforme o c�digo do livro"));//Receber o c�digo do livro do usu�rio			
				for(int i = 0;i< livros.length;i++)
				{
					if(livros[i] != null && livros[i].getCodigo() == codigo)	//Verificar se possui livro com o c�digo fornecido					
					{
						teste=true;
						if(livros[i].isDisponivel())
						{
							for(int j =0; j < emprestimos.length;j++) //Colocar o livro no array de empr�stimos
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
							JOptionPane.showMessageDialog(null, "Livro indispon�vel", "Biblioteca", JOptionPane.ERROR_MESSAGE);
						}
					}					
				}
				if(!teste)
				{
					JOptionPane.showMessageDialog(null, "C�digo inv�lido ", "Biblioteca", JOptionPane.ERROR_MESSAGE);
				}
			}while(contador != tamanho);			
			
			//Atribuindo array de emprestimos a loca��o
			
			locacao.setLivros(emprestimos);
			
			
			//Recebimento da da de loca��o e da data de devolu��o do livro
			//Declara��o das vari�veis de data
			
			LocalDateTime relogio = LocalDateTime.now();
			
			Data dataLocacao = new Data();			
			dataLocacao.setDia(relogio.getDayOfMonth());
			dataLocacao.setMes(relogio.getMonthValue());
			dataLocacao.setAno(relogio.getYear());
			
			//Formatador de Data e Hora
			
			DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			
			//Atribuindo a data de loca��o
			locacao.setDataLocacao(dataLocacao);
			
			Data dataDevolucao = new Data();
			
			String data; //Vari�vel de recebimento de valor data
			
			teste = false;//Controle de recebimento de data			
			LocalDateTime dataInformada;
			
			do
			{
				data = JOptionPane.showInputDialog("Informe a data de devolu��o com dia mes e ano separados por /");
				String vetor[] = data.split("/"); //Receber a data de uma �nica vez e quebra-l� em 3 partes		
				if(vetor.length == 3)//Verificar se algum algarismo n�o foi recebido
				{
					dataInformada = LocalDateTime.parse(vetor[2] + "-" + vetor[1] + "-"+ vetor[0] + " 00:00",formatador);
					if(dataInformada.isAfter(relogio))
					{						
						dataDevolucao.setDia(Integer.parseInt(vetor[0]));
						dataDevolucao.setMes(Integer.parseInt(vetor[1]));
						dataDevolucao.setAno(Integer.parseInt(vetor[2]));
						teste = !teste; //Atribui��o por nega��o
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Data Inv�lida","Biblioteca", JOptionPane.ERROR_MESSAGE);
					}
				}
			}while(!teste); //Teste por nega��o
			
			//Atribuindo as datas a loca��o
			
			
			locacao.setDataDevolucao(dataDevolucao);			

			//Retornando livro para cadastro
			return locacao;
		}
		
		//M�todo para efetuar uma devolu��o de livro na biblioteca
		
		public void devolucaoLivro()
		{
			//Recebimento de c�digo do empr�stimo a devolver os livros
			
			String mensagem = retornarUsuariosComEmprestimos(locacoes);			
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(mensagem + "\nInforme o c�digo do usu�rio a realizar devolu��o"));
			int posicao=0;
			boolean teste = false;//Vari�vel de controle para localiza��o de informa��es			
			//Verificar se existe empr�stimo com o c�digo informado
			for(int i = 0;i< locacoes.length;i++)
			{
				if(locacoes[i] != null && locacoes[i].getCodigo() == codigo)
				{
					teste = true;
					posicao = i;
				}
			}
			
			if(teste)//SE houver empr�stimo no nome do usu�rio fornecido, varrer array de empr�stimo fazendo a exclus�o das loca��es
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
				
				//Informando ao usu�rio que as devolu��es foram realizadas
				
				/*Nota: N�o h� valida��o de atraso no empr�stimo*/
				JOptionPane.showMessageDialog(null, "Devolu��es efetuadas com sucesso", "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				//Caso n�o haja empr�stimo com o c�digo informado, avisar ao usu�rio
				JOptionPane.showMessageDialog(null, "N�o h� empr�stimo vinculado ao usu�rio solicitado", "Biblioteca", JOptionPane.WARNING_MESSAGE);
			}
			
		}
		
		//M�todo para listar os livros da biblioteca
		
		public void listarLivros()
		{
			//Vari�veis auxiliares para exibir os livros cadastrados na biblioteca para o usu�rio
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
			
			if(teste)//Se houver livros, imprimir livros, sen�o, emitir alerta
			{
				JOptionPane.showMessageDialog(null, mensagem, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "N�o h� livros cadastrados no momento", "Biblioteca", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		//M�todo para listar livros para cadastro
		
		public String listaLivrosCadastro(Livro livro[])
		{
			//Vari�veis auxiliares para exibir os livros cadastrados na biblioteca para o usu�rio
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
		
		//M�todo para listar usu�rios para cadastro
		
		public String listaUsuariosCadastro(Usuario usuario[])
		{
			//Vari�veis auxiliares para exibir os livros cadastrados na biblioteca para o usu�rio
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
		
		
		
		//M�todo para listar os usu�rios da biblioteca
		
		public void listarUsuarios()
		{
			//Vari�veis auxiliares para exibir os usu�rios cadastrados na biblioteca para o usu�rio
			String mensagem = "";
			boolean teste = false;
			
			//Varrendo a biblioteca para verificar se existe usu�rios cadastrados
			for(int i=0;i<usuarios.length;i++)
			{//inicio do for
				if(usuarios[i] != null)
				{
					mensagem += usuarios[i].toString() + "\n";
					teste = true;
				}
			}//fim do for
			
			if(teste)//Se houver usu�rios, imprimir usu�rios, sen�o, emitir alerta
			{
				JOptionPane.showMessageDialog(null, mensagem, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "N�o h� usu�rios cadastrados no momento", "Biblioteca", JOptionPane.WARNING_MESSAGE);
			}
		}		
		
		//M�todo para pesquisar os livros da biblioteca pelo atributo Editora
		
		public void pesquisarLivrosPorEditora()
		{
			// Recebendo do usu�rio qual a editora a ser pesquisada
			String editora = JOptionPane.showInputDialog("Informe a editora para pesquisa");

			// Vari�vel auxiliar para exibir a mensagem do resultado pesquisado
			String mensagem = "";

			// Vari�vel auxiliar para verificar se existe o autor cadastrado
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
			if (existe) //Se existir, exibir os resgistros, sen�o exibir alerta
			{
				JOptionPane.showMessageDialog(null, "Pesquisar por Editora: \n\n"  + mensagem, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "N�o existe livro cadastrado com a editora informada", "Biblioteca",JOptionPane.WARNING_MESSAGE);
			}
		}
		
		//M�todo para pesquisar os livros da biblioteca pela atributo Autor
		
		public void pesquisarLivrosPorAutor()
		{
			// Recebendo do usu�rio qual o autor a ser pesquisado
			String autor = JOptionPane.showInputDialog("Informe o autor para pesquisa");

			// Vari�vel auxiliar para exibir a mensagem do resultado pesquisado
			String mensagem = "";

			// Vari�vel auxiliar para verificar se existe o autor cadastrado
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
			if (existe) //Se existir, exibir os registros, sen�o exibir alerta
			{
				JOptionPane.showMessageDialog(null, "Pesquisar por Autor: \n\n" + mensagem, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "N�o existe livro cadastrado com o autor informado", "Biblioteca",JOptionPane.WARNING_MESSAGE);
			}
		}
		
		//M�todo para pesquisar as loca��es efetuadas na biblioteca filtradas por data
		
		public void pesquisarLocacoesPorData()
		{
			
			
			//Array contendo oop��es de escolha do usu�rio
			String[] opcoes = {"Por data de loca��o", "Por data de devolu��o","Todas as loca��es"};
			
			//Recebimento de data por meio de String
			String data;
			Data dataPesquisa = new Data();
			String mensagem = "";
			boolean teste = false;
			
			//Vari�vel para receber a op��o de escolha do usu�rio
			
			int x = JOptionPane.showOptionDialog(null, "De qual modo deseja efetuar a pesquisa?", "Biblioteca", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			//Se usu�rio escolher a op��o "Por data de loca��o"
			if(x == 0)
			{
				do
				{
					data = JOptionPane.showInputDialog("Informe a data de loca��o com dia mes e ano separados por /");
					String vetor[] = data.split("/"); //Receber a data de uma �nica vez e quebra-l� em 3 partes				
					if(vetor.length == 3)//Verificar se algum algarismo n�o foi recebido
					{
						dataPesquisa.setDia(Integer.parseInt(vetor[0]));
						dataPesquisa.setMes(Integer.parseInt(vetor[1]));
						dataPesquisa.setAno(Integer.parseInt(vetor[2]));
						teste = !teste; //Atribui��o por nega��o
					}			
					teste = true;
				}while(!teste); //Teste por nega��o				
					
				teste = false;
					
				//Tendo a data j� convertida, efetuar a busca pr�priamente dita
					
				for(int i = 0;i<locacoes.length;i++)
				{
					//Concatenar os dados de todos empr�stimos efetuados com a condi��o de loca��o igual a data informada
					if(locacoes[i] != null && locacoes[i].getDataLocacao().toString().equals(dataPesquisa.toString()))
					{
						
						mensagem += "C�digo              : " + locacoes[i].getCodigo() +
								    "\nUsu�rio           : " + locacoes[i].getUsuario().getNome() +
								    "\nData de Loca��o   : " + locacoes[i].getDataLocacao().toString() +
								    "\nData de Devolu��o : " + locacoes[i].getDataDevolucao().toString()+ 
								    "\n         Livros    \n" + retornarLivrosEmprestados(locacoes[i].getLivros());
						teste = true;
					}
				}			
					
				//Se houver um empr�stimo na data selecionada, exibir resultado. Sen�o, exibir alerta 
				if(teste)
				{
					JOptionPane.showMessageDialog(null, mensagem, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "N�o existem empr�stimos na data informada", "Biblioteca",JOptionPane.WARNING_MESSAGE);
				}
			}
			//Se usu�rio escolher a op��o "Por data de devolu��o"
			else if(x == 1)
			{
				do
				{
					data = JOptionPane.showInputDialog("Informe a data de devolu��o com dia mes e ano separados por /");
					String vetor[] = data.split("/"); //Receber a data de uma �nica vez e quebra-l� em 3 partes				
					if(vetor.length == 3)//Verificar se algum algarismo n�o foi recebido
					{
						dataPesquisa.setDia(Integer.parseInt(vetor[0]));
						dataPesquisa.setMes(Integer.parseInt(vetor[1]));
						dataPesquisa.setAno(Integer.parseInt(vetor[2]));
						teste = !teste; //Atribui��o por nega��o
					}			
					teste = true;
				}while(!teste); //Teste por nega��o						
			
				teste = false;
				
				//Tendo a data j� convertida, efetuar a busca pr�priamente dita
				
				for(int i = 0;i<locacoes.length;i++)
				{//inicio do for
					//Concatenar os dados de todos empr�stimos efetuados com a condi��o de devolu��o igual a data informada
					if(locacoes[i] != null && locacoes[i].getDataDevolucao().toString().equals(dataPesquisa.toString()))
					{
						mensagem +=  "C�digo              : " + locacoes[i].getCodigo() +
								     "\nUsu�rio           : " + locacoes[i].getUsuario().getNome() +
								     "\nData de Loca��o   : " + locacoes[i].getDataLocacao().toString() +
								     "\nData de Devolu��o : " + locacoes[i].getDataDevolucao().toString()+
								     "\n         Livros    \n" + retornarLivrosEmprestados(locacoes[i].getLivros());								
						teste = true;
					}
				}//fim do for
				
				//Se houver um empr�stimo na data selecionada, exibir resultado. Sen�o, exibir alerta 
				if(teste)
				{
					JOptionPane.showMessageDialog(null, mensagem, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "N�o existem empr�stimo na data informada", "Biblioteca",JOptionPane.WARNING_MESSAGE);
				}
			}
			//Se usu�rio escolher a op��o "Todas as loca��es"
			else
			{
				for(int i = 0;i<locacoes.length;i++)
				{//inicio do for
					//Concatenar os dados de todos empr�stimos efetuados
					if(locacoes[i] != null)
					{
						mensagem +=  "C�digo              : " + locacoes[i].getCodigo() +
								     "\nUsu�rio           : " + locacoes[i].getUsuario().getNome() +
								     "\nData de Loca��o   : " + locacoes[i].getDataLocacao().toString() +
								     "\nData de Devolu��o : " + locacoes[i].getDataDevolucao().toString()+ 
									 "\n         Livros    \n" + retornarLivrosEmprestados(locacoes[i].getLivros());
						teste = true;
					}
				}//fim do for
				
				//Se houver um empr�stimo pelo menos, exibir resultado. Sen�o, exibir alerta 
				if(teste)
				{
					JOptionPane.showMessageDialog(null, mensagem, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "N�o existe empr�stimos efetuados", "Biblioteca",JOptionPane.WARNING_MESSAGE);					
				}
			}		
		}	
		
		
		//M�todo para retornar mensagem contendo todos os usu�rios do array solicitado
		
		public String retornarUsuarios(Usuario usuario[])
		{
			//Declara��o de vari�vel que conter� a lista
			String mensagem = "Lista de Usu�rios\n";
			//Varrer o array e procurar todos os usu�rios
			for(int i =0;i<usuario.length;i++)
			{//inicio do for
				//Concatenar os dados dos usu�rios
				if(usuario[i] != null)
				{
					mensagem +=   "C�digo :" +  usuario[i].getCodigo() +
						    	"\nNome   :" + usuario[i].getNome() + "\n-----------\n";
				}
			}//fim do for
			return mensagem;
		}
		
		//M�todo para retornar mensagem contendo todos os livros do array informado
		
		public String retornarLivros(Livro livro[])
		{
			//Declara��o de vari�vel que conter� a lista de livros
			String mensagem = "Lista de Livros\n";
			//Varrer o array e procurar todos os livros dispon�veis
			for(int i =0;i<livro.length;i++)
			{//inicio do for
				//Como esta listagem ser� usada para mostrar os livros dispon�veis para empr�stimo, ser� filtrado por disponibilidade
				if(livro[i] != null && livro[i].isDisponivel())
				{
					//Concatenar os dados dos livros
					mensagem +=   "C�digo : " +  livro[i].getCodigo() +
						    	"\nT�tulo : " + livro[i].getTitulo() + "\n-----------\n";
				}
			}//fim do for
			return mensagem;
		}
		
		//M�todo para retornar mensagem contendo todos os autores do array informado
		
		public String retornarAutor(Livro livro[])
		{
			//Declara��o de vari�vel que conter� a lista de autores		
			String mensagem = "Lista de Autores cadastrados\n";	
			
			for(int i =0;i<livro.length;i++)
			{//inicio do for
				//Concatenar os dados dos autores
				if(livro[i] != null)
				{
					mensagem += "C�digo  : " +  livro[i].getAutor().getCodigo() +
						    	"\nAutor : " + livro[i].getAutor().getNome() + "\n-----------\n";					
				}
			}//fim do for
			return mensagem;
		}
		
		public String retornarEditora(Livro livro[])
		{		
			//Declara��o de vari�vel que conter� a lista de editoras
			String mensagem = "Lista de Editoras cadastradas\n";
			for(int i =0;i<livro.length;i++)
			{//inicio do for
				if(livro[i] != null)
				{ //Concatenar os dados das editoras
					mensagem += "C�digo  : " +  livro[i].getEditora().getCodigo() +
						   	  "\nEditora : " + livro[i].getEditora().getNome() + "\n-----------\n";					
				}
			}//fim do for
			return mensagem;
		}		
		
		//M�todo para retornar livros emprestar por usu�rio
		public String retornarLivrosEmprestados(Livro livro[])
		{
			//Declara��o de vari�vel que receber� a mensagem
			
			String mensagem= "";			
			for(int i = 0;i<livro.length;i++)
			{
				mensagem +=   "C�digo             : " + livro[i].getCodigo() +
						    "\nT�tulo             : " + livro[i].getTitulo() + "\n-----------\n";
			}
			return mensagem;
		}
		
		//M�todo para retornar usu�rios com empr�stimos realizados
		public String retornarUsuariosComEmprestimos(Locacao locacao[])		
		{
			String mensagem = "";
			for(int i =0; i < locacao.length;i++)
			{
				mensagem += "C�digo          : " + locacao[i].getUsuario().getCodigo() +
						  "\nUsu�rio         : " + locacao[i].getUsuario().getNome() +
						  "\nData de Entrega : " + locacao[i].getDataDevolucao().toString() + "\n-----------\n";
			}
			return mensagem;
		}
		
		
		//M�todo para sair do sistema
		
		public void sairDoSistema()
		{
			//Efetuar o questionamento ao usu�rio, se responder sim, executar a opera��o
			if(JOptionPane.showConfirmDialog(null, "Deseja sair?","Biblioteca", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			{
				System.exit(0); //Comando de quebra de execu��o
			}
		}
}
