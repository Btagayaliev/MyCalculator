package com.calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MyCalculator
{
  private JFrame frame;
  private JTextField textField;
  double number;
  double result;
  char value;
  
  public static void main(String[] args)
  {
    try
    {
      UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
    }
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(MyCalculator.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(MyCalculator.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(MyCalculator.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(MyCalculator.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        try
        {
          MyCalculator window = new MyCalculator();
          window.frame.setVisible(true);
        }
        catch (Exception e)
        {
          e.printStackTrace();
        }
      }
    });
  }
  
  public MyCalculator()
  {
    initialize();
  }
  
  public void calculate()
  {
    switch (this.value)
    {
    case '+': 
      this.result = (this.number + Double.parseDouble(this.textField.getText()));
      
      this.textField.setText(Double.toString(this.result));
      
      break;
    case '-': 
      this.result = (this.number - Double.parseDouble(this.textField.getText()));
      
      this.textField.setText(Double.toString(this.result));
      
      break;
    case '*': 
      this.result = (this.number * Double.parseDouble(this.textField.getText()));
      
      this.textField.setText(Double.toString(this.result));
      
      break;
    case '/': 
      this.result = (this.number / Double.parseDouble(this.textField.getText()));
      
      this.textField.setText(Double.toString(this.result));
    }
  }
  
  private void initialize()
  {
    this.frame = new JFrame();
    this.frame.setResizable(false);
    this.frame.setBounds(100, 100, 385, 466);
    this.frame.setDefaultCloseOperation(3);
    this.frame.getContentPane().setLayout(null);
    
    this.textField = new JTextField();
    this.textField.setFont(new Font("Georgia", 1, 16));
    this.textField.setHorizontalAlignment(11);
    this.textField.setBounds(33, 55, 279, 56);
    this.frame.getContentPane().add(this.textField);
    this.textField.setColumns(10);
    
    JButton key_one = new JButton("1");
    key_one.setFont(new Font("Georgia", 1, 14));
    key_one.setForeground(new Color(47, 79, 79));
    key_one.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.textField.setText(MyCalculator.this.textField.getText() + "1");
      }
    });
    final JLabel myLabel = new JLabel("");
    myLabel.setFont(new Font("Georgia", 1, 14));
    myLabel.setHorizontalAlignment(11);
    myLabel.setBounds(209, 9, 103, 35);
    this.frame.getContentPane().add(myLabel);
    key_one.setBounds(33, 123, 62, 43);
    this.frame.getContentPane().add(key_one);
    
    JButton key_two = new JButton("2");
    key_two.setFont(new Font("Georgia", 1, 14));
    key_two.setForeground(new Color(47, 79, 79));
    key_two.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.textField.setText(MyCalculator.this.textField.getText() + "2");
      }
    });
    key_two.setBounds(105, 123, 62, 43);
    this.frame.getContentPane().add(key_two);
    
    JButton key_three = new JButton("3");
    key_three.setFont(new Font("Georgia", 1, 14));
    key_three.setForeground(new Color(47, 79, 79));
    key_three.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.textField.setText(MyCalculator.this.textField.getText() + "3");
      }
    });
    key_three.setBounds(177, 123, 62, 43);
    this.frame.getContentPane().add(key_three);
    
    JButton key_add = new JButton("+");
    key_add.setFont(new Font("Georgia", 1, 14));
    key_add.setForeground(new Color(47, 79, 79));
    
    key_add.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.number = Double.parseDouble(MyCalculator.this.textField.getText());
        MyCalculator.this.value = '+';
        myLabel.setText(MyCalculator.this.textField.getText() + " +");
        MyCalculator.this.textField.setText("");
      }
    });
    key_add.setBounds(249, 123, 62, 43);
    this.frame.getContentPane().add(key_add);
    
    JButton key_four = new JButton("4");
    key_four.setFont(new Font("Georgia", 1, 14));
    key_four.setForeground(new Color(47, 79, 79));
    key_four.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.textField.setText(MyCalculator.this.textField.getText() + "4");
      }
    });
    key_four.setBounds(33, 182, 62, 43);
    this.frame.getContentPane().add(key_four);
    
    JButton key_five = new JButton("5");
    key_five.setFont(new Font("Georgia", 1, 14));
    key_five.setForeground(new Color(47, 79, 79));
    key_five.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.textField.setText(MyCalculator.this.textField.getText() + "5");
      }
    });
    key_five.setBounds(105, 182, 62, 43);
    this.frame.getContentPane().add(key_five);
    
    JButton key_six = new JButton("6");
    key_six.setFont(new Font("Georgia", 1, 14));
    key_six.setForeground(new Color(47, 79, 79));
    key_six.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.textField.setText(MyCalculator.this.textField.getText() + "6");
      }
    });
    key_six.setBounds(177, 182, 62, 43);
    this.frame.getContentPane().add(key_six);
    
    JButton key_subtract = new JButton("-");
    key_subtract.setFont(new Font("Georgia", 1, 14));
    key_subtract.setForeground(new Color(47, 79, 79));
    key_subtract.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.number = Double.parseDouble(MyCalculator.this.textField.getText());
        MyCalculator.this.value = '-';
        myLabel.setText(MyCalculator.this.textField.getText() + " -");
        MyCalculator.this.textField.setText("");
      }
    });
    key_subtract.setBounds(249, 182, 62, 43);
    this.frame.getContentPane().add(key_subtract);
    
    JButton key_seven = new JButton("7");
    key_seven.setFont(new Font("Georgia", 1, 14));
    key_seven.setForeground(new Color(47, 79, 79));
    key_seven.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.textField.setText(MyCalculator.this.textField.getText() + "7");
      }
    });
    key_seven.setBounds(33, 245, 62, 43);
    this.frame.getContentPane().add(key_seven);
    
    JButton key_eight = new JButton("8");
    key_eight.setFont(new Font("Georgia", 1, 14));
    key_eight.setForeground(new Color(47, 79, 79));
    key_eight.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.textField.setText(MyCalculator.this.textField.getText() + "8");
      }
    });
    key_eight.setBounds(105, 245, 62, 43);
    this.frame.getContentPane().add(key_eight);
    
    JButton key_nine = new JButton("9");
    key_nine.setFont(new Font("Georgia", 1, 14));
    key_nine.setForeground(new Color(47, 79, 79));
    key_nine.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.textField.setText(MyCalculator.this.textField.getText() + "9");
      }
    });
    key_nine.setBounds(177, 245, 62, 43);
    this.frame.getContentPane().add(key_nine);
    
    JButton key_multiply = new JButton("*");
    key_multiply.setFont(new Font("Georgia", 1, 14));
    key_multiply.setForeground(new Color(47, 79, 79));
    key_multiply.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.number = Double.parseDouble(MyCalculator.this.textField.getText());
        MyCalculator.this.value = '*';
        myLabel.setText(MyCalculator.this.textField.getText() + " *");
        MyCalculator.this.textField.setText("");
      }
    });
    key_multiply.setBounds(249, 245, 62, 43);
    this.frame.getContentPane().add(key_multiply);
    
    JButton key_dot = new JButton(".");
    key_dot.setFont(new Font("Georgia", 1, 14));
    key_dot.setForeground(new Color(47, 79, 79));
    key_dot.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.textField.setText(MyCalculator.this.textField.getText() + ".");
      }
    });
    key_dot.setBounds(33, 306, 62, 43);
    this.frame.getContentPane().add(key_dot);
    
    JButton key_zero = new JButton("0");
    key_zero.setFont(new Font("Georgia", 1, 14));
    key_zero.setForeground(new Color(47, 79, 79));
    key_zero.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.textField.setText(MyCalculator.this.textField.getText() + "0");
      }
    });
    key_zero.setBounds(105, 306, 62, 43);
    this.frame.getContentPane().add(key_zero);
    
    JButton key_back = new JButton("CE");
    key_back.setFont(new Font("Georgia", 1, 14));
    key_back.setForeground(new Color(47, 79, 79));
    key_back.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        int size = MyCalculator.this.textField.getText().length();
        int number = MyCalculator.this.textField.getText().length() - 1;
        String st = "";
        if (size > 0)
        {
          StringBuilder sb = new StringBuilder(MyCalculator.this.textField.getText());
          sb.deleteCharAt(number);
          st = sb.toString();
        }
        MyCalculator.this.textField.setText(st);
      }
    });
    key_back.setBounds(177, 306, 62, 43);
    this.frame.getContentPane().add(key_back);
    
    JButton key_divide = new JButton("/");
    key_divide.setFont(new Font("Georgia", 1, 14));
    key_divide.setForeground(new Color(47, 79, 79));
    key_divide.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.number = Double.parseDouble(MyCalculator.this.textField.getText());
        MyCalculator.this.value = '/';
        myLabel.setText(MyCalculator.this.textField.getText() + " /");
        MyCalculator.this.textField.setText("");
      }
    });
    key_divide.setBounds(249, 306, 62, 43);
    this.frame.getContentPane().add(key_divide);
    
    JButton key_clear = new JButton("AC");
    key_clear.setFont(new Font("Georgia", 1, 14));
    key_clear.setForeground(new Color(47, 79, 79));
    key_clear.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.textField.setText("");
        myLabel.setText("");
      }
    });
    key_clear.setBounds(33, 360, 62, 43);
    this.frame.getContentPane().add(key_clear);
    
    JButton key_result = new JButton("Result");
    key_result.setFont(new Font("Georgia", 1, 14));
    key_result.setForeground(new Color(47, 79, 79));
    key_result.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        MyCalculator.this.calculate();
        myLabel.setText("");
      }
    });
    key_result.setBounds(105, 360, 207, 43);
    this.frame.getContentPane().add(key_result);
  }
}
