package view;

import javax.swing.*;
import java.awt.*;

public class TelaReplicacaoDirecaoView extends JFrame {

    private JTextField txfId;
    private JComboBox<String> cbProcesso;

    private JTextField txfOrigem;
    private JTextField txfDestino;
    private JTextField txfUsuarioOrigem;
    private JTextField txfUsuarioDestino;
    private JTextField txfSenhaOrigem;
    private JTextField txfSenhaDestino;
    private JCheckBox chkHabilitado;

    private JButton btnSalvar;
    private JButton btnAdicionar;
    private JButton btnBuscar;
    private JButton btnExcluir;

    public TelaReplicacaoDirecaoView() {
        setTitle("Cadastro de Tabelas");
        setSize(760, 470);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        btnBuscar = new JButton("BUSCAR");
        btnAdicionar = new JButton("ADICIONAR");
        btnSalvar = new JButton("SALVAR");
        btnExcluir = new JButton("EXCLUIR");

        btnBuscar.setBounds(10, 10, 130, 30);
        btnAdicionar.setBounds(150, 10, 130, 30);
        btnSalvar.setBounds(290, 10, 130, 30);
        btnExcluir.setBounds(430, 10, 130, 30);

        panel.add(btnBuscar);
        panel.add(btnAdicionar);
        panel.add(btnSalvar);
        panel.add(btnExcluir);

        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(10, 70, 140, 25);
        panel.add(lblId);

        txfId = new JTextField();
        txfId.setBounds(160, 70, 220, 25);
        panel.add(txfId);

        JLabel lblProcesso = new JLabel("Processo:");
        lblProcesso.setBounds(10, 105, 140, 25);
        panel.add(lblProcesso);

        cbProcesso = new JComboBox<>();
        cbProcesso.setBounds(160, 105, 520, 25);
        panel.add(cbProcesso);

        JLabel lblOrigem = new JLabel("Origem:");
        lblOrigem.setBounds(10, 150, 200, 25);
        lblOrigem.setFont(lblOrigem.getFont().deriveFont(Font.BOLD));
        panel.add(lblOrigem);

        JLabel lblDirecaoOrigem = new JLabel("DIRECAO_ORIGEM:");
        lblDirecaoOrigem.setBounds(10, 185, 140, 25);
        panel.add(lblDirecaoOrigem);

        txfOrigem = new JTextField();
        txfOrigem.setBounds(160, 185, 560, 25);
        panel.add(txfOrigem);

        JLabel lblUsuarioOrigem = new JLabel("USUARIO_ORIGEM:");
        lblUsuarioOrigem.setBounds(10, 220, 140, 25);
        panel.add(lblUsuarioOrigem);

        txfUsuarioOrigem = new JTextField();
        txfUsuarioOrigem.setBounds(160, 220, 560, 25);
        panel.add(txfUsuarioOrigem);

        JLabel lblSenhaOrigem = new JLabel("SENHA_ORIGEM:");
        lblSenhaOrigem.setBounds(10, 255, 140, 25);
        panel.add(lblSenhaOrigem);

        txfSenhaOrigem = new JTextField();
        txfSenhaOrigem.setBounds(160, 255, 560, 25);
        panel.add(txfSenhaOrigem);

        JLabel lblDestino = new JLabel("Destino:");
        lblDestino.setBounds(10, 300, 200, 25);
        lblDestino.setFont(lblDestino.getFont().deriveFont(Font.BOLD));
        panel.add(lblDestino);

        JLabel lblDirecaoDestino = new JLabel("DIRECAO_DESTINO:");
        lblDirecaoDestino.setBounds(10, 335, 140, 25);
        panel.add(lblDirecaoDestino);

        txfDestino = new JTextField();
        txfDestino.setBounds(160, 335, 560, 25);
        panel.add(txfDestino);

        JLabel lblUsuarioDestino = new JLabel("USUARIO_DESTINO:");
        lblUsuarioDestino.setBounds(10, 370, 140, 25);
        panel.add(lblUsuarioDestino);

        txfUsuarioDestino = new JTextField();
        txfUsuarioDestino.setBounds(160, 370, 280, 25);
        panel.add(txfUsuarioDestino);

        JLabel lblSenhaDestino = new JLabel("SENHA_DESTINO:");
        lblSenhaDestino.setBounds(450, 370, 280, 25);
        panel.add(lblSenhaDestino);

        txfSenhaDestino = new JTextField();
        txfSenhaDestino.setBounds(570, 370, 150, 25);
        panel.add(txfSenhaDestino);

        chkHabilitado = new JCheckBox("Habilitado");
        chkHabilitado.setBounds(10, 405, 140, 25);
        panel.add(chkHabilitado);

        setContentPane(panel);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaReplicacaoDirecaoView().setVisible(true));
    }
}
