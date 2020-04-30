import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class PlayerGUI extends JFrame{

    public PlayerGUI(final Player player){
        super("First Pokemon");
        final Container container = getContentPane();
        container.setLayout(new BorderLayout());
        final JPanel status = new JPanel();
        status.setLayout(new BoxLayout(status,BoxLayout.Y_AXIS));
        final JLabel playerLabel =new JLabel("Name : " + player.getName());
        final JLabel playerLV = new JLabel("Level : " + player.getlvl() + "  EXP : " + player.getexp());
        final JLabel playerHP = new JLabel("HP : " + player.gethp() + " / " + player.getmaxHp());
        final JLabel playerMp = new JLabel("MP : " + player.getMp() + " / " + player.getMaxMp());
        status.add(playerLabel);
        status.add(playerLV);
        status.add(playerHP);
        status.add(playerMp);
        final JLabel pokeLabel =new JLabel("Name :PikaChu");
        final JLabel pokeLV = new JLabel("Level :1 ");
        final JLabel pokeHP = new JLabel("HP : 100" );
        final JLabel pokeMp = new JLabel("MP : 50" );
        status.add(pokeLabel);
        status.add(pokeLV);
        status.add(pokeHP);
        status.add(pokeMp);
        final JPanel northJPanel = new JPanel();
        northJPanel.setLayout(new GridLayout(1,2));
        northJPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        final ImageIcon iconlogo =new ImageIcon("Logo.png");
        final JLabel logo = new JLabel(iconlogo);
        northJPanel.add(logo);
        northJPanel.add(status);
        container.add(northJPanel, BorderLayout.NORTH);
        final ImageIcon iconcha = new ImageIcon(player.getPic());
        final JLabel chaPic = new JLabel(iconcha);
        container.add(chaPic, BorderLayout.LINE_START);
        final ImageIcon pikachupic1 =new ImageIcon("Pikachu.png");
        final JLabel pikachupic = new JLabel(pikachupic1);
        container.add(pikachupic, BorderLayout.LINE_END);
        final JButton duel = new JButton("Duel");
        final JButton bag = new JButton("Bag");
        final JButton changePoke =new JButton("Change Pokemon");
        final JButton Exit =new JButton("Quit");
        final JPanel select = new JPanel();
        select.setLayout(new FlowLayout());
        select.add(duel);
        select.add(bag);
        select.add(changePoke);
        select.add(Exit);
        container.add(select,BorderLayout.SOUTH);
        
        duel.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new MonsterSelect(player);
                dispose();
            }
        });
        
        bag.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BagGUI(player,1);
                dispose();
            }
        });
        Exit.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}