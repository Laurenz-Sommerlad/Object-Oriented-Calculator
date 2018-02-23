import javax.swing.*;
import java.awt.event.*;

	public class taschenrechner {
		 public static void main(String[] args) {
		        new Calc();
		}
	}
	 
 class Calc implements ActionListener
	{
		
	    JFrame f;
	    JTextField t;
	    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr,Pytagoras,PytagorasA,PytagorasB,PytagorasC,bpow,bsqrt,bpowx,bcbrt;
	    int countPytaguras = 0;
	    String firstPytaguras = null;
	    String secondPytaguras = null;
	    static double a=0,b=0,result=0;
	    static int operator=0;
	    static int variable=0;
	 
	    Calc()
	    {
	        f=new JFrame("Calculator");
	        t=new JTextField();
	        b1=new JButton("1");
	        b2=new JButton("2");
	        b3=new JButton("3");
	        b4=new JButton("4");
	        b5=new JButton("5");
	        b6=new JButton("6");
	        b7=new JButton("7");
	        b8=new JButton("8");
	        b9=new JButton("9");
	        b0=new JButton("0");
	        bdiv=new JButton("/");
	        bmul=new JButton("*");
	        bsub=new JButton("-");
	        badd=new JButton("+");
	        bdec=new JButton(".");
	        beq=new JButton("=");
	        bdel=new JButton("Delete");
	        bclr=new JButton("Clear");
	        Pytagoras = new JButton("Pytagura");
	        PytagorasA = new JButton("a");
	        PytagorasB = new JButton("b");
	        PytagorasC = new JButton("c");
	        bpow = new JButton("x²");
	        bpowx = new JButton("x^");
	        bcbrt = new JButton("³√");
	        bsqrt = new JButton("√");
	        
	        
	        t.setBounds(30,40,280,30);
	        b7.setBounds(40,100,50,40);
	        b8.setBounds(110,100,50,40);
	        b9.setBounds(180,100,50,40);
	        bdiv.setBounds(250,100,50,40);
	        
	        b4.setBounds(40,170,50,40);
	        b5.setBounds(110,170,50,40);
	        b6.setBounds(180,170,50,40);
	        bmul.setBounds(250,170,50,40);
	        
	        b1.setBounds(40,240,50,40);
	        b2.setBounds(110,240,50,40);
	        b3.setBounds(180,240,50,40);
	        bsub.setBounds(250,240,50,40);
	        
	        bdec.setBounds(40,310,50,40);
	        b0.setBounds(110,310,50,40);
	        beq.setBounds(180,310,50,40);
	        badd.setBounds(250,310,50,40);
	        
	        bdel.setBounds(40,450,80,40);
	        bclr.setBounds(130,450,80,40);
	        bpow.setBounds(40, 380, 50, 40);
	        bpowx.setBounds(110, 380, 50, 40);
	        bsqrt.setBounds(180, 380, 50, 40);
	        bcbrt.setBounds(250, 380, 50, 40);
	        
	        
	        Pytagoras.setBounds(220, 450, 80, 40);
	        PytagorasA.setBounds(320, 240, 50, 40);
	        PytagorasB.setBounds(320, 170, 50, 40);
	        PytagorasC.setBounds(320, 100, 50, 40);
	        PytagorasA.setVisible(false);
	        PytagorasB.setVisible(false);
	        PytagorasC.setVisible(false);
	        PytagorasA.setEnabled(false);
	        PytagorasB.setEnabled(false);
	        PytagorasC.setEnabled(false);
	        
	        f.add(t);
	        f.add(b7);
	        f.add(b8);
	        f.add(b9);
	        f.add(bdiv);
	        f.add(b4);
	        f.add(b5);
	        f.add(b6);
	        f.add(bmul);
	        f.add(b1);
	        f.add(b2);
	        f.add(b3);
	        f.add(bsub);
	        f.add(bdec);
	        f.add(b0);
	        f.add(beq);
	        f.add(badd);
	        f.add(bdel);
	        f.add(bclr);
	        f.add(Pytagoras);
	        f.add(PytagorasA);
	        f.add(PytagorasB);
	        f.add(PytagorasC);
	        f.add(bpow);
	        f.add(bpowx);
	        f.add(bsqrt);
	        f.add(bcbrt);
	        
	        
	        
	        f.setLayout(null);
	        f.setVisible(true);
	        f.setSize(390,550);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setResizable(true);
	        
	        b1.addActionListener(this);
	        b2.addActionListener(this);
	        b3.addActionListener(this);
	        b4.addActionListener(this);
	        b5.addActionListener(this);
	        b6.addActionListener(this);
	        b7.addActionListener(this);
	        b8.addActionListener(this);
	        b9.addActionListener(this);
	        b0.addActionListener(this);
	        badd.addActionListener(this);
	        bdiv.addActionListener(this);
	        bmul.addActionListener(this);
	        bsub.addActionListener(this);
	        bdec.addActionListener(this);
	        beq.addActionListener(this);
	        bdel.addActionListener(this);
	        bclr.addActionListener(this);
	        Pytagoras.addActionListener(this);
	        PytagorasA.addActionListener(this);
	        PytagorasB.addActionListener(this);
	        PytagorasC.addActionListener(this);
	        bpow.addActionListener(this);
	        bpowx.addActionListener(this);
	        bsqrt.addActionListener(this);
	        bcbrt.addActionListener(this);
	    }
	 
	    public void actionPerformed(ActionEvent e)
	    {
	        if(e.getSource()==b1)
	            t.setText(t.getText().concat("1"));
	        
	        if(e.getSource()==b2)
	            t.setText(t.getText().concat("2"));
	        
	        if(e.getSource()==b3)
	            t.setText(t.getText().concat("3"));
	        
	        if(e.getSource()==b4)
	            t.setText(t.getText().concat("4"));
	        
	        if(e.getSource()==b5)
	            t.setText(t.getText().concat("5"));
	        
	        if(e.getSource()==b6)
	            t.setText(t.getText().concat("6"));
	        
	        if(e.getSource()==b7)
	            t.setText(t.getText().concat("7"));
	        
	        if(e.getSource()==b8)
	            t.setText(t.getText().concat("8"));
	        
	        if(e.getSource()==b9)
	            t.setText(t.getText().concat("9"));
	        
	        if(e.getSource()==b0)
	            t.setText(t.getText().concat("0"));
	        
	        if(e.getSource()==bdec)
	            t.setText(t.getText().concat("."));
	        
	        if(e.getSource()==badd)
	        {
	            a=Double.parseDouble(t.getText());
	            operator=1;
	            t.setText("");
	        } 
	        
	        if(e.getSource()==bsub)
	        {
	            a=Double.parseDouble(t.getText());
	            operator=2;
	            t.setText("");
	        }
	        
	        if(e.getSource()==bmul)
	        {
	            a=Double.parseDouble(t.getText());
	            operator=3;
	            t.setText("");
	        }
	        
	        if(e.getSource()==bdiv)
	        {
	            a=Double.parseDouble(t.getText());
	            operator=4;
	            t.setText("");
	        }
	        if(e.getSource()==bpow) {
	        	a=Double.parseDouble(t.getText());
	        	t.setText("" + Math.pow(a, 2));
	        }
	        if(e.getSource()==bpowx) {
	        	a=Double.parseDouble(t.getText());
	        	t.setText("");
	        	operator=6;
	        }
	        if(e.getSource()==bsqrt) {
	        	a=Double.parseDouble(t.getText());
	        	t.setText(""+Math.sqrt(a));	        	        	
	        }
	        if(e.getSource()==bcbrt) {
	        	a=Double.parseDouble(t.getText());
	        	t.setText(""+Math.cbrt(a));
	        	
	        }
	        if(countPytaguras < 2) {
	        
	        if(e.getSource()==PytagorasA) {
	        
	        	if(countPytaguras == 0) {
	        		firstPytaguras = "A";
	        	} else {
	        		secondPytaguras = "A";
	        	}
	        	countPytaguras++;	        	
            	t.setText("");            			
            }            		       	        
	        if(e.getSource()==PytagorasB) {
	        	if(countPytaguras == 0) {
	        		firstPytaguras = "B";
	        	} else {
	        		secondPytaguras = "B";
	        	}
	        	t.setText("");
	        	countPytaguras++;
	        }
	        if(e.getSource()==PytagorasC) {
	        	if(countPytaguras == 0) {
	        		firstPytaguras = "C";
	        	} else {
	        		secondPytaguras = "C";
	        	}
	        	t.setText("");
	        	countPytaguras++;
	        	
	        }
	        
	    	
	        }
	        
	        if(e.getSource()==Pytagoras)
	        {
	        	a=Double.parseDouble(t.getText());
	        	operator=5; 
//	        	t.setText("Tippe deine 2. Zahl ein, dann Definiere 1. Nummer und 2. Nummer (abc)");
	        	t.setText("Definiere die 1. und 2. Nummer (abc)");
	        	PytagorasA.setVisible(true);
    	        PytagorasB.setVisible(true);
    	        PytagorasC.setVisible(true);
    	        PytagorasA.setEnabled(true);
    	        PytagorasB.setEnabled(true);
    	        PytagorasC.setEnabled(true);
    	       
	        }
	        if(e.getSource()==beq)
	        {
	            b=Double.parseDouble(t.getText());
	        
	            switch(operator)
	            {
	                case 1: result=a+b;
	                    break;
	        
	                case 2: result=a-b;
	                    break;
	        
	                case 3: result=a*b;
	                    break;
	        
	                case 4: result=a/b;
	                    break;
	                case 5:
	                	if(firstPytaguras.equals("A") || firstPytaguras.equals("B")) {
	                		if(secondPytaguras.equals("A") || secondPytaguras.equals("B")) {
	                			result=(Math.sqrt((Math.pow(a, 2) + (Math.pow(b, 2))))); // a²+b² / b²+a²
	                			break;
	                		}
	                		
	                	}
	                	if(firstPytaguras.equals("C")) {
	                		if(secondPytaguras.equals("A") || secondPytaguras.equals("B")) {
	                			result=(Math.sqrt((Math.pow(a, 2) - (Math.pow(b, 2)))));// c²-b² / c²-a²
	                			break;
	                		}
	                	}
	                	if(firstPytaguras.equals("A") || firstPytaguras.equals("B")) {
	                		if(secondPytaguras.equals("C")){
	                			result=(Math.sqrt((Math.pow(b, 2) - (Math.pow(a, 2)))));// -a²+c² / -b²+c²
	                			break;
	                		}
	                	}
	                	if(firstPytaguras.equals("C")) {
	                		if(secondPytaguras.equals("C")){
	                			result = 0;
	                			t.setText("Error ein Dreieck hat keine 2 C Seiten");
	                			break;
	                		}
	                	}
	                	if(firstPytaguras.equals("B")) {
	                		if(secondPytaguras.equals("B")){
	                			result = 0;
	                			t.setText("Error ein Dreieck hat keine 2 B Seiten");
	                			break;
	                		}
	                	}
	                	if(firstPytaguras.equals("A")) {
	                		if(secondPytaguras.equals("A")){
	                			result = 0;
	                			t.setText("Error ein Dreieck hat keine 2 A Seiten");
	                			break;
	                		}	                	
	                		break;
	                	}
	                case 6: result=Math.pow(a, b);
	                    break;    
	             //       switch(variable)
	        	        //{
	        	   //         case 1: result=(Math.sqrt((Math.pow(a, 2) + (Math.pow(b, 2))))); // a²+b² / b²+a²
	        	     //   	    break;
	        	       //     case 2: result=(Math.sqrt((Math.pow(a, 2) - (Math.pow(b, 2)))));// c²-b² / c²-a²
	        	         //       break;
	        	           // case 3: result=(Math.sqrt((Math.pow(b, 2) - (Math.pow(a, 2)))));// -a²+c² / -b²+c²
	        	        //}
	        
	                default: result=0;
	            }
	        
	            t.setText(""+result);
	        }
	        
	        if(e.getSource()==bclr) {
	            t.setText("");
	            firstPytaguras = "";
	            secondPytaguras = "";
	            countPytaguras = 0;
	            PytagorasA.setVisible(false);
		        PytagorasB.setVisible(false);
		        PytagorasC.setVisible(false);
		        PytagorasA.setEnabled(false);
		        PytagorasB.setEnabled(false);
		        PytagorasC.setEnabled(false);
	        }
	        
	        if(e.getSource()==bdel)
	        {
	            String s=t.getText();
	            t.setText("");
	            for(int i=0;i<s.length()-1;i++)
	            t.setText(t.getText()+s.charAt(i));
	        }  
	    }
	    
	}
