package br.ufpb.dcx.ayla.agenda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

public class AgendaGUI extends JFrame {
    public AgendaGUI(){
        setTitle("Agenda de Aniversario");
        setSize(400,200);
        setLocation(150,150);
        setResizable(false);
        getContentPane().setBackground(Color.GREEN);
    }

    public static void main(String[] args) {
        JFrame janela = new AgendaGUI();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
        }
    }
}
