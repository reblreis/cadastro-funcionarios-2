package controllers;

import entities.Funcao;
import entities.Funcionario;
import entities.Setor;
import enums.TipoContratacao;
import helpers.InputHelper;
import repositories.FuncionarioRepository;

public class FuncionarioController {

	public void cadastrarFuncionario() {

		System.out.println("\n*** CADASTRO DE FUNCIONARIO ***\n");

		Funcionario funcionario = new Funcionario();
		Funcao funcao = new Funcao();
		Setor setor = new Setor();

		InputHelper inputHelper = new InputHelper();

		funcionario.setIdFuncionario(Integer.parseInt(inputHelper.inputData("ID DO FUNCIONÁRIO: ")));

		funcionario.setNome(inputHelper.inputData("NOME DO FUNCIONÁRIO: "));
		funcionario.setCpf(inputHelper.inputData("CPF DO FUNCIONÁRIO: "));
		funcionario.setMatricula(inputHelper.inputData("MATRICULA DO FUNCIONÁRIO: "));

		String opcao = inputHelper.inputData("TIPO DE CONTRATAÇÃO (C)CLT, (E)Estágio, (T)Terceirizado: ");

		switch (opcao) {

		case "C":
			funcionario.setTipoContratacao(TipoContratacao.CLT);
			break;

		case "E":
			funcionario.setTipoContratacao(TipoContratacao.ESTAGIO);
			break;

		case "T":
			funcionario.setTipoContratacao(TipoContratacao.TERCEIRIZADO);
			break;
		}

		funcionario.setFuncao(funcao);
		funcionario.setSetor(setor);

		try {
			FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarDados(funcionario);

			System.out.println("\nFUNCIONARIO CADASTRADO COM SUCESSO!");

		} catch (Exception e) {
			System.out.println("\nERRO: " + e.getMessage());
		}

		System.out.println("\nFIM!");
	}
}