import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Layout {
	Frame frame;

	Layout() {

		frame = new Frame();
		
		Display_Window1();
		
		frame.setLayout(null);
		frame.setVisible(true);

		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
			}
		});
	}
// -------------------- First Window ---------------------------------------
	public void Display_Window1(){

		Label select = new Label("Select User Type - ");
		select.setBounds(20, 90, 100, 30);

		Choice user_type = new Choice();
		user_type.add("New User");
		user_type.add("Registered User");
		user_type.add("Admin");
		user_type.setBounds(130, 90, 150, 30);

		Button ok = new Button("Select");
		ok.setBounds(300, 90, 50, 30);

//************************** ADD *****************************************
		frame.add(select);
		frame.add(user_type);
		frame.add(ok);

//*************************Frame size ****************************************
		frame.setSize(400, 200);

// *******************************Button function *************************

		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Display_Window2(user_type);
				

			}
		});
	}
// --------------------------------------- Second Window --------------------------------------------

	public void Display_Window2(Choice user_type) {
		Label welcome = null;

		frame.removeAll();

		Button submit = new Button("Submit");
		Button back = new Button("Back");

		int index = user_type.getSelectedIndex();
		if (index == 0) {
			welcome = new Label("Welcome New User");
			New_User();
			submit.setBounds(40, 440, 80, 30);
			back.setBounds(140, 440, 80, 30);
		} else {
			if (index == 1) {
				welcome = new Label("Welcome User");
			} else {
				welcome = new Label("Welcome Admin");
			}
			Registered_User();
			submit.setBounds(40, 160, 80, 30);
			back.setBounds(140, 160, 80, 30);
		}

		welcome.setBounds(200, 40, 200, 30);
		frame.add(welcome);
		frame.add(submit);
		frame.add(back);

//************************** Button function *************************************
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(index == 0) {
					// add data to the database(not done)
					// go to regisered user page
					frame.removeAll();
					Label thank = new Label("Your Response Submitted Successfuly");
					thank.setBounds(20, 40,	250, 30);
					back.setBounds(140, 160, 80, 30);
					
					
					frame.add(thank);
					frame.add(back);
					frame.setSize(500,300);
				}
			}
		});
		
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.removeAll();
				Display_Window1();
			}
		});
	}
// --------------------------- Third Part-1 Window ------------------------------
	public void New_User() {
// ******************* Labels ******************************************
		Label fname = new Label("First Name - ");
		fname.setBounds(20, 80, 120, 30);

		Label lname = new Label("Last Name - ");
		lname.setBounds(20, 120, 120, 30);

		Label mobile = new Label("Phone No. -");
		mobile.setBounds(20, 160, 120, 30);

		Label email = new Label("E-Mail - ");
		email.setBounds(20, 200, 120, 30);

		Label adrs = new Label("Address - ");
		adrs.setBounds(20, 240, 120, 30);

		Label u_id = new Label("Create User Id - ");
		u_id.setBounds(20, 280, 120, 30);

		Label c_uid = new Label("Confirm User Id - ");
		c_uid.setBounds(20, 320, 120, 30);

		Label pass = new Label("Create Password - ");
		pass.setBounds(20, 360, 120, 30);

		Label c_pass = new Label("Confirm Password - ");
		c_pass.setBounds(20, 400, 120, 30);

// ************************* Inputs Container ********************************
		

		TextField i_fname = new TextField();
		i_fname.setBounds(160, 80, 200, 30);

		TextField i_lname = new TextField();
		i_lname.setBounds(160, 120, 200, 30);

		TextField i_mobile = new TextField();
		i_mobile.setBounds(160, 160, 200, 30);

		TextField i_email = new TextField();
		i_email.setBounds(160, 200, 200, 30);

		TextField i_adrs = new TextField();
		i_adrs.setBounds(160, 240, 200, 30);

		TextField i_u_id = new TextField();
		i_u_id.setBounds(160, 280, 200, 30);

		TextField i_c_uid = new TextField();
		i_c_uid.setBounds(160, 320, 200, 30);

		TextField i_pass = new TextField();
		i_pass.setBounds(160, 360, 200, 30);

		TextField i_c_pass = new TextField();
		i_c_pass.setBounds(160, 400, 200, 30);

// *********************add items*********************************************
		frame.add(fname);
		frame.add(lname);
		frame.add(mobile);
		frame.add(email);
		frame.add(adrs);
		frame.add(u_id);
		frame.add(c_uid);
		frame.add(pass);
		frame.add(c_pass);
		frame.add(i_fname);
		frame.add(i_lname);
		frame.add(i_mobile);
		frame.add(i_email);
		frame.add(i_adrs);
		frame.add(i_u_id);
		frame.add(i_c_uid);
		frame.add(i_pass);
		frame.add(i_c_pass);
		frame.setSize(500,600);
		
	}

// ----------------------- Third Part 2 Window -----------------------------------


	public void Registered_User() {
// ******************* Label ************************************
		Label u_id = new Label("User Id");
		u_id.setBounds(20, 80, 100, 30);

		Label pass = new Label("Password");
		pass.setBounds(20, 120, 100, 30);
		
		TextField i_u_id = new TextField();
		i_u_id.setBounds(160, 80, 200, 30);
		
		TextField i_pass = new TextField();
		i_pass.setBounds(160, 120, 200, 30);
		
// ************************ Add Items ***************************	
		frame.add(u_id);
		frame.add(pass);
		frame.add(i_u_id);
		frame.add(i_pass);
		frame.setSize(500,300);
	}

// ---------------------------- main method -----------------------	
	public static void main(String[] args) {

		Layout layout = new Layout();
	}
}
