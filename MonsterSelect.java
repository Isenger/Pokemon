import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MonsterSelect extends JFrame{

    public MonsterSelect(Player player){
        super("PokemonGame_SelectMonster");
        Container container = getContentPane();
        container.setLayout(new GridLayout(2,3));
        JPanel mon1 = new JPanel();
        JPanel mon2 = new JPanel();
        mon1.setLayout(new GridLayout(2,1));
        mon2.setLayout(new GridLayout(2,1));

        container.add(mon1);
        container.add(mon2);

        mon1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mon2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        ImageIcon icon1 =new ImageIcon("Slime.png");
        ImageIcon icon2 =new ImageIcon("Kaiju.jpg");

        JLabel label1 =new JLabel(icon1);
        JLabel label2 =new JLabel(icon2);

        mon1.add(label1);
        mon2.add(label2);

        JButton button1 =new JButton("Slime Lv.1");
        JButton button2 =new JButton("Kaiju Lv.100");

        JPanel set1 =new JPanel();
        JPanel set2 =new JPanel();

        set1.add(button1);
        set2.add(button2);
        
        mon1.add(set1);
        mon2.add(set2);
        
        button1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BattleArena(player, new Slime());
                dispose();
            }
        });
        button2.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BattleArena(player, new Kaiju());
                dispose();
            }
        });
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}