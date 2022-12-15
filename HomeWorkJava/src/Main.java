import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
   JFrame frame=new JFrame("GUI of Registration");
   frame.setSize(800,600);
   frame.setLayout(null);


   JPanel panel1 = new JPanel();
   JPanel panel3 = new JPanel();

panel1.setLayout(null);
panel3.setLayout(null);

    panel1.setBounds(0,0,1000,800);
    panel3.setBounds(0,400,800,600);

        JLabel label9=new JLabel("Registration Form for only Graduated Jobless Female");
        Font mfont=new Font("yenesew",Font.PLAIN ,20);
        label9.setFont(mfont);
        JLabel label1 = new JLabel("Fill Personal info");
        Font myfont=new Font("yenesew",Font.PLAIN ,17);
        label1.setFont(myfont);
        JLabel label2 = new JLabel("Accademic info");
        JLabel label3 = new JLabel("Profile Display Area");

        label1.setBounds(100,17,200,60);
        label2.setBounds(90,0,100,40);
        label3.setBounds(420,0,150,40);
        label9.setBounds(190,0,550,40);


        JTextField t1,t2,t3,t4,t5;
        t1=new JTextField();
        t1.setBounds(150,70, 170,25);
        t2=new JTextField();
        t2.setBounds(150,130, 170,25);
        t3=new JTextField();
        t3.setBounds(150,200, 170,25);

        JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl8;
        lbl1=new JLabel("First Name");
        lbl1.setBounds(20,50,100,60);
        lbl2=new JLabel("Middle Name");
        lbl2.setBounds(20,115,100,60);
        lbl3=new JLabel("LAst Name");
        lbl3.setBounds(20,180,100,60);

        lbl4=new JLabel("Sex");
        lbl4.setBounds(20,255,100,60);

        JRadioButton rb1,rb2;
        rb1=new JRadioButton("Male");
        rb1.setBounds(150,270,70,30);
        rb2=new JRadioButton("Female");
        rb2.setBounds(260,270,80,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);bg.add(rb2);

        lbl5=new JLabel("Languages can speak");
        lbl5.setBounds(530,40,200,60);
        Font font=new Font("uba",Font.PLAIN,17);
        lbl5.setFont(font);
        String country[]={"English","Amharic","Oromiffa","Chinese","japanese","Guragegna","Geez","Other"};
        JList list=new JList(country);
        list.setBounds(530, 100,130,210);
        Font font2=new Font("ubaa",Font.PLAIN,18);
        list.setFont(font2);


        lbl6=new JLabel("Phone No");
        lbl6.setBounds(20,320,70,30);
        t4=new JTextField();
        t4.setBounds(170,325, 120,20);

        lbl8=new JLabel("Email");
        lbl8.setBounds(20,365,70,40);
        t5=new JTextField();
        t5.setBounds(170,375, 120,20);

        JLabel lbl7 = new JLabel();
        ImageIcon logo = new ImageIcon("ethio.jpg");
        ImageIcon image = new ImageIcon("safari.jpg");
        image.setImage(image.getImage().getScaledInstance(800,130,Image.SCALE_SMOOTH));
        lbl7.setIcon(image);
        lbl7.setBounds(0,420,800,150);

        panel1.add(label1);
        panel1.add(t1);
        panel1.add(t2);
        panel1.add(t3);
        panel1.add(t4);
        panel1.add(t5);
        panel1.add(lbl1);
        panel1.add(lbl2);
        panel1.add(lbl3);
        panel1.add(lbl4);
        panel1.add(lbl5);
        panel1.add(lbl6);
        panel1.add(rb1);
        panel1.add(rb2);
        panel1.add(list);
        panel1.add(lbl7);
        panel1.add(lbl8);
        panel1.add(label9);

        panel1.setBackground(new Color(255,102,102,225));
      //  panel2.setBackground(new Color(125,200,134,225));
        panel3.setBackground(new Color(22,10,134,2));


        JButton btn1 = new JButton("Next");
        btn1.setBounds(650,380,100,30);
        JFrame fr=new JFrame("Academical info");
btn1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (t1.getText().isEmpty()||t2.getText().isBlank()||t3.getText().isEmpty()||bg.isSelected(rb1.getModel()))
        JOptionPane.showMessageDialog(null,"no");
        else

        fr.setSize(600,500);
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0,0,500,400);
        panel2.add(label2);
        panel3.add(label3);

        //panel1.setBackground(new Color(255,102,102,225));
        panel2.setBackground(new Color(125,200,134,225));
        //panel3.setBackground(new Color(22,10,134,2));

        JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7;
        lb1=new JLabel("Collague");
        lb1.setBounds(15,75,80,40);
        lb2=new JLabel("Major Course");
        lb2.setBounds(15,115,80,40);
        lb3=new JLabel("Minor Course");
        lb3.setBounds(15,155,80,40);
        lb4=new JLabel("Job");
        lb4.setBounds(15,240,80,25);
        lb5=new JLabel("Graduate level");
        lb5.setBounds(15,40,100,40);
        lb6=new JLabel("Contract Year");
        lb6.setBounds(15,190,100,40);


        String level[]={"None","Degree","Masters","PHD","Proffesor","Deploma"};
        JComboBox cbx=new JComboBox(level);
        cbx.setBounds(140, 45,90,20);



        String Year[]={"1","2","3","4","5","6","7","8","9","10","10+"};
        JComboBox cbx2=new JComboBox(Year);
        cbx2.setBounds(120, 200,90,20);

        JTextField tx1,tx2,tx3,tx4;
        tx1=new JTextField();
        tx1.setBounds(120,80, 170,25);
        tx2=new JTextField();
        tx2.setBounds(120,120, 170,25);
        tx3=new JTextField();
        tx3.setBounds(120,160, 170,25);



        JRadioButton rbt1,rbt2;
        rbt1=new JRadioButton("YES");
        rbt1.setBounds(120,240,70,20);
        rbt2=new JRadioButton("NO");
        rbt2.setBounds(190,240,80,20);
        ButtonGroup btng=new ButtonGroup();
        btng.add(rbt1);btng.add(rbt2);



        lb7=new JLabel("CGPA of Last-graduate");
        lb7.setBounds(15,270,120,40);
        tx4=new JTextField();
        tx4.setBounds(170,275, 50,25);

        JButton btn3 = new JButton("Finished");
        btn3.setBounds(350,360,100,30);
btn3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(tx1.getText().isEmpty()||tx2.getText().isEmpty()||tx4.getText().isEmpty()||tx3.getText().isEmpty()||cbx.getSelectedIndex()==0||cbx.getSelectedIndex()==5||btng.isSelected(rbt1.getModel()))
        JOptionPane.showMessageDialog(null,"soory there is some error");
        else
            JOptionPane.showMessageDialog(null,"CONGRA U R HIRED");

    }
});
        panel2.add(tx1);
        panel2.add(tx2);
        panel2.add(tx3);
        panel2.add(tx4);
        panel2.add(lb1);
        panel2.add(lb2);
        panel2.add(lb3);
        panel2.add(rbt1);
        panel2.add(rbt2);
        panel2.add(lb4);
        panel2.add(lb5);
        panel2.add(lb6);
        panel2.add(lb7);
        panel2.add(cbx);
        panel2.add(cbx2);
        panel2.add(btn3);
fr.add(panel2);
        fr.setIconImage(logo.getImage());
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
});

        panel1.add(btn1);
        frame.add(panel1);
        //frame.add(panel2);
        frame.add(panel3);
        frame.setIconImage(logo.getImage());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

