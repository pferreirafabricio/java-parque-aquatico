/**
 * @author Fabricio Pinto Ferreira (Fabreco)
 */
package parqueaquatico;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class ParqueAquatico extends JFrame implements ActionListener
{
    public static void main(String args[])
    { 
        ParqueAquatico Formulario = new ParqueAquatico();
        Formulario.show();
       
    }
    
    //Variaveis
    JPanel pnBarraMenu, pnFormulario, pnSexo, pnBotoes, pnRodape;
    JLabel lbNome, lbCidade, lbDataNascimento, lbSexo, lbEmail, lbTelefone, lbIco, lbDireitos;
    JTextField txtNome, txtDataNascimento, txtEmail, txtTelefone;
    JRadioButton rbSexoF;
    JButton jbSalvar, jbLimpar, jbSair;
    JCheckBox jcSexoM;
    JMenuBar mbMenuBarra;
    JMenu mAjuda, mSobre;
    JMenuItem miRelatar, miInformacoes, miSobreProgramador;
    JComboBox cbCidade;
    String strCidades[] = {"Selecione sua cidade...", "Elias Fausto", "Monte Mor", "Hortolandia", "Capivari", "Indaiatuba", "Itu", "Salto", "São Paulo"};
    //JFrame
     
    ParqueAquatico()
    {
    	URL caminhoImagem = this.getClass().getResource("./icon.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        setIconImage(iconeTitulo);
    	
        setTitle("Formulário de Cadastro - Water Park's Fabreco");
        setSize(500, 350);
        setLocation(0, 0);
        getContentPane().setLayout(new BorderLayout());
        Container ctn = getContentPane();
        
        //Estabelecimento dos pain�is
        //pnBarraMenu = new JPanel();
        //pnBarraMenu.setLayout(new GridLayout(1, 3));
        
        pnFormulario = new JPanel();
        pnFormulario.setLayout(new GridLayout(7,                                                                                                                                                                                                                                          2, 0, 5));
        
        pnSexo = new JPanel();
        pnSexo.setLayout(new BorderLayout());
        
        pnBotoes = new JPanel();
        pnBotoes.setLayout(null);
      
        pnRodape = new JPanel();
        pnRodape.setLayout(new BorderLayout());
        
        //Estabelecimento da barra de menu
        mbMenuBarra = new JMenuBar();
        
        //Menu Ajuda
        mAjuda = new JMenu("Ajuda");
        mAjuda.setMnemonic(KeyEvent.VK_A);
        //mAjuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
        miRelatar = new JMenuItem("Relatar um problema");
        miRelatar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        miRelatar.addActionListener(this);
        
        miInformacoes = new JMenuItem("Informações sobre o software");
        miInformacoes.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        miInformacoes.addActionListener(this);
        
        //Menu Sobre
        mSobre = new JMenu("Sobre");
        mSobre.setMnemonic(KeyEvent.VK_S);
        
        miSobreProgramador = new JMenuItem("Sobre o programador");
        miSobreProgramador.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        miSobreProgramador.addActionListener(this);
        
        //Adicionando na barra de menu
        mAjuda.add(miRelatar);
        mAjuda.addSeparator();
        mAjuda.add(miInformacoes);
        
        mSobre.add(miSobreProgramador);
        //mSobre.addSeparator();
        
        mbMenuBarra.add(mAjuda);
        mbMenuBarra.add(mSobre);
        
        //=========================== Estrutura��o do formul�rio ===============================
            
        //Campo nome
        lbNome = new JLabel("Nome do cliente: ", JLabel.CENTER);
        pnFormulario.add(lbNome);
        txtNome = new JTextField(30);
        pnFormulario.add(txtNome);
          
        //Campo cidade
        lbCidade = new JLabel("Cidade: ", JLabel.CENTER);
        pnFormulario.add(lbCidade);
        cbCidade = new JComboBox(strCidades);
        cbCidade.setMaximumRowCount(9);
        pnFormulario.add(cbCidade);
          
        //Campo data de nascimento
        lbDataNascimento = new JLabel("Data de Nascimento: ", JLabel.CENTER);
        pnFormulario.add(lbDataNascimento);
        txtDataNascimento = new JTextField(30);
        pnFormulario.add(txtDataNascimento);
          
        //Campo telefone
        lbSexo = new JLabel("Sexo: ", JLabel.CENTER);
        pnFormulario.add(lbSexo);
        
        //Painel para a separação dos sexos
        rbSexoF = new JRadioButton("Feminino");
        rbSexoF.addActionListener(this);
        
        jcSexoM = new JCheckBox("Masculino");
        jcSexoM.addActionListener(this);
        
        pnSexo.add(rbSexoF, "West");
        pnSexo.add(jcSexoM, "East");
        pnFormulario.add(pnSexo, "Center");
           
        //Campo email       
        lbEmail = new JLabel("E-Mail: ", JLabel.CENTER);
        pnFormulario.add(lbEmail);
        txtEmail = new JTextField(30);
        pnFormulario.add(txtEmail);
        
        //Campo telefone
        lbTelefone = new JLabel("Telefone: ", JLabel.CENTER);
        pnFormulario.add(lbTelefone);
        txtTelefone = new JTextField(30);
        pnFormulario.add(txtTelefone);

        //Bot�es
        jbSalvar = new JButton("SALVAR");
        jbSalvar.setBounds(5, 0, 150, 30);
        jbSalvar.addActionListener(this );
                
        jbLimpar = new JButton("LIMPAR");    
        jbLimpar.setBounds(168, 0, 150, 30);
        jbLimpar.addActionListener(this );
        
        jbSair = new JButton("SAIR");
        jbSair.setBounds(330, 0, 150, 30);
        jbSair.addActionListener(this );
        
        pnBotoes.add(jbSalvar);
        pnBotoes.add(jbLimpar);
        pnBotoes.add(jbSair);
        
        //Rodap�
        //ImageIcon logo = new ImageIcon("./agua.png");
        ImageIcon logo = new ImageIcon(getClass().getResource("./agua5.png"));
        logo.setImage(logo.getImage().getScaledInstance(30, 30, 100));
        
        lbIco = new JLabel(logo, JLabel.CENTER);
        lbIco.setBounds(0, 0, 0, 0);
        pnRodape.add(lbIco, "West");
        
        lbDireitos = new JLabel("Water Park's Fabreco - All Rights Reserved ©     ");
        pnRodape.add(lbDireitos, "East");

        //=========================== Adicionando os elementos no painel ===============================
        setJMenuBar(mbMenuBarra);
        
        ctn.add(pnFormulario, "North");
        ctn.add(pnBotoes, "Center");
        ctn.add(pnRodape, "South");

        //============================= Estilos ================================
        mbMenuBarra.setBackground(new Color(0, 52, 89));
        mAjuda.setForeground(Color.white);
        mSobre.setForeground(Color.white);

        pnFormulario.setBackground(Color.white);
        
        pnSexo.setBackground(Color.white);
        rbSexoF.setBackground(Color.white);
        jcSexoM.setBackground(Color.white);
        
        pnBotoes.setBackground(Color.white);
        
        lbNome.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lbCidade.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lbDataNascimento.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lbSexo.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lbEmail.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lbTelefone.setFont(new Font("Segoe UI", Font.BOLD, 13));
        
        lbDireitos.setFont(new Font("Segoe UI", Font.BOLD, 11));
        lbDireitos.setForeground(Color.white);
        //Font.PLAIN = Deixa a fonte sem estilo
        //Montserrat Regular
        
        jbSalvar.setBackground(new Color(0, 52, 89));
        jbSalvar.setForeground(Color.white);
        
        jbLimpar.setBackground(new Color(0, 52, 89));
        jbLimpar.setForeground(Color.white);
        
        jbSair.setBackground(new Color(0, 52, 89));
        jbSair.setForeground(Color.white);
          
        pnRodape.setBackground(new Color(0, 52, 89)); 
    }
    
    
  //============================= Events ================================
    
    public void actionPerformed(ActionEvent eventos)
    {
        if (eventos.getSource() == jbSalvar)
        {
            //rbSexoF.isSelected() == false ||
            //jcSexoM.isSelected() == false ||
            
            if ( txtNome.getText() == "" ||
                 cbCidade.getSelectedItem() == strCidades[0] ||
                 txtDataNascimento.getText() ==  "" ||
                 txtEmail.getText() == "" ||
                 txtTelefone.getText() == ""
                )
            {
                JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS", "CAMPOS VAZIOS", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if (eventos.getSource() == jbLimpar)
        {
            txtNome.setText("");
            cbCidade.setSelectedItem(strCidades[0]);
            txtDataNascimento.setText("");
            rbSexoF.setSelected(false);
            rbSexoF.setEnabled(true);
            jcSexoM.setSelected(false);
            jcSexoM.setEnabled(true);
            txtEmail.setText("");
            txtTelefone.setText("");
        }
        
        if (eventos.getSource() == jbSair)
        {
            System.exit(0);
        }
        
        if (eventos.getSource() == miRelatar)
        {
            JOptionPane.showInputDialog("Relatar um problema", "Descreva seu problema");
        }
        
        if (eventos.getSource() == miInformacoes)
        {
            JOptionPane.showMessageDialog(null, "Desenvolvido desde 1979, com a ajuda de toda uma equipe de uma\n"
            + "única pessoa, chamada Fabreco Lopes Galego Silva Júnior Júnior.\n\n"
            + "O software apesar de estar a tempos sendo desenvolvido, só foi\n"
            + "completado em 2018, no começo de Dezembro, devido a grande\n"
            + "complexidade do projeto e também do desenvolvedor ser muito ocupado.\n\n"
            + "FRASE PARA REFLEXÃO:\n\n"
            + "\"Era noite e o sol raiava no horizonte. Estava eu andando parado e\n"
            + "sentado numa pedra de algodão. Longe dali e bem perto, havia um\n"
            + "bosque sem árvores, onde os passarinhos pastavam, vacas pulavam de\n"
            + "galho em galho e os elefantes tomavam sol à sombra de um pé de alface.\"", "Informações sobre o software", JOptionPane.INFORMATION_MESSAGE);
        }

        if (eventos.getSource() == miSobreProgramador)
        {
            ImageIcon imagem = new ImageIcon(getClass().getResource("programador.jpeg"));
            imagem.setImage(imagem.getImage().getScaledInstance(220, 300, 100));
            
            JOptionPane.showMessageDialog(null, "Programador: Fabreco Lopes Galego Silva Júnior Júnior,\n"
            + "desde 1979 até Dezembro de 2018.\n\n"
            + "Formado em Ciência da Computação pela Universidade de São Paulo (USP)\n"
            + "em 1982, formado também em sexologia pelo YouTube, em 2017~2018.\n\n"
            + "Fez vários cursos profissionalizantes na instituição ETEC de Monte Mor\n"
            + "e em várias plataformas online, em busca de especialização e dinheiro.\n\n "
            + "FRASE PARA REFLEXÃO:\n\n"
            + "\"Mais à direita, seguindo pela esquerda, havia um lago com solo pedregoso,\n"
            + " no qual os peixinhos nadavam e aos poucos morriam afogados. Resolvi voltar\n"
            + "pra casa e entrei pela porta da frente, que ficava nos fundos.\"", "Informações sobre o Programador", JOptionPane.INFORMATION_MESSAGE, imagem);
        }
        
        if ((eventos.getSource() == rbSexoF) || (eventos.getSource() == jcSexoM))
        {
            if (jcSexoM.isSelected())
            {
                rbSexoF.setEnabled(false);
                //rbSexoF.setSelected(false);
            }
            else
            {
                rbSexoF.setEnabled(true);
            }

            if (rbSexoF.isSelected())
            {
                jcSexoM.setEnabled(false);
            }
            else
            {
                jcSexoM.setEnabled(true);
            }
        }
    }
}
