package br.ufpb.dcx.ayla.agenda.controller;

import br.ufpb.dcx.ayla.agenda.Agenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaRemoveController implements ActionListener {
    private Agenda agenda;
    private JFrame janelaPrincipal;

    public AgendaRemoveController(Agenda agenda, JFrame janela){
        this.agenda = agenda;
        this.janelaPrincipal = janela;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal,"Qual nome do aniversiante a remover ?");
        boolean removeu = agenda.removeContato(nome);
        if(removeu){
            JOptionPane.showMessageDialog(janelaPrincipal,"Aniversiante removido com sucesso");
        }else{
            JOptionPane.showMessageDialog(janelaPrincipal,"Aniversiante nao foi encontrado"+"Operacao nao realizada");
        }
    }
}
