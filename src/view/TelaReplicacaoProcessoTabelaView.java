package view;

import database.model.TB_REPLICACAO_DIRECAO;

import javax.swing.*;

public class TelaReplicacaoProcessoTabelaView extends JFrame {

    private JTextField txfId;
    private JComboBox<TB_REPLICACAO_DIRECAO> cbProcesso;
    private JTextField txfTabelaOrigem;
    private JTextField txfTabelaDestino;
    private JTextField txfOrdem;
    private JCheckBox chkHabilitado;
    private JTextArea txtWhere;

    private JButton btnSalvar;
    private JButton btnAdicionar;
    private JButton btnBuscar;
    private JButton btnExcluir;

    public TelaReplicacaoProcessoTabelaView() {
        setTitle("Cadastro de Tabelas");
        setSize(720, 420);
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

        JLabel lblTabelaOrigem = new JLabel("Tabela origem:");
        lblTabelaOrigem.setBounds(10, 140, 140, 25);
        panel.add(lblTabelaOrigem);

        txfTabelaOrigem = new JTextField();
        txfTabelaOrigem.setBounds(160, 140, 520, 25);
        panel.add(txfTabelaOrigem);

        JLabel lblTabelaDestino = new JLabel("Tabela destino:");
        lblTabelaDestino.setBounds(10, 175, 140, 25);
        panel.add(lblTabelaDestino);

        txfTabelaDestino = new JTextField();
        txfTabelaDestino.setBounds(160, 175, 520, 25);
        panel.add(txfTabelaDestino);

        JLabel lblOrdem = new JLabel("Ordem:");
        lblOrdem.setBounds(10, 210, 140, 25);
        panel.add(lblOrdem);

        txfOrdem = new JTextField();
        txfOrdem.setBounds(160, 210, 520, 25);
        panel.add(txfOrdem);

        chkHabilitado = new JCheckBox("Habilitado");
        chkHabilitado.setBounds(160, 245, 140, 25);
        panel.add(chkHabilitado);

        JLabel lblWhere = new JLabel("Where:");
        lblWhere.setBounds(10, 280, 140, 25);
        panel.add(lblWhere);

        txtWhere = new JTextArea();
        txtWhere.setBounds(160, 280, 520, 80);
        panel.add(txtWhere);

        setContentPane(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaReplicacaoProcessoTabelaView().setVisible(true));
    }
}
