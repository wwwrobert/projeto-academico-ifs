package br.edu.ifs;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		ArrayList<Professor> listaProfessor = new ArrayList<Professor>();
		ArrayList<Psicologo> listaPsicologos = new ArrayList<Psicologo>();
		ArrayList<Pedagogo> listaPedagogo = new ArrayList<Pedagogo>();
		ArrayList<Tecnico> listaTecnico = new ArrayList<Tecnico>();
		ArrayList<Candidato> listaCandidatos = new ArrayList<Candidato>();
		ArrayList<Responsavel> listaResponsavel = new ArrayList<Responsavel>();
		ArrayList<Zelador> listaZelador = new ArrayList<Zelador>();
		ArrayList<Monitor> listaMonitores = new ArrayList<Monitor>();
		ArrayList<Secretaria> listaSecretaria = new ArrayList<Secretaria>();

		String nome;
		String dataNasc;
		String locDeNasc;
		String cpf;
		char sexo;
		String formacao;

		Scanner scanner = new Scanner(System.in);
		int escolha;

		Menu menu = new Menu();

		System.out.print(menu.getMenu());
		escolha = scanner.nextInt();
		System.out.println(" ");

		while (escolha != 0) {
			switch (escolha) {
				case 1:
					System.out.println("==================");
					System.out.println("| CADASTRO ALUNO |");
					System.out.println("==================");
					System.out.println(" ");

					System.out.println("Digite o CPF:");
					cpf = scanner.next();

					Aluno aluno = new Aluno(cpf);

					System.out.println("Digite o nome do aluno:");
					nome = scanner.next();
					aluno.setNome(nome);

					System.out.println("Digite a data de nascimento:");
					dataNasc = scanner.next();
					aluno.setDataNascimento(dataNasc);

					System.out.println("Digite o local de nascimento:");
					locDeNasc = scanner.next();
					aluno.setLocalNascimento(locDeNasc);

					System.out.println("Digite o sexo do aluno:");
					sexo = scanner.next().charAt(0);
					aluno.setSexo(sexo);

					System.out.println("Digite a primeira nota do aluno: ");
					double nota1 = scanner.nextDouble();
					aluno.setNota1(nota1);

					System.out.println("Digite a segunda nota do aluno: ");
					double nota2 = scanner.nextDouble();
					aluno.setNota2(nota2);

					listaAlunos.add(aluno);

					break;
				case 2:
					System.out.println("================");
					System.out.println("| LISTAR ALUNO |");
					System.out.println("================");
					System.out.println(" ");

					System.out.println(listaAlunos);
					break;
				case 3:
					System.out.println("======================");
					System.out.println("| CADASTRO PROFESSOR |");
					System.out.println("======================");
					System.out.println(" ");

					System.out.println("Digite o CPF:");
					cpf = scanner.next();

					System.out.println("Digite a formação do professor: ");
					formacao = scanner.next();

					Professor professor = new Professor(cpf, formacao);

					System.out.println("Digite o nome do professor:");
					nome = scanner.next();
					professor.setNome(nome);

					System.out.println("Digite a data de nascimento:");
					dataNasc = scanner.next();
					professor.setDataNascimento(dataNasc);

					System.out.println("Digite o local de nascimento: ");
					locDeNasc = scanner.next();
					professor.setLocalNascimento(locDeNasc);

					System.out.println("Digite o sexo do professor:");
					sexo = scanner.next().charAt(0);
					professor.setSexo(sexo);

					System.out.println("Digite a quantidade de disciplinas: ");
					int disciplinas = scanner.nextInt();
					professor.setQuantDisciplinas(disciplinas);

					System.out.println("Digite o tempo de serviço: ");
					double tempoServico = scanner.nextDouble();
					professor.setTempoServico(tempoServico);

					listaProfessor.add(professor);
					break;
				case 4:
					System.out.println("====================");
					System.out.println("| LISTAR PROFESSOR |");
					System.out.println("====================");
					System.out.println(" ");

					System.out.println(listaProfessor);
					break;
				case 5:
					System.out.println("======================");
					System.out.println("| CADASTRO PSICOLÓGO |");
					System.out.println("======================");
					System.out.println(" ");

					System.out.println("Digite o CPF:");
					cpf = scanner.next();

					Psicologo psicologo = new Psicologo(cpf);

					System.out.println("Digite o nome do psicólogo: ");
					nome = scanner.next();
					psicologo.setNome(nome);

					System.out.println("Digite a data de nascimento:");
					dataNasc = scanner.next();
					psicologo.setDataNascimento(dataNasc);

					System.out.println("Digite o local de nascimento: ");
					locDeNasc = scanner.next();
					psicologo.setLocalNascimento(locDeNasc);

					System.out.println("Digite o sexo do psicólogo:");
					sexo = scanner.next().charAt(0);
					psicologo.setSexo(sexo);

					System.out.println("Digite a especialidade do psicólogo:");
					String especialidade = scanner.next();
					psicologo.setEspecialidade(especialidade);

					System.out.println("Digite o CRP do psicólogo:");
					int crp = scanner.nextInt();
					psicologo.setCrp(crp);

					listaPsicologos.add(psicologo);

					break;
				case 6:
					System.out.println("====================");
					System.out.println("| LISTAR PSICÓLOGO |");
					System.out.println("====================");
					System.out.println(" ");

					System.out.println(listaPsicologos);
					break;
				case 7:
					System.out.println("======================");
					System.out.println("| CADASTRAR PEDAGOGO |");
					System.out.println("======================");
					System.out.println(" ");

					System.out.println("Digite o CPF:");
					cpf = scanner.next();

					Pedagogo pedagogo = new Pedagogo(cpf);

					System.out.println("Digite o nome do pedagogo: ");
					nome = scanner.next();
					pedagogo.setNome(nome);

					System.out.println("Digite a data de nascimento:");
					dataNasc = scanner.next();
					pedagogo.setDataNascimento(dataNasc);

					System.out.println("Digite o local de nascimento: ");
					locDeNasc = scanner.next();
					pedagogo.setLocalNascimento(locDeNasc);

					System.out.println("Digite o sexo do pedagogo:");
					sexo = scanner.next().charAt(0);
					pedagogo.setSexo(sexo);

					System.out.println("Informe o Registro do pedagogo:");
					int registro = scanner.nextInt();
					pedagogo.setRegistro(registro);

					listaPedagogo.add(pedagogo);

					break;
				case 8:
					System.out.println("===================");
					System.out.println("| LISTAR PEDAGOGO |");
					System.out.println("===================");
					System.out.println(" ");

					System.out.println(listaPedagogo);
					break;
				case 9:
					System.out.println("====================");
					System.out.println("| CADASTRO TECNICO |");
					System.out.println("====================");
					System.out.println(" ");

					System.out.println("Digite o CPF:");
					cpf = scanner.next();

					Tecnico tecnico = new Tecnico(cpf);

					System.out.println("Digite o nome do técnico: ");
					nome = scanner.next();
					tecnico.setNome(nome);

					System.out.println("Digite a data de nascimento:");
					dataNasc = scanner.next();
					tecnico.setDataNascimento(dataNasc);

					System.out.println("Digite o local de nascimento: ");
					locDeNasc = scanner.next();
					tecnico.setLocalNascimento(locDeNasc);

					System.out.println("Digite o sexo do técnico:");
					sexo = scanner.next().charAt(0);
					tecnico.setSexo(sexo);

					System.out.println("Digite a função do técnico:");
					String funcao = scanner.next();
					tecnico.setFuncao(funcao);

					System.out.println("Qual o cargo do técnico:");
					String cargo = scanner.next();
					tecnico.setCargo(cargo);

					System.out.println("Qual o ano de entrada do técnico:");
					String anoEntrada = scanner.next();
					tecnico.setAnoDeEntrada(anoEntrada);

					listaTecnico.add(tecnico);
					break;
				case 10:
					System.out.println("==================");
					System.out.println("| LISTAR TECNICO |");
					System.out.println("==================");
					System.out.println(" ");

					System.out.println(listaTecnico);
					break;
				case 11:
					System.out.println("======================");
					System.out.println("| CADASTRO CANDIDATO |");
					System.out.println("======================");
					System.out.println(" ");

                    System.out.println("Digite o CPF:");
					cpf = scanner.next();

					Candidato candidato = new Candidato(cpf);

					System.out.println("Digite o nome do candidato: ");
					nome = scanner.next();
					candidato.setNome(nome);

					System.out.println("Digite a data de nascimento:");
					dataNasc = scanner.next();
					candidato.setDataNascimento(dataNasc);

					System.out.println("Digite o local de nascimento: ");
					locDeNasc = scanner.next();
					candidato.setLocalNascimento(locDeNasc);

					System.out.println("Digite o sexo do candidato:");
					sexo = scanner.next().charAt(0);
					candidato.setSexo(sexo);

					System.out.println("Digite a data do concurso:");
					String dataConcurso = scanner.next();
					candidato.setDataConcurso(dataConcurso);

					System.out.println("Digite o código da vaga:");
					int codigoVaga = scanner.nextInt();
					candidato.setCodigoVaga(codigoVaga);

					System.out.println("Digite a pontuação:");
					int pontuacao = scanner.nextInt();
					candidato.setPontuacao(pontuacao);

					listaCandidatos.add(candidato);
					break;
				case 12:
					System.out.println("====================");
					System.out.println("| LISTAR CANDIDATO |");
					System.out.println("====================");
					System.out.println(" ");

					System.out.println(listaCandidatos);
					break;
				case 13:
					System.out.println("========================");
					System.out.println("| CADASTRO RESPONSÁVEL |");
					System.out.println("========================");
					System.out.println(" ");

					System.out.println("Digite o CPF:");
					cpf = scanner.next();

					Responsavel responsavel = new Responsavel(cpf);

					System.out.println("Digite o nome do responsável: ");
					nome = scanner.next();
					responsavel.setNome(nome);

					System.out.println("Digite a data de nascimento:");
					dataNasc = scanner.next();
					responsavel.setDataNascimento(dataNasc);

					System.out.println("Digite o local de nascimento: ");
					locDeNasc = scanner.next();
					responsavel.setLocalNascimento(locDeNasc);

					System.out.println("Digite o sexo do responsável:");
					sexo = scanner.next().charAt(0);
					responsavel.setSexo(sexo);

					System.out.println("Digite o parentesco do responsável:");
					String parentesco = scanner.next();
					responsavel.setParentesco(parentesco);

					System.out.println("Digite a renda do responsável:");
					double renda = scanner.nextDouble();
					responsavel.setRenda(renda);

					listaResponsavel.add(responsavel);
					break;
				case 14:
					System.out.println("======================");
					System.out.println("| LISTAR RESPONSÁVEL |");
					System.out.println("======================");
					System.out.println(" ");

					System.out.println(listaResponsavel);
					break;
				case 15:
					System.out.println("====================");
					System.out.println("| CADASTRO ZELADOR |");
					System.out.println("====================");
					System.out.println(" ");

					System.out.println("Digite o CPF:");
					cpf = scanner.next();

					Zelador zelador = new Zelador(cpf);

					System.out.println("Digite o nome do zelador: ");
					nome = scanner.next();
					zelador.setNome(nome);

					System.out.println("Digite a data de nascimento:");
					dataNasc = scanner.next();
					zelador.setDataNascimento(dataNasc);

					System.out.println("Digite o local de nascimento: ");
					locDeNasc = scanner.next();
					zelador.setLocalNascimento(locDeNasc);

					System.out.println("Digite o sexo do zelador:");
					sexo = scanner.next().charAt(0);
					zelador.setSexo(sexo);

					System.out.println("Digite o setor do zelador: ");
					String setorResponsavel = scanner.next();
					zelador.setSetorResponsavel(setorResponsavel);

					System.out.println("O zelador possui chave? (Digite 'true' se sim, 'false' se não): ");
					boolean possuiChave = scanner.nextBoolean();
					zelador.setPossuiChave(possuiChave);

					listaZelador.add(zelador);
					break;
				case 16:
					System.out.println("==================");
					System.out.println("| LISTAR ZELADOR |");
					System.out.println("==================");
					System.out.println(" ");

					System.out.println(listaZelador);
					break;
				case 17:
					System.out.println("====================");
					System.out.println("| CADASTRO MONITOR |");
					System.out.println("====================");
					System.out.println(" ");

					System.out.println("Digite o CPF:");
					cpf = scanner.next();

					System.out.println("Digite a formação do monitor: ");
					formacao = scanner.next();
				
					Monitor monitor = new Monitor(cpf, formacao);

					System.out.println("Digite o nome do monitor: ");
					nome = scanner.next();
					monitor.setNome(nome);

					System.out.println("Digite a data de nascimento:");
					dataNasc = scanner.next();
					monitor.setDataNascimento(dataNasc);

					System.out.println("Digite o local de nascimento: ");
					locDeNasc = scanner.next();
					monitor.setLocalNascimento(locDeNasc);

					System.out.println("Digite o sexo do monitor:");
					sexo = scanner.next().charAt(0);
					monitor.setSexo(sexo);

					System.out.println("Digite o salário do monitor: ");
					double salario = scanner.nextDouble();
					monitor.setSalario(salario);

					System.out.println("Digite o período do monitor: ");
					String periodo = scanner.next();
					monitor.setPeriodo(periodo);

					System.out.println("Digite a disciplina do monitor: ");
					String disciplina = scanner.next();
					monitor.setDisciplina(disciplina);

					listaMonitores.add(monitor);
					break;
				case 18:
					System.out.println("==================");
					System.out.println("| LISTAR MONITOR |");
					System.out.println("==================");
					System.out.println(" ");

					System.out.println(listaMonitores);
					break;
				case 19:
					System.out.println("=======================");
					System.out.println("| CADASTRO SECRETÁRIA |");
					System.out.println("=======================");
					System.out.println(" ");

					System.out.println("Digite o CPF:");
					cpf = scanner.next();

					Secretaria secretaria = new Secretaria(cpf);

					System.out.println("Digite o nome da secretária: ");
					nome = scanner.next();
					secretaria.setNome(nome);

					System.out.println("Digite a data de nascimento:");
					dataNasc = scanner.next();
					secretaria.setDataNascimento(dataNasc);

					System.out.println("Digite o local de nascimento: ");
					locDeNasc = scanner.next();
					secretaria.setLocalNascimento(locDeNasc);

					System.out.println("Digite o sexo da secretária:");
					sexo = scanner.next().charAt(0);
					secretaria.setSexo(sexo);

					System.out.println("Digite o número do ramal:");
					int ramal = scanner.nextInt();
					secretaria.setRamal(ramal);

					System.out.println("Digite a função da secretária:");
					String funcaoS = scanner.next();
					secretaria.setFuncaoS(funcaoS);

					System.out.println("Digite o turno da secretária:");
					String turno = scanner.next();
					secretaria.setTurno(turno);

					System.out.println("Digite o departamento da secretária:");
					String departamento = scanner.next();
					secretaria.setDepartamento(departamento);

					listaSecretaria.add(secretaria);
					break;

				case 20:
					System.out.println("===================");
					System.out.println("| LISTAR SECRETÁRIA |");
					System.out.println("===================");
					System.out.println(" ");

					System.out.println(listaSecretaria);
					break;
			}

			System.out.print(menu.getMenu());
			escolha = scanner.nextInt();
			System.out.println(" ");

			if (escolha == 0) {
				System.out.println("Saindo...");
			}
		}
		scanner.close();

	}

}