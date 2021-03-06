import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;

/** Menu<br>
 * Entry point for project
 * 
 * @author 
 *
 *
 */
public class Amazon_UI extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Amazon_UI frame = new Amazon_UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Amazon_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

        // Menu Objects 
        JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
        
		JMenu mnClothing = new JMenu("Clothing");
		menuBar.add(mnClothing);
		
		JMenuItem mntmShirt = new JMenuItem("Shirt");
		mnClothing.add(mntmShirt);
		mntmShirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clothing_UI frame = new Clothing_UI(0);
		        frame.lblImage.setIcon(new ImageIcon("src/nike.jpg")); 
		        frame.setVisible(true); 
			}
		});
		
		JMenuItem mntmPant = new JMenuItem("Pant");
		mnClothing.add(mntmPant);
		mntmPant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clothing_UI frame = new Clothing_UI(2);
		        frame.lblImage.setIcon(new ImageIcon("src/pants.jpg")); 
		        frame.setVisible(true); 
			}
		});
		
		JMenuItem mntmShoe = new JMenuItem("Shoe");
		mnClothing.add(mntmShoe);
		mntmShoe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clothing_UI frame = new Clothing_UI(1);
		        frame.lblImage.setIcon(new ImageIcon("src/shoes.jpg")); 
		        frame.setVisible(true); 
			}
		});
		
		JMenu mnToys = new JMenu("Toys");
		menuBar.add(mnToys);
		
		JMenuItem mntmChicken = new JMenuItem("Rubber Chicken");
		mnToys.add(mntmChicken);
		mntmChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Toys_UI frame = new Toys_UI("Rubber Chicken", 10.99, "50+");
				frame.setVisible(true);
			}
		});
		
		JMenuItem mntmLegos = new JMenuItem("Lego");
		mnToys.add(mntmLegos);
		mntmLegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Toys_UI frame = new Toys_UI("Legos", 15.99, "8-11");
				frame.setVisible(true);
			}
		});
		
		JMenuItem mntmStuffedAnimals = new JMenuItem("Stuffed Animal");
		mnToys.add(mntmStuffedAnimals);
		mntmStuffedAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Toys_UI frame = new Toys_UI("Stuffed animals", 8.99, "5-10");
				frame.setVisible(true);
			}
		});
		
		JMenu mnElectronics = new JMenu("Electronics");
		menuBar.add(mnElectronics);

		JMenuItem mntmPhone = new JMenuItem("Phone");
		mnElectronics.add(mntmPhone);
		mntmPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Electronics_UI frame = new Electronics_UI("iPhone", 500.01, "Apple");
				frame.setVisible(true);
			}
		});
		
		JMenuItem mntmComputer = new JMenuItem("Computer");
		mnElectronics.add(mntmComputer);
		mntmComputer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Electronics_UI frame = new Electronics_UI("Computer", 600.01, "Microsoft");
				frame.setVisible(true);
			}
		});
		
		JMenuItem mntmTV = new JMenuItem("TV");
		mnElectronics.add(mntmTV);
		mntmTV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Electronics_UI frame = new Electronics_UI("TV", 800.01, "Sony");
				frame.setVisible(true);
			}
		});
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenuItem mntmFurniture = new JMenuItem("Couch");
		mnHome.add(mntmFurniture);
		mntmPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_UI frame = new Home_UI("Coach",350.01, "15 ft x 5 ft");
				frame.setVisible(true);
			}
		});
		
		JMenuItem mntmDecor = new JMenuItem("Table");
		mnHome.add(mntmDecor);
		mntmDecor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_UI frame = new Home_UI("Table", 100.00, "10 ft x 15 ft");
				frame.setVisible(true);
			}
		});
		
		JMenu mnSearch = new JMenu("Search");
		menuBar.add(mnSearch);
		
		JMenuItem mntmSearch = new JMenuItem("Search for a product");
		mnSearch.add(mntmSearch);
		mntmSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_UI frame = new Search_UI();
				frame.setVisible(true);
			}
		});
		
		JMenu Cart = new JMenu("My Cart");
		menuBar.add(Cart);
		
		JMenuItem mntmCheckout = new JMenuItem("Proceed to Checkout");
		Cart.add(mntmCheckout);
		getContentPane().setLayout(null);
		mntmCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cart_UI frame = new Cart_UI();
				frame.setVisible(true);
			}
		});
		
		/*JLabel lblAmazon = new JLabel("Welcome to Amazon!");
		lblAmazon.setOpaque(true);
		lblAmazon.setBackground(Color.ORANGE);
		lblAmazon.setBounds(147, 17, 137, 78);
		getContentPane().add(lblAmazon);*/ 
		
		
	}
	
}
