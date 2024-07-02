import java.awt.*;
import java.awt.event.*;

class calculater extends WindowAdapter implements ActionListener{

    Frame f ;
    Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,be,be1,be2,be3,be4,be5,ba,ce,d,n;
    Label tf;
    double xd;
    double num1,num2,check;
    calculater(){
        f = new Frame("The Calculater");
        f.addWindowListener(this);
    tf = new Label();
    tf.setBackground(Color.LIGHT_GRAY);
    tf.setBounds(20,50,330,100);
    f.add(tf);
     b = new Button("1");
    b.setBounds(20,220,70,70);
    f.add(b);
    b.addActionListener(this);
     b1 = new Button("2");
    b1.setBounds(100,220,70,70);
    f.add(b1);
    b1.addActionListener(this);
     b2 = new Button("3");
    b2.setBounds(180,220,70,70);
    f.add(b2);
    b2.addActionListener(this);
     b3 = new Button("4");
    b3.setBounds(20,300,70,70);
    f.add(b3);
    b3.addActionListener(this);
     b4 = new Button("5");
    b4.setBounds(100,300,70,70);
    f.add(b4);
    b4.addActionListener(this);
     b5 = new Button("6");
    b5.setBounds(180,300,70,70);
    f.add(b5);
    b5.addActionListener(this);
     b6 = new Button("7");
    b6.setBounds(20,380,70,70);
    f.add(b6);
    b6.addActionListener(this);
     b7 = new Button("8");
    b7.setBounds(100,380,70,70);
    f.add(b7);
    b7.addActionListener(this);
     b8 = new Button("9");
    b8.setBounds(180,380,70,70);
    f.add(b8);
    b8.addActionListener(this);
     b9 = new Button("0");
    b9.setBounds(100,460,70,70);
    f.add(b9);
    b9.addActionListener(this);
     be = new Button("+");
    be.setBounds(260,220,80,50);
    f.add(be);
    be.addActionListener(this);
     be1 = new Button("-");
    be1.setBounds(260,280,80,50);
    f.add(be1);
    be1.addActionListener(this);
     be2 = new Button("*");
    be2.setBounds(260,340,80,50);
    f.add(be2);
    be2.addActionListener(this);
     be3 = new Button("/");
    be3.setBounds(260,400,80,50);
    f.add(be3);
    be3.addActionListener(this);
     be4 = new Button("=");
    be4.setBounds(260,470,80,60);
    f.add(be4);
    be4.addActionListener(this);
    be5 = new Button("%");
    be5.setBounds(20,160,60,50);
    f.add(be5);
    be5.addActionListener(this);
    ba = new Button("Back");
    ba.setBounds(100,160,60,50);
    f.add(ba);
    ba.addActionListener(this);
    ce = new Button("CE");
    ce.setBounds(180,160,60,50);
    f.add(ce);
    ce.addActionListener(this);
    d = new Button(".");
    d.setBounds(180,460,70,70);
    f.add(d);
    n =new Button("+/-");
    n.setBounds(20,460,70,70);
    f.add(n);
    n.addActionListener(this);
    d.addActionListener(this);
    f.setSize(380,550);
    f.setLayout(null); 
    f.setVisible(true);
    

    }


 
public void windowClosing(WindowEvent ae){
    f.dispose();
}
public void actionPerformed(ActionEvent ae){
    String s,st;

    if(ae.getSource()==b){
        st=tf.getText();
        s=st+"1";
        tf.setText(s);
    }
    if(ae.getSource()==b1){
        st=tf.getText();
        s=st+"2";
        tf.setText(s);
    }
    if(ae.getSource()==b2){
        st=tf.getText();
        s=st+"3";
        tf.setText(s);
    }
    if(ae.getSource()==b3){
        st=tf.getText();
        s=st+"4";
        tf.setText(s);
    }
    if(ae.getSource()==b4){
        st=tf.getText();
        s=st+"5";
        tf.setText(s);
    }
    if(ae.getSource()==b5){
        st=tf.getText();
        s=st+"6";
        tf.setText(s);
    }
    if(ae.getSource()==b6){
        st=tf.getText();
        s=st+"7";
        tf.setText(s);
    }
    if(ae.getSource()==b7){
        st=tf.getText();
        s=st+"8";
        tf.setText(s);
    }
    if(ae.getSource()==b8){
        st=tf.getText();
        s=st+"9";
        tf.setText(s);
    }
    if(ae.getSource()==b9){
        st=tf.getText();
        s=st+"0";
        tf.setText(s);
    }
    if(ae.getSource()==d){
        st=tf.getText();
        s=st+".";
        tf.setText(s);
    }
    if(ae.getSource()==n){
        st=tf.getText();
        s="-"+st;
        tf.setText(s);
    }
    if(ae.getSource()==ba){
        st=tf.getText();
       try{
        s=st.substring(0, st.length()-1);
       }catch(StringIndexOutOfBoundsException f){return;}
       tf.setText(s);
    }
    if(ae.getSource()==be){
        try{
            num1=Double.parseDouble(tf.getText());
        }catch(NumberFormatException f){
        tf.setText("Invalid Format");
        return;}
        s="";
        tf.setText(s);
        check=1;
    }
    if(ae.getSource()==be1){
        try{
            num1=Double.parseDouble(tf.getText());
        }catch(NumberFormatException f){
        tf.setText("Invalid Format");
        return;}
        s="";
        tf.setText(s);
        check=2;
    }
    if(ae.getSource()==be2){
        try{
            num1=Double.parseDouble(tf.getText());
        }catch(NumberFormatException f){
        tf.setText("Invalid Format");
        return;}
        s="";
        tf.setText(s);
        check=3;
    }
    if(ae.getSource()==be3){
        try{
            num1=Double.parseDouble(tf.getText());
        }catch(NumberFormatException f){
        tf.setText("Invalid Format");
        return;}
        s="";
        tf.setText(s);
        check=4;
    }
   
    if(ae.getSource()==be5){
        try{
            num1=Double.parseDouble(tf.getText());
        }catch(NumberFormatException f){
        tf.setText("Invalid Format");
        return;}
        s="";
        tf.setText(s);
        check=5;
    }

    if(ae.getSource()==be4){
        try{
            num2=Double.parseDouble(tf.getText());
        }catch(NumberFormatException f){
        tf.setText("Enter the Number first");
        return;
        }
    
    if(check==1)
        xd=num1+num2;
    if(check==2)
        xd=num1-num2;
    if(check==3)
        xd=num1*num2;
    if(check==4)
        xd=num1/num2;
    if(check==5)
        xd=num1%num2;
    tf.setText(String.valueOf(xd));
    }
    if(ae.getSource()==ce){
        num1=0;
        num2=0;
        check=0;
        xd=0;
        s="";
        tf.setText(s);
    }
}


    public static void main(String args[]){
        new calculater();


    }
}