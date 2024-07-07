package managementSystem;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Dashboard extends JFrame implements ActionListener{
	
	String username;
	JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkpackages;
	JButton bookpackages,viewpackaage,viewhotels,destinations,payment,bookhotels,deletePersonalDetails;
	JButton viewbookhotels,calculator,notepad,about;
	Dashboard(String username){
		this.username=username;
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBounds(0, 0, 1600, 65);
		p1.setLayout(null);
		p1.setBackground(new Color(0,0,102));
		add(p1);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
		Image i2= i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel icon = new JLabel(i3);
		icon.setBounds(5, 0, 70, 70);
		p1.add(icon);
		
		JLabel heading = new JLabel("Dashboard");
		heading.setBounds(80, 10, 300, 40);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahoma",Font.BOLD,30));
		p1.add(heading);
		
		JPanel p2 = new JPanel();
		p2.setBounds(0, 65, 300, 900);
		p2.setLayout(null);
		p2.setBackground(new Color(0,0,102));
		add(p2);
		
		addPersonalDetails = new JButton("addPersonalDetails");
		addPersonalDetails.setBounds(0,0,300,50);
		addPersonalDetails.setBackground(new Color(0,0,102));
		addPersonalDetails.setForeground(Color.WHITE);
		addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		addPersonalDetails.setMargin(new Insets(0,0,0,60));
		addPersonalDetails.addActionListener(this);
		p2.add(addPersonalDetails);
		
		updatePersonalDetails = new JButton("UpdatePersonalDetails");
		updatePersonalDetails.setBounds(0,50,300,50);
		updatePersonalDetails.setBackground(new Color(0,0,102));
		updatePersonalDetails.setForeground(Color.WHITE);
		updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		updatePersonalDetails.setMargin(new Insets(0,0,0,30));
		updatePersonalDetails.addActionListener(this);
		p2.add(updatePersonalDetails);
		
		viewPersonalDetails = new JButton("View Details");
		viewPersonalDetails.setBounds(0,100,300,50);
		viewPersonalDetails.setBackground(new Color(0,0,102));
		viewPersonalDetails.setForeground(Color.WHITE);
		viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewPersonalDetails.setMargin(new Insets(0,0,0,130));
		viewPersonalDetails.addActionListener(this);
		p2.add(viewPersonalDetails);
		
	    deletePersonalDetails = new JButton("Delete Personal Details");
		deletePersonalDetails.setBounds(0,150,300,50);
		deletePersonalDetails.setBackground(new Color(0,0,102));
		deletePersonalDetails.setForeground(Color.WHITE);
		deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		deletePersonalDetails.setMargin(new Insets(0,0,0,40));
		deletePersonalDetails.addActionListener(this);
		p2.add(deletePersonalDetails);
		
		checkpackages = new JButton("Check Package");
		checkpackages.setBounds(0,200,300,50);
		checkpackages.setBackground(new Color(0,0,102));
		checkpackages.setForeground(Color.WHITE);
		checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
		checkpackages.setMargin(new Insets(0,0,0,110));
		checkpackages.addActionListener(this);
		p2.add(checkpackages);
		
		bookpackages = new JButton("Book Package");
		bookpackages.setBounds(0,250,300,50);
		bookpackages.setBackground(new Color(0,0,102));
		bookpackages.setForeground(Color.WHITE);
		bookpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
		bookpackages.setMargin(new Insets(0,0,0,120));
		bookpackages.addActionListener(this);
		p2.add(bookpackages);
		
		viewpackaage = new JButton("View Package");
		viewpackaage.setBounds(0,300,300,50);
		viewpackaage.setBackground(new Color(0,0,102));
		viewpackaage.setForeground(Color.WHITE);
		viewpackaage.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewpackaage.setMargin(new Insets(0,0,0,120));
		viewpackaage.addActionListener(this);
		p2.add(viewpackaage);
		
		viewhotels = new JButton("View Hotels");
		viewhotels.setBounds(0,350,300,50);
		viewhotels.setBackground(new Color(0,0,102));
		viewhotels.setForeground(Color.WHITE);
		viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewhotels.setMargin(new Insets(0,0,0,130));
		viewhotels.addActionListener(this);
		p2.add(viewhotels);
		
		bookhotels = new JButton("Book Hotels");
		bookhotels.setBounds(0,400,300,50);
		bookhotels.setBackground(new Color(0,0,102));
		bookhotels.setForeground(Color.WHITE);
		bookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
		bookhotels.setMargin(new Insets(0,0,0,140));
		bookhotels.addActionListener(this);
		p2.add(bookhotels);
		
		viewbookhotels = new JButton("View Book Hotels");
		viewbookhotels.setBounds(0,450,300,50);
		viewbookhotels.setBackground(new Color(0,0,102));
		viewbookhotels.setForeground(Color.WHITE);
		viewbookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewbookhotels.setMargin(new Insets(0,0,0,70));
		viewbookhotels.addActionListener(this);
		p2.add(viewbookhotels);
		
		destinations = new JButton("Destinations");
		destinations.setBounds(0,500,300,50);
		destinations.setBackground(new Color(0,0,102));
		destinations.setForeground(Color.WHITE);
		destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
		destinations.setMargin(new Insets(0,0,0,125));
		destinations.addActionListener(this);
		p2.add(destinations);
		
		payment = new JButton("Payment");
		payment.setBounds(0,550,300,50);
		payment.setBackground(new Color(0,0,102));
		payment.setForeground(Color.WHITE);
		payment.setFont(new Font("Tahoma",Font.PLAIN,20));
		payment.setMargin(new Insets(0,0,0,155));
		payment.addActionListener(this);
		p2.add(payment);
		
		calculator = new JButton("Calculator");
		calculator.setBounds(0,600,300,50);
		calculator.setBackground(new Color(0,0,102));
		calculator.setForeground(Color.WHITE);
		calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
		calculator.setMargin(new Insets(0,0,0,145));
		calculator.addActionListener(this);
		p2.add(calculator);
		
		notepad = new JButton("Notepad");
		notepad.setBounds(0,650,300,50);
		notepad.setBackground(new Color(0,0,102));
		notepad.setForeground(Color.WHITE);
		notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
		notepad.setMargin(new Insets(0,0,0,155));
		notepad.addActionListener(this);
		p2.add(notepad);
		
		about = new JButton("About");
		about.setBounds(0,700,300,50);
		about.setBackground(new Color(0,0,102));
		about.setForeground(Color.WHITE);
		about.setFont(new Font("Tahoma",Font.PLAIN,20));
		about.setMargin(new Insets(0,0,0,175));
		about.addActionListener(this);
		p2.add(about);
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
		Image i5= i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel image = new JLabel(i6);
		image.setBounds(0, 0, 1650, 1000);
		add(image);
		
		JLabel text = new JLabel("Travel and Tourrism Management System");
		text.setBounds(320, 60, 1400,70);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Raleway",Font.PLAIN,55));
		image.add(text);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==addPersonalDetails) {
			new AddCustomer(username);
		}else if(ae.getSource()==viewPersonalDetails) {
			new ViewCustomer(username);
		}else if(ae.getSource()==updatePersonalDetails){
			new UpdateCustomer(username);
		}else if(ae.getSource()==checkpackages){
			new CheckPackage();
		}else if(ae.getSource()==bookpackages) {
			new BookPackage(username);
		}else if(ae.getSource()==viewpackaage) {
			new ViewPackage(username);
		}else if(ae.getSource()==viewhotels) {
			new CheckHotels();
		}else if(ae.getSource()==destinations) {
			new Destinations();
		}else if(ae.getSource()==bookhotels) {
			new BookHotel(username);
		}else if(ae.getSource()==viewbookhotels) {
			new ViewBookHotel(username);
		}else if(ae.getSource()==payment) {
			new Payment();
		}else if(ae.getSource()==calculator) {
			try {
				Runtime.getRuntime().exec("calc.exe");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(ae.getSource()==notepad) {
			try {
				Runtime.getRuntime().exec("notepad.exe");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(ae.getSource()==about) {
			new About();
		}else if(ae.getSource()==deletePersonalDetails) {
			new DeleteDetails(username);
		}
	}

	public static void main(String[] args) {
		new Dashboard("");

	}

}
