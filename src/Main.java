import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    JFrame frame;
    JLabel heading,Pizza,cold_drink,Onion,SweetCorn,Chicken,Pasta;
    JLabel Coca,Sprit,Fanta,Limca;
    JRadioButton sco,mco,ssp,msp,sfa,mfa,slm,mlm;
    JRadioButton p1,p2,p3,sc1,sc2,sc3;
    JRadioButton s,m,l,s1,m1,l1;

    JLabel Total;
    JButton Items;
    JButton Print;
    Main(){

        frame=new JFrame("Pizza Chef");
        frame.getContentPane().setBackground(Color.WHITE);

        Font fnt=new Font("Arial",Font.PLAIN,80);


        heading=new JLabel(" WelCome in Pizza Chef");
        heading.setBounds(5,5,2000,180);

        heading.setIcon(new ImageIcon("logo.png"));

        heading.setFont(fnt);
        heading.setBackground(Color.WHITE);
        heading.setOpaque(true);
        heading.setForeground(Color.BLACK);
        frame.add(heading);

        Font p=new Font("Arial",Font.BOLD,45);

        //Pizza

        Pizza=new JLabel("Pizza");
        Pizza.setBounds(5,190,400,125);
        Pizza.setFont(p);
        Pizza.setBackground(Color.WHITE);
        Pizza.setOpaque(true);
        Pizza.setIcon(new ImageIcon("Pizza.jfif"));
        frame.add(Pizza);

        //Onion
        Font o=new Font("Arial",Font.PLAIN,16);
        Onion=new JLabel("Onion Pizza");
        Onion.setBounds(10,315,200,50);
        Onion.setBackground(Color.white);
        Onion.setOpaque(true);
        Onion.setFont(o);
        frame.add(Onion);



        //RadioButtons Onion-Pizza
        p1=new JRadioButton("Small ₹299/");
        p1.setBounds(10,350,120,50);
        p1.setBackground(Color.white);
        p1.setOpaque(true);

        p1.addActionListener(this);
        frame.add(p1);

        p2=new JRadioButton("Medium ₹349/");
        p2.setBounds(130,350,120,50);
        p2.setBackground(Color.white);
        p2.setOpaque(true);

        p2.addActionListener(this);
        frame.add(p2);

        p3=new JRadioButton("Large ₹499/");
        p3.setBounds(250,350,120,50);
        p3.setBackground(Color.white);
        p3.setOpaque(true);

        p3.addActionListener(this);
        frame.add(p3);

        //Sweet-Corn
        SweetCorn=new JLabel("Sweet-Corn Pizza");
        SweetCorn.setBounds(10,400,200,50);
        SweetCorn.setBackground(Color.white);
        SweetCorn.setOpaque(true);
        SweetCorn.setFont(o);
        frame.add(SweetCorn);


        //RadioButtons Sweet-Corn-Pizza
        sc1=new JRadioButton("Small ₹299/");
        sc1.setBounds(10,450,120,50);
        sc1.setBackground(Color.white);
        sc1.setOpaque(true);
        frame.add(sc1);

        sc2=new JRadioButton("Medium ₹369/");
        sc2.setBounds(130,450,120,50);
        sc2.setBackground(Color.white);
        sc2.setOpaque(true);
        frame.add(sc2);

        sc3=new JRadioButton("Large ₹449/");
        sc3.setBounds(250,450,120,50);
        sc3.setBackground(Color.white);
        sc3.setOpaque(true);
        frame.add(sc3);

        //Chicken-Pizza
        Chicken=new JLabel("Chicken-Pizza");
        Chicken.setBounds(10,500,200,50);
        Chicken.setBackground(Color.white);
        Chicken.setOpaque(true);
        Chicken.setFont(o);
        frame.add(Chicken);

        //RadioButtons Chicken-Pizza
        s=new JRadioButton("Small ₹329/");
        s.setBounds(10,550,120,50);
        s.setBackground(Color.white);
        s.setOpaque(true);

        s.addActionListener(this);
        frame.add(s);

        m=new JRadioButton("Medium ₹439/");
        m.setBounds(130,550,120,50);
        m.setBackground(Color.white);
        m.setOpaque(true);

        m.addActionListener(this);
        frame.add(m);

        l=new JRadioButton("Large ₹699/");
        l.setBounds(250,550,120,50);
        l.setBackground(Color.white);
        l.setOpaque(true);
        l.addActionListener(this);
        frame.add(l);



        //Pasta-Pizza
        Pasta=new JLabel("Pasta-Pizza");
        Pasta.setBounds(10,600,200,50);
        Pasta.setBackground(Color.white);
        Pasta.setOpaque(true);
        Pasta.setFont(o);
        frame.add(Pasta);

        //RadioButtons Pasta-Pizza
        s1=new JRadioButton("Small ₹359/");
        s1.setBounds(10,650,120,50);
        s1.setBackground(Color.white);
        s1.setOpaque(true);

        s1.addActionListener(this);
        frame.add(s1);

        m1=new JRadioButton("Medium ₹469/");
        m1.setBounds(130,650,120,50);
        m1.setBackground(Color.white);
        m1.setOpaque(true);

        m1.addActionListener(this);
        frame.add(m1);

        l1=new JRadioButton("Large ₹699/");
        l1.setBounds(250,650,120,50);
        l1.setBackground(Color.white);
        l1.setOpaque(true);

        l1.addActionListener(this);
        frame.add(l1);


        //Cold Drinks

        cold_drink=new JLabel("Cold Drink");
        cold_drink.setBounds(500,190,500,125);
        cold_drink.setFont(p);
        cold_drink.setBackground(Color.white);
        cold_drink.setOpaque(true);
        cold_drink.setIcon(new ImageIcon("drinks.jfif"));
        frame.add(cold_drink);

        // Coca
        Coca=new JLabel("Coca-Cola");
        Coca.setBounds(500,315,200,50);
        Coca.setBackground(Color.white);
        Coca.setOpaque(true);
        Coca.setFont(o);
        frame.add(Coca);


        //RadioButtons Coca
        sco=new JRadioButton("Small ₹30/");
        sco.setBounds(500,350,120,50);
        sco.setBackground(Color.white);
        sco.setOpaque(true);

        sco.addActionListener(this);
        frame.add(sco);

        mco=new JRadioButton("Medium ₹50/");
        mco.setBounds(650,350,120,50);
        mco.setBackground(Color.white);
        mco.setOpaque(true);

        mco.addActionListener(this);
        frame.add(mco);

        // Sprit
        Sprit=new JLabel("Sprit");
        Sprit.setBounds(500,400,200,50);
        Sprit.setBackground(Color.white);
        Sprit.setOpaque(true);
        Sprit.setFont(o);
        frame.add(Sprit);


        //RadioButtons Sprit
        ssp=new JRadioButton("Small ₹30/");
        ssp.setBounds(500,450,120,50);
        ssp.setBackground(Color.white);
        ssp.setOpaque(true);

        ssp.addActionListener(this);
        frame.add(ssp);

        msp=new JRadioButton("Medium ₹50/");
        msp.setBounds(650,450,120,50);
        msp.setBackground(Color.white);
        msp.setOpaque(true);

        msp.addActionListener(this);
        frame.add(msp);

        // Fanta
        Fanta=new JLabel("Fanta");
        Fanta.setBounds(500,500,200,50);
        Fanta.setBackground(Color.white);
        Fanta.setOpaque(true);
        Fanta.setFont(o);
        frame.add(Fanta);


        //RadioButtons Sprit
        sfa=new JRadioButton("Small ₹30/");
        sfa.setBounds(500,550,120,50);
        sfa.setBackground(Color.white);
        sfa.setOpaque(true);

        sfa.addActionListener(this);
        frame.add(sfa);

        mfa=new JRadioButton("Medium ₹50/");
        mfa.setBounds(650,550,120,50);
        mfa.setBackground(Color.white);
        mfa.setOpaque(true);

        mfa.addActionListener(this);
        frame.add(mfa);

        // Limca
        Limca=new JLabel("Limca");
        Limca.setBounds(500,600,200,50);
        Limca.setBackground(Color.white);
        Limca.setOpaque(true);
        Limca.setFont(o);
        frame.add(Limca);


        //RadioButtons Sprit
        slm=new JRadioButton("Small ₹30/");
        slm.setBounds(500,650,120,50);
        slm.setBackground(Color.white);
        slm.setOpaque(true);

        slm.addActionListener(this);
        frame.add(slm);

        mlm=new JRadioButton("Medium ₹50/");
        mlm.setBounds(650,650,120,50);
        mlm.setBackground(Color.white);
        mlm.setOpaque(true);

        mlm.addActionListener(this);
        frame.add(mlm);

        //Buttons
        Items=new JButton("Print Bill");
        Items.setBounds(1000,600,150,50);
        Items.setFont(o);
        Items.addActionListener(this);
        Items.setBackground(Color.GRAY);
        Items.setOpaque(true);
        frame.add(Items);


        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }


    // Your Bill Function

    void fun(float v, String m,int c){
        JFrame frame1=new JFrame(" Your Bill");
        frame1.setBounds(900,150,400,550);
        frame1.getContentPane().setBackground(Color.WHITE);


        JLabel bl=new JLabel("  Welcome in Pizza Chef");
        Font f=new Font("Arial",Font.PLAIN,18);
        bl.setFont(f);
        bl.setBounds(20,5,300,50);
        frame1.add(bl);


        JTextArea l=new JTextArea();
        l.setBounds(20,60,350,300);
        l.setLineWrap(true);
        l.setEnabled(false);
        Font b=new Font("Arial",Font.BOLD,16);
        l.setFont(b);
        l.setText("Items:\n" + m);
        frame1.add(l);


        JLabel lb=new JLabel("Amount:" + v);
        lb.setFont(b);

        lb.setBounds(20,350,150,50);
        frame1.add(lb);

        JLabel co=new JLabel("Total Items:\n" + c);
        co.setBounds(200,350,150,50);
        co.setFont(b);
        frame1.add(co);

        JButton pr=new JButton("Print");
        pr.setBounds(30,420,300,50);
        pr.setFont(f);
        pr.addActionListener(this);
        frame1.add(pr);

        frame1.setLayout(null);
        frame1.setVisible(true);
        //frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        float amount=0;
        int count=0;
        String msg="";

        //Onion
        if(p1.isSelected()){
            amount+=299;
            msg="Small Onion-Pizza: 299\n";
            count++;
        }
        if(p2.isSelected()){
            amount+=349;
            msg+="Medium Onion-Pizza: 349\n";
            count++;
        }
        if(p3.isSelected()){
            amount+=499;
            msg+="Large Onion-Pizza: 499\n";
            count++;
        }

        //Sweet-Corn
        if(sc1.isSelected()){
            amount+=299;
            msg+="Small Sweet-Corn-Pizza: 299\n";
            count++;
        }
        if(sc2.isSelected()){
            amount+=369;
            msg+="Medium Sweet-Corn-Pizza: 369\n";
            count++;
        }
        if(sc3.isSelected()){
            amount+=449;
            msg+="Large Sweet-Corn-Pizza: 449\n";
            count++;
        }


        //Chicken-Pizza
        if(s.isSelected()){
            amount+=329;
            msg+="Small Chicken-Pizza: 329\n";
            count++;
        }
        if(m.isSelected()){
            amount+=439;
            msg+="Medium Chicken-Pizza: 439\n";
            count++;
        }
        if(l.isSelected()){
            amount+=699;
            msg+="Large Chicken-Pizza: 699\n";
            count++;
        }

        //Pasta-Pizza
        if(s1.isSelected()){
            amount+=359;
            msg+="Small Pasta-Pizza: 359\n";
            count++;
        }
        if(m1.isSelected()){
            amount+=469;
            msg+="Medium Pasta-Pizza: 469\n";
            count++;
        }
        if(l1.isSelected()){
            amount+=699;
            msg+="Large Pasta-Pizza: 699\n";
            count++;
        }


        //Cold-Drinks

        //Coca cola button
        if(sco.isSelected()){
            amount+=30;
            msg+="Small Coca-Cola: 30\n";
            count++;
        }
        if(mco.isSelected()){
            amount+=50;
            msg+="Medium Coca-Cola: 50\n";
            count++;
        }
        if(ssp.isSelected()){
            amount+=30;
            msg+="Small Sprit: 30\n";
            count++;
        }
        if(msp.isSelected()){
            amount+=50;
            msg+="Medium Sprit: 50\n";
            count++;
        }
        if(sfa.isSelected()){
            amount+=30;
            msg+="Small Fanta: 30\n";
            count++;
        }
        if(mfa.isSelected()){
            amount+=50;
            msg+="Medium Fanta: 50\n";
            count++;
        }
        if(slm.isSelected()){
            amount+=30;
            msg+="Small Limca: 30\n";
            count++;
        }
        if(mlm.isSelected()){
            amount+=50;
            msg+="Medium Limca: 50\n";
            count++;
        }

        msg+="\n-----------------------------------------------------------\n";

        if(e.getSource()==Items){
            fun(amount , msg, count);
        }
    }
    public static void main(String[] args) {

        new Main();
    }
}