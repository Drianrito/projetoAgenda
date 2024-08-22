package br.ufpb.dcx.ayla.agenda.gui;

import br.ufpb.dcx.ayla.agenda.Agenda;
import br.ufpb.dcx.ayla.agenda.AgendaAyla;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AgendaGUIV3 extends JFrame{
    JLabel linha1, linha2;
    ImageIcon boloIm = new ImageIcon("./imgs/icone.jpg");
    ImageIcon addImg = new ImageIcon("./imgs/icone.jpg");
    ImageIcon pesqImg = new ImageIcon("./imgs/icone.jpg");
    ImageIcon removeImg= new ImageIcon("./imgs/icone.jpg");
    JButton botaoAdicionar, botaoRemover, botaoPesquisar;
    Agenda agenda = new AgendaAyla();
    public AgendaGUIV3(){
        setTitle("Agenda de Aniversario");
        setSize(400, 800);
        setLocation(150,150);
        setResizable(true);
        getContentPane().setBackground(Color.WHITE);
        linha1 = new JLabel("Minha Agenda de Aniversario",JLabel.CENTER);
        linha1.setForeground(Color.BLACK);
        linha1.setFont(new Font("Serif",Font.BOLD,26));
        linha2 = new JLabel(boloIm,JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(3,1));
        getContentPane().add(linha1);
        getContentPane().add(linha2);

    }

    public static void main(String[] args) {
        JFrame janela = new AgendaGUI();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);
    }
}
