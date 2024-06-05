package ChatAplication;


	
	import java.awt.*; //color
	import java.awt.event.*;  // actionListner
	import javax.swing.*; // main file
import javax.swing.border.*; //boder layout // line number 339
import java.util.*; //use date
import java.text.*;
import java.net.*;
import java.io.*;


	public class ServerMain extends JFrame implements ActionListener { // ActionListener abstrat method created is mandatroy
		
		//globl decla
		JTextField text;
		//chat box
		
		// main frame
		JPanel a1;
		//vertical msg show
	static	Box vertical=Box.createVerticalBox();
	static	JFrame f = new JFrame();
	static DataOutputStream du;
		
		
		
		
		
		
		public  ServerMain() {
			
			
		
			
			
		
			
			
	
	
	
	
	//step 2...
			
			// Because own create layout this resone layout is null;
			//Mandatory
			f.setLayout(null);
			
			//create a top of panel in window ;
			//create object because JPanel extend Class;
			//Swing package
			JPanel j1= new JPanel();
			/*
			 * creat frame for use JPanel
			 */
			// SET PANEL COLOR ;
			//COLOR PERENT CLASS OF CREATE OBJECT (R,G,B);
			//green color
			j1.setBackground(new Color(7,94,84));
			
			//set of bound is use first panel
			//task bar created
			j1.setBounds(0, 0, 450,70);
			
			//Because layout page  set of Null and create own layout page;
			
			//add the function use method add
			f.add(j1);
			//by defualt are nuull becuse not set your layout
			j1.setLayout(null);
			
			
			
			
			
			//step 3...
			//awt package
			// imge is erro
			//Adding image of icon       //class  in    //static method   // icon address;
			ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
			
		// this line is ero image are proper shape
		// Image is class // select all i1 part // method   //image is crop
			// image is edit
			Image i2 = i1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
			
			
			//convert Image class to ImageIcone class
			ImageIcon i3 = new ImageIcon(i2);
			
			//Create Label and pass the argument of ImageIcone object name;
			//2. Passed i3 because ero image are crop so JLable are access only ImageIcone i1 not insert;
			JLabel ero = new JLabel(i3);
			
			//Image length
			ero.setBounds(5, 20, 25, 25);
		// j1 up the photo that reason are j1.add;	
		j1.add(ero);
		
		
		
		// first icon code
		// this line is use icone photo (DP for first user)
					ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png")) ;	
					// use  for icone mins dp photo edit 
					Image i5 = i4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
					 // this line covert to ImageIcon
					ImageIcon i6 =	new ImageIcon(i5);
					//creat profile photo
					JLabel profil = new JLabel(i6);
					
				profil.setBounds(38, 10, 50, 50);
				// mins j1 is background 
					j1.add(profil);
		
					
					
					//video icone  sesson
					ImageIcon i8 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
					Image i9 = i8.getImage().getScaledInstance(30, 35,Image.SCALE_DEFAULT);
					
					ImageIcon i10 = new ImageIcon(i9);
					JLabel video = new JLabel(i10);
					
					video.setBounds(300, 20, 35, 30);
					j1.add(video);
		
					
					
				//	phone Icone sesseon
					ImageIcon i12 =new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
					Image i15 = i12.getImage().getScaledInstance(35, 30,Image.SCALE_DEFAULT);
					ImageIcon i16 = new ImageIcon(i15);
					JLabel phone = new JLabel(i16);		
			phone.setBounds(360,20,35,30);
			j1.add(phone);
			
			
			// more setting  icone adding
			
			ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
			Image i22 = i21.getImage().getScaledInstance(10,25,Image.SCALE_DEFAULT);
			ImageIcon i23 = new ImageIcon(i22);
			JLabel more = new JLabel(i23);
			more.setBounds(415,22, 11, 24);
			j1.add(more);
		
		
		
			//step 5....
			//username
			JLabel name = new JLabel("hero");
			name.setBounds(90, 20, 100, 18);
			//j1.add(name);
			name.setForeground(Color.WHITE);
			name.setFont(new Font("SAN_SERIF",Font.BOLD,20));
			j1.add(name);
	
		
			
			//step 6
			
			JLabel status = new JLabel("active");
			status.setBounds(98,45,110,14);
			status.setForeground(Color.WHITE);
			status.setFont(new Font("SAN_SERIF",Font.BOLD,12));
			j1.add(status);
			
	
			
			
			//step7
			// white screen 
			//big frem
			a1 = new JPanel();
			// JPanel decl globel
			a1.setBounds(5, 75,440,570);
			f.add(a1);
			
			//extra 
			//remove heder file remove
			setUndecorated(true);
			
			
		
			
			//msg typeing box
			//a1 panel
		//	JTextField  remober it becuse send buuton weok clik event
			 text= new JTextField();
	 // globel decl J TextFiled
			text.setBounds(5,620,310,40);
			text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
			f.add(text);
			
			
			//BUtton
			
			JButton send = new JButton("SEND");
			send.setBounds(320,620,123,35);
			f.add(send);
			send.setBackground(new Color(7,94,84));
			send.setForeground(Color.WHITE);
			
			//clik the action      use this 
			send.addActionListener(this);
			send.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
			
			
			
		
	//	step 4
		
		// add mthod for work in ero 
		     // class name     // creat object  MosueAdapter is object name
		ero.addMouseListener(new MouseAdapter(){
			// method name of mouseClike //object
						public void mouseClicked(MouseEvent ap) {
				// both are use close the window 
				
				//close the program
			System.exit(0);
			//	setVisible(false);
			
			
			
			
			
			
			
			
			
		}
		});
		
			
			
				
			
		
		
		
		//1..java swing 
		//create fream
f.setLocation(200 ,50);
f.setSize(450 ,700);

//Background color use AWT package
f.getContentPane().setBackground(Color.WHITE);

f.setVisible(true);
		
		
		
			// TODO Auto-generated constructor stub
		}
		
		
		// ActionListoner are absrtct method so methd override is compsary
		public void actionPerformed(ActionEvent a) {
			try {
		//1 	// print the  MSG 
            String out = text.getText();
			           // JTextbox  the msg
            
            
         // 2
           //creat jlabel pass  String:-out 
        // JLabel output = new JLabel(out);  // pass arrgument :-out // but throw excption
            
            // transfer to Jlabel to JPenal
            //p2 mins msg
            JPanel p2 =  formatLabel(out); //JPanel  // becuse retuen the j panel in public static formatelabel (MSG SHOW IN BOX)
          //  p2.add(output);
           
            
            
            
            
            
            
            
       //3    
         //main fream set small frem
            a1.setLayout(new BorderLayout());
          
            //4
          //  creat fream msg show
            JPanel right = new JPanel(new BorderLayout());
            
            //right side add msg and show borderlayout
        
           //not return String
        
            //5
            right.add(p2,BorderLayout.LINE_END);
            vertical.add(right);
            vertical.add(Box.createVerticalStrut(14));
           
            //6
            //add vertical box main frem
            a1.add(vertical,BorderLayout.PAGE_START);
            
            du.writeUTF(out);
            
            
            //8
            // text box free 
            //coneecton on first point
            text.setText("");
            
            //7
            //msg not show than page repaint
            f.repaint();
            f.invalidate();
            f.validate();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
          
            
            
            
			
                      
                        
                  //  System.out.println(out);

                        
                        
                        
		}
		
		
public static JPanel formatLabel(String out) {
	//1
	JPanel box = new JPanel();
	box.setLayout(new BoxLayout(box,BoxLayout.Y_AXIS));
	
	
	//2
	JLabel output = new JLabel(out);
	output.setFont( new Font("Tahoma",Font.PLAIN,16));
	//box.add(output);
	
	
	output.setBackground(new Color(37,211,102));
	output.setOpaque(true);
	output.setBorder(new EmptyBorder(15,15,15,50));
	
	box.add(output);
	
	
	// date and time
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sd= new SimpleDateFormat("HH:mm");
	
	
	
	JLabel time = new JLabel();
	time.setText(sd.format(cal.getTime()));
	box.add(time);
	
	
	
	
	
	return box;
	
	
}

public static void main(String[] args) {
		 	new ServerMain();
		 	
		 	
		 	
		 	try {
		 		ServerSocket sk = new ServerSocket(6004);
		 		while(true) {
		 		Socket s = sk.accept();
		 		
		 		DataInputStream din = new DataInputStream(s.getInputStream());
		 		du = new DataOutputStream(s.getOutputStream());
		 		while(true) {
		 		
		 		
		 		
		 	String msg=din.readUTF();
		 	
		 	JPanel panel=formatLabel(msg);
		 	JPanel left= new JPanel(new BorderLayout());
		 	  left.add(panel,BorderLayout.LINE_START);
		 	
		 	  vertical.add(left);
		 	 f.validate();
		 		}
		 		}
		 		}catch(Exception e) {
		 		e.printStackTrace();
		 	}
		
		
		
		

}		
}
	


