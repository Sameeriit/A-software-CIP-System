import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;
import java.util.*;
import java.lang.String.*;
import java.awt.event.ItemEvent.*;
import java.util.scanner; // I use scanner because it's command lin

public class CIP implements ActionListener, Runnable
{
Container cip;
Container ci;
JFrame f0;
JFrame fk;
JFrame fl;
JFrame f1 = new JFrame("PATIENTS RECORDS FOR OPD, CIP");
JFrame f2 = new JFrame("Master Record");
JFrame f3 = new JFrame("Demographic");
JFrame f5 = new JFrame("General Psychiatric Case");
JFrame f6 = new JFrame("Neurology Case");
JFrame f7 = new JFrame("Epilepsy Case");
JFrame f8 = new JFrame("Sleep Disorder Case");
JFrame f9 = new JFrame("Headache Case");
JFrame f10 = new JFrame("Deaddiction Case");
JFrame f11 = new JFrame("Emergency Clinic");
JFrame f12 = new JFrame("Skin Clinic");
JFrame f13 = new JFrame("Old Cases");
JFrame f14 = new JFrame("Admission Chart");
JFrame f15 = new JFrame("Discharge Chart");
JFrame f16 = new JFrame("Extension Clinic");
JFrame f17 = new JFrame("Registration Card");
//--------------------------------------------------------------------------
JFrame f18 = new JFrame("Report");
JFrame f19 = new JFrame("Daywise Report");
JFrame f20 = new JFrame("Day Wise Report New & Old Patients");
JFrame f21 = new JFrame("Categorywise Report New & Old Patients");
JFrame f22 = new JFrame("Daywise Report Admission & Discharge");
JFrame f23 = new JFrame("Categorywise Report Admission & Discharge");

JFrame f24 = new JFrame("Month wise Report");
JFrame f25 = new JFrame("Monthly Report New & Old Patients");
JFrame f26 = new JFrame("Category wise Monthly Report New & Old Patients");
JFrame f27 = new JFrame("Monthly Report Admission & Discharge");

JFrame f28 = new JFrame("Yearwise Report");
JFrame f29 = new JFrame("Yearly ReportNew & Old Patients");
JFrame f30 = new JFrame("Category wise Yearly Report New & Old Patients");
JFrame f31 = new JFrame("Yearly Report Admission & Discharge");

JFrame f32 = new JFrame("Mothly Report Special Clinic");
JFrame f33 = new JFrame("Yearly Report Special Clinic");
JFrame f34 = new JFrame("Monthly Report Psychiatric & Non Psychiatric Pts.");
JFrame f35 = new JFrame("Yearly Report Psychiatric & Non Psychiatric Pts.");
JFrame f49 = new JFrame("Daywise Estension Report");
//---------------------------------------------------------------------------
JFrame f36 = new JFrame("Query");
JFrame f37 = new JFrame("Patients query on Name");
JFrame f38 = new JFrame("Patients query on Sex and date");
JFrame f39 = new JFrame("Patients query on Diagnosis and date");
JFrame f40 = new JFrame("Patients query on Name and date");
JFrame f41 = new JFrame("Update");
//---------------------------------------------------------------------------
JFrame f42 = new JFrame("Modify New Patients");
JFrame f43 = new JFrame("Modify Old Patients");
JFrame f44 = new JFrame("Modify Admission");
JFrame f45 = new JFrame("Modify Discharge");
JFrame f46 = new JFrame("Modify Extension Clinic");
JFrame f47 = new JFrame("Modify Skin Clinic");
//JFrame f48 = new JFrame("Delete New Patients");
JFrame f48 = new JFrame("Query form");
//---------------------------------------------------------------------------
JButton r0 = new JButton("Master Record");
JButton r1 = new JButton("Demographic");
JButton r2 = new JButton("General Psychiatric");
JButton r3 = new JButton("Neurology");
JButton r4 = new JButton("Epilepsy");
JButton r5 = new JButton("Sleep Disorder");
JButton r6 = new JButton("Headache");
JButton r7 = new JButton("De-Addiction");
JButton r8 = new JButton("Skin Clinic");
JButton r9 = new JButton("Emergency Clinic");
JButton r10 = new JButton("Extension Clinic");
JButton r11 = new JButton("Old Cases");
JButton r12 = new JButton("Admission");
JButton r13 = new JButton("Discharge");
JButton r14 = new JButton("Report");
JButton r15 = new JButton("Query");
 JButton j123 = new JButton("show");//for query
JButton r16 = new JButton("Exit");
//---------------------------------------------------------------------------
JButton r17 = new JButton("Daywise New_Old");
JButton r18 = new JButton("Daywise Admis_Disch");
JButton r19 = new JButton("Daywise Skin");
JButton r20 = new JButton("Daywise Extension");
JButton r21 = new JButton("Daywise Emergency");
JButton r22 = new JButton("Monthwise");
JButton r23 = new JButton("Master report");
JButton r24 = new JButton("Categorywise New_Old");
JButton r25 = new JButton("Categorywise Admis_Disc");
JButton r26 = new JButton("Monthwise New_Old");
JButton r27 = new JButton("Monthwise Admis_Disc");
JButton r28 = new JButton("Yearwise New_Old");
JButton r29 = new JButton("Yearwise Admis_Disc");
JButton r30 = new JButton("Monthwise Special_CL");
JButton r31 = new JButton("Yearwise Special_CL");
JButton r32 = new JButton("Monthwise PSY_NONPSY");
JButton r33 = new JButton("Yearwise PSY_NONPSY");
//--------------------------------------------------------------------------
JButton r34 = new JButton("Name");
JButton r35 = new JButton("Name  and Sex");
JButton r36 = new JButton("Name and Diagnosis");
JButton r37 = new JButton("Name and Date");
//--------------------------------------------------------------------------
JButton s1 = new JButton("Submit");
JButton s2 = new JButton("Save");
JButton s3 = new JButton("Save");
JButton s4 = new JButton("Save");
JButton s5 = new JButton("Save");
JButton s6 = new JButton("Save");
JButton s7 = new JButton("Save");
JButton s8 = new JButton("Save");
JButton s9 = new JButton("Save");
JButton s10 = new JButton("Save");
JButton s11 = new JButton("Save");
JButton s12 = new JButton("Save");
JButton s13 = new JButton("Save");
JButton s14 = new JButton("Save");
JButton s15 = new JButton("Save");
JButton s16 = new JButton("Save");
//-----------------------------------------------------------------------

JButton b1 = new JButton("Back");
JButton b2 = new JButton("Back");
JButton b3a = new JButton("Submit");
JButton b3 = new JButton("Back");
JButton b4 = new JButton("Back");
JButton b4a = new JButton("Cancle"); 
JButton b5 = new JButton("Back");
JButton b6= new JButton("Back");
JButton b7= new JButton("Back");
JButton b8= new JButton("Back");
JButton b9= new JButton("Back");
JButton b10= new JButton("Back");
JButton b11= new JButton("Back");
JButton b12= new JButton("Back");
JButton b13= new JButton("Back");
JButton b14= new JButton("Back");
JButton b15= new JButton("Back");
JButton b16= new JButton("Back");
JButton b17 = new JButton("Back");
JButton b18 = new JButton("Back");
JButton b19 = new JButton("Back");
JButton b20 = new JButton("Back");
JButton b21 = new JButton("Back");
JButton b22 = new JButton("Back");
JButton b23 = new JButton("Back");
JButton b24 = new JButton("Back");
JButton b28= new JButton("Back");
JButton b29= new JButton("Display");
JButton b30= new JButton("Back");
JButton b31= new JButton("Display");
JButton b32= new JButton("Back");
JButton b33= new JButton("Display");
JButton b34= new JButton("Back");
JButton b35= new JButton("Display");
JButton b36= new JButton("Delete");
JButton b37= new JButton("update");
JButton b_rol= new JButton("Back");
JButton u_rol= new JButton("Query");
//-------------------------------------------------Master file
JTextField tm0 = new JTextField();
JTextField t3 = new JTextField();
JTextField t4 = new JTextField();
JTextField t5 = new JTextField();
JTextField t6 = new JTextField();
JTextField tq1 = new JTextField(); //for query.===================================
//-------------------------------------------------Demographic file
JTextField td7 = new JTextField();
JTextField td8 = new JTextField();
JTextField td9 = new JTextField();
JTextField td10 = new JTextField();
JTextField td11 = new JTextField();
JTextField td12 = new JTextField();
JTextField td13 = new JTextField();
JTextField td14 = new JTextField();
JTextField td15 = new JTextField();
JTextField td16 = new JTextField();
JTextField td17 = new JTextField();
JTextField td18 = new JTextField();
JTextField td19 = new JTextField();
JTextField td20 = new JTextField();
JTextField td21 = new JTextField();
JTextField td22 = new JTextField();
JTextField td23 = new JTextField();
JTextField td24 = new JTextField();
JTextField td25 = new JTextField();
JTextField td26 = new JTextField();
JTextField td27 = new JTextField();
JTextField td28 = new JTextField();
JTextField td29 = new JTextField();
JTextField td30 = new JTextField();
JTextField td31 = new JTextField();
JTextField td32 = new JTextField();
JTextField td33 = new JTextField();
JTextField td34 = new JTextField();
JTextField td35 = new JTextField();
JTextField td36 = new JTextField();
JTextField td37 = new JTextField();
JTextField td38 = new JTextField();
JTextField td39 = new JTextField();
JTextField td40 = new JTextField();
JTextField td41 = new JTextField();
JTextField td42 = new JTextField();
JTextField td43 = new JTextField();
JTextField td44 = new JTextField();
JTextField td45 = new JTextField();
JTextField td46 = new JTextField();
JTextField td47 = new JTextField();
JTextField td48 = new JTextField();
JTextField td49 = new JTextField();
JTextField td50 = new JTextField();
JTextField td51 = new JTextField();
JTextField td52 = new JTextField();
JTextField td53 = new JTextField();
JTextField td54 = new JTextField();
JTextField td55 = new JTextField();
JTextField td56 = new JTextField();
JTextField td57 = new JTextField();
JTextField td58 = new JTextField();
JTextField td59 = new JTextField();
JTextField td60 = new JTextField();
JTextField td61 = new JTextField();
JTextField td62 = new JTextField();
JTextField td63 = new JTextField();
JTextField td64 = new JTextField();
JTextField td65 = new JTextField();

//-------------------------------------------------------General Psychiatric File
JTextField tg1 = new JTextField();
JTextField tg2 = new JTextField();
JTextField tg3 = new JTextField();
JTextField tg4 = new JTextField();
JTextField tg5 = new JTextField();
JTextField tg6 = new JTextField();
JTextField tg7 = new JTextField();
JTextField tg8 = new JTextField();
JTextField tg9 = new JTextField();
JTextField tg10 = new JTextField();
JTextField tg11 = new JTextField();
JTextField tg12 = new JTextField();
JTextField tg13 = new JTextField();
JTextField tg14 = new JTextField();
JTextField tg15 = new JTextField();
JTextField tg16 = new JTextField();
JTextField tg17 = new JTextField();
JTextField tg18 = new JTextField();
JTextField tg19 = new JTextField();
JTextField tg20 = new JTextField();
JTextField tg21 = new JTextField();
JTextField tg22 = new JTextField();
JTextField tg23 = new JTextField();
JTextField tg24 = new JTextField();
JTextField tg25 = new JTextField();
JTextField tg26 = new JTextField();
JTextField tg27 = new JTextField();
JTextField tg28 = new JTextField();
JTextField tg29 = new JTextField();
JTextField tg30 = new JTextField();
JTextField tg31 = new JTextField();
JTextField tg32 = new JTextField();
JTextField tg33 = new JTextField();
JTextField tg34 = new JTextField();
JTextField tg35 = new JTextField();
JTextField tg36 = new JTextField();
JTextField tg37 = new JTextField();
JTextField tg38 = new JTextField();
JTextField tg39 = new JTextField();
JTextField tg40 = new JTextField();
JTextField tg41 = new JTextField();
JTextField tg42 = new JTextField();
JTextField tg43 = new JTextField();
JTextField tg44 = new JTextField();
JTextField tg45 = new JTextField();
JTextField tg46 = new JTextField();
JTextField tg47 = new JTextField();
JTextField tg48 = new JTextField();
JTextField tg49 = new JTextField();
JTextField tg50 = new JTextField();
JTextField tg51 = new JTextField();
JTextField tg52 = new JTextField();
JTextField tg53 = new JTextField();
JTextField tg54 = new JTextField();
JTextField tg55 = new JTextField();
JTextField tg56 = new JTextField();
JTextField tg57 = new JTextField();
JTextField tg58 = new JTextField();
JTextField tg59 = new JTextField();
JTextField tg60 = new JTextField();
JTextField tg61= new JTextField();
JTextField tg62 = new JTextField();
//--------------------------------------------------------Old file
JTextField to1 = new JTextField();
JTextField to2 = new JTextField();
JTextField to3 = new JTextField();
JTextField to4 = new JTextField();
JTextField to5 = new JTextField();
JTextField to6 = new JTextField();
JTextField to7 = new JTextField();
JTextField trno1 = new JTextField();


//--------------------------------------------------------skin file
JTextField ts1 = new JTextField();
JTextField ts2 = new JTextField();
JTextField ts3 = new JTextField();
JTextField ts4 = new JTextField();
JTextField ts5 = new JTextField();
JTextField ts6 = new JTextField();
JTextField ts7 = new JTextField();
JTextField ts8 = new JTextField();
JTextField ts9 = new JTextField();
JTextField ts10 = new JTextField();
JTextField ts11 = new JTextField();

//--------------------------------------------------------Admission file
JTextField ta1 = new JTextField();
JTextField ta2 = new JTextField();
JTextField ta3 = new JTextField();
JTextField ta4 = new JTextField();
JTextField ta5 = new JTextField();
JTextField ta6 = new JTextField();
JTextField ta7 = new JTextField();
JTextField ta8 = new JTextField();
JTextField ta9 = new JTextField();
JTextField ta10 = new JTextField();
JTextField ta11 = new JTextField();
JTextField ta12 = new JTextField();
JTextField ta13 = new JTextField();
JTextField ta14 = new JTextField();
JTextField ta15 = new JTextField();
JTextField ta16 = new JTextField();
JTextField ta17 = new JTextField();
JTextField ta18 = new JTextField();
JTextField ta19 = new JTextField();
JTextField ta20 = new JTextField();
JTextField ta21 = new JTextField();
JTextField ta22 = new JTextField();

//------------------------------------------------------- Dischage file
JTextField tdi1 = new JTextField();
JTextField tdi2 = new JTextField();
JTextField tdi3 = new JTextField();
JTextField tdi4 = new JTextField();
JTextField tdi5 = new JTextField();
JTextField tdi6 = new JTextField();
JTextField tdi7 = new JTextField();
JTextField tdi8 = new JTextField();
JTextField tdi9 = new JTextField();
JTextField tdi10 = new JTextField();
JTextField tdi11 = new JTextField();
JTextField tdi12 = new JTextField();
JTextField tdi13 = new JTextField();
JTextField tdi14 = new JTextField();
JTextField tdi15 = new JTextField();
JTextField tdi16 = new JTextField();
JTextField tdi17 = new JTextField();
JTextField tdi18 = new JTextField();
JTextField tdi19 = new JTextField();
JTextField tdi20 = new JTextField();
JTextField tdi21 = new JTextField();
JTextField tdi22 = new JTextField();

//-------------------------------------------------------Extension file
JTextField tx0 = new JTextField();
JTextField tx3 = new JTextField();
JTextField tx4 = new JTextField();
JTextField tx5 = new JTextField();
JTextField tx6 = new JTextField();

//-------------------------------------------------------Emergency file
JTextField te1 = new JTextField();
JTextField te2 = new JTextField();
JTextField te3 = new JTextField();
JTextField te4 = new JTextField();
JTextField te5 = new JTextField();
JTextField te6 = new JTextField();
JTextField te7 = new JTextField();
JTextField te8 = new JTextField();
JTextField te9 = new JTextField();
JTextField te10 = new JTextField();
JTextField te11 = new JTextField();
JTextField te12 = new JTextField();
JTextField te13 = new JTextField();
JTextField te14 = new JTextField();
JTextField te15 = new JTextField();
JTextField te16 = new JTextField();
JTextField te17 = new JTextField();
JTextField te18 = new JTextField();
JTextField te19 = new JTextField();
JTextField te20 = new JTextField();
JTextField te21 = new JTextField();
JTextField te22 = new JTextField();
//---------------------------------------------------------welcome window
JProgressBar jpb;
void display()
{
swagatum();
try
{
  Thread.sleep(1200);
}
catch(Exception e)
{  }
password();
}
public void swagatum()
{
  f0 = new JFrame("OPD Record Management System");
  cip =f0.getContentPane();
  cip.setLayout(null);
  jpb = new JProgressBar();
  jpb.setStringPainted(true);
  Font f = new Font("SensSerif",Font.BOLD,25);
  Font f1 = new Font("SensSerif",Font.BOLD,20);
  JLabel l1 = new JLabel("SWAGATUM/WELCOME...OPD Record Management System");
  l1.setFont(f);
  
	JLabel l2 = new JLabel("Central Institute of Psychiatry");
	JLabel l4 = new JLabel("A Prosperous Institute....");
	JLabel l5 = new JLabel("        Ranchi");
	JLabel l6 = new JLabel(" and Designed by Sameer,irfan,amir");
	jpb.setBounds(100,500,300,20);
	l1.setBounds(150,100,600,25);
	l2.setBounds(200,150,500,25);
	l4.setBounds(190,200,500,25);
	l5.setBounds(350,250,150,25);
	l6.setBounds(150,300,600,25);
	l2.setFont(f);
	l4.setFont(f);
	l5.setFont(f);
	l6.setFont(f1);
	cip.add(jpb);
	cip.add(l1);
	cip.add(l2);
	cip.add(l4);
	cip.add(l5);
	cip.add(l6);
	cip.setBackground(Color.red);
  f0.setSize(1285,740);
  f0.setVisible(true);
new Thread(this).start();
}
public void run()
{
int counter;
try
{
for(counter=0;counter<=200;counter++)
{
Thread.sleep(50);
if(jpb.getValue()==50)
   f0.setVisible(false);
else
jpb.setValue(jpb.getValue()+counter);
}

}
catch(Exception e)
{ }
}

//------------------------------------------------------Pasword Window
String pass;
String user;
user = txtUser.getText();
pass = txtPass.getText();

if(pass.equals("blue") && user.equals("bob") ){
    lblDisplay.setText("Credentials Accepted.");
}
else{
    lblDisplay.setText("Please try again.");
}





//----------------------------------------------------Main menu program

public void mainMenu()
{
fl.setVisible(false);
JLabel l2 = new JLabel("PATIENTS RECORDS AND INFORMATION MANAGEMENT SYSTEM");
Font f = new Font("SansSerif",Font.BOLD,15);
JLabel l3 = new JLabel("Central Institute of Psychiatry");
Font ft = new Font("SansSerif",Font.BOLD,15);
JLabel l4 = new JLabel("Kanke Ranchi");
JLabel l5 = new JLabel("Sofware Developed by sameer");
Font ff = new Font("SansSerif",Font.BOLD,0);
JLabel l6 = new JLabel(".");

l2.setFont(f);
l3.setFont(ft);
l4.setFont(ft);
l5.setFont(ft);
l6.setFont(ff);
r0.setFont(ft);
r1.setFont(ft);
r2.setFont(ft);
r3.setFont(ft);
r4.setFont(ft);
r5.setFont(ft);
r6.setFont(ft);
r7.setFont(ft);
r8.setFont(ft);
r9.setFont(ft);
r10.setFont(ft);
r11.setFont(ft);
r12.setFont(ft);
r13.setFont(ft);
r14.setFont(ft);
r15.setFont(ft);
r16.setFont(ft);

cip = f1.getContentPane();
f1.setSize(1270,720);
r0.setBackground(Color.white);
r1.setBackground(Color.white);
r2.setBackground(Color.white);
r3.setBackground(Color.white);
r4.setBackground(Color.gray);
r5.setBackground(Color.gray);
r6.setBackground(Color.gray);
r7.setBackground(Color.gray);
r8.setBackground(Color.white);
r9.setBackground(Color.white);
r10.setBackground(Color.white);
r11.setBackground(Color.white);
r12.setBackground(Color.white);
r13.setBackground(Color.white);
r14.setBackground(Color.white);
r15.setBackground(Color.white);
r16.setBackground(Color.white);
cip.setBackground(Color.white);

cip.add(r0);
cip.add(r1);
cip.add(r2);
cip.add(r3);
cip.add(r4);
cip.add(r5);
cip.add(r6);
cip.add(r7);
cip.add(r8);
cip.add(r9);
cip.add(r10);
cip.add(r11);
cip.add(r12);
cip.add(r13);
cip.add(r14);
cip.add(r15);
cip.add(r16);
cip.add(l2);
cip.add(l3);
cip.add(l4 );
cip.add(l5);
cip.add(l6);

f1.setVisible(true);
r0.setBounds(100,100,200,25);
r1.setBounds(100,130,200,25);
r2.setBounds(100,160,200,25);
r3.setBounds(100,190,200,25);
r4.setBounds(100,220,200,25);
r5.setBounds(100,250,200,25);
r6.setBounds(100,280,200,25);
r7.setBounds(100,310,200,25);
r8.setBounds(100,340,200,25);
r9.setBounds(100,370,200,25);
r10.setBounds(100,400,200,25);
r11.setBounds(100,430,200,25);
r12.setBounds(100,460,200,25);
r13.setBounds(100,490,200,25);
r14.setBounds(100,520,200,25);
r15.setBounds(100,550,200,25);
r16.setBounds(100,580,200,25);
l2.setBounds(350,325,650,25);
l3.setBounds(480,370,550,25);
l4.setBounds(520,400,550,25);
l5.setBounds(450,450,550,25);
l6.setBounds(350,500,100,25);

r0.addActionListener(this);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
r4.addActionListener(this);
r5.addActionListener(this);
r6.addActionListener(this);
r7.addActionListener(this);
r8.addActionListener(this);
r9.addActionListener(this);
r10.addActionListener(this);
r11.addActionListener(this);
r12.addActionListener(this);
r13.addActionListener(this);
r14.addActionListener(this);
r15.addActionListener(this);
r16.addActionListener(this);

}

//-------------------------------------------------Master Record Form

public void master()
{
f1.setVisible(false);
cip=f2.getContentPane();
cip.setLayout(null);
f2.setSize(400,400);
f2.setVisible(true);
tm0.requestFocus();

JLabel l1 = new JLabel("State ");
JLabel l2 = new JLabel("District ");
JLabel l3 = new JLabel("Country ");
JLabel l4 = new JLabel("Diagnosis Name ");
JLabel l5 = new JLabel("Diagnosis Code ");

cip.add(l1);
cip.add(l2);
cip.add(l3);
cip.add(l4);
cip.add(l5);
cip.add(t3);
cip.add(t4);
cip.add(t5);
cip.add(t6);
cip.add(tm0);

l1.setBounds(25,25,75,25);
tm0.setBounds(100,25,200,25);
l2.setBounds(25,75,75,25);
t3.setBounds(100,75,200,25);
l3.setBounds(25,125,75,25);
t4.setBounds(100,125,200,25);
l4.setBounds(25,175,75,25);
t5.setBounds(100,175,200,25);
l5.setBounds(25,225,75,25);
t6.setBounds(100,225,200,25);
cip.add(s2);
cip.add(b2);

cip.setBackground(Color.pink);
s2.setBounds(100,300,100,20);
b2.setBounds(210,300,100,20);
s2.addActionListener(this);
b2.addActionListener(this);
}

//---------------------------------------------------Master Record Entry

public void mastera()
{
Connection con;
PreparedStatement ps;

  String mstate=tm0.getText();
  String mdistrict=t3.getText();
  String mcountry=t4.getText();
  String mdiagnosis=t5.getText();
  int mdiagc=Integer.parseInt(t6.getText());
// String critem=String.valueOf(c1.getSelectedItem());
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con=DriverManager.getConnection("jdbc:odbc:cipproject","abc","xyz");
  ps=con.prepareStatement("insert into master1(state,district,country,diagName,diagCode) values(?,?,?,?,?)");
  ps.setString(1,mstate);
  ps.setString(2,mdistrict);
  ps.setString(3,mcountry);
  ps.setString(4,mdiagnosis);
  ps.setInt(5,mdiagc);
  ps.execute();
  
  JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f2,"Data Successfully Added");
}

 catch(Exception e)
 {JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f2,"Can not insert Duplicate Value into Database");
 }
}


//------------------------------------------------Demographic Entry form

public void demographic()
{
JFrame f3 = new JFrame();
cip = f3.getContentPane();
cip.setLayout(null);
f3.setSize(1000,720);
f3.setVisible(true);



JLabel ld7 = new JLabel("CRF_NO");
JLabel ld9 = new JLabel("Unit");
JLabel ld10 = new JLabel("Date");
JLabel ld11 = new JLabel("First Name");
JLabel ld12 = new JLabel("Last Name");
JLabel ld13 = new JLabel("Father/Husband");
JLabel ld14 = new JLabel("Age");
JLabel ld15 = new JLabel("Sex");
JLabel ld16 = new JLabel("Education");
JLabel ld17 = new JLabel("Specify");
JLabel ld18 = new JLabel("Year_Educ");
JLabel ld19 = new JLabel("Marital Status");
JLabel ld20 = new JLabel("Religion");
JLabel ld21 = new JLabel("Religion_Other");
JLabel ld22 = new JLabel("Mother_Tounge");
JLabel ld23 = new JLabel("Mothe_ToungeOther");
JLabel ld24 = new JLabel("Residence");
JLabel ld25 = new JLabel("Distance");
JLabel ld26 = new JLabel("State_Other");
JLabel ld27 = new JLabel("Foreigner");
JLabel ld28 = new JLabel("Family Income");
JLabel ld29 = new JLabel("Family Type");
JLabel ld30 = new JLabel("Address");
JLabel ld33 = new JLabel("District");
JLabel ld34 = new JLabel("PIN");
JLabel ld35 = new JLabel("STD_Code");
JLabel ld36 = new JLabel("Telephone");
JLabel ld37 = new JLabel("Email");
JLabel ld38 = new JLabel("AddressP");
JLabel ld41 = new JLabel("District");
JLabel ld42 = new JLabel("PIN");
JLabel ld43= new JLabel("STD_Code");
JLabel ld44 = new JLabel("Telephone");
JLabel ld45 = new JLabel("Email");
JLabel ld46 = new JLabel("Refereal/By");
JLabel ld47 = new JLabel("Referal_SOurce");
JLabel ld48 = new JLabel("Refera_No");
JLabel ld49 = new JLabel("Prev_Hospitalization");
JLabel ld50 = new JLabel("ProvisionDiag");
JLabel ld51 = new JLabel("ProvisionDiag_Specify");
JLabel ld52 = new JLabel("ProvisionICD");
JLabel ld53 = new JLabel("Specify");
JLabel ld54 = new JLabel("Final_Diagnos");
JLabel ld55 = new JLabel("Specify");
JLabel ld56 = new JLabel("ICD");
JLabel ld57 = new JLabel("Specify");
JLabel ld58 = new JLabel("Change_Diag");
JLabel ld59 = new JLabel("Specify");
JLabel ld60 = new JLabel("ICD");
JLabel ld61 = new JLabel("Specify");
JLabel ld62 = new JLabel("Quota");
JLabel ld63 = new JLabel("Admission_Date");
JLabel ld64 = new JLabel("DIscharge_Date");
JLabel ld65 = new JLabel("Diagnosed By");

cip.add(ld7);
cip.add(ld9);
cip.add(ld10);
cip.add(ld11);
cip.add(ld12);
cip.add(ld13);
cip.add(ld14);
cip.add(ld15);
cip.add(ld16);
cip.add(ld17);
cip.add(ld18);
cip.add(ld19);
cip.add(ld20);
cip.add(ld21);
cip.add(ld22);
cip.add(ld23);
cip.add(ld24);
cip.add(ld25);
cip.add(ld26);
cip.add(ld27);
cip.add(ld28);
cip.add(ld29);
cip.add(ld30);
cip.add(ld33);
cip.add(ld34);
cip.add(ld35);
cip.add(ld36);
cip.add(ld37);
cip.add(ld38);
cip.add(ld41);
cip.add(ld42);
cip.add(ld43);
cip.add(ld44);
cip.add(ld45);
cip.add(ld46);
cip.add(ld47);
cip.add(ld48);
cip.add(ld49);
cip.add(ld50);
cip.add(ld51);
cip.add(ld52);
cip.add(ld53);
cip.add(ld54);
cip.add(ld55);
cip.add(ld56);
cip.add(ld57);
cip.add(ld58);
cip.add(ld59);
cip.add(ld60);
cip.add(ld61);
cip.add(ld62);
cip.add(ld63);
cip.add(ld64);
cip.add(ld65);

cip.add(td7);
cip.add(td8);
cip.add(td9);
cip.add(td10);
cip.add(td11);
cip.add(td12);
cip.add(td13);
cip.add(td14);
cip.add(td15);
cip.add(td16);
cip.add(td17);
cip.add(td18);
cip.add(td19);
cip.add(td20);
cip.add(td21);
cip.add(td22);
cip.add(td23);
cip.add(td24);
cip.add(td25);
cip.add(td26);
cip.add(td27);

cip.add(td28);
cip.add(td29);
cip.add(td30);
cip.add(td31);
cip.add(td32);
cip.add(td33);
cip.add(td34);
cip.add(td35);
cip.add(td36);
cip.add(td37);
cip.add(td38);
cip.add(td39);
cip.add(td40);
cip.add(td41);
cip.add(td42);
cip.add(td43);
cip.add(td44);
cip.add(td45);
cip.add(td46);
cip.add(td47);
cip.add(td48);
cip.add(td49);
cip.add(td50);
cip.add(td51);
cip.add(td52);
cip.add(td53);
cip.add(td54);
cip.add(td55);
cip.add(td56);
cip.add(td57);
cip.add(td58);
cip.add(td59);
cip.add(td60);
cip.add(td61);
cip.add(td62);
cip.add(td63);
cip.add(td64);
cip.add(td65);
 

ld10.setBounds(5,5,100,20);
td10.setBounds(110,5,50,20);
ld7.setBounds(5,30,100,20);
td7.setBounds(110,30,50,20);
td8.setBounds(170,30,20,20);
ld9.setBounds(5,55,100,20);
td9.setBounds(110,55,50,20);
ld11.setBounds(5,80,100,20);
td11.setBounds(110,80,150,20);
ld12.setBounds(5,105,100,20);
td12.setBounds(110,105,150,20);
ld13.setBounds(5,135,100,20);
td13.setBounds(110,135,150,20);
ld14.setBounds(5,160,100,20);
td14.setBounds(110,160,150,20);
ld15.setBounds(5,185,100,20);
td15.setBounds(110,185,150,20);
ld16.setBounds(5,210,100,20);
td16.setBounds(110,210,150,20);
ld17.setBounds(5,235,100,20);
td17.setBounds(110,235,150,20);
ld18.setBounds(5,260,100,20);
td18.setBounds(110,260,150,20);
ld19.setBounds(5,285,100,20);
td19.setBounds(110,285,150,20);
ld20.setBounds(5,310,100,20);
td20.setBounds(110,310,150,20);
ld21.setBounds(5,335,10,20);
td21.setBounds(110,335,150,20);
ld22.setBounds(5,360,100,20);
td22.setBounds(110,360,150,20);
ld23.setBounds(5,385,100,20);
td23.setBounds(110,385,150,20);
ld24.setBounds(5,410,100,20);
td24.setBounds(110,410,150,20);
ld25.setBounds(5,435,100,20);
td25.setBounds(110,435,150,20);
ld26.setBounds(5,460,100,20);
td26.setBounds(110,460,150,20);
ld27.setBounds(5,485,100,20);
td27.setBounds(110,485,150,20);
ld28.setBounds(5,510,100,20);
td28.setBounds(110,510,150,20);
ld29.setBounds(5,535,100,20);
td29.setBounds(110,535,150,20);
ld30.setBounds(350,5,100,20);
td30.setBounds(460,5,150,20);
td31.setBounds(460,35,150,20);
td32.setBounds(460,60,150,20);
ld33.setBounds(350,85,100,20);
td33.setBounds(460,85,150,20);
ld34.setBounds(350,110,100,20);
td34.setBounds(460,110,150,20);
ld35.setBounds(350,135,100,20);
td35.setBounds(460,135,150,20);
ld36.setBounds(350,160,100,20);
td36.setBounds(460,160,150,20);
ld37.setBounds(350,185,100,20);
td37.setBounds(460,185,150,20);
ld38.setBounds(350,210,100,20);
td38.setBounds(460,210,150,20);
td39.setBounds(460,235,150,20);
td40.setBounds(460,260,150,20);
ld41.setBounds(350,285,100,20);
td41.setBounds(460,285,150,20);
ld42.setBounds(350,310,100,20);
td42.setBounds(460,310,150,20);
ld43.setBounds(350,335,100,20);
td43.setBounds(460,335,150,20);
ld44.setBounds(350,360,100,20);
td44.setBounds(460,360,150,20);
ld45.setBounds(350,385,100,20);
td45.setBounds(460,385,150,20);
ld46.setBounds(350,410,100,20);
td46.setBounds(460,410,150,20);
ld47.setBounds(350,435,100,20);
td47.setBounds(460,435,150,20);
ld48.setBounds(350,460,100,20);
td48.setBounds(460,460,150,20);
ld49.setBounds(350,485,100,20);
td49.setBounds(460,485,150,20);
ld50.setBounds(350,510,100,20);
td50.setBounds(460,510,150,20);
ld51.setBounds(350,535,100,20);
td51.setBounds(460,535,150,20);
ld52.setBounds(700,5,100,20);
td52.setBounds(800,5,150,20);
ld53.setBounds(700,35,100,20);
td53.setBounds(800,35,150,20);
ld54.setBounds(700,60,100,20);
td54.setBounds(800,60,150,20);
ld55.setBounds(700,85,100,20);
td55.setBounds(800,85,150,20);
ld56.setBounds(700,110,100,20);
td56.setBounds(800,110,150,20);
ld57.setBounds(700,135,100,20);
td57.setBounds(800,135,150,20);
ld58.setBounds(700,160,100,20);
td58.setBounds(800,160,150,20);
ld59.setBounds(700,185,100,20);
td59.setBounds(800,185,150,20);
ld60.setBounds(700,210,100,20);
td60.setBounds(800,210,150,20);
ld61.setBounds(700,235,100,20);
td61.setBounds(800,235,150,20);
ld62.setBounds(700,260,100,20);
td62.setBounds(800,260,150,20);
ld63.setBounds(700,285,100,20);
td63.setBounds(800,285,150,20);
ld64.setBounds(700,310,100,20);
td64.setBounds(800,310,150,20);
ld65.setBounds(700,335,100,20);
td65.setBounds(800,335,150,20);
cip.add(s3);
cip.add(b3);
cip.setBackground(Color.yellow);
s3.setBounds(700,535,100,30);
b3.setBounds(800,535,100,30);
s3.addActionListener(this);
b3.addActionListener(this);
cip.add(f3);
}

//--------------------------------------------- Demographic Record Entry to Database
public void demograph()
{
Connection con;
PreparedStatement ps11;

  int dcrfno 	= Integer.parseInt(td7.getText());
  String dcrftp = td8.getText();//crftype
  String dunit 	= td9.getText();//unit
  String ddate 	= td10.getText();//unit
  String dfnme 	= td11.getText(); //fname
  String dlnm 	= td12.getText(); //lname
  String dfatr 	= td13.getText();//father
  int dage	= Integer.parseInt(td14.getText());//age
  int dsex  	= Integer.parseInt(td15.getText());//sex
  int deduc 	= Integer.parseInt(td16.getText());//education
  String  dsedu	= td17.getText();//specif
  String  dyedu	= td18.getText();
  int dmar 	= Integer.parseInt(td19.getText());
  int drel 	= Integer.parseInt(td20.getText());
  String  dorel	= td21.getText();
  int dmt	= Integer.parseInt(td22.getText());
  String  domt	= td23.getText();
  int dresi 	= Integer.parseInt(td24.getText());
  int  ddistce 	= Integer.parseInt(td25.getText());
  String dost 	= td26.getText();
  String dfor 	= td27.getText();
  int dfin 	= Integer.parseInt(td28.getText());
  String dtfy 	= td29.getText();
  String dad1 	= td30.getText();
  String dad2 	= td31.getText();
  String dad3 	= td32.getText();
  String ddist 	= td33.getText();
  int dpin 	= Integer.parseInt(td34.getText());
  int dstd 	= Integer.parseInt(td35.getText());
  int dtele 	= Integer.parseInt(td36.getText());
  String demail = td37.getText();
  String dpad1	= td38.getText();
  String dpad2 	= td39.getText();
  String dpad3 	= td40.getText();
  String dpdis 	= td41.getText();
  int dppin  	= Integer.parseInt(td42.getText());
  int dpstd 	= Integer.parseInt(td43.getText());
  int dptel 	= Integer.parseInt(td44.getText());
  String dpemil = td45.getText();
  int drefby 	= Integer.parseInt(td46.getText());
  String drsor 	= td47.getText();
  int drno 	= Integer.parseInt(td48.getText());
  String dphos 	= td49.getText();
  int dpdias 	= Integer.parseInt(td50.getText());
  String dpsdia = td51.getText();
  int dpicd 	= Integer.parseInt(td52.getText());
  String dspicd = td53.getText();
  int dfdiag 	= Integer.parseInt(td54.getText());
  String dsfdiag = td55.getText();
  int dficd 	= Integer.parseInt(td56.getText());
  String dsficd = td57.getText();
  int dcdiag 	= Integer.parseInt(td58.getText());
  String dcsdiag = td59.getText();
  int dcicd 	= Integer.parseInt(td60.getText());
  String dscicd = td61.getText();
  String dquota = td62.getText();
  String ddad 	= td63.getText();
  String dddis 	= td64.getText();
  String dcaser = td65.getText();

  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
  ps11 = con.prepareStatement("insert into demographic(crf,crfType,unit,date,fName,lName,father,age,sex,education,especify,eyear,marital,religion,oreligion,mothert,omothert,residence,distance,state,foreign,incomef,familyt,address1,address2,address3,district,pin,std,tele,email,paddress1,paddress2,paddress3,pdistrict,ppin,pstd,ptele,pemail,referby,rsource,rno,hospital,diagnos,sdiagnos,pricd,sicd,fdiag,sfdiag,ficd,sficd,cdiag,csdiag,cicd,scicd,quota,admission,discharge,recorder) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");  
  ps11.setInt(1,dcrfno);
  ps11.setString(2,dcrftp);
  ps11.setString(3,dunit);
  ps11.setString(4,ddate);
  ps11.setString(5,dfnme);
  ps11.setString(6,dlnm);
  ps11.setString(7,dfatr);
  ps11.setInt(8,dage);
  ps11.setInt(9,dsex);
  ps11.setInt(10,deduc);
  ps11.setString(11,dsedu);
  ps11.setString(12,dyedu);
  ps11.setInt(13,dmar);
  ps11.setInt(14,drel);
  ps11.setString(15,dorel);
  ps11.setInt(16,dmt);
  ps11.setString(17,domt);
  ps11.setInt(18,dresi);
  ps11.setInt(19,ddistce);
  ps11.setString(20,dost);
  ps11.setString(21,dfor);
  ps11.setInt(22,dfin);
  ps11.setString(23,dtfy);
  ps11.setString(24,dad1);
  ps11.setString(25,dad2);
  ps11.setString(26,dad3);
  ps11.setString(27,ddist);
  ps11.setInt(28,dpin);
  ps11.setInt(29,dstd);
  ps11.setInt(30,dtele);
  ps11.setString(31,demail);
  ps11.setString(32,dpad1);
  ps11.setString(33,dpad2);
  ps11.setString(34,dpad3);
  ps11.setString(35,dpdis);
  ps11.setInt(36,dppin);
  ps11.setInt(37,dpstd);
  ps11.setInt(38,dptel);
  ps11.setString(39,dpemil);
  ps11.setInt(40,drefby);
  ps11.setString(41,drsor);
  ps11.setInt(42,drno);
  ps11.setString(43,dphos);
  ps11.setInt(44,dpdias);
  ps11.setString(45,dpsdia);
  ps11.setInt(46,dpicd);
  ps11.setString(47,dspicd);
  ps11.setInt(48,dfdiag);
  ps11.setString(49,dsfdiag);
  ps11.setInt(50,dficd);
  ps11.setString(51,dsficd);
  ps11.setInt(52,dcdiag);
  ps11.setString(53,dcsdiag);
  ps11.setInt(54,dcicd);
  ps11.setString(55,dscicd);
  ps11.setString(56,dquota);
  ps11.setString(57,ddad);
  ps11.setString(58,dddis);
  ps11.setString(59,dcaser);
  ps11.execute();
  
	JOptionPane jo=new JOptionPane();
  	jo.showMessageDialog(f3,"Ok...Successfully Added");
  }

 	catch(Exception e)
 	{
	JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f3,"Error or Duplicat data....");
	 }
}


//--------------------------------------General Psychiatric file

public void generalpsych()
{

Container cip = f5.getContentPane();
cip.setLayout(null);
f5.setSize(1000,700);
f5.setVisible(true);
JLabel lg1 = new JLabel("CRF_NO");
JLabel lg2 = new JLabel("Date");
JLabel lg3 = new JLabel("ID Marks");
JLabel lg4 = new JLabel("Reliability");
JLabel lg5 = new JLabel("Chief Complaint");
JLabel lg6 = new JLabel("Patient Hstory");
JLabel lg7 = new JLabel("Informant");
JLabel lg8 = new JLabel("History Present_ill");
JLabel lg9 = new JLabel("Past History");
JLabel lg10 = new JLabel("Family History");
JLabel lg11 = new JLabel("Childhood His");
JLabel lg12 = new JLabel("Home_Atmospher");
JLabel lg13 = new JLabel("Menstrual_History");
JLabel lg14 = new JLabel("Sexual_Merital");
JLabel lg15 = new JLabel("Living Pattern");
JLabel lg16 = new JLabel("Premorbid");
JLabel lg17 = new JLabel("Cardio_vascular");
JLabel lg18 = new JLabel("Respiratry");
JLabel lg19 = new JLabel("Nurve");
JLabel lg20 = new JLabel("Speech");
JLabel lg21 = new JLabel("Appenia");
JLabel lg22 = new JLabel("Agonosia");
JLabel lg23 = new JLabel("motor System");
JLabel lg24 = new JLabel("Biceps_R");
JLabel lg25 = new JLabel("Triceps_R");
JLabel lg26 = new JLabel("Supenator_R");
JLabel lg27 = new JLabel("Knee_R");
JLabel lg28 = new JLabel("Ankel_R");
JLabel lg29 = new JLabel("Abdominal_R");
JLabel lg30 = new JLabel("Other_R");
JLabel lg31 = new JLabel("Biceps_L");
JLabel lg32 = new JLabel("Triceps_L");
JLabel lg33= new JLabel("Supenator_L");
JLabel lg34 = new JLabel("Knee_L");
JLabel lg35 = new JLabel("Anke._L");
JLabel lg36 = new JLabel("Admoninal_L");
JLabel lg37 = new JLabel("Other_L");
JLabel lg38 = new JLabel("Automatic System");
JLabel lg39 = new JLabel("Cerebral_Herati");
JLabel lg40 = new JLabel("Investigation");
JLabel lg41 = new JLabel("Language_Inter");
JLabel lg42 = new JLabel("Time_Inter");
JLabel lg43 = new JLabel("Interpretor");
JLabel lg44 = new JLabel("Attitude");
JLabel lg45 = new JLabel("Motor_Behaviour");
JLabel lg46 = new JLabel("Speech");
JLabel lg47 = new JLabel("Cognitive");
JLabel lg48 = new JLabel("calculation");
JLabel lg49 = new JLabel("Intelligent");
JLabel lg50 = new JLabel("Lobe_Mood");
JLabel lg51 = new JLabel("Thought_Stream_Form");
JLabel lg52 = new JLabel("Pocession");
JLabel lg53 = new JLabel("Contents");
JLabel lg54 = new JLabel("Sensory_Disorder");
JLabel lg55 = new JLabel("Other Phenomenon");
JLabel lg56 = new JLabel("Judgment");
JLabel lg57 = new JLabel("Insight");
JLabel lg58 = new JLabel("Assessment");
JLabel lg59 = new JLabel("Diagnosis");
JLabel lg60 = new JLabel("ICD_CODE");
JLabel lg61 = new JLabel("Follow_up");
JLabel lg62 = new JLabel("Image");

cip.add(lg1);
cip.add(lg2);
cip.add(lg3);
cip.add(lg4);
cip.add(lg5);
cip.add(lg6);
cip.add(lg7);
cip.add(lg8);
cip.add(lg9);
cip.add(lg10);
cip.add(lg11);
cip.add(lg12);
cip.add(lg13);
cip.add(lg14);
cip.add(lg15);
cip.add(lg16);
cip.add(lg17);
cip.add(lg18);
cip.add(lg19);
cip.add(lg20);
cip.add(lg21);
cip.add(lg22);
cip.add(lg23);
cip.add(lg24);
cip.add(lg25);
cip.add(lg26);
cip.add(lg27);
cip.add(lg28);
cip.add(lg29);
cip.add(lg30);
cip.add(lg31);
cip.add(lg32);
cip.add(lg33);
cip.add(lg34);
cip.add(lg35);
cip.add(lg36);
cip.add(lg37);
cip.add(lg38);
cip.add(lg39);
cip.add(lg40);
cip.add(lg41);
cip.add(lg42);
cip.add(lg43);
cip.add(lg44);
cip.add(lg45);
cip.add(lg46);
cip.add(lg47);
cip.add(lg48);
cip.add(lg49);
cip.add(lg50);
cip.add(lg51);
cip.add(lg52);
cip.add(lg53);
cip.add(lg54);
cip.add(lg55);
cip.add(lg56);
cip.add(lg57);
cip.add(lg58);
cip.add(lg59);
cip.add(lg60);
cip.add(lg61);
cip.add(lg62);

lg1.setBounds(5,5,100,20);
tg1.setBounds(110,5,50,20);
lg2.setBounds(5,30,100,20);
tg2.setBounds(110,30,50,20);
tg3.setBounds(170,30,20,20);
lg3.setBounds(5,55,100,20);
tg4.setBounds(110,55,50,20);
lg5.setBounds(5,80,100,20);
tg5.setBounds(110,80,150,20);
lg6.setBounds(5,105,100,20);
tg6.setBounds(110,105,150,20);
lg7.setBounds(5,135,100,20);
tg7.setBounds(110,135,150,20);
lg8.setBounds(5,160,100,20);
tg8.setBounds(110,160,150,20);
lg9.setBounds(5,185,100,20);
tg9.setBounds(110,185,150,20);
lg10.setBounds(5,210,100,20);
tg10.setBounds(110,210,150,20);
lg11.setBounds(5,235,100,20);
tg11.setBounds(110,235,150,20);
lg12.setBounds(5,260,100,20);
tg12.setBounds(110,260,150,20);
lg13.setBounds(5,285,100,20);
tg13.setBounds(110,285,150,20);
lg14.setBounds(5,310,100,20);
tg14.setBounds(110,310,150,20);
lg15.setBounds(5,335,10,20);
tg15.setBounds(110,335,150,20);
lg16.setBounds(5,360,100,20);
tg16.setBounds(110,360,150,20);
lg17.setBounds(5,385,100,20);
tg17.setBounds(110,385,150,20);
lg18.setBounds(5,410,100,20);
tg18.setBounds(110,410,150,20);
lg19.setBounds(5,435,100,20);
tg19.setBounds(110,435,150,20);
lg20.setBounds(5,460,100,20);
tg20.setBounds(110,460,150,20);
lg21.setBounds(5,485,100,20);
tg21.setBounds(110,485,150,20);
lg22.setBounds(5,510,100,20);
tg22.setBounds(110,510,150,20);
lg23.setBounds(5,535,100,20);
tg23.setBounds(110,535,150,20);
lg24.setBounds(350,5,100,20);
tg24.setBounds(460,5,150,20);
tg25.setBounds(460,35,150,20);
tg25.setBounds(460,60,150,20);
lg26.setBounds(350,85,100,20);
tg26.setBounds(460,85,150,20);
lg27.setBounds(350,110,100,20);
tg28.setBounds(460,110,150,20);
lg29.setBounds(350,135,100,20);
tg29.setBounds(460,135,150,20);
lg30.setBounds(350,160,100,20);
tg30.setBounds(460,160,150,20);
lg31.setBounds(350,185,100,20);
tg31.setBounds(460,185,150,20);
lg32.setBounds(350,210,100,20);
tg32.setBounds(460,210,150,20);
tg33.setBounds(460,235,150,20);
tg33.setBounds(460,260,150,20);
lg34.setBounds(350,285,100,20);
tg34.setBounds(460,285,150,20);
lg35.setBounds(350,310,100,20);
tg35.setBounds(460,310,150,20);
lg36.setBounds(350,335,100,20);
tg36.setBounds(460,335,150,20);
lg37.setBounds(350,360,100,20);
tg37.setBounds(460,360,150,20);
lg38.setBounds(350,385,100,20);
tg38.setBounds(460,385,150,20);
lg39.setBounds(350,410,100,20);
tg39.setBounds(460,410,150,20);
lg40.setBounds(350,435,100,20);
tg40.setBounds(460,435,150,20);
lg41.setBounds(350,460,100,20);
tg41.setBounds(460,460,150,20);
lg42.setBounds(350,485,100,20);
tg42.setBounds(460,485,150,20);
lg43.setBounds(350,510,100,20);
tg43.setBounds(460,510,150,20);
lg44.setBounds(350,535,100,20);
tg44.setBounds(460,535,150,20);
lg45.setBounds(700,5,100,20);
tg45.setBounds(800,5,150,20);
lg46.setBounds(700,35,100,20);
tg46.setBounds(800,35,150,20);
lg47.setBounds(700,60,100,20);
tg47.setBounds(800,60,150,20);
lg48.setBounds(700,85,100,20);
tg48.setBounds(800,85,150,20);
lg49.setBounds(700,110,100,20);
tg49.setBounds(800,110,150,20);
lg50.setBounds(700,135,100,20);
tg50.setBounds(800,135,150,20);
lg51.setBounds(700,160,100,20);
tg51.setBounds(800,160,150,20);
lg52.setBounds(700,185,100,20);
tg52.setBounds(800,185,150,20);
lg53.setBounds(700,210,100,20);
tg53.setBounds(800,210,150,20);
lg54.setBounds(700,235,100,20);
tg54.setBounds(800,235,150,20);
lg55.setBounds(700,260,100,20);
tg55.setBounds(800,260,150,20);
lg56.setBounds(700,285,100,20);
tg56.setBounds(800,285,150,20);
lg57.setBounds(700,310,100,20);
tg57.setBounds(800,310,150,20);
lg58.setBounds(700,335,100,20);
tg58.setBounds(800,335,150,20);
lg59.setBounds(700,360,100,20);
tg59.setBounds(800,360,150,20);
lg60.setBounds(700,385,100,20);
tg60.setBounds(800,385,150,20);
lg61.setBounds(700,410,100,20);
tg61.setBounds(800,410,150,20);
lg62.setBounds(700,435,100,20);
tg62.setBounds(800,435,150,20);

//Date dt = new Date();
//t5.setText(String.valueOf(dt));
cip.add(s4);
cip.add(b4);
cip.add(tg1);
cip.add(tg2);
cip.add(tg3);
cip.add(tg4);
cip.add(tg5);
cip.add(tg6);
cip.add(tg7);
cip.add(tg8);
cip.add(tg9);
cip.add(tg10);
cip.add(tg11);
cip.add(tg12);
cip.add(tg13);
cip.add(tg14);
cip.add(tg15);
cip.add(tg16);
cip.add(tg17);
cip.add(tg18);
cip.add(tg19);
cip.add(tg20);
cip.add(tg21);
cip.add(tg22);
cip.add(tg23);
cip.add(tg24);
cip.add(tg25);
cip.add(tg26);
cip.add(tg27);
cip.add(tg28);
cip.add(tg29);
cip.add(tg30);
cip.add(tg31);
cip.add(tg32);
cip.add(tg33);
cip.add(tg34);
cip.add(tg35);
cip.add(tg36);
cip.add(tg37);
cip.add(tg38);
cip.add(tg39);
cip.add(tg40);
cip.add(tg41);
cip.add(tg42);
cip.add(tg43);
cip.add(tg44);
cip.add(tg45);
cip.add(tg46);
cip.add(tg47);
cip.add(tg48);
cip.add(tg49);
cip.add(tg50);
cip.add(tg51);
cip.add(tg52);
cip.add(tg53);
cip.add(tg54);
cip.add(tg55);
cip.add(tg56);
cip.add(tg57);
cip.add(tg58);
cip.add(tg59);
cip.add(tg60);
cip.add(tg61);
cip.add(tg62);
 
cip.setBackground(Color.pink);

s4.setBounds(700,535,100,30);
b4.setBounds(800,535,100,30);
s4.addActionListener(this);
b4.addActionListener(this);
}


//---------------------------------------General Psychiatry record entry

public void generalpsychd()
{
Connection con;
PreparedStatement ps12;
  int dcrfno 	= Integer.parseInt(td7.getText());
  String dcrftp = td8.getText();//crftype
  String dunit 	= td9.getText();//
  String ddate 	= td10.getText();//unit
  String dfnme 	= td11.getText(); //fname
  String dlnm 	= td12.getText(); //lname
  String dfatr 	= td13.getText();//father
  int dage	= Integer.parseInt(td14.getText());//age
  int dsex  	= Integer.parseInt(td15.getText());//sex
  int deduc 	= Integer.parseInt(td16.getText());//education
  String  dsedu	= td17.getText();//specif
  String  dyedu	= td18.getText();
  int dmar 	= Integer.parseInt(td19.getText());
  int drel 	= Integer.parseInt(td20.getText());
  String  dorel	= td21.getText();
  int dmt	= Integer.parseInt(td22.getText());
  String  domt	= td23.getText();
  int dresi 	= Integer.parseInt(td24.getText());
  int  ddistce 	= Integer.parseInt(td25.getText());
  String dost 	= td26.getText();
  String dfor 	= td27.getText();
  int dfin 	= Integer.parseInt(td28.getText());
  String dtfy 	= td29.getText();
  String dad1 	= td30.getText();
  String dad2 	= td31.getText();
  String dad3 	= td32.getText();
  String ddist 	= td33.getText();
  int dpin 	= Integer.parseInt(td34.getText());
  int dstd 	= Integer.parseInt(td35.getText());
  int dtele 	= Integer.parseInt(td36.getText());
  String demail = td37.getText();
  String dpad1 	= td38.getText();
  String dpad2 	= td39.getText();
  String dpad3 	= td40.getText();
  String dpdis 	= td41.getText();
  int dppin  	= Integer.parseInt(td42.getText());
  int dpstd 	= Integer.parseInt(td43.getText());
  int dptel 	= Integer.parseInt(td44.getText());
  String dpemil = td45.getText();
  int drefby 	= Integer.parseInt(td46.getText());
  String drsor 	= td47.getText();
  int drno 	= Integer.parseInt(td48.getText());
  String dphos 	= td49.getText();
  int dpdias 	= Integer.parseInt(td50.getText());
  String dpsdia = td51.getText();
  int dpicd 	= Integer.parseInt(td52.getText());
  String dspicd = td53.getText();
  int dfdiag 	= Integer.parseInt(td54.getText());
  String dsfdiag = td55.getText();
  int dficd 	= Integer.parseInt(td56.getText());
  String dsficd = td57.getText();
  int dcdiag 	= Integer.parseInt(td58.getText());
  String dcsdiag = td59.getText();
  int dcicd 	= Integer.parseInt(td60.getText());
  String dscicd = td61.getText();
  String dquota = td62.getText();
  String ddad 	= td63.getText();
  String dddis 	= td64.getText();
  String dcaser = td65.getText();

  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
  ps12=con.prepareStatement("insert into genpsy(crfNo,crfType,unit,date,fName,lName,father,age,sex,education,especify,eyear,marital,religion,oreligion,mothert,omothert,residence,distance,state,foreign,incomef,familyt,address1,address2,address3,district,pin,std,tele,email,paddress1,paddress2,paddress3,pdistrict,ppin,pstd,ptele,pemail,referby,rsource,rno,hospital,diagnos,sdiagnos,pricd,sicd,fdiag,sfdiag,ficd,sficd,cdiag,csdiag,cicd,scicd,quota,admission,discharge,recorder) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,??)");  
  ps12.setInt(1,dcrfno);
  ps12.setString(2,dcrftp);
  ps12.setString(3,dunit);
  ps12.setString(4,ddate);
  ps12.setString(5,dfnme);
  ps12.setString(6,dlnm);
  ps12.setString(7,dfatr);
  ps12.setInt(8,dage);
  ps12.setInt(9,dsex);
  ps12.setInt(10,deduc);
  ps12.setString(11,dsedu);
  ps12.setString(12,dyedu);
  ps12.setInt(13,dmar);
  ps12.setInt(14,drel);
  ps12.setString(15,dorel);
  ps12.setInt(16,dmt);
  ps12.setString(17,domt);
  ps12.setInt(18,dresi);
  ps12.setInt(19,ddistce);
  ps12.setString(20,dost);
  ps12.setString(21,dfor);
  ps12.setInt(22,dfin);
  ps12.setString(23,dtfy);
  ps12.setString(24,dad1);
  ps12.setString(25,dad2);
  ps12.setString(26,dad3);
  ps12.setString(27,ddist);
  ps12.setInt(28,dpin);
  ps12.setInt(29,dstd);
  ps12.setInt(30,dtele);
  ps12.setString(31,demail);
  ps12.setString(32,dpad1);
  ps12.setString(33,dpad2);
  ps12.setString(34,dpad3);
  ps12.setString(35,dpdis);
  ps12.setInt(36,dppin);
  ps12.setInt(37,dpstd);
  ps12.setInt(38,dptel);
  ps12.setString(39,dpemil);
  ps12.setInt(40,drefby);
  ps12.setString(41,drsor);
  ps12.setInt(42,drno);
  ps12.setString(43,dphos);
  ps12.setInt(44,dpdias);
  ps12.setString(45,dpsdia);
  ps12.setInt(46,dpicd);
  ps12.setString(47,dspicd);
  ps12.setInt(48,dfdiag);
  ps12.setString(49,dsfdiag);
  ps12.setInt(50,dficd);
  ps12.setString(51,dsficd);
  ps12.setInt(52,dcdiag);
  ps12.setString(53,dcsdiag);
  ps12.setInt(54,dcicd);
  ps12.setString(55,dscicd);
  ps12.setString(56,dquota);
  ps12.setString(57,ddad);
  ps12.setString(58,dddis);
  ps12.setString(59,dcaser);
  ps12.execute();

  
	JOptionPane jo=new JOptionPane();
  	jo.showMessageDialog(f3,"Data Successfully Added");
  }

 	catch(Exception e)
 	{
	JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f3,"Can not insert Duplicate Value into Database");
	 }
}


//--------------------------------------Extension clinic form
public void extension()
{

cip=f16.getContentPane();
cip.setLayout(null);
f16.setSize(400,400);
f16.setVisible(true);
//tm0.requestFocus();
JLabel l1 = new JLabel("Frequency ");
JLabel l2 = new JLabel("Clinic ");
JLabel l3 = new JLabel("date ");
JLabel l4 = new JLabel("old");
JLabel l5 = new JLabel("New");

cip.add(l1);
cip.add(l2);
cip.add(l3);
cip.add(l4);
cip.add(l5);
cip.add(tx3);
cip.add(tx4);
cip.add(tx5);
cip.add(tx6);
cip.add(tx0);

l1.setBounds(25,25,75,25);
tx0.setBounds(100,25,200,25);
l2.setBounds(25,75,75,25);
tx3.setBounds(100,75,200,25);
l3.setBounds(25,125,75,25);
tx4.setBounds(100,125,200,25);
l4.setBounds(25,175,75,25);
tx5.setBounds(100,175,200,25);
l5.setBounds(25,225,75,25);
tx6.setBounds(100,225,200,25);


//Date dt = new Date();
//t5.setText(String.valueOf(dt));
cip.add(s13);
cip.add(b13);

cip.setBackground(Color.gray);
s13.setBounds(100,300,100,20);
b13.setBounds(210,300,100,20);
s13.addActionListener(this);
b13.addActionListener(this);
}

//-----------------------------------------------Extension record Entry

public void extensiona()
{
Connection con;
PreparedStatement ps1;

  int xfr	=Integer.parseInt(tx0.getText());
  String xcl	=tx3.getText();
  String xdat	=tx4.getText();
  int xold	=Integer.parseInt(tx5.getText());
  int xnew	=Integer.parseInt(tx6.getText());
 
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
  ps1=con.prepareStatement("insert into ext(fr,cl,dat,old,new) values(?,?,?,?,?)");
  ps1.setInt(1,xfr);
  ps1.setString(2,xcl);
  ps1.setString(3,xdat);
  ps1.setInt(4,xold);
  ps1.setInt(5,xnew);
  ps1.execute();
  
  JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f13,"Data Successfully Added");
}

 catch(Exception e)
 {JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f13,"Can not insert Duplicate Value into Database");
 }
}


//-------------------------------------------------Skin Clinic form

public void skin()
{

cip=f12.getContentPane();
cip.setLayout(null);
f12.setSize(400,600);
f12.setVisible(true);
ts1.requestFocus();
//ts1.requestFocus();
JLabel ls1 = new JLabel("SL No");
JLabel ls2 = new JLabel("SkinNO");
JLabel ls3 = new JLabel("Date ");
JLabel ls4 = new JLabel("Name ");
JLabel ls5 = new JLabel("Age ");
JLabel ls6 = new JLabel("Sex ");
JLabel ls7 = new JLabel("Doctor ");
JLabel ls8 = new JLabel("Designation ");
JLabel ls9 = new JLabel("Medicine ");
JLabel ls10 = new JLabel("Dose ");
cip.add(ls1);
cip.add(ls2);
cip.add(ls3);
cip.add(ls4);
cip.add(ls5);
cip.add(ls6);
cip.add(ls7);
cip.add(ls8);
cip.add(ls9);
cip.add(ls10);
cip.add(ts1);
cip.add(ts2);
cip.add(ts3);
cip.add(ts4);
cip.add(ts5);
cip.add(ts6);
cip.add(ts7);
cip.add(ts8);
cip.add(ts9);
cip.add(ts10);

ls1.setBounds(25,25,75,25);
ts1.setBounds(100,25,200,25);
ls2.setBounds(25,75,75,25);
ts2.setBounds(100,75,200,25);
ls3.setBounds(25,125,75,25);
ts3.setBounds(100,125,200,25);
ls4.setBounds(25,175,75,25);
ts4.setBounds(100,175,200,25);
ls5.setBounds(25,215,75,25);
ts5.setBounds(100,215,200,25);
ls6.setBounds(25,260,75,25);
ts6.setBounds(100,260,200,25);
ls7.setBounds(25,300,75,25);
ts7.setBounds(100,300,200,25);
ls8.setBounds(25,350,75,25);
ts8.setBounds(100,350,200,25);
ls9.setBounds(25,400,75,25);
ts9.setBounds(100,400,200,25);
ls10.setBounds(25,450,75,25);
ts10.setBounds(100,450,200,25);

//Date dt = new Date();
//t5.setText(String.valueOf(dt));
cip.add(s12);
cip.add(b12);

cip.setBackground(Color.gray);
s12.setBounds(100,500,100,20);
b12.setBounds(210,500,100,20);
s12.addActionListener(this);
b12.addActionListener(this);
}

//----------------------------------------------Skin record Entry

public void skina()
{
Connection con;
PreparedStatement ps3;

  int ssl	=Integer.parseInt(ts1.getText());
  String ssno	=ts2.getText();
  String sdt	=ts3.getText();
  String snm	=ts4.getText();
  int sage	=Integer.parseInt(ts5.getText());
  String ssex	=ts6.getText();
  String sdoc	=ts7.getText();
  String sdes	=ts8.getText();
  String smed	=ts9.getText();
  String sdos	=ts10.getText();
 
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con=DriverManager.getConnection("jdbc:odbc:cipproject","abc","xyz");
  ps3=con.prepareStatement("insert into skin1(sl,skn,dte,nm,age,sex,doc,des,med,dos)  values(?,?,?,?,?,?,?,?,?,?)");
  ps3.setInt(1,ssl);
  ps3.setString(2,ssno);
  ps3.setString(3,sdt);
  ps3.setString(4,snm);
  ps3.setInt(5,sage);
  ps3.setString(6,ssex);
  ps3.setString(7,sdoc);
  ps3.setString(8,sdes);
  ps3.setString(9,smed);
  ps3.setString(10,sdos);
  ps3.execute();
  
  JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f12,"Data Successfully Added");
}

 catch(Exception e)
 {JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f12,"Can not insert Duplicate Value into Database");
 }
}







//-------------------------------------------Emergency file

