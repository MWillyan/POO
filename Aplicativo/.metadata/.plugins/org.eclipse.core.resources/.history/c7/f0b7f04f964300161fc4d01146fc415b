package aplicativo.br;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritorDeArquivo {
	
	public void escreverNovoArquivo(String relatorio, ArrayList<String> linhas){

        System.out.println("|-----------------------------------------------|");
        System.out.println("|  Escrita do Arquivo :: "+relatorio);
        System.out.println("|  Cria um novo arquivo, caso não existir");
        System.out.println("|  Sobrescreve o arquivo, caso  existir");
        System.out.println("|-----------------------------------------------|");

        try{

            FileWriter fileWriter = new FileWriter(relatorio);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(String linha : linhas) {

                bufferedWriter.write(linha);
                bufferedWriter.newLine();

            }

            bufferedWriter.close();
            fileWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
