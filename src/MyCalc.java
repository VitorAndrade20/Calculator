import java.awt.*;
import java.awt.event.*;

class MyCalc extends WindowAdapter implements ActionListener{
    Frame f;
    Label l1;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    Button badd,bsub,bmult,bdiv,bmod,bcalc,bclr,bpts,bneg,bback;
    double xd;
    double num1, num2, check;

    //class constructor
    MyCalc() {
        f = new Frame("MY CALCULATOR");
        l1 = new Label();
        l1.setBackground(Color.LIGHT_GRAY);
        l1.setBounds(50, 50, 260, 60);

        b1 = new Button("1");
        b1.setBounds(50, 340, 50, 50);
        b2 = new Button("2");
        b2.setBounds(120, 340, 50, 50);
        b3 = new Button("3");
        b3.setBounds(190, 340, 50, 50);
        b4 = new Button("4");
        b4.setBounds(50, 270, 50, 50);
        b5 = new Button("5");
        b5.setBounds(120, 270, 50, 50);
        b6 = new Button("6");
        b6.setBounds(190, 270, 50, 50);
        b7 = new Button("7");
        b7.setBounds(50, 200, 50, 50);
        b8 = new Button("8");
        b8.setBounds(120, 200, 50, 50);
        b9 = new Button("9");
        b9.setBounds(190, 200, 50, 50);
        b0 = new Button("0");
        b0.setBounds(120, 410, 50, 50);
        bneg = new Button("+/-");
        bneg.setBounds(50, 410, 50, 50);
        bpts = new Button(".");
        bpts.setBounds(190, 410, 50, 50);
        bback = new Button("back");
        bback.setBounds(120, 130, 50, 50);
        badd = new Button("+");
        badd.setBounds(260, 340, 50, 50);
        bsub = new Button("-");
        bsub.setBounds(260, 270, 50, 50);
        bmult = new Button("*");
        bmult.setBounds(260,200,50,50);
        bdiv = new Button("/");
        bdiv.setBounds(260, 130, 50, 50);
        bmod = new Button("%");
        bmod.setBounds(190, 130, 50, 50);
        bcalc = new Button("=");
        bcalc.setBounds(245, 410, 65, 50);
        bclr = new Button("CE");
        bclr.setBounds(50,130,65,50);
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

        bpts.addActionListener(this);
        bneg.addActionListener(this);
        bback.addActionListener(this);

        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmult.addActionListener(this);
        bdiv.addActionListener(this);
        bmod.addActionListener(this);
        bcalc.addActionListener(this);
        bclr.addActionListener(this);

        f.addWindowListener(this);
        //adding to frame
        f.add(l1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(badd);
        f.add(bsub);
        //f.add(bmod);
        f.add(bmult);
        f.add(bdiv);
        f.add(bmod);
        f.add(bcalc);
        f.add(bclr);
        f.add(bpts);
        f.add(bneg);
        f.add(bback);

        f.setSize(360, 500);
        f.setLayout(null);
        f.setVisible(true);
    }//end of constructor

    //closing the window
    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        String z = "", zt = l1.getText(); //z -> Stores the value to be displayed after the current action.
                                          //zt -> Stores the value displayed so far.
        Button btn = (Button) e.getSource(); //Stores the Button pressed.
        String label = btn.getLabel();       //Stores the label of Button.

        //Switch Case for the "non-operation" buttons.
        switch (label){
            case "1":
                z = zt + "1";
                l1.setText(z);
                break;
            case "2":
                z = zt + "2";
                l1.setText(z);
                break;
            case "3":
                z = zt + "3";
                l1.setText(z);
                break;
            case "4":
                z = zt + "4";
                l1.setText(z);
                break;
            case "5":
                z = zt + "5";
                l1.setText(z);
                break;
            case "6":
                z = zt + "6";
                l1.setText(z);
                break;
            case "7":
                z = zt + "7";
                l1.setText(z);
                break;
            case "8":
                z = zt + "8";
                l1.setText(z);
                break;
            case "9":
                z = zt + "9";
                l1.setText(z);
                break;
            case "0":
                z = zt + "0";
                l1.setText(z);
                break;
//            case "badd":
//
//            case "bsub"
//            case "bmod"
//            case "bmult"
//            case "bdiv"
//            case "bcalc"
            case "CE":
                num1 = 0;
                num2 = 0;
                check = 0;
                xd = 0;
                z = "";
                l1.setText(z);
                break;
            case ".":
                z = zt + ".";
                l1.setText(z);
                break;
//            case "-":
//                z = "-" + zt;
//                break;
            case "back":
                try {
                    z = zt.substring(0, zt.length() - 1);
                } catch (StringIndexOutOfBoundsException f) {
                    return;
                }
                l1.setText(z);
                break;
            default: break;
        }

        //number button
//        if (e.getSource() == b1) {
//            zt = l1.getText();
//            z = zt + "1";
//            l1.setText(z);
//        }
//        if (e.getSource() == b2) {
//            zt = l1.getText();
//            z = zt + "2";
//            l1.setText(z);
//        }
//        if (e.getSource() == b3) {
//            zt = l1.getText();
//            z = zt + "3";
//            l1.setText(z);
//        }
//        if (e.getSource() == b4) {
//            zt = l1.getText();
//            z = zt + "4";
//            l1.setText(z);
//        }
//        if (e.getSource() == b5) {
//            zt = l1.getText();
//            z = zt + "5";
//            l1.setText(z);
//        }
//        if (e.getSource() == b6) {
//            zt = l1.getText();
//            z = zt + "6";
//            l1.setText(z);
//        }
//        if (e.getSource() == b7) {
//            zt = l1.getText();
//            z = zt + "7";
//            l1.setText(z);
//        }
//        if (e.getSource() == b8) {
//            zt = l1.getText();
//            z = zt + "8";
//            l1.setText(z);
//        }
//        if (e.getSource() == b9) {
//            zt = l1.getText();
//            z = zt + "9";
//            l1.setText(z);
//        }
//        if (e.getSource() == b0) {
//            zt = l1.getText();
//            z = zt + "0";
//            l1.setText(z);
//        }
        //add decimal point
//        if (e.getSource() == bpts) {
//            zt = l1.getText();
//            z = zt + ".";
//            l1.setText(z);
//        }
//        //add negative sign
//        if (e.getSource() == bneg) {
//            zt = l1.getText();
//            z = "-" + zt;
//            l1.setText(z);
//        }
        //clear the last digit
//        if (e.getSource() == bback) {
//            zt = l1.getText();
//            try {
//                z = zt.substring(0, zt.length() - 1);
//            } catch (StringIndexOutOfBoundsException f) {
//                return;
//            }
//            l1.setText(z);
//        }
        //operations buttons;
        //verifies if the divided number is valid;
        //var check => stores the operation type.
        Object compare = e.getSource();
        if (compare == badd || compare == bsub || compare == bmult || compare == bdiv || compare == bmod) {
            try {
                num1 = Double.parseDouble(l1.getText());
              //  num1 = Double.parseDouble(l1.getText().substring(0,1));
            } catch (NumberFormatException f) {
                l1.setText("Invalid Format");
                return;
            }
            if (compare == badd) {
                check = 1;
            } else if (compare == bsub) {
                check = 2;
            } else if (compare == bmult) {
                check = 3;
            } else {
                check = 4;
            }
            z = "";
            l1.setText(z);
        }
        //prompts the operation result or return an error if the input is invalid
        if (e.getSource() == bcalc) {
            try {
                num2 = Double.parseDouble(l1.getText());
            } catch (Exception f) {
                l1.setText("Enter Number First");
                return;
            }
            if (check == 1) {
                xd = num1 + num2;
            }
            if (check == 2) {
                xd = num1 - num2;
            }
            if (check == 3) {
                xd = num1 * num2;
            }
            if (check == 4) {
                xd = num1 / num2;
            }
            l1.setText(String.valueOf(xd));
        }
        //clear button
//        if (e.getSource() == bclr) {
//            num1 = 0;
//            num2 = 0;
//            check = 0;
//            xd = 0;
//            z = "";
//            l1.setText(z);
//        }
    }
}