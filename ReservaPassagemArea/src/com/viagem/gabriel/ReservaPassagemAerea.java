
package com.viagem.gabriel;
import java.awt.JobAttributes;

import javax.swing.*;

public class ReservaPassagemAerea {

	static int opcao, opcao1, opcao2;
	static String sopcao;
	static int voo[];
	static String origem[];
	static String destino[];
	static int lugares[];
	static String dadosVoo= "";
	
	public static void main(String[] args) {
		
		Voo v = new Voo();

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja verificar dados?", "Confirmação do programa", 
				JOptionPane.YES_NO_OPTION);
		if(resposta == JOptionPane.YES_OPTION){
			v.mostrarDadosIniciaisVoo();
		}
		
		while(true){
			try{
				opcao1 = Integer.parseInt(
						JOptionPane.showInputDialog(menuPrincipal()));
			
				if(opcao1 == 1){
					while (true){
						try {
							opcao2 = Integer.parseInt(JOptionPane.showInputDialog(menuConsultarVoo()));
						if(opcao2 == 1){
							opcao = Integer.parseInt(JOptionPane.showInputDialog(
									"CONSULTAR VÔO POR NÚMERO DO VÔO\n\n" + "Informe o número do vôo"));
							if(opcao < 1 || opcao >3){
								JOptionPane.showMessageDialog(null, "Número do vôo Inexistente");
							}else {
								for(int i = 0; i<= 2; i++){
								if(v.voo[i] == (opcao)){
									v.resultadoConsultaVoo(i);
								}
							}
						}
						}
						
				if(opcao2 ==2){
					sopcao = JOptionPane.showInputDialog("CONSULTAR VÔO POR ORIGEM DO VÔO\n\n" + "Informe a origem");
					Boolean verOrigem = true;
					verOrigem = v.verificaVooOrigem(sopcao);
					if(verOrigem == false){
						JOptionPane.showMessageDialog(null, "Origem não cadastrada no programa. Verifique",
								"Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
					}else{
						for(int i = 0; i <= 2; i++){
							if(v.origem[i].equalsIgnoreCase(sopcao)){
								v.resultadoConsultaVoo(i);
							}
						}
					}
				}
						
				
				///////
				
				if(opcao2 ==3){
					sopcao = JOptionPane.showInputDialog("CONSULTAR VÔO POR DESTINO DO VÔO\n\n" + "Informe o destino");
					Boolean verDestino = true;
					verDestino = v.verificaVooDestino(sopcao);
					if(verDestino == false){
						JOptionPane.showMessageDialog(null, "Destino não cadastrado no programa. Verifique",
								"Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
					}else{
						for(int i = 0; i <= 2; i++){
							if(destino[i].equalsIgnoreCase(sopcao)){
								v.resultadoConsultaVoo(i);
							}
						}
					}
				}
				
				/////////
				
				if(opcao2 == 4){
					v.mostrarDadosIniciaisVoo();
				}
				
				if(opcao2 == 5){
					break;
				}
						}catch (Exception e){
							JOptionPane.showMessageDialog(null, "\nTecla cancelar foi acionada\nou um erro inesperado ocorreu. \nO programa será finalizado");
							break;
						}
						
					}
				}
				
				if(opcao1 == 2){
					JOptionPane.showMessageDialog(null, "OPÇÂO 2 - RESERVA \nOpção em desenvolvimento...");
				}
				
				if(opcao1 == 3){
					break;
				}
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "\n Tecla cancelar foi acionada\nouum erro inesperado ocorreu. \n O programa será finalizado");
				break;
			}
			
		}
		System.out.println("\n\nPROGRAMA FINALIZADO");
		
	}
	
	private static String menuConsultarVoo(){
		return "CONSULTAR VÔOS \n\n"+
				"1 - Por número do vôo\n"+
				"2 - Por origem\n"+
				"3 - Por destino \n"+
				"4 - Consulta Geral\n" +
				"5- Voltar\n\n";
	}
	
	private static String menuPrincipal(){
		return "OPÇÔES \n\n"+
				"1 - Consulta\n"+
				"2 - Reservar\n"+
				"3 - Finalizar\n\n";
	}

}