public void emergency()
{

cip=f11.getContentPane();
cip.setLayout(null);
f11.setSize(700,700);
f11.setVisible(true);
te1.requestFocus();
JLabel l1 = new JLabel("date ");
JLabel l2 = new JLabel("Emergency No ");
JLabel l3 = new JLabel("Name ");
JLabel l4 = new JLabel("Father ");
JLabel l5 = new JLabel("Age ");
JLabel l6 = new JLabel("sex");
JLabel l7 = new JLabel("Address");
JLabel l8 = new JLabel("District");
JLabel l9 = new JLabel("State");
JLabel l10 = new JLabel("Pin");
JLabel l11 = new JLabel("Phone");
JLabel l12 = new JLabel("Information Relation");
JLabel l13 = new JLabel("P&P History");
JLabel l14 = new JLabel("Family History");
JLabel l15 = new JLabel("Physical Exam");
JLabel l16 = new JLabel("Mental Status");
JLabel l17 = new JLabel("Diagnosis");
JLabel l18 = new JLabel("Management");
JLabel l19 = new JLabel("Doctor");
 
cip.add(l1);
cip.add(l2);
cip.add(l3);
cip.add(l4);
cip.add(l5);
cip.add(l6);
cip.add(l7);
cip.add(l8);
cip.add(l9);
cip.add(l10);
cip.add(l11);
cip.add(l12);
cip.add(l13);
cip.add(l14);
cip.add(l15);
cip.add(l16);
cip.add(l17);
cip.add(l18);
cip.add(l19);
cip.add(te1);
cip.add(te2);
cip.add(te3);
cip.add(te4);
cip.add(te5);
cip.add(te6);
cip.add(te7);
cip.add(te8);
cip.add(te9);
cip.add(te10);
cip.add(te11);
cip.add(te12);
cip.add(te13);
cip.add(te14);
cip.add(te15);
cip.add(te16);
cip.add(te17);
cip.add(te18);
cip.add(te19);

l1.setBounds(25,25,75,25);
te1.setBounds(100,25,200,25);
l2.setBounds(25,55,75,25);
te2.setBounds(100,55,200,25);
l3.setBounds(25,85,75,25);
te3.setBounds(100,85,200,25);
l4.setBounds(25,115,75,25);
te4.setBounds(100,115,200,25);
l5.setBounds(25,145,75,25);
te5.setBounds(100,145,200,25);
l6.setBounds(25,175,75,25);
te6.setBounds(100,175,200,25);
l7.setBounds(25,205,75,25);
te7.setBounds(100,205,200,25);
l8.setBounds(25,235,75,25);
te8.setBounds(100,235,200,25);
l9.setBounds(25,275,75,25);
te9.setBounds(100,275,200,25);
l10.setBounds(25,305,75,25);
te10.setBounds(100,305,200,25);
l11.setBounds(25,335,75,25);
te11.setBounds(100,335,200,25);
l12.setBounds(25,375,75,25);
te12.setBounds(100,375,200,25);
l13.setBounds(25,405,75,25);
te13.setBounds(100,405,200,25);
l14.setBounds(25,435,75,25);
te14.setBounds(100,435,200,25);
l15.setBounds(25,475,75,25);
te15.setBounds(100,475,200,25);
l16.setBounds(25,505,75,25);
te16.setBounds(100,505,200,25);
l17.setBounds(25,540,75,25);
te17.setBounds(100,540,200,25);
l18.setBounds(25,575,75,25);
te18.setBounds(100,575,200,25);
l19.setBounds(25,605,75,25);
te19.setBounds(100,605,200,25);
 
//Date dt = new Date();
//t5.setText(String.valueOf(dt));
cip.add(s14);
cip.add(b14);

cip.setBackground(Color.pink);
s14.setBounds(400,575,100,20);
b14.setBounds(500,575,100,20);
s14.addActionListener(this);
b14.addActionListener(this);
}

//---------------------------------------------Emergency Report
public void emergencya() 
{
Connection con;
PreparedStatement ps5;

  String edt=te1.getText();
  String eno=te2.getText();
  String enm=te3.getText();
  String efn=te4.getText();
  String eage=te5.getText();
  String esex=te6.getText();
  String eadd=te7.getText();
  String edis=te8.getText();
  String esta=te9.getText();
  String epin=te10.getText();
  String eph=te11.getText();
  String eir=te12.getText();
  String epph=te13.getText();
  String efh=te14.getText();
  String epe=te15.getText();
  String ems=te16.getText();
  String edi=te17.getText();
  String eman=te18.getText();
  String edoc=te19.getText();
  
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con=DriverManager.getConnection("jdbc:odbc:cipproject","abc","xyz");
  ps5=con.prepareStatement("insert into emerg(dt,en,nm,fa,ag,se,ad,dis,st,pi,ph,ir,pp,fh,pph,ms,di,ma,do) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
  ps5.setString(1,edt);
  ps5.setString(2,eno);
  ps5.setString(3,enm);
  ps5.setString(4,efn);
  ps5.setString(5,eage);
  ps5.setString(6,esex);
  ps5.setString(7,eadd);
  ps5.setString(8,edis);
  ps5.setString(9,esta);
  ps5.setString(10,epin);
  ps5.setString(11,eph);
  ps5.setString(12,eir);
  ps5.setString(13,epph);
  ps5.setString(14,efh);
  ps5.setString(15,epe);
  ps5.setString(16,ems);
  ps5.setString(17,edi);
  ps5.setString(18,eman);
  ps5.setString(19,edoc);
  
  ps5.execute();
  
  JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f11,"Data Successfully Entered");
}

 catch(Exception e)
 {JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f11,"Duplicate data........!");
 }

}

//----------------------------------------------------------Old Record Entry form
public void old()  
{

cip = f13.getContentPane();
cip.setLayout(null);
f13.setSize(1000,700);
f13.setVisible(true);
cip.add(s11);
cip.add(b11);
cip.setBackground(Color.yellow);
cip.add(to1);
cip.add(to2);
cip.add(to3);
cip.add(to4);
cip.add(to5);
cip.add(to6);
cip.add(to7);

JLabel lo1 = new JLabel("CRF_NO");
JLabel lo2 = new JLabel("type");
JLabel lo3 = new JLabel("DateVisit");
JLabel lo4 = new JLabel("Room Alot");
JLabel lo5 = new JLabel("Doctors");
JLabel lo6 = new JLabel("Remarks");
JLabel lo7 = new JLabel("Diagnosi");

cip.add(lo1);
cip.add(lo2);
cip.add(lo3);
cip.add(lo4);
cip.add(lo5);
cip.add(lo6);
cip.add(lo7);

lo1.setBounds(5,5,100,20);
to1.setBounds(110,5,50,20);
lo2.setBounds(5,30,100,20);
to2.setBounds(110,30,50,20);
lo3.setBounds(5,55,100,20);
to3.setBounds(110,55,50,20);
lo4.setBounds(5,80,100,20);
to4.setBounds(110,80,50,20);
lo5.setBounds(5,105,100,20);
to5.setBounds(110,105,50,20);
lo6.setBounds(5,130,100,20);
to6.setBounds(110,130,50,20);
lo7.setBounds(5,155,100,20);
to7.setBounds(110,155,150,20); 
s11.setBounds(700,535,100,30);
b11.setBounds(800,535,100,30);
s11.addActionListener(this);
b11.addActionListener(this);
}

//---------------------------------------------Old Record Entry
public void oldd()  
{
Connection con;
PreparedStatement ps2;

  String ocr=to1.getText();
  String ocrtp=to2.getText(); 
  String odat=to3.getText(); 
  String oro=to4.getText();
  String odor=to5.getText();  
  String ore=to6.getText();  
  String odi=to7.getText();  
   
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
  ps2=con.prepareStatement("insert into old1(cr,ty,da,rom,doc,re,d) values(?,?,?,?,?,?,?)");  
  ps2.setString(1,ocr);
  ps2.setString(2,ocrtp);
  ps2.setString(3,odat);
  ps2.setString(4,oro);
  ps2.setString(5,odor);
  ps2.setString(6,ore);
  ps2.setString(7,odi);
  ps2.execute();
  
	JOptionPane jo=new JOptionPane();
  	jo.showMessageDialog(f13,"Data Successfully Added");
  }

 	catch(Exception e)
 	{
	JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f13,"Can not insert Duplicate Value into Database");
	 }
}



//--------------------------------------------Admission Form

public void admission()  
{

cip=f14.getContentPane();
cip.setLayout(null);
f14.setSize(600,720);
f14.setVisible(true);
ta1.requestFocus();
JLabel la1 = new JLabel("CRF No");
JLabel la2 = new JLabel("Date");
JLabel la3 = new JLabel("TIme ");
JLabel la4 = new JLabel("FName ");
JLabel la5 = new JLabel("LName ");
JLabel la6 = new JLabel("Age ");
JLabel la7 = new JLabel("Sex ");
JLabel la8 = new JLabel("SpecialCase ");
JLabel la9 = new JLabel("VB_Case ");
JLabel la10 = new JLabel("GovernmentCase ");
JLabel la11 = new JLabel("Class");
JLabel la12 = new JLabel("Charge By");
JLabel la13 = new JLabel("Adress1 ");
JLabel la14 = new JLabel("Adress2 ");
JLabel la15 = new JLabel("District ");
JLabel la16 = new JLabel("State ");
JLabel la17 = new JLabel("Charge ");
JLabel la18 = new JLabel("CautionMoney ");
JLabel la19 = new JLabel("Adm_OrderBy ");
JLabel la20 = new JLabel("CMO ");
JLabel la21 = new JLabel("Specimen ");
JLabel la22 = new JLabel("Diagnosis ");

cip.add(la1);
cip.add(la2);
cip.add(la3);
cip.add(la4);
cip.add(la5);
cip.add(la6);
cip.add(la7);
cip.add(la8);
cip.add(la9);
cip.add(la10);
cip.add(la11);
cip.add(la12);
cip.add(la13);
cip.add(la14);
cip.add(la15);
cip.add(la16);
cip.add(la17);
cip.add(la18);
cip.add(la19);
cip.add(la20);
cip.add(la21);
cip.add(la22);

cip.add(ta1);
cip.add(ta2);
cip.add(ta3);
cip.add(ta4);
cip.add(ta5);
cip.add(ta6);
cip.add(ta7);
cip.add(ta8);
cip.add(ta9);
cip.add(ta10);
cip.add(ta11);
cip.add(ta12);
cip.add(ta13);
cip.add(ta14);
cip.add(ta15);
cip.add(ta16);
cip.add(ta17);
cip.add(ta18);
cip.add(ta19);
cip.add(ta20);
cip.add(ta21);
cip.add(ta22);

la1.setBounds(25,10,75,25);
ta1.setBounds(100,10,200,25);
la2.setBounds(25,40,75,25);
ta2.setBounds(100,40,200,25);
la3.setBounds(25,70,75,25);
ta3.setBounds(100,70,200,25);
la4.setBounds(25,100,75,25);
ta4.setBounds(100,100,200,25);
la5.setBounds(25,140,75,25);
ta5.setBounds(100,140,200,25);
la6.setBounds(25,170,75,25);
ta6.setBounds(100,170,200,25);
la7.setBounds(25,200,75,25);
ta7.setBounds(100,200,200,25);
la8.setBounds(25,230,75,25);
ta8.setBounds(100,230,200,25);
la9.setBounds(25,260,75,25);
ta9.setBounds(100,260,200,25);
la10.setBounds(25,290,75,25);
ta10.setBounds(100,290,200,25);
la11.setBounds(25,320,75,25);
ta11.setBounds(100,320,200,25);
la12.setBounds(25,350,75,25);
ta12.setBounds(100,350,200,25);
la13.setBounds(25,380,75,25);
ta13.setBounds(100,380,200,25);
la14.setBounds(25,410,75,25);
ta14.setBounds(100,410,200,25);
la15.setBounds(25,440,75,25);
ta15.setBounds(100,440,200,25);
la16.setBounds(25,470,75,25);
ta16.setBounds(100,470,200,25);
la17.setBounds(25,500,75,25);
ta17.setBounds(100,500,200,25);
la18.setBounds(25,530,75,25);
ta18.setBounds(100,530,200,25);
la19.setBounds(25,560,75,25);
ta19.setBounds(100,560,200,25);
la20.setBounds(25,590,75,25);
ta20.setBounds(100,590,200,25);
la21.setBounds(25,620,75,25);
ta21.setBounds(100,620,200,25);
la22.setBounds(25,650,75,25);
ta22.setBounds(100,650,200,25);


//Date dt = new Date();
//t5.setText(String.valueOf(dt));
cip.add(s16);
cip.add(b16);

cip.setBackground(Color.pink);
s16.setBounds(310,650,100,25);
b16.setBounds(410,650,100,25);
s16.addActionListener(this);
b16.addActionListener(this);
}

//--------------------------------------------------Admission Record Entry

