package com.viagem.gabriel;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Voo {
	public int voo[];
	public String origem[];
	public String destino[];
	public int lugares[];
	public String dadosVoo;

	public Voo(){
		voo = new int[3];
		origem = new String[3];
		destino = new String[3];
		lugares = new int [3];
		
		voo[0] =1;
		origem[0] = "BHTE";
		destino[0]= "São Paulo";
		lugares[0] = 20;
		dadosVoo = dadosVoo + "\n" + voo[0] + "\t" + origem[0] + "\t" + destino[0] + "\t" + lugares[0];
		
		voo[1] =2;
		origem[1] = "São Paulo";
		destino[1]= "Curitiba";
		lugares[1] = 25;
		dadosVoo = dadosVoo + "\n" + voo[1] + "\t" + origem[1] + "\t" + destino[1] + "\t" + lugares[1];
		
		voo[2] =3;
		origem[2] = "Curitiba";
		destino[2]= "Joinville";
		lugares[2] = 15;
		dadosVoo = dadosVoo + "\n" + voo[2] + "\t" + origem[2] + "\t" + destino[2] + "\t" + lugares[2];
		
	}
	
	public void mostrarDadosIniciaisVoo(){
		
		JTextArea saida = new JTextArea(10,40);
		saida.setText("Nro\tOrigem\tDestino\tPassageiros");
		saida.append(dadosVoo);
		JScrollPane scroll = new JScrollPane(saida);
		JOptionPane.showMessageDialog(null, scroll, "Dados dos vôos: ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public boolean verificaVooOrigem(String sopcao){
		for(int i=0; i<=2; i++){
			if (origem[i].equalsIgnoreCase(sopcao)){
				return true;
			}
		}
		return false;
		
	}
	
	public boolean verificaVooDestino(String sopcao){
		for(int i=0; i<=2; i++){
			if (destino[i].equalsIgnoreCase(sopcao)){
				return true;
			}
		}
		return false;
		
	}
	
	public void resultadoConsultaVoo(int i){
		String resultado = "Vôo: " +voo[i] + "\n" + "Origem: "
				+ origem[i] + "\n" + "Destino: " + destino[i]
				+ "\n" + "Lugares: " + lugares[i];
		
		JOptionPane.showMessageDialog(null, resultado);
		
	}
}
