import javax.swing.JPanel;

public class TrainerGUI extends JFrame{

    public TrainerGUI(final Player player){
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
        final JLabel Fatigue = new JLabel("Fatigue:100" );
        status.add(pokeLabel);
        status.add(pokeLV);
        status.add(pokeHP);
        status.add(pokeMp);
        status.add(Fatigue);
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
        final JButton goFight = new JButton("Go Fight");
        final JButton bag = new JButton("Bag");
        final JButton changePoke =new JButton("Change Pokemon");
        final JButton eat =new JButton("EAT");
        final JPanel select = new JPanel();
        select.setLayout(new FlowLayout());
        select.add(goFight);
        select.add(bag);
        select.add(changePoke);
        select.add(eat);
        container.add(select,BorderLayout.SOUTH);
        
        goFight.addActionListener(new ActionListener(){
        
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
        eat.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Delete 50 Fatigue");
                dispose();
            }
        });
    
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}