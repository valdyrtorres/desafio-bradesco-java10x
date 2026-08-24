package view;

import javax.swing.*;

public class TelaReplicacaoProcessoView extends JFrame {

    private JTextField txfId;
    private JTextField txfProcesso;
    private JTextField txfDescricao;
    private JCheckBox chkHabilitado;

    private JButton btnSalvar;
    private JButton btnAdicionar;
    private JButton btnBuscar;
    private JButton btnExcluir;

    public TelaReplicacaoProcessoView() {
        setTitle("Cadastro de Processos");
        setSize(620, 320);
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
        lblId.setBounds(10, 70, 120, 25);
        panel.add(lblId);

        txfId = new JTextField();
        txfId.setBounds(140, 70, 200, 25);
        panel.add(txfId);

        JLabel lblProcesso = new JLabel("Processo:");
        lblProcesso.setBounds(10, 105, 120, 25);
        panel.add(lblProcesso);

        txfProcesso = new JTextField();
        txfProcesso.setBounds(140, 105, 420, 25);
        panel.add(txfProcesso);

        JLabel lblDescricao = new JLabel("Descricao:");
        lblDescricao.setBounds(10, 140, 120, 25);
        panel.add(lblDescricao);

        txfDescricao = new JTextField();
        txfDescricao.setBounds(140, 140, 420, 25);
        panel.add(txfDescricao);

        chkHabilitado = new JCheckBox("Habilitado");
        chkHabilitado.setBounds(10, 175, 120, 25);
        panel.add(chkHabilitado);

        setContentPane(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaReplicacaoProcessoView().setVisible(true));
    }
}
