package managementSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

// first panel then background then layout then setting bounds

public class Login extends JFrame implements ActionListener{
	JButton login,signUp,password;
	JTextField tfpassword,tfusername;
	Login(){
		setSize(850,400);
		setLocation(350,200);
		setLayout(null);
		
		getContentPane().setBackground(Color.WHITE);
		
		JPanel p1= new JPanel();
		p1.setBackground(new Color(131,193,233));
		p1.setBounds(0, 0, 400, 400);
		p1.setLayout(null);
		add(p1);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
		Image i2= i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(100, 120, 200, 200);
		p1.add(image);
		
		JPanel p2= new JPanel();
		p2.setLayout(null);
		p2.setBounds(400, 0, 500, 400);
		add(p2);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setBounds(60, 20, 100, 25);
		lblusername.setFont(new Font("SAN SERIF",Font.PLAIN,20));
		p2.add(lblusername);
		
		tfusername= new JTextField();
		tfusername.setBounds(60, 60, 300, 30);
		tfusername.setBorder(BorderFactory.createEmptyBorder());
		p2.add(tfusername);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setBounds(60, 110, 100, 25);
		lblpassword.setFont(new Font("SAN SERIF",Font.PLAIN,20));
		p2.add(lblpassword);
		
		tfpassword= new JTextField();
		tfpassword.setBounds(60, 150, 300, 30);
		tfpassword.setBorder(BorderFactory.createEmptyBorder());
		p2.add(tfpassword);
		
	    login= new JButton("Login");
		login.setBounds(60, 200, 130, 30);
		login.setBackground(new Color(133,193,233));
		login.setForeground(Color.WHITE);
		login.setBorder(new LineBorder(new Color(133,193,233)));
		login.addActionListener(this);
		p2.add(login);
		
	    signUp = new JButton("Signup");
		signUp.setBounds(230, 200, 130, 30);
		signUp.setBackground(new Color(133,193,233));
		signUp.setForeground(Color.WHITE);
		signUp.setBorder(new LineBorder(new Color(133,193,233)));
		signUp.addActionListener(this);
		p2.add(signUp);
		
	    password = new JButton("Forget Password");
		password.setBounds(130, 250, 130, 30);
		password.setBackground(new Color(133,193,233));
		password.setForeground(Color.WHITE);
		password.setBorder(new LineBorder(new Color(133,193,233)));
		password.addActionListener(this);
		p2.add(password);
		
		JLabel text = new JLabel("trouble in login...");
		text.setBounds(300, 250, 150, 20);
		text.setForeground(Color.RED);
		p2.add(text);
		
				
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Login();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==login) {
			try {
				String username=tfusername.getText();
				String pass=tfpassword.getText();
				String query ="select * from account where username = '"+username+"' AND password = '"+pass+"'";
				Conn c=new Conn();
				ResultSet r = c.s.executeQuery(query);
				if(r.next()) {
					setVisible(false);
					new Loading(username);	
				}else {
					JOptionPane.showMessageDialog(null, "Incorrect username and Password");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(ae.getSource()==signUp) {
			setVisible(false); 
			new Signup();
		}
		else if(ae.getSource()==password) {
			setVisible(false); 
			new ForgetPassword();
		}		
	}

}