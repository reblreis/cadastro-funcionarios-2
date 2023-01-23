package repositories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {

	// método para gravar os dados do profissional em um arquivo na máquina do
	// usuário

	public void exportarDados(Funcionario funcionario) throws Exception {

		// abrindo um arquivo para gravação
		PrintWriter printWriter = new PrintWriter(
				new FileOutputStream(new File("c:\\clientes\\funcionarios-cadastrados.txt"), true));

		printWriter.write("\nDADOS DO FUNCIONÁRIO: ");
		printWriter.write("\nID DO FUNCIONÁRIO...........: " + funcionario.getIdFuncionario());
		printWriter.write("\nNOME DO FUNCIONÁRIO.........: " + funcionario.getNome());
		printWriter.write("\nCPF DO FUNCIONÁRIO..........: " + funcionario.getCpf());
		printWriter.write("\nMATRICULA DO FUNCIONÁRIO....: " + funcionario.getMatricula());
		printWriter.write("\nID DA FUNÇAO:...............: " + funcionario.getFuncao().getIdFuncao());
		printWriter.write("\nSIGLA DA FUNÇÃO:............: " + funcionario.getFuncao().getSigla());
		printWriter.write("\nDESCRIÇÃO DA FUNÇÃO:........: " + funcionario.getFuncao().getDescricao());
		printWriter.write("\nID DO SETOR:................: " + funcionario.getSetor().getIdSetor());
		printWriter.write("\nNOME DO SETOR:..............: " + funcionario.getSetor().getNome());

		printWriter.flush();
		printWriter.close();
	}

}
