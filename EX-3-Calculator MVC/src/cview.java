import javax.swing.*;

public class cview extends JFrame {

    JLabel a,b,result;
    JTextField txta, txtb,txtresult;
    JButton addi,sub, multi,div;

    cview(){
        setSize(500,500);
        setLayout(null);
        setTitle("Calculator");


        a= new JLabel("enter A");
        a.setBounds(30,30,100,30);
        add(a);

        txta=new JTextField();
        txta.setBounds(100,30,100,30);
        add(txta);

        b= new JLabel("enter B");
        b.setBounds(30,80,100,30);
        add(b);

        txtb=new JTextField();
        txtb.setBounds(100,80,100,30);
        add(txtb);

        addi= new JButton("+");
        addi.setBounds(80,130,60,30);
        add(addi);



        sub= new JButton("-");
        sub.setBounds(130,130,60,30);
        add(sub);

        multi= new JButton("*");
        multi.setBounds(180,130,60,30);
        add(multi);


        div= new JButton("/");
        div.setBounds(230,130,60,30);
        add(div);


        result= new JLabel("Result");
        result.setBounds(30,180,100,30);
        add(result);


        txtresult=new JTextField();
        txtresult.setBounds(100,180,100,30);
        txtresult.setEnabled(false);
        add(txtresult);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}