public void admissiona() 
{
Connection con;
PreparedStatement ps4;

  String mcrf=ta1.getText();
  String mdate=ta2.getText();
  String mtime=ta3.getText();
  String mfname=ta4.getText();
  String mlname=ta5.getText();
  String mage=ta6.getText();
 
  String msex=ta7.getText();
  String mspecial=ta8.getText();
  String mvb=ta9.getText();
  String mgovt=ta10.getText();
  String mclass=ta11.getText();
  String mchargeby=ta12.getText();
  String maddres1=ta13.getText();
  String maddres2=ta14.getText();
  String mdistrict=ta15.getText();
  String mstate=ta16.getText();
  String mcharge=ta17.getText();
  String mcoutionmoney=ta18.getText();
  String madm_orderby=ta19.getText();
  String mmedicalO=ta20.getText();
  String mspecimen=ta21.getText();
  String mdiagnosis=ta22.getText();

// String critem=String.valueOf(c1.getSelectedItem());
  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
  ps4=con.prepareStatement("insert into admission(crf,date,time,fname,lname,age,sex,special,vb,govt,class,chargeby,address1,address2,district,state,charge,coution,adm_ord_by,officer,specime,diag) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
  ps4.setString(1,mcrf);
  ps4.setString(2,mdate);
  ps4.setString(3,mtime);
  ps4.setString(4,mfname);
  ps4.setString(5,mlname);
  ps4.setString(6,mage);
  ps4.setString(7,msex);
  ps4.setString(8,mspecial);
  ps4.setString(9,mvb);
  ps4.setString(10,mgovt);
  ps4.setString(11,mclass);
  ps4.setString(12,mchargeby);
  ps4.setString(13,maddres1);
  ps4.setString(14,maddres2);
  ps4.setString(15,mdistrict);
  ps4.setString(16,mstate);
  ps4.setString(17,mcharge);
  ps4.setString(18,mcoutionmoney);
  ps4.setString(19,madm_orderby);
  ps4.setString(20,mmedicalO);
  ps4.setString(21,mspecimen);
  ps4.setString(22,mdiagnosis);
  ps4.execute();
  
  JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f14,"Data Successfully Added");
}

 catch(Exception e)
 {JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f14,"Can not insert Duplicate Value into Database");
 }

}
//-------------------------------------------Discharge form

public void discharge()
{

cip=f15.getContentPane();
cip.setLayout(null);
f15.setSize(600,720);
f15.setVisible(true);
ta1.requestFocus();
JLabel ldi1 = new JLabel("CRF No");
JLabel ldi2 = new JLabel("Date");
JLabel ldi3 = new JLabel("TIme ");
JLabel ldi4 = new JLabel("FName ");
JLabel ldi5 = new JLabel("LName ");
JLabel ldi6 = new JLabel("Age ");
JLabel ldi7 = new JLabel("Sex ");
JLabel ldi8 = new JLabel("SpecialCase ");
JLabel ldi9 = new JLabel("VB_Case ");
JLabel ldi10 = new JLabel("GovernmentCase ");
JLabel ldi11 = new JLabel("Cldiss");
JLabel ldi12 = new JLabel("Charge By");
JLabel ldi13 = new JLabel("Adress1 ");
JLabel ldi14 = new JLabel("Adress2 ");
JLabel ldi15 = new JLabel("District ");
JLabel ldi16 = new JLabel("Sldte ");
JLabel ldi17 = new JLabel("Charge ");
JLabel ldi18 = new JLabel("CautionMoney ");
JLabel ldi19 = new JLabel("Adm_OrderBy ");
JLabel ldi20 = new JLabel("CMO ");
JLabel ldi21 = new JLabel("Specimen ");
JLabel ldi22 = new JLabel("Diagnosis ");

cip.add(ldi1);
cip.add(ldi2);
cip.add(ldi3);
cip.add(ldi4);
cip.add(ldi5);
cip.add(ldi6);
cip.add(ldi7);
cip.add(ldi8);
cip.add(ldi9);
cip.add(ldi10);
cip.add(ldi11);
cip.add(ldi12);
cip.add(ldi13);
cip.add(ldi14);
cip.add(ldi15);
cip.add(ldi16);
cip.add(ldi17);
cip.add(ldi18);
cip.add(ldi19);
cip.add(ldi20);
cip.add(ldi21);
cip.add(ldi22);


cip.add(tdi1);
cip.add(tdi2);
cip.add(tdi3);
cip.add(tdi4);
cip.add(tdi5);
cip.add(tdi6);
cip.add(tdi7);
cip.add(tdi8);
cip.add(tdi9);
cip.add(tdi10);
cip.add(tdi11);
cip.add(tdi12);
cip.add(tdi13);
cip.add(tdi14);
cip.add(tdi15);
cip.add(tdi16);
cip.add(tdi17);
cip.add(tdi18);
cip.add(tdi19);
cip.add(tdi20);
cip.add(tdi21);
cip.add(tdi22);

ldi1.setBounds(25,10,75,25);
tdi1.setBounds(100,10,200,25);
ldi2.setBounds(25,40,75,25);
tdi2.setBounds(100,40,200,25);
ldi3.setBounds(25,70,75,25);
tdi3.setBounds(100,70,200,25);
ldi4.setBounds(25,100,75,25);
tdi4.setBounds(100,100,200,25);
ldi5.setBounds(25,130,75,25);
tdi5.setBounds(100,130,200,25);
ldi6.setBounds(25,160,75,25);
tdi6.setBounds(100,160,200,25);
ldi7.setBounds(25,190,75,25);
tdi7.setBounds(100,190,200,25);
ldi8.setBounds(25,220,75,25);
tdi8.setBounds(100,220,200,25);
ldi9.setBounds(25,250,75,25);
tdi9.setBounds(100,250,200,25);
ldi10.setBounds(25,280,75,25);
tdi10.setBounds(100,280,200,25);
ldi11.setBounds(25,310,75,25);
tdi11.setBounds(100,310,200,25);
ldi12.setBounds(25,350,75,25);
tdi12.setBounds(100,350,200,25);
ldi13.setBounds(25,380,75,25);
tdi13.setBounds(100,380,200,25);
ldi14.setBounds(25,410,75,25);
tdi14.setBounds(100,410,200,25);
ldi15.setBounds(25,440,75,25);
tdi15.setBounds(100,440,200,25);
ldi16.setBounds(25,470,75,25);
tdi16.setBounds(100,470,200,25);
ldi17.setBounds(25,500,75,25);
tdi17.setBounds(100,500,200,25);
ldi18.setBounds(25,530,75,25);
tdi18.setBounds(100,530,200,25);
ldi19.setBounds(25,560,75,25);
tdi19.setBounds(100,560,200,25);
ldi20.setBounds(25,590,75,25);
tdi20.setBounds(100,590,200,25);
ldi21.setBounds(25,610,75,25);
tdi21.setBounds(100,610,200,25);
ldi22.setBounds(25,640,75,25);
tdi22.setBounds(100,640,200,25);

//Date dt = new Date();
//t5.setText(String.valueOf(dt));
cip.add(s15);
cip.add(b15);

cip.setBackground(Color.pink);
s15.setBounds(310,640,100,20);
b15.setBounds(410,640,100,20);
s15.addActionListener(this);
b15.addActionListener(this);
}
//---------------------------------------------Discharge Record Entry

public void dischargea()
{
Connection con;
PreparedStatement ps5;

 String mcrf=tdi1.getText();
  String mdate=tdi2.getText();
  String mtime=tdi3.getText();
  String mfname=tdi4.getText();
  String mlname=tdi5.getText();
  int mage = Integer.parseInt(tdi6.getText());
 
  String msex=tdi7.getText();
  String mspecial=tdi8.getText();
  String mvb=tdi9.getText();
  String mgovt=tdi10.getText();
  String mclass=tdi11.getText();
  String mchargeby=tdi12.getText();
  String maddres1=tdi13.getText();
  String maddres2=tdi14.getText();
  String mdistrict=tdi15.getText();
  String mstate=tdi16.getText();
  String mcharge=tdi17.getText();
  String mcoutionmoney=tdi18.getText();
  String madm_orderby=tdi19.getText();
  String mmedicalO=tdi20.getText();
  String mspecimen=tdi21.getText();
  String mdiagnosis=tdi22.getText();

  try
  {
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
  ps5=con.prepareStatement("insert into admission(crf,date,time,fname,lname,age,sex,special,vb,govt,class,chargeby,address1,address2,district,state,charge,coution,adm_ord_by,officer,specime,diag) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
  ps5.setString(1,mcrf);
  ps5.setString(2,mdate);
  ps5.setString(3,mtime);
  ps5.setString(4,mfname);
  ps5.setString(5,mlname);
  ps5.setInt(6,mage);
  ps5.setString(7,msex);
  ps5.setString(8,mspecial);
  ps5.setString(9,mvb);
  ps5.setString(10,mgovt);
  ps5.setString(11,mclass);
  ps5.setString(12,mchargeby);
  ps5.setString(13,maddres1);
  ps5.setString(14,maddres2);
  ps5.setString(15,mdistrict);
  ps5.setString(16,mstate);
  ps5.setString(17,mcharge);
  ps5.setString(18,mcoutionmoney);
  ps5.setString(19,madm_orderby);
  ps5.setString(20,mmedicalO);
  ps5.setString(21,mspecimen);
  ps5.setString(22,mdiagnosis);
  ps5.execute();
  
  JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f14,"Data Successfully Added");
}

 catch(Exception e)
 {JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f14,"Can not insert Duplicate Value into Database");
 }
}


//--------------------------------------------------Report form
void report()
{
cip=f18.getContentPane();
cip.setLayout(null);
cip.setBackground(Color.pink);
f18.setSize(800,600);
f18.setVisible(true);
Font f = new Font("Verdana",Font.BOLD,20);
JLabel l1 = new JLabel("Reports");
l1.setFont(f);
ButtonGroup bg = new ButtonGroup();
cip.add(l1);
bg.add(r17);
bg.add(r18);
bg.add(r19);
bg.add(r20);
bg.add(r21);
bg.add(r22);
bg.add(r23);
bg.add(r24);
bg.add(r25);
cip.add(r17);
cip.add(r18);
cip.add(r19);
cip.add(r20);
cip.add(r21);
cip.add(r22);
cip.add(r23);
cip.add(r24);
cip.add(r25);
cip.add(b10);
 
r17.setBackground(Color.gray);
r18.setBackground(Color.gray);
r19.setBackground(Color.gray);
r20.setBackground(Color.gray);
r21.setBackground(Color.gray);
r22.setBackground(Color.gray);
r23.setBackground(Color.gray);
r24.setBackground(Color.gray);
r25.setBackground(Color.gray);
l1.setBounds(350,50,200,50);
r17.setBounds(250,100,300,25);
r18.setBounds(250,130,300,25);
r19.setBounds(250,160,300,25);
r20.setBounds(250,190,300,25);
r21.setBounds(250,220,300,25);
r22.setBounds(250,250,300,25);
r23.setBounds(250,280,300,25);
r24.setBounds(250,310,300,25);
r25.setBounds(250,340,300,25);
b10.setBounds(400,370,100,25);

r17.addActionListener(this);
r18.addActionListener(this);
r19.addActionListener(this);
r20.addActionListener(this);
r21.addActionListener(this);
r22.addActionListener(this);
r23.addActionListener(this);
r24.addActionListener(this);
r25.addActionListener(this);
b10.addActionListener(this);

}

//------------------------------------------------------ Master report

public void masterrep()
{
Connection con;
Statement stm;
ResultSet rs;
PreparedStatement ps7;
cip=f19.getContentPane();
cip.setLayout(null);
f19.setSize(800,600);
f19.setVisible(true);
cip.setBackground(Color.gray);
JLabel l1 = new JLabel("Day Wise Report");
cip.add(l1);
l1.setBounds(350,25,100,25);
String colHeads[] = {"STAT","DIST.","COUNTR.","DIAGNAME","DIAGCODE"};
DefaultTableModel dtab=new DefaultTableModel(colHeads,1);
JTable jt = new JTable();
jt.setModel(dtab);

int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
JScrollPane jp = new JScrollPane(jt,v,h);
cip.add(jp);
jp.setBounds(30,50,730,425);
cip.add(b17);
b17.setBounds(650,500,100,20);
b17.addActionListener(this);
try
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
  stm=con.createStatement();
  rs=stm.executeQuery("select master1.state,master1.district,master1.country,master1.diagName,master1.diagCode from master1");
 
  int r=0,row=0;

  while(rs.next())
  {
    dtab.setValueAt(rs.getString(1),row,0);
    dtab.setValueAt(rs.getString(2),row,1);
    dtab.setValueAt(rs.getString(3),row,2);
    dtab.setValueAt(rs.getString(4),row,3);
    dtab.setValueAt(rs.getString(5),row,4);
    r=dtab.getRowCount();
    r=r+1;
    dtab.setNumRows(r);
    row=row+1;
  }

  }

 catch(Exception e)
 {   }

}

//------------------------------------------------------Skin Report

public void skinrep()
{
Connection con;
Statement stm;
ResultSet rs;
PreparedStatement ps7;
cip=f32.getContentPane();
//String icode = ts11.getText();
cip.setLayout(null);
f32.setSize(900,600);
f32.setVisible(true);
cip.setBackground(Color.gray);
JLabel l1 = new JLabel("Day Wise Report : Skin");
cip.add(l1);
l1.setBounds(350,25,100,25);
String colHeads[] = {"Skin_No","Date.","Name","Age","Sex"};
DefaultTableModel dtab=new DefaultTableModel(colHeads,1);
JTable jt = new JTable();
jt.setModel(dtab);

int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
JScrollPane jp = new JScrollPane(jt,v,h);
cip.add(jp);
jp.setBounds(30,50,730,425);
cip.add(b18);
b18.setBounds(650,500,100,20);
b18.addActionListener(this);
try
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
  stm=con.createStatement();
  rs=stm.executeQuery("select skin1.skn,skin1.dte,skin1.nm,skin1.age,skin1.sex from skin1");
 
  int r=0,row=0;

  while(rs.next())
  {

                           
 dtab.setValueAt(rs.getString(1),row,0);
    dtab.setValueAt(rs.getString(2),row,1);
    dtab.setValueAt(rs.getString(3),row,2);
    dtab.setValueAt(rs.getString(4),row,3);
    dtab.setValueAt(rs.getString(5),row,4);
    r=dtab.getRowCount();
    r=r+1;
    dtab.setNumRows(r);
    row=row+1;
  }

  }

 catch(Exception e)
 {   }

}

//------------------------------------------------Emergency Report

public void extenrep()
{
Connection con;
Statement stm;
ResultSet rs;
PreparedStatement ps7;
cip=f49.getContentPane();
//String icode = ts11.getText();
cip.setLayout(null);
f49.setSize(900,600);
f49.setVisible(true);
cip.setBackground(Color.gray);
JLabel l1 = new JLabel("Day Wise Report : Extension");
cip.add(l1);
l1.setBounds(350,25,100,25);
String colHeads[] = {"Frequency","Clinic","Date","Old","New"};
DefaultTableModel dtab=new DefaultTableModel(colHeads,1);
JTable jt = new JTable();
jt.setModel(dtab);

int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
JScrollPane jp = new JScrollPane(jt,v,h);
cip.add(jp);
jp.setBounds(30,50,730,425);
cip.add(b19);
b19.setBounds(650,500,100,20);
b19.addActionListener(this);
try
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
  stm=con.createStatement();
  rs=stm.executeQuery("select ext.fr,ext.cl,ext.dat,ext,old,ext.new from ext");
 
  int r=0,row=0;

  while(rs.next())
  {
    dtab.setValueAt(rs.getString(1),row,0);
    dtab.setValueAt(rs.getString(2),row,1);
    dtab.setValueAt(rs.getString(3),row,2);
    dtab.setValueAt(rs.getString(4),row,3);
    dtab.setValueAt(rs.getString(5),row,4);
    r=dtab.getRowCount();
    r=r+1;
    dtab.setNumRows(r);
    row=row+1;
  }

  }

 catch(Exception e)
 {   }

}


//--------------------------------------------------Query form
void query()
{
cip=f36.getContentPane();
cip.setLayout(null);
cip.setBackground(Color.pink);
f36.setSize(800,600);
f36.setVisible(true);
Font f = new Font("Verdana",Font.BOLD,20);
JLabel l1 = new JLabel("Query");
l1.setFont(f);
ButtonGroup bg = new ButtonGroup();
cip.add(l1);
bg.add(r34);
bg.add(r35);
bg.add(r36);
bg.add(r37);
bg.add(b20);
cip.add(r34);
cip.add(r35);
cip.add(r36);
cip.add(r37);
 
r34.setBackground(Color.gray);
r35.setBackground(Color.gray);
r36.setBackground(Color.gray);
r37.setBackground(Color.gray);

l1.setBounds(350,50,200,25);
r34.setBounds(350,100,100,30);
r35.setBounds(350,130,100,30);
r36.setBounds(350,170,100,30);
r37.setBounds(350,200,100,30);
b20.setBounds(370,240,70,20);
r34.addActionListener(this);
r35.addActionListener(this);
r36.addActionListener(this);
r37.addActionListener(this);
b20.addActionListener(this);

}


//---------------------------------------------------------Name wise Query

public void queryn()
{

Connection con;
Statement stm;
ResultSet rs;
PreparedStatement ps7;

cip.setLayout(null);
cip=f37.getContentPane();
f37.setSize(1000,600);
f37.setVisible(true);
JLabel l6 = new JLabel("Query on Name for Skink Clinic");
cip.add(l6);
cip.add(j123);
cip.add(b36);
cip.add(b37);
cip.add(tq1);
l6.setBounds(350,25,300,25);
tq1.setBounds(650,25,100,25);
j123.setBounds(750,25,100,25);
b36.setBounds(750,50,100,25);
b36.setBounds(900,50,100,25);
j123.addActionListener(this);
b36.addActionListener(this);
b37.addActionListener(this);

cip.setBackground(Color.gray);

String tdq1 = tq1.getText();
String colHeads[] = {"Skin_No","Date.","Name","Age","Sex"};
//String colHeads[] = {"sknno"};
DefaultTableModel dtab=new DefaultTableModel(colHeads,1);
JTable jt = new JTable();
jt.setModel(dtab);
int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
JScrollPane jp = new JScrollPane(jt,v,h);
cip.add(jp);
jp.setBounds(30,50,730,425);
cip.add(b21);
b21.setBounds(650,500,100,20);

b21.addActionListener(this);
try
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
  stm=con.createStatement();
  rs=stm.executeQuery("select skin1.skn,skin1.dte,skin1.nm,skin1.age,skin1.sex from skin1 WHERE skin1.nm= '"+tdq1+"'");
// rs=stm.executeQuery("select COUNT(skin1.skn) from skin1 WHERE skin1.nm= '"+tdq1+"'");
  // rs=stm.executeQuery("select count(skin1.skn) from skin1 WHERE skin1.dte = '"+tdq1+"'");
//rs=stm.executeQuery("select count(skin1.skn) from skin1 WHERE MONTH(skin1.dte) = '"+tdq1+"'");


  int r=0,row=0;

  while(rs.next())
  {
    dtab.setValueAt(rs.getString(1),row,0);
    dtab.setValueAt(rs.getString(2),row,1);
    dtab.setValueAt(rs.getString(3),row,2);
    dtab.setValueAt(rs.getString(4),row,3);
    dtab.setValueAt(rs.getString(5),row,4);
    r=dtab.getRowCount();
    r=r+1;
    dtab.setNumRows(r);
    row=row+1;
  }

  }

 catch(Exception e)
 {   }

}


/*
//erase data================================================
public void erase_item()
{
Connection con;
ResultSet rs;
PreparedStatement ps7;
Statement stm;

PreparedStatement ps;

  String tdq1 = tq1.getText();
  
  try
  {
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
  stm=con.createStatement();
  rs=stm.executeQuery("delete from skin1 WHERE skin1.nm= '"+tdq1+"'");  
 
//con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
 //  rs=con.prepareStatement("delete from skin1 where skin1.nm = '"+tdq1+"'");
   
//	ps.execute();
  }
  catch(Exception e)
  {System.out.println(e);}
}
*/
//update item========
public void update_item()
{
Connection con;
ResultSet rs;
PreparedStatement ps7;
Statement stm;

PreparedStatement ps;

  String tdq1 = tq1.getText();
  
  try
  {
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
   stm=con.createStatement();
   rs=stm.executeQuery("update skin1 WHERE skin1.nm= '"+tdq1+"'");  
 
// con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
//   rs=con.prepareStatement("update skin1 where skin1.nm = '"+tdq1+"'");
   
//	ps.execute();
  }
  catch(Exception e)
  {System.out.println(e);}

}

/*

//==================update item

public void back_item()
{
Connection con;
Statement stm;
ResultSet rs;
skin();

  String tdq1 = tq1.getText();
    
  try
  {
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   con=DriverManager.getConnection("jdbc:odbc:cipproject","eqbal","akhtar");
   stm=con.createStatement();
   rs=stm.executeQuery("select skin1.skn,skin1.dte,skin1.nm,skin1.age,skin1.sex from skin1 WHERE skin1.nm= '"+tdq1+"'");
   rs.next();
  
  Integer.parseInt(ts1.getText());
 ts2.getText();
 ts3.getText();
  ts4.getText();
 Integer.parseInt(ts5.getText());
  ts6.getText();
 ts7.getText();
 ts8.getText();
  ts9.getText();
  ts10.getText();


   t21.setText(rs.getString(1));
   t20.setText(rs.getString(2));


   t22.setText(String.valueOf(rs.getInt(3)));
   ta.setText(rs.getString(4));
   t_stock.setText(String.valueOf(rs.getInt(5)));
  JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f8,"Data Successfuly Backed");

  }
  catch(Exception e)
  {
  JOptionPane jo=new JOptionPane();
  jo.showMessageDialog(f8,"Data Could not Go");
  }
}

*/
public void actionPerformed(ActionEvent ae)
{

   if(ae.getSource()==r16)
     {
      System.exit(0);
     }
  if(ae.getSource()==r0)
     {
  	master();
      }
  
  if(ae.getSource()==s2)
     {
     	mastera();
	tm0.setText("");	
	t3.setText("");
	t4.setText("");
	t5.setText("");
	t6.setText("");
	tm0.requestFocus();
     }



 if(ae.getSource()==b2)
      {
       f2.setVisible(false);
JFrame f1 = new JFrame("PATIENTS RECORDS FOR OPD, CIP");
	mainMenu();
	}

//--------------
  
if(ae.getSource()==r1)
     {
  	demographic();
      }
  
  if(ae.getSource()==s3)
     {
     	demograph();
     }

if(ae.getSource()==b3)
     {
	f3.setVisible(false);
     	mainMenu();
     } 
//----------------

if(ae.getSource()==r2)
     {
     	generalpsych();
	 
     }
if(ae.getSource()==s4)
{
generalpsychd();
}
if(ae.getSource()==b4)
{
	f5.setVisible(false);
     	mainMenu();
}
//-----------

if(ae.getSource()==r9)
     {
emergency();
      } 

if(ae.getSource()==s14)
     {
     	f2.setVisible(false);
	emergencya();
	te1.setText("");	
	te2.setText("");
	te3.setText("");
	te4.setText("");
	te5.setText("");
	te6.setText("");	
	te7.setText("");
	te8.setText("");
	te9.setText("");
	te10.setText("");
	te11.setText("");	
	te12.setText("");
	te13.setText("");
	te14.setText("");
	te15.setText("");
	te16.setText("");	
	te17.setText("");
	te18.setText("");
	te19.setText("");
	te1.requestFocus();
     }

if(ae.getSource()==b14)
     {
 	f11.setVisible(false);	
	mainMenu();
}
//-----

if(ae.getSource()==r8)
     {
	skin();
      }
  
  if(ae.getSource()==s12)
     {
	skina();
	ts1.setText("");	
	ts2.setText("");
	ts3.setText("");
	ts4.setText("");
	ts5.setText("");
	ts6.setText("");
	ts7.setText("");
	ts8.setText("");
	ts9.setText("");
	ts10.setText("");
	ts1.requestFocus();  
      }

	if(ae.getSource()==b12)
     	{
	f12.setVisible(false);  
	mainMenu();
        }


//-----

	if(ae.getSource()==r11)
     {
     	f2.setVisible(false);
	old();
	 
     }  
	if(ae.getSource()==s11)
     {
	f2.setVisible(false);
     	oldd();
 	to1.getText();
 	to2.getText(); 
 	to3.getText(); 
  	to4.getText();
  	to5.getText();  
  	to6.getText();  
  	to7.getText();  
	to1.requestFocus();	 
     }
 	if(ae.getSource()==b11)
     {
       f13.setVisible(false);

	mainMenu();
     }
 //------


	if(ae.getSource()==r12)
     {
     	admission();
	 
     }  
	if(ae.getSource()==s16)
     {
	admissiona();
	 
     }
 	if(ae.getSource()==b16)
     {
       f14.setVisible(false);

	mainMenu();
     }
//-----

if(ae.getSource()==r13)
     {
     	discharge();
	 
     }  
	if(ae.getSource()==s15)
     {
	dischargea();
	 
     }
 	if(ae.getSource()==b15)
     {
       f15.setVisible(false);

	mainMenu();
     }

//------

if(ae.getSource()==r10)
     {
     	extension();
	 
     }  
	if(ae.getSource()==s13)
     {
	extensiona();
	 
     }
 	if(ae.getSource()==b13)
     {
       f16.setVisible(false);

	mainMenu();
     }
//))))))))))))))))
if(ae.getSource()==r14)
     
	{
  	report();
        }
if(ae.getSource()==b10)
{
f18.setVisible(false);
}

  if(ae.getSource()==r23)
     {
  	masterrep();
      }
  if(ae.getSource()== b17)
{ f19.setVisible(false);
}
   if(ae.getSource()==r19)
     {
 	skinrep();
      }
if(ae.getSource()==b18)
     {
 	f32.setVisible(false);
      }

 if(ae.getSource()==r20)
     {
  	extenrep();
      }
  if(ae.getSource()== b19)
{ f49.setVisible(false);
}

 


//**************** Query
if(ae.getSource()==r15)
     
	{ f18.setVisible(false);
  	query();
        }
if(ae.getSource()==b20)
     {
  	f36.setVisible(false);
      }
if(ae.getSource()==r34)
     {
  	f36.setVisible(false);
	queryn();

      }  
if(ae.getSource()==b21)
     {
  	f37.setVisible(false);
      } 

if(ae.getSource()==b3a)
     {
  	f0.setVisible(false);
	mainMenu();
      }
  if(ae.getSource()==j123)
     {
  	queryn();
       
      }
  
if(ae.getSource()==b36)
     {
  	queryn();
       
      }
if(ae.getSource()==b37)
     {
  	update_item();
       
      }
if(ae.getSource()==b4a)
     {
  	System.exit(0);
      } 
 //**************************
}
public static void main(String arg[])
  {
CIP p = new CIP();
  p.display();
  }

}
