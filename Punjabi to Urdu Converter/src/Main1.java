/**
 * @author Shreya Gandhi  (150176202851)
 * @author Gursimar Kaur  (150176202816)
 * @author Maan Kaur      (150176202831)
 * @author Manpreet Singh (150176270885)
*/


import java.awt.print.*;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;


import java.awt.SystemColor;


public class Main1
{
	public JFrame frame;
	private JTextArea textArea_1;
	private JTextArea textArea;
	private JButton pause;
	private JButton resume;
	private JButton cancel;
	private JButton stop;
	private String path,data;
	private JButton print,back;
	String userhome = System.getProperty("user.home");
	public JFileChooser fc;
	private JMenuItem mntmSave=new 	JMenuItem();
	

	public void recordActionPerformed(java.awt.event.ActionEvent rc)
	{
		resume.setEnabled(false);
		pause.setEnabled(true);
		stop.setEnabled(true);
		cancel.setEnabled(true);
		
	}
	
	public void pauseActionPerformed(java.awt.event.ActionEvent pa)
	{
		resume.setEnabled(true);
		pause.setEnabled(false);
	}
	

	public void resumeActionPerformed(java.awt.event.ActionEvent rs)
	{
		resume.setEnabled(false);
		pause.setEnabled(true);
	}
	

	public void stopActionPerformed(java.awt.event.ActionEvent st)
	{
		
		resume.setEnabled(false);
		pause.setEnabled(false);
		stop.setEnabled(false);
		cancel.setEnabled(false);
		path=JOptionPane.showInputDialog(null, "Enter name of macro to be saved : ","Macro name");
		if(path == null)
		{
			JOptionPane.showMessageDialog(null, "Macro could not be saved successfully.", "Error Message", JOptionPane.ERROR_MESSAGE);
			return;
		}
		data=textArea.getText();
		try
		{
			File f=new File(userhome + "/Documents/Macro_Files(DRC to Urdu)/"+path+".txt");
			if(path.length() < 6)
			{
				JOptionPane.showMessageDialog(null, "Name should be minimum 6 letters long.");
				stopActionPerformed(st);
			}
			else if(f.exists())
			{
				JOptionPane.showMessageDialog(null, "File with same name already exits.");
				stopActionPerformed(st);
			}
			else
			{
	        	saveActionPerformed(st);
	        	JOptionPane.showMessageDialog(null, "Macro " + path + " has been saved successfully.");
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e, "Error Message", JOptionPane.ERROR_MESSAGE);
		}
    }
	
	

	public void cancelActionPerformed(java.awt.event.ActionEvent ca)
	{
		resume.setEnabled(false);
		pause.setEnabled(false);
		stop.setEnabled(false);
		cancel.setEnabled(false);
	}

	public void saveActionPerformed(java.awt.event.ActionEvent sa)
	{
		BufferedWriter writer = null;
		try
		{
			File dir = new File(userhome + "/Documents/Macro_Files(DRC to Urdu)");
			if(!dir.exists())
			{
				dir.mkdir();
			}
			writer = new BufferedWriter( new FileWriter(dir + "/"+path+".txt"));
		    writer.write(data);
		}
		catch ( IOException e)
		{}
		finally
		{
		    try
    		{
	     	   if ( writer != null)
    		    writer.close( );
   			}
	    	catch ( IOException e)
    		{}
		}
		resume.setEnabled(false);
		pause.setEnabled(false);
		stop.setEnabled(false);
		cancel.setEnabled(false);
	}
	
	
	private void save()
	{
		try
		{
			if(textArea_1.getText().length() < 1)
			{
				JOptionPane.showMessageDialog(null, "There is no any text in Shahmukhi text box.");
			}
			else
			{
				String text=textArea_1.getText();
				File dir = new File(userhome + "/Documents/Urdu_Files(DRC to Urdu)");
				if(!dir.exists())
				{
					dir.mkdir();
				}
				
	            fc= new JFileChooser(userhome + "/Documents/Urdu_Files(DRC to Urdu)");
		        int returnVal = fc.showSaveDialog(mntmSave);
				if (returnVal == JFileChooser.APPROVE_OPTION)
		        {
		            File file = fc.getSelectedFile();
		            Path path1 = FileSystems.getDefault().getPath(file.getAbsolutePath() + ".txt");
		            Charset charset = Charset.forName("UTF-8");
		            String path=file.getAbsolutePath();
		            File f=new File(path+".txt");
					
					if(file.getName().length() < 6)
					{
						JOptionPane.showMessageDialog(null, "Name must exceed from 6 letters");	
					}
					else if(f.exists())
					{
						JOptionPane.showMessageDialog(null, "File with same name already exits.");
					}
					else
					{
						BufferedWriter writer = null;
						try
						{
						    writer = Files.newBufferedWriter( path1, charset);
						    writer.write(text);
						    JOptionPane.showMessageDialog(null, "Data is saved");
						}
						catch ( IOException ioe)
						{
							JOptionPane.showMessageDialog(null, ioe);
						}
						finally
						{
						    try
				    		{
					     	   if ( writer != null)
				    		    writer.close( );
				   			}
					    	catch ( IOException ioe2)
				    		{}
						}
					}
		        }
			}
		}
		catch(Exception e2)
		{
			JOptionPane.showMessageDialog(null, e2);
		}
	}
	/**private void saveurdu()
	{
		try
		{
			if(textArea_1.getText().length() < 1)
			{
				JOptionPane.showMessageDialog(null, "There is no any text in Shahmukhi text box.");
			}
			else
			{
				String text=textArea_1.getText();
				File dir = new File(userhome + "/Documents/Urdu_Files");
				if(!dir.exists())
				{
					dir.mkdir();
				}
				
	            fc= new JFileChooser(userhome + "/Documents/Urdu_Files");
		        int returnVal = fc.showSaveDialog(mntmSave);
				if (returnVal == JFileChooser.APPROVE_OPTION)
		        {
		            File file = fc.getSelectedFile();
		            Path path1 = FileSystems.getDefault().getPath(file.getAbsolutePath() + ".txt");
		            Charset charset = Charset.forName("UTF-8");
		            String path=file.getAbsolutePath();
		            File f=new File(path+".txt");
					
					if(file.getName().length() < 6)
					{
						JOptionPane.showMessageDialog(null, "Name must exceed from 6 letters");	
						save();
					}
					else if(f.exists())
					{
						JOptionPane.showMessageDialog(null, "File with same name already exits.");
						save();
					}
					else
					{
						BufferedWriter writer = null;
						try
						{
						    writer = Files.newBufferedWriter( path1, charset);
						    writer.write(text);
						    JOptionPane.showMessageDialog(null, "Data is saved");
						    ImageIcon icon = new ImageIcon("src/img/save.png");
						   int selection=JOptionPane.showOptionDialog(null, "Would you like to save Urdu text as well", "Save(Urdu)", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,icon, null, "default");
						    if(selection==0)
						    {
						    	saveurdu();
						    }
						}
						catch ( IOException ioe)
						{
							JOptionPane.showMessageDialog(null, ioe);
						}
						finally
						{
						    try
				    		{
					     	   if ( writer != null)
				    		    writer.close( );
				   			}
					    	catch ( IOException ioe2)
				    		{}
						} 
					}
		        }
			}
		}
		catch(Exception e2)
		{
			JOptionPane.showMessageDialog(null, e2);
		}
	}*/
	
	/**
	 * Create the application.
	 * @throws IOException 
	 * @wbp.parser.entryPoint
	*/
	public Main1() throws IOException
	{
		String cn = UIManager.getSystemLookAndFeelClassName();
    	try
    	{
			UIManager.setLookAndFeel(cn);
		}
    	catch (Exception e1)
    	{
			e1.printStackTrace();
		}
    	
		initialize();
		JPopupMenu menu = new JPopupMenu();
        Action cut = new DefaultEditorKit.CutAction();
        cut.putValue(Action.NAME, "Cut");
        cut.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control X"));
        menu.add( cut );

        Action copy = new DefaultEditorKit.CopyAction();
        copy.putValue(Action.NAME, "Copy");
        copy.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control C"));
        menu.add( copy );

        Action paste = new DefaultEditorKit.PasteAction();
        paste.putValue(Action.NAME, "Paste");
        paste.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control V"));
        menu.add( paste );

        Action selectAll = new SelectAll();
        menu.add( selectAll );

        textArea.setComponentPopupMenu( menu );
        textArea_1.setComponentPopupMenu( menu );
    }

    static class SelectAll extends TextAction
    {
    	private static final long serialVersionUID = 1L;
		public SelectAll()
        {
            super("Select All");
            putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control A"));
        }

        public void actionPerformed(ActionEvent e)
        {
            JTextComponent component = getFocusedComponent();
            component.selectAll();
            component.requestFocusInWindow();
        }
    }


	/**
	 * Initialize the contents of the frame.
	*/
	
	
    private void convertText()
    {
    	
    	if(textArea.getText() == null)
    	{
    		textArea_1.setText(null);
    		return;
    	}
    	
    	String far = " " + textArea.getText() + " ";
		
		/**Prep*/
		far = far.replaceAll("!", " " + String.valueOf((char)33) + " ");
		
		far = far.replaceAll("-", " " + String.valueOf((char)45) + " ");
		
		far = far.replaceAll("_", " " + String.valueOf((char)95) + " ");
		
		far = far.replaceAll("=", " " + String.valueOf((char)61) + " ");
		
		far = far.replaceAll(";", " " + String.valueOf((char)1563) + " ");
		
		far = far.replaceAll(",", " " + String.valueOf((char)1644) + " ");
		
		far = far.replaceAll("'", " " + String.valueOf((char)1589) + " ");
		
		far = far.replaceAll(String.valueOf((char)8216),  " " + String.valueOf((char)1589) + String.valueOf((char)1589) + String.valueOf((char)1589) + " ");
		
		far = far.replaceAll(String.valueOf((char)8217),  " " + String.valueOf((char)1590) + String.valueOf((char)1590) + String.valueOf((char)1590) + " ");
		
		far = far.replaceAll(String.valueOf((char)8220),  " " + String.valueOf((char)1593) + String.valueOf((char)1593) + String.valueOf((char)1593) + " ");
		
		far = far.replaceAll(String.valueOf((char)8221),  " " + String.valueOf((char)1594) + String.valueOf((char)1594) + String.valueOf((char)1594) + " ");
		
		far = far.replaceAll("@", " " + String.valueOf((char)64) + " ");
		
		far = far.replaceAll("#", " " + String.valueOf((char)35) + " ");
		
		far = far.replaceAll(":", " " + String.valueOf((char)58) + " ");
		
		int i;
        textArea_1.setText(far);
		char text[]=textArea_1.getText().toCharArray();
        textArea_1.setText(null);
        for(i=0;i<text.length;i++)
        {
    	   	Document doc=textArea_1.getDocument();
            try
            {
              if(i>0 && text[i-1] == '^' && text[i] == 'p')
              {
                doc.remove(doc.getLength() -1,1);
                textArea_1.setText(textArea_1.getText() + " ^p ");                 
              }  
              else if(text[i] == '?')
              {
            	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)1567) + " ");
              }
              else if(text[i] == (char)92)
              {
            	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)92) + String.valueOf((char)92) + " ");
              }
              else if(text[i] == '.')
              {
            	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf(text[i]) + " ");
              }
              else if(text[i] == '[')
              {
            	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)8228) + " ");
              }
              else if(text[i] == ']')
              {
            	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)1748) + String.valueOf((char)1748) + " ");
              }
              else if(text[i] == '$')
              {
            	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)36) + " ");
              }
              else if(text[i] == '%')
              {
            	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)1642) + " ");
              }
              else if(text[i] == '*')
              {
            	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)1645) + " ");
              }
              else if(text[i] == '(')
              {
            	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)64831) + " ");
              }
              else if(text[i] == ')')
              {
            	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)64830) + " ");
              }
              else if(text[i] == '+')
              {
            	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf(text[i]) + " ");
              }
              else if(text[i] == '}')
              {
            	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)125) + " ");
              }
              else if(text[i] == '{')
              {
            	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)123) + " ");
              }
              else if(text[i] == '|')
              {
            	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)124) + " ");
              }
              else if(i>0 && text[i-1] == ' ' && text[i] == ' ')
              {}
              else if(text[i] == 'i')
              {
            	  textArea_1.setText(textArea_1.getText() + text[i+1]);
            	  textArea_1.setText(textArea_1.getText() + text[i]);
            	  i++;
              }
              else if(text[i] == 'W')
              {
            	  textArea_1.setText(textArea_1.getText() + text[i+1]);
            	  textArea_1.setText(textArea_1.getText() + text[i]);
            	  i++;
              }
              else if(text[i] == 'w')
              {
            	  textArea_1.setText(textArea_1.getText() + text[i+1]);
            	  textArea_1.setText(textArea_1.getText() + text[i]);
            	  i++;
              }
              else if(text[i] == '\n')
              {
            	  textArea_1.setText(textArea_1.getText() + " " + text[i] + " ");
              }
              else if(i>0 && text[i-1] == ' ' && text[i] == ' ')
              {}
              else
              {
            	  textArea_1.setText(textArea_1.getText() + String.valueOf(text[i]));
              }
            }
            catch(BadLocationException b)
            {
            	textArea_1.setText(String.valueOf(b));
            	return;
            }             
        }
        text=null;
        
        
        
        
        /**
         * Creating Connection to the Database.
         * 3306 is the default port for MySQL in XAMPP. Note both the 
         * MySQL server and Apache must be running. 
         */
        String url = "jdbc:mysql://localhost:3306/";

        /**
         * The MySQL user.
         * The MySQL pasword
         */
        String user = "root";
        String password = "";
        textArea_1.setText(textArea_1.getText().replaceAll("  ", " "));
        String am = textArea_1.getText();
        textArea_1.setText(null);
        String dbWords[] = am.split(" ");
        int dbCount[] = new int[dbWords.length];
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stt = con.createStatement();

            /**
             * Select a database for use. 
             */
            stt.execute("USE punjabitourduconverter");
            
            
            for(i=0;i<dbWords.length;i++)
            {
            	dbCount[i] = 0;
            }

            /**
             * Query Entries for searching the words from the database
             */
            ResultSet res = stt.executeQuery("SELECT * FROM wordconvert1");
    		for(i=0;i<dbWords.length;i++)
            {
    			next:
        		while(res.next())
    			{
    				if(res.getString("Punjabi") == dbWords[i])
            		{
            			dbWords[i] = " " + res.getString("Urdu") + " ";
            			dbCount[i] = 1;
            			break next;
            		}
            	}
    		}
            
    		for(i=0;i<dbWords.length;i++)
    		{
    			if(dbCount[i] ==0)
    			{
    				dbWords[i] = " " + dbWords[i] + " ";
    			}
    		}
            
    		/**
    		 * Close Opened ResultSet resource
    		 */
        	res.close();
        	stt.close();
            con.close();
        }
        catch (Exception e)
        {
         	JOptionPane.showMessageDialog(null, String.valueOf(e));
            return;
        }
 
        
        
        
        for(int j = 0;j<dbWords.length;j++)
        {
        	 if(dbCount[j] == 0)
        	 {
        		 textArea_1.setText(textArea_1.getText() + dbWords[j]);
          	 }
        }
     	
     	textArea_1.setText(" " + textArea_1.getText() + " ");
   		 
    	textArea_1.setText(textArea_1.getText().replaceAll("  ", " "));
   		 
    	 
    	 
    	/**Prep*/
     	textArea_1.setText(textArea_1.getText().replaceAll(" ik ", " " + String.valueOf((char)1705) + String.valueOf((char)1616) + String.valueOf((char)1729) )); 
       	  
       	textArea_1.setText(textArea_1.getText().replaceAll("afAu", String.valueOf((char)1570) + String.valueOf((char)1574) + String.valueOf((char)1615))); 
        		
       	//textArea_1.setText(textArea_1.getText().replaceAll("sL", String.valueOf((char)1588))); 
       	  
       	textArea_1.setText(textArea_1.getText().replaceAll("KL", String.valueOf((char)1582))); 
       	  
       	textArea_1.setText(textArea_1.getText().replaceAll("gL", String.valueOf((char)1594))); 
       	  
       	textArea_1.setText(textArea_1.getText().replaceAll("jL", String.valueOf((char)1586)));
       	  
       	textArea_1.setText(textArea_1.getText().replaceAll("PL", String.valueOf((char)1601)));
       	  
       	textArea_1.setText(textArea_1.getText().replaceAll("lL", String.valueOf((char)1604) + String.valueOf((char)1726)));
       	  
       	textArea_1.setText(textArea_1.getText().replaceAll("ƒ", "nUM")); 
     	  
       	//textArea_1.setText(textArea_1.getText().replaceAll("^t", " ")); 
     	  
        //textArea_1.setText(textArea_1.getText().replaceAll("^l", " "));

           
         
        /**Sihari*/
     	//textArea_1.setText(textArea_1.getText().replaceAll("i^$", "i^&i"));
 
        textArea_1.setText(textArea_1.getText().replaceAll("ii", ""));
		
     	textArea_1.setText(textArea_1.getText().replaceAll("iL", "Li"));
		
		textArea_1.setText(textArea_1.getText().replaceAll("iH", "Hi"));
		 
		textArea_1.setText(textArea_1.getText().replaceAll("iR", "Ri"));
		 
		textArea_1.setText(textArea_1.getText().replaceAll("iÍ","Íi"));
  
     	
          
		/**Adhak*/
		textArea_1.setText(textArea_1.getText().replaceAll("W", "w"));
	      
		//textArea_1.setText(textArea_1.getText().replaceAll("ww", ""));
	    
	     
	     
	    /**Muharni*/
		textArea_1.setText(textArea_1.getText().replaceAll(" afieaf ", " " + String.valueOf((char)1570) + String.valueOf((char)1740) + String.valueOf((char)1575) + " "));

  		textArea_1.setText(textArea_1.getText().replaceAll("ieaf ", " " + String.valueOf((char)1740) + String.valueOf((char)1575) + " "));
		 
  		textArea_1.setText(textArea_1.getText().replaceAll(" aqy ", " " + String.valueOf((char)1575) + String.valueOf((char)1578) + String.valueOf((char)1746) + " "));
         
  		textArea_1.setText(textArea_1.getText().replaceAll(" hn ", " " + String.valueOf((char)1729) + String.valueOf((char)1606) + " "));
		
  		textArea_1.setText(textArea_1.getText().replaceAll(" hY ", " " + String.valueOf((char)1729) + String.valueOf((char)1746) + String.valueOf((char)1614) + " "));
         
  		textArea_1.setText(textArea_1.getText().replaceAll("afAu", String.valueOf((char)1570) + String.valueOf((char)1574) + String.valueOf((char)1615)));
   		
  		textArea_1.setText(textArea_1.getText().replaceAll(" ey ", " " + String.valueOf((char)1747) + " "));
   		
   		textArea_1.setText(textArea_1.getText().replaceAll(" nUM ", " " + String.valueOf((char)1606) + String.valueOf((char)1608) + String.valueOf((char)1615) +  String.valueOf((char)1722) + " " ));
         
   		textArea_1.setText(textArea_1.getText().replaceAll("ey ", String.valueOf((char)1574) + String.valueOf((char)1746) + " "));
 		
   		textArea_1.setText(textArea_1.getText().replaceAll("ÅÆ",String.valueOf((char)2676)));
   		
   	    textArea_1.setText(textArea_1.getText().replaceAll("ÃÄ",String.valueOf((char)2676)));
  		
   	    textArea_1.setText(textArea_1.getText().replaceAll(" af ", " " + String.valueOf((char)1570) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll(" af", " " + String.valueOf((char)1570)));
   		textArea_1.setText(textArea_1.getText().replaceAll("af ", String.valueOf((char)1740) + String.valueOf((char)1575) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll("af", String.valueOf((char)1740) + String.valueOf((char)1575)));
  		
   		textArea_1.setText(textArea_1.getText().replaceAll("Fa ", String.valueOf((char)1575) + String.valueOf((char)1722) + String.valueOf((char)1620) + " "));
 		
   		textArea_1.setText(textArea_1.getText().replaceAll(" aF ", " " + String.valueOf((char)1570) + String.valueOf((char)1722) + " "));
		textArea_1.setText(textArea_1.getText().replaceAll(" aF", " " + String.valueOf((char)1570) + String.valueOf((char)1606) + String.valueOf((char)1618)));
		textArea_1.setText(textArea_1.getText().replaceAll("aF ", String.valueOf((char)1740) + String.valueOf((char)1575) + String.valueOf((char)1722) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll("aF", String.valueOf((char)1740) + String.valueOf((char)1575)  + String.valueOf((char)1606) + String.valueOf((char)1618)));
   		
   		textArea_1.setText(textArea_1.getText().replaceAll(" ei ", " " + String.valueOf((char)1575) + String.valueOf((char)1616) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll(" ei", " " + String.valueOf((char)1575) + String.valueOf((char)1616)));
   		textArea_1.setText(textArea_1.getText().replaceAll("ei ", String.valueOf((char)1569) + String.valueOf((char)1616) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll("ei", String.valueOf((char)1574) + String.valueOf((char)1616)));
   		
   		textArea_1.setText(textArea_1.getText().replaceAll(" eI ", " " + String.valueOf((char)1575) + String.valueOf((char)1616) + String.valueOf((char)1740) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll(" eI", " " + String.valueOf((char)1575) + String.valueOf((char)1616) + String.valueOf((char)1740)));
   		textArea_1.setText(textArea_1.getText().replaceAll("eI ", String.valueOf((char)1574) + " "));
   		
   		textArea_1.setText(textArea_1.getText().replaceAll("eIa", String.valueOf((char)1574) + String.valueOf((char)1616) + String.valueOf((char)1740) + String.valueOf((char)1593)));
   		textArea_1.setText(textArea_1.getText().replaceAll("eI", String.valueOf((char)1574) + String.valueOf((char)1616) + String.valueOf((char)1740)));
   		
   		textArea_1.setText(textArea_1.getText().replaceAll("fAu", String.valueOf((char)1575) + String.valueOf((char)1614) + String.valueOf((char)1608)));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" Au ", " " + String.valueOf((char)1575) + String.valueOf((char)1615)) + " ");
   		textArea_1.setText(textArea_1.getText().replaceAll(" Au", " " + String.valueOf((char)1575) + String.valueOf((char)1615)));
   		textArea_1.setText(textArea_1.getText().replaceAll("Au ", String.valueOf((char)1572) + String.valueOf((char)1615) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll("Au", String.valueOf((char)1574) + String.valueOf((char)1615)));
   		
   		textArea_1.setText(textArea_1.getText().replaceAll(" AU ", " " + String.valueOf((char)1575) + String.valueOf((char)1615) + String.valueOf((char)1608) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll(" AU", " " + String.valueOf((char)1575) + String.valueOf((char)1615) + String.valueOf((char)1608)));
   		textArea_1.setText(textArea_1.getText().replaceAll("AU ", String.valueOf((char)1572) + String.valueOf((char)1615) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll("AU", String.valueOf((char)1574) + String.valueOf((char)1615) + String.valueOf((char)1608)));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" ey ", " " + String.valueOf((char)1575) + String.valueOf((char)1746) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll(" ey", " " + String.valueOf((char)1575) + String.valueOf((char)1740)));
   		textArea_1.setText(textArea_1.getText().replaceAll("ey ", String.valueOf((char)1574) + String.valueOf((char)1746) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll("ey", String.valueOf((char)1574) + String.valueOf((char)1740)));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" aY ", " " + String.valueOf((char)1575) + String.valueOf((char)1614) + String.valueOf((char)1746) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll(" aY", " " + String.valueOf((char)1575) + String.valueOf((char)1614) + String.valueOf((char)1740)));
   		textArea_1.setText(textArea_1.getText().replaceAll("aY ", String.valueOf((char)1574) +  String.valueOf((char)1614)+  String.valueOf((char)1746) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll("aY", String.valueOf((char)1574) + String.valueOf((char)1614)+ String.valueOf((char)1740)));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" E ", " " + String.valueOf((char)1575) + String.valueOf((char)1608) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll(" E", " " + String.valueOf((char)1575) + String.valueOf((char)1608)));
   		textArea_1.setText(textArea_1.getText().replaceAll("E ", String.valueOf((char)1572) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll("E", String.valueOf((char)1572)));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" aO ", " " + String.valueOf((char)1575) + String.valueOf((char)1614) + String.valueOf((char)1608) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll(" aO", " " + String.valueOf((char)1575)+ String.valueOf((char)1614) + String.valueOf((char)1608)));
   		textArea_1.setText(textArea_1.getText().replaceAll("aO ", String.valueOf((char)1572)+ String.valueOf((char)1614) + " "));
   		textArea_1.setText(textArea_1.getText().replaceAll("aO", String.valueOf((char)1572)+ String.valueOf((char)1614)));
   		
   		textArea_1.setText(textArea_1.getText().replaceAll("w", String.valueOf((char)1617)));
   	     
	     
   		 
   		/**A4Main1*/
		textArea_1.setText(textArea_1.getText().replaceAll("aL", String.valueOf((char)1593)));

		textArea_1.setText(textArea_1.getText().replaceAll("ya", String.valueOf((char)1740) + String.valueOf((char)1574)));

		textArea_1.setText(textArea_1.getText().replaceAll("a", String.valueOf((char)1575)));

		textArea_1.setText(textArea_1.getText().replaceAll("AL", String.valueOf((char)1593)));

		textArea_1.setText(textArea_1.getText().replaceAll("A", String.valueOf((char)1575)));

		textArea_1.setText(textArea_1.getText().replaceAll("eL", String.valueOf((char)1593)));

		textArea_1.setText(textArea_1.getText().replaceAll("e", String.valueOf((char)1575)));

		textArea_1.setText(textArea_1.getText().replaceAll("sLLL", String.valueOf((char)1579)));

		textArea_1.setText(textArea_1.getText().replaceAll("sLL", String.valueOf((char)1589)));

		textArea_1.setText(textArea_1.getText().replaceAll("sL", String.valueOf((char)1588)));

		textArea_1.setText(textArea_1.getText().replaceAll("È", String.valueOf((char)1588)));

		textArea_1.setText(textArea_1.getText().replaceAll("s", String.valueOf((char)1587)));

		textArea_1.setText(textArea_1.getText().replaceAll("hL", String.valueOf((char)1581)));

		textArea_1.setText(textArea_1.getText().replaceAll("h", String.valueOf((char)1729)));

		textArea_1.setText(textArea_1.getText().replaceAll("VH", String.valueOf((char)1681) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("H", String.valueOf((char)1729)));

		textArea_1.setText(textArea_1.getText().replaceAll("§", String.valueOf((char)1729) + String.valueOf((char)1615) + String.valueOf((char)1608)));

		textArea_1.setText(textArea_1.getText().replaceAll("kL", String.valueOf((char)1602)));

		textArea_1.setText(textArea_1.getText().replaceAll("k", String.valueOf((char)1705)));

		textArea_1.setText(textArea_1.getText().replaceAll("KL", String.valueOf((char)1582)));

		textArea_1.setText(textArea_1.getText().replaceAll("É", String.valueOf((char)1582)));

   		textArea_1.setText(textArea_1.getText().replaceAll("K", String.valueOf((char)1705) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("gL", String.valueOf((char)1594)));

		textArea_1.setText(textArea_1.getText().replaceAll("Ê", String.valueOf((char)1594)));

		textArea_1.setText(textArea_1.getText().replaceAll("g", String.valueOf((char)1711)));

		textArea_1.setText(textArea_1.getText().replaceAll("Õ", String.valueOf((char)1711)));

		textArea_1.setText(textArea_1.getText().replaceAll("G", String.valueOf((char)1711) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("c", String.valueOf((char)1670)));

		textArea_1.setText(textArea_1.getText().replaceAll("ç", String.valueOf((char)1670)));

		textArea_1.setText(textArea_1.getText().replaceAll("C", String.valueOf((char)1670) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("jLL", String.valueOf((char)1590)));

  		textArea_1.setText(textArea_1.getText().replaceAll("J", String.valueOf((char)1580) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("t", String.valueOf((char)1657)));

		textArea_1.setText(textArea_1.getText().replaceAll("†", String.valueOf((char)1657)));

		textArea_1.setText(textArea_1.getText().replaceAll("T", String.valueOf((char)1657) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("z", String.valueOf((char)1672)));

		textArea_1.setText(textArea_1.getText().replaceAll("Z", String.valueOf((char)1672) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("x", String.valueOf((char)1606) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("qL", String.valueOf((char)1591)));

		textArea_1.setText(textArea_1.getText().replaceAll("q", String.valueOf((char)1578)));

		textArea_1.setText(textArea_1.getText().replaceAll("œ", String.valueOf((char)1578)));

		textArea_1.setText(textArea_1.getText().replaceAll("Q", String.valueOf((char)1578) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("d", String.valueOf((char)1583)));

		textArea_1.setText(textArea_1.getText().replaceAll("D", String.valueOf((char)1583) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("n", String.valueOf((char)1606)));
   
		textArea_1.setText(textArea_1.getText().replaceAll("p", String.valueOf((char)1662)));

		textArea_1.setText(textArea_1.getText().replaceAll("PL", String.valueOf((char)1601)));

		textArea_1.setText(textArea_1.getText().replaceAll("Ì", String.valueOf((char)1601)));

		textArea_1.setText(textArea_1.getText().replaceAll("P", String.valueOf((char)1662) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("b", String.valueOf((char)1576)));

		textArea_1.setText(textArea_1.getText().replaceAll("B", String.valueOf((char)1576) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("m", String.valueOf((char)1605)));

		textArea_1.setText(textArea_1.getText().replaceAll("XLL", String.valueOf((char)1592)));

		textArea_1.setText(textArea_1.getText().replaceAll("XL", String.valueOf((char)1688)));

		textArea_1.setText(textArea_1.getText().replaceAll("X", String.valueOf((char)1740)));

		textArea_1.setText(textArea_1.getText().replaceAll("XL", String.valueOf((char)1586)));

		textArea_1.setText(textArea_1.getText().replaceAll("Ï", String.valueOf((char)1586)));

		textArea_1.setText(textArea_1.getText().replaceAll("Î", String.valueOf((char)1686)));

		textArea_1.setText(textArea_1.getText().replaceAll("Ï", String.valueOf((char)1586)));

   		textArea_1.setText(textArea_1.getText().replaceAll("r", String.valueOf((char)1585)));

		textArea_1.setText(textArea_1.getText().replaceAll("lL", String.valueOf((char)1604) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("Ü", String.valueOf((char)1604) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("l", String.valueOf((char)1604)));

		textArea_1.setText(textArea_1.getText().replaceAll("v", String.valueOf((char)1608) + String.valueOf((char)1618)));

		textArea_1.setText(textArea_1.getText().replaceAll("Í", String.valueOf((char)1608)));

		textArea_1.setText(textArea_1.getText().replaceAll("VH", String.valueOf((char)1681) + String.valueOf((char)1726)));

		textArea_1.setText(textArea_1.getText().replaceAll("V", String.valueOf((char)1681)));

		textArea_1.setText(textArea_1.getText().replaceAll("f", String.valueOf((char)1575)));

   		textArea_1.setText(textArea_1.getText().replaceAll("F ", String.valueOf((char)1575) + String.valueOf((char)1722) + " "));

   		textArea_1.setText(textArea_1.getText().replaceAll("F", String.valueOf((char)1575) + String.valueOf((char)1606) + String.valueOf((char)1618)));

		textArea_1.setText(textArea_1.getText().replaceAll("i", String.valueOf((char)1616)));

		textArea_1.setText(textArea_1.getText().replaceAll("eI ", String.valueOf((char)1574) + " "));

		textArea_1.setText(textArea_1.getText().replaceAll("eI", String.valueOf((char)1593) + String.valueOf((char)1616) + String.valueOf((char)1609) + " "));

		textArea_1.setText(textArea_1.getText().replaceAll("I ", String.valueOf((char)1609) + " "));

		textArea_1.setText(textArea_1.getText().replaceAll("I", String.valueOf((char)1616) + String.valueOf((char)1609)));

		textArea_1.setText(textArea_1.getText().replaceAll("u", String.valueOf((char)1615)));

		textArea_1.setText(textArea_1.getText().replaceAll("ü", String.valueOf((char)1615)));

		textArea_1.setText(textArea_1.getText().replaceAll("U", String.valueOf((char)1615) + String.valueOf((char)1608)));

		textArea_1.setText(textArea_1.getText().replaceAll("¨", String.valueOf((char)1615) + String.valueOf((char)1608)));

		textArea_1.setText(textArea_1.getText().replaceAll("¨", String.valueOf((char)1735)));

		textArea_1.setText(textArea_1.getText().replaceAll("y ", String.valueOf((char)1746) + " "));

		textArea_1.setText(textArea_1.getText().replaceAll("y", String.valueOf((char)1740)));

		textArea_1.setText(textArea_1.getText().replaceAll("Y ", String.valueOf((char)1746) + String.valueOf((char)1614) + " "));

		textArea_1.setText(textArea_1.getText().replaceAll("Y", String.valueOf((char)1614) + String.valueOf((char)1740)));

		textArea_1.setText(textArea_1.getText().replaceAll("E", String.valueOf((char)1575) + String.valueOf((char)1608)));

		textArea_1.setText(textArea_1.getText().replaceAll("o", String.valueOf((char)1608)));

		textArea_1.setText(textArea_1.getText().replaceAll("O", String.valueOf((char)1614) + String.valueOf((char)1608)));

		textArea_1.setText(textArea_1.getText().replaceAll("S", String.valueOf((char)1606) + String.valueOf((char)1617)));

		textArea_1.setText(textArea_1.getText().replaceAll("M ", String.valueOf((char)1722) + " "));

		textArea_1.setText(textArea_1.getText().replaceAll("M", String.valueOf((char)1606) + String.valueOf((char)1617)));

		textArea_1.setText(textArea_1.getText().replaceAll("µ", String.valueOf((char)1606) + String.valueOf((char)1617)));

		textArea_1.setText(textArea_1.getText().replaceAll("µ", String.valueOf((char)1606) + String.valueOf((char)1617)));

		textArea_1.setText(textArea_1.getText().replaceAll("N ", String.valueOf((char)1722) + " "));

		textArea_1.setText(textArea_1.getText().replaceAll("N", String.valueOf((char)1606) + String.valueOf((char)1618)));

		textArea_1.setText(textArea_1.getText().replaceAll("`", String.valueOf((char)1548)));
		
		textArea_1.setText(textArea_1.getText().replaceAll("~", String.valueOf((char)1617)));

		textArea_1.setText(textArea_1.getText().replaceAll("]", String.valueOf((char)1748) + String.valueOf((char)1748) + " "));

		//textArea_1.setText(textArea_1.getText().replaceAll("[", " " + String.valueOf((char)1748)));

		textArea_1.setText(textArea_1.getText().replaceAll("Ë", String.valueOf((char)1584)));

		textArea_1.setText(textArea_1.getText().replaceAll("Ë", String.valueOf((char)1584)));

		textArea_1.setText(textArea_1.getText().replaceAll("j", String.valueOf((char)1580)));

		textArea_1.setText(textArea_1.getText().replaceAll("Ö", String.valueOf((char)1580)));

		textArea_1.setText(textArea_1.getText().replaceAll("jL", String.valueOf((char)1584)));

		textArea_1.setText(textArea_1.getText().replaceAll("†", String.valueOf((char)1657)));

		textArea_1.setText(textArea_1.getText().replaceAll("˜", String.valueOf((char)1606)));

   		textArea_1.setText(textArea_1.getText().replaceAll("œ", String.valueOf((char)1578)));

		textArea_1.setText(textArea_1.getText().replaceAll("R", String.valueOf((char)1585)));

		textArea_1.setText(textArea_1.getText().replaceAll("®", String.valueOf((char)1585)));

		textArea_1.setText(textArea_1.getText().replaceAll("Í", String.valueOf((char)1608)));

		textArea_1.setText(textArea_1.getText().replaceAll("Ï", String.valueOf((char)1586)));

		textArea_1.setText(textArea_1.getText().replaceAll("ç", String.valueOf((char)1670)));

		textArea_1.setText(textArea_1.getText().replaceAll("ƒ", String.valueOf((char)1606) + String.valueOf((char)1735) + String.valueOf((char)1606) + String.valueOf((char)1617)));

		textArea_1.setText(textArea_1.getText().replaceAll("¨", String.valueOf((char)1735)));

		textArea_1.setText(textArea_1.getText().replaceAll("°", String.valueOf((char)1731)));

		textArea_1.setText(textArea_1.getText().replaceAll("Ú", String.valueOf((char)1475)));
		 
		 
		 
		/**Uu06Main2*/
		textArea_1.setText(textArea_1.getText().replaceAll("Î", String.valueOf((char)1686)));

		textArea_1.setText(textArea_1.getText().replaceAll("ü", String.valueOf((char)1615)));

		textArea_1.setText(textArea_1.getText().replaceAll("´", String.valueOf((char)1729)));

		textArea_1.setText(textArea_1.getText().replaceAll("¡", String.valueOf((char)2676)));

		textArea_1.setText(textArea_1.getText().replaceAll("  ", " "));

		//textArea_1.setText(textArea_1.getText().replaceAll(".", String.valueOf((char)1748)));
		 
	
		/**PunctuationBack*/
   		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1575) + String.valueOf((char)33) + String.valueOf((char)1575), String.valueOf((char)33) + " "));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)8220) + " ", String.valueOf((char)8220)));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)8221), String.valueOf((char)8221)));
   		 
   		 
   		 
   		/**ShahmukhiCorrection*/
   		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1589) + String.valueOf((char)1589) + String.valueOf((char)1589) + " ", String.valueOf((char)8216)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1590) + String.valueOf((char)1590) + String.valueOf((char)1590), String.valueOf((char)8217)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1593) + String.valueOf((char)1593) + String.valueOf((char)1593) + " ", String.valueOf((char)8221)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1609) + String.valueOf((char)1608) + String.valueOf((char)1618), String.valueOf((char)1609) + String.valueOf((char)1608)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll( " " + String.valueOf((char)1594) + String.valueOf((char)1594) + String.valueOf((char)1594), String.valueOf((char)8220)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1740) + String.valueOf((char)1608) + String.valueOf((char)1618), String.valueOf((char)1740) + String.valueOf((char)1608)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1608) + String.valueOf((char)1618) + String.valueOf((char)1614) + String.valueOf((char)1740), " " + String.valueOf((char)1608) + String.valueOf((char)1614) + String.valueOf((char)1740)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1618) + String.valueOf((char)1616), String.valueOf((char)1616)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1604) + String.valueOf((char)1575) + String.valueOf((char)1575), String.valueOf((char)1604) + String.valueOf((char)1575) + String.valueOf((char)1569)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll("-" + String.valueOf((char)1608) + String.valueOf((char)1618), "-" + String.valueOf((char)1608)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1608) + String.valueOf((char)1618) + String.valueOf((char)1575), String.valueOf((char)1608) + String.valueOf((char)1575)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)64831), String.valueOf((char)64831)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)64831) + String.valueOf((char)1853) + " ", String.valueOf((char)64831) + String.valueOf((char)1853)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1740) + String.valueOf((char)1608) + String.valueOf((char)1618), String.valueOf((char)1740) + String.valueOf((char)1608)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1705) + String.valueOf((char)1616) + " ", " " + String.valueOf((char)1705) + String.valueOf((char)1616) + String.valueOf((char)1729) + " "));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1587) + String.valueOf((char)1729) + String.valueOf((char)1615) + String.valueOf((char)1722) + " ", " " + String.valueOf((char)1587) + String.valueOf((char)1614) + String.valueOf((char)1608) + String.valueOf((char)1606) + String.valueOf((char)1618) + String.valueOf((char)1729) + " "));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1574) + String.valueOf((char)1616) + String.valueOf((char)1740) + " ", String.valueOf((char)1574) + " "));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1729) + String.valueOf((char)1615) + String.valueOf((char)1705) + String.valueOf((char)1605), String.valueOf((char)1581) + String.valueOf((char)1615) + String.valueOf((char)1705) + String.valueOf((char)1605)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1608) + String.valueOf((char)1618) + String.valueOf((char)1746) + " ", String.valueOf((char)1608) + String.valueOf((char)1746) + " "));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1608) + String.valueOf((char)1618) + String.valueOf((char)1746), String.valueOf((char)1608) + String.valueOf((char)1746)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1747) + " ", " " + String.valueOf((char)1575) + String.valueOf((char)1746) + " "));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1604) + String.valueOf((char)1617) + String.valueOf((char)1575) + " ", String.valueOf((char)1604) + String.valueOf((char)1617) + String.valueOf((char)1729) + " "));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1616) + String.valueOf((char)1609) + String.valueOf((char)1575) + String.valueOf((char)1578) + " ", String.valueOf((char)1616) + String.valueOf((char)1740) + String.valueOf((char)1574) + String.valueOf((char)1578) + " "));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1576) + String.valueOf((char)1726) + String.valueOf((char)1575) + String.valueOf((char)1575) + " ", String.valueOf((char)1576) + String.valueOf((char)1726) + String.valueOf((char)1575) + String.valueOf((char)1643) + " "));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1574) + String.valueOf((char)1615) + String.valueOf((char)1722) + " ", String.valueOf((char)1574) + String.valueOf((char)1615) + String.valueOf((char)1608) + String.valueOf((char)1722) + " "));

        String value[] = textArea_1.getText().split(" ");
		
        int j;
        
		textArea_1.setText(null);
    		 
        if(value.length == 0)
        {
            for(i=0;i<dbWords.length;i++)
	        {
	        	
	        	textArea_1.setText(textArea_1.getText() + dbWords[i]);
	        	textArea_1.setText(textArea_1.getText().replaceAll("  ", " "));
	        }
        }
        else
        {
        	for(i=0;i<dbWords.length;i++)
        	{
        		if(dbCount[i] == 0)
        		{
	        		HERE:
	        		for(j=0;j<value.length;j++)
	        		{
	        			if(value[j] != "no")
	        			{
	        				textArea_1.setText(textArea_1.getText() + " " + value[j] + " ");
	        				textArea_1.setText(textArea_1.getText().replaceAll("  ", " "));
	        				value[j] = "no";
	        				break HERE;
	        			}
	        		}
        		}
        		else
        		{
        			textArea_1.setText(textArea_1.getText() + dbWords[i]);
        			textArea_1.setText(textArea_1.getText().replaceAll("  ", " "));
        		}
        	}
        }
        dbWords = null;
        dbCount = null;
        value = null;
        
   	 
		/**DeleteSpace*/
   		textArea_1.setText(textArea_1.getText().replaceAll("  "," "));
   		
   		textArea_1.setText(textArea_1.getText().replaceAll("  "," "));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" !","!"));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)8228) + " ", String.valueOf((char)8228) + " "));
   		
   		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1642), String.valueOf((char)1642)));
  		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1645), String.valueOf((char)1645)));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)64831) + " ", String.valueOf((char)64831)));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)64830), String.valueOf((char)64830)));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" - ", "-"));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" _ ", "_"));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1563), String.valueOf((char)1563)));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1567), String.valueOf((char)1567)));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)58), String.valueOf((char)58)));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1644), String.valueOf((char)1644)));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1748), String.valueOf((char)1748)));
   		 
   		//textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)123) + " " , String.valueOf((char)123)));
   		 
   		//textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)125), String.valueOf((char)125)));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll(" / ", "/"));
   		 
   		textArea_1.setText(textArea_1.getText().replaceAll("L",""));
		
		return;
    }   
    
	
	private void initialize() throws IOException
	{
		
		try
		{
	    	frame = new JFrame("Punjabi(DRChatrikWeb) to Urdu(unicode)");
	    	frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Main1.class.getResource("/img/logo with background.png")));
	    	frame.setTitle("Gurmukhi(DRChatrikWeb) to Shahmukhi(unicode)");
	    	frame.getContentPane().setBackground(new Color(204, 204, 255));
	    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	        frame.setBounds(0,0,screenSize.width, screenSize.height-35);
	        frame.setMinimumSize(new Dimension(450,340));
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10,70,(frame.getWidth()/2)-40, (frame.getHeight())-150);
        	frame.getContentPane().add(scrollPane);
			
        	textArea = new JTextArea();
        	textArea.setBackground(new Color(255, 255, 255));
			textArea.setFont(new Font("DRChatrikWeb", Font.PLAIN, 30));
			scrollPane.setViewportView(textArea);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds((frame.getWidth()/2)+20, 70, (frame.getWidth()/2)-45, frame.getHeight()-150);
        	frame.getContentPane().add(scrollPane_1);
			
        	textArea_1 = new JTextArea();
        	textArea_1.setBackground(new Color(255, 255, 255));
        	textArea_1.setForeground(Color.BLACK);
		    textArea_1.setFont(new Font("", Font.PLAIN, 35));
			scrollPane_1.setViewportView(textArea_1);
			textArea_1.setLineWrap(true);
			textArea_1.setWrapStyleWord(true);
			textArea_1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		    
			
			
			JLabel lblGurmukhi = new JLabel("Gurmukhi");
			lblGurmukhi.setFont(new Font("Times New Roman", Font.ITALIC, 24));
			lblGurmukhi.setBounds((frame.getWidth()/4)-60, 35, 150, 28);
        	frame.getContentPane().add(lblGurmukhi);
			
			
        	
        	JLabel lblShahmukhi = new JLabel("Shahmukhi");
			lblShahmukhi.setFont(new Font("Times New Roman", Font.ITALIC, 24));
			lblShahmukhi.setBounds((frame.getWidth()/2) + (frame.getWidth()/4) - 65, 35, 150, 28);
        	frame.getContentPane().add(lblShahmukhi);
			
				
        	BufferedImage master;

        	
        	
        	URL file = getClass().getResource("/img/resume_1.png");
            Image image1 = ImageIO.read(file);
            ImageIcon icon1 = new ImageIcon(image1);
            Image img1 = icon1.getImage() ;  
			Image newimg1 = img1.getScaledInstance( 22, 22,  java.awt.Image.SCALE_SMOOTH ) ;
			icon1 = new ImageIcon(newimg1);
            resume = new JButton(icon1);
			resume.setBorder(null);
			resume.setBackground(null);
			resume.setContentAreaFilled(false);
			resume.setFocusPainted(false);
			resume.setBorderPainted(false);
			resume.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					resumeActionPerformed(e);
				}
			});
			resume.setToolTipText("Resume Recording Macro");
			resume.setEnabled(false);
			
			
			
			file = getClass().getResource("/img/pause_1.png");
            image1 = ImageIO.read(file);
            icon1 = new ImageIcon(image1);
            img1 = icon1.getImage() ;  
			newimg1 = img1.getScaledInstance( 22, 22,  java.awt.Image.SCALE_SMOOTH ) ;
			icon1 = new ImageIcon(newimg1);
            pause = new JButton(icon1);
			pause.setBorder(null);
			pause.setBackground(null);
			pause.setContentAreaFilled(false);
			pause.setFocusPainted(false);
			pause.setBorderPainted(false);
			pause.setBounds(145, 0, 22, 22);
			pause.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pauseActionPerformed(e);
				}
			});
			pause.setToolTipText("Pause Recording Macro");
			pause.setEnabled(false);
			
			
			
			file = getClass().getResource("/img/stop_1.png");
            image1 = ImageIO.read(file);
            icon1 = new ImageIcon(image1);
            img1 = icon1.getImage() ;  
			newimg1 = img1.getScaledInstance( 22, 22,  java.awt.Image.SCALE_SMOOTH ) ;
			icon1 = new ImageIcon(newimg1);
            stop = new JButton(icon1);
			stop.setBorder(null);
			stop.setBackground(null);
			stop.setContentAreaFilled(false);
			stop.setFocusPainted(false);
			stop.setBorderPainted(false);
			stop.setBounds(170, 0, 22, 22);
			stop.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					stopActionPerformed(e);
				}
			});
			stop.setToolTipText("Stop Recording and Save Macro");
			stop.setEnabled(false);
			
			
			
			file = getClass().getResource("/img/cancel_1.png");
            image1 = ImageIO.read(file);
            icon1 = new ImageIcon(image1);
            img1 = icon1.getImage() ;  
			newimg1 = img1.getScaledInstance( 22, 22,  java.awt.Image.SCALE_SMOOTH ) ;
			icon1 = new ImageIcon(newimg1);
            cancel = new JButton(icon1);
			cancel.setBorder(null);
			cancel.setBackground(null);
			cancel.setContentAreaFilled(false);
			cancel.setFocusPainted(false);
			cancel.setBorderPainted(false);
			cancel.setBounds(195, 0, 22, 22);
			cancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cancelActionPerformed(e);
				}
			});
			cancel.setToolTipText("Cancel Recording Macro");
			cancel.setEnabled(false);	
			
			file = getClass().getResource("/img/printer_1.png");
            image1 = ImageIO.read(file);
            icon1 = new ImageIcon(image1);
            img1 = icon1.getImage() ;  
			newimg1 = img1.getScaledInstance( 24, 22,  java.awt.Image.SCALE_SMOOTH ) ;
			icon1 = new ImageIcon(newimg1);
            print = new JButton(icon1);
            print.setBorder(null);
            print.setBackground(null);
         
			print.setBounds(360, 0, 24, 22);
			print.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(textArea_1.getText().length() <= 1)
					{
						JOptionPane.showMessageDialog(null, "There is no any text in Shahmukhi text box.", "Error Message", JOptionPane.CANCEL_OPTION);
						return;
					}
					try
					{
						Boolean complete = textArea_1.print();
						if(complete)
			            {
			            	JOptionPane.showMessageDialog(null, "Done Printing", "Information", JOptionPane.INFORMATION_MESSAGE);
			            }
			            else
			            {
			            	JOptionPane.showMessageDialog(null, "Printing Canceled.", "Printer", JOptionPane.ERROR_MESSAGE);
			            }
					}
					catch(Exception ee)
					{
		            	JOptionPane.showMessageDialog(null, "Printing Canceled.", "Printer", JOptionPane.ERROR_MESSAGE);
		            	//JOptionPane.showMessageDialog(null, ee, "Exception Handling", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			print.setToolTipText("Print");

			file = getClass().getResource("/img/left-arrow.png");
	        image1 = ImageIO.read(file);
	        icon1 = new ImageIcon(image1);
	        img1 = icon1.getImage() ;  
			newimg1 = img1.getScaledInstance( 22, 22,  java.awt.Image.SCALE_SMOOTH ) ;
			icon1 = new ImageIcon(newimg1);
	        back = new JButton(icon1);
	        back.setBorder(null);
	        back.setBackground(null);
	     
	        back.setBounds(385, 0, 22, 22);
	        back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Option o;
					o = new Option();
					o.frame.setVisible(true);
					frame.setVisible(false);
					
							}
			});
			back.setToolTipText("Back to Option page");
			
			JButton rtu =new JButton("Raavi to Urdu");
			rtu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Main2 m2;
					try {
						m2 = new Main2();
						m2.frame.setVisible(true);
						frame.setVisible(false);
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			rtu.setBounds(480, 0, 80, 22);
			
			rtu.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			rtu.setBackground(UIManager.getColor("Button.background"));
			
				
			
			Vector v = new Vector();
		    for (int i=10; i<100; i+=5)
		    {
		         v.addElement(""+i);
		    }
		    final JComboBox fontSize = new JComboBox(v);
		    fontSize.setSize(20,20);
		    fontSize.setEditable(true);
		    fontSize.setForeground(Color.BLACK);
		    fontSize.setBackground(Color.WHITE);
		    Font f = fontSize.getFont();
		    fontSize.setFont(f.deriveFont(10.0f));
		    fontSize.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent ae)
		    {
		    	try
		    	{
		    		textArea.setFont(new Font("DRChatrikWeb", Font.PLAIN, new Integer(""+fontSize.getSelectedItem())));
		    		textArea_1.setFont(new Font("", Font.PLAIN, new Integer(""+fontSize.getSelectedItem())));
		    	}
		    	catch(Exception e)
		    	{}
		    }
		    });
		
			JLabel size=new JLabel("Size :");
			
			size.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		    JToolBar toolbar1 = new JToolBar();
		    toolbar1.setBounds(263, 0, 90, 26);
			toolbar1.setRollover(false);
			toolbar1.setFloatable(false);
			toolbar1.setBackground(Color.WHITE);
			frame.getContentPane().add(toolbar1);
			toolbar1.setVisible(true);
			Border matteBorder = new MatteBorder(0, 0, 1, 0, Color.GRAY);
			toolbar1.setBorder(matteBorder);
			toolbar1.add(size);
			size.setPreferredSize(new Dimension(40,26));
			toolbar1.add(fontSize);
			
			fontSize.setPreferredSize(new Dimension(50,22));
			
			JToolBar toolbar2 = new JToolBar();
		    toolbar2.setBounds(140, 0, 108, 26);
			toolbar2.setRollover(false);
			toolbar2.setFloatable(false);
			toolbar2.setBackground(Color.WHITE);
			frame.getContentPane().add(toolbar2);
			toolbar2.setVisible(true);
			Border matteBorder2 = new MatteBorder(0, 0, 1, 0, Color.GRAY);
			toolbar2.setBorder(matteBorder2);
			toolbar2.addSeparator();
			toolbar2.add(resume);
			
			resume.setBorder(new EmptyBorder(new Insets(0,2,0,2)));
			
		    toolbar2.add(pause);
			pause.setBorder(new EmptyBorder(new Insets(0,2,0,2)));
			
		    toolbar2.add(stop);
		    stop.setBorder(new EmptyBorder(new Insets(0,2,0,2)));
		    
		    toolbar2.add(cancel);
		    cancel.setBorder(new EmptyBorder(new Insets(0,2,0,2)));
		    
		    toolbar2.addSeparator();
			
		    JToolBar toolbar4 = new JToolBar();
		    toolbar4.setBounds(360, 0, 235, 26);
			toolbar4.setRollover(false);
			toolbar4.setFloatable(false);
			toolbar4.setBackground(Color.WHITE);
			frame.getContentPane().add(toolbar4);
			toolbar4.setVisible(true);
			Border matteBorder4 = new MatteBorder(0, 0, 1, 0, Color.GRAY);
			toolbar4.setBorder(matteBorder4);
			toolbar4.add(print);
            print.setBorder(new EmptyBorder(new Insets(0,2,0,2)));
            toolbar4.add(back);
            back.setBorder(new EmptyBorder(new Insets(0,2,0,2)));
            toolbar4.add(rtu);
            rtu.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
                
		    
		    JToolBar toolbar3 = new JToolBar();
		    toolbar3.setBounds(140, 0, frame.getWidth()-105, 26);
			toolbar3.setRollover(false);
			toolbar3.setFloatable(false);
			toolbar3.setBackground(Color.WHITE);
			frame.getContentPane().add(toolbar3);
			toolbar3.setVisible(true);
			Border matteBorder3 = new MatteBorder(0, 0, 1, 0, Color.GRAY);
			toolbar3.setBorder(matteBorder3);
			
		    
		    
			JMenuBar menuBar = new JMenuBar();
			menuBar.setBounds(0, 0, 140, 26);
			frame.getContentPane().add(menuBar);
			menuBar.setBorder(matteBorder);
			JMenu mnFile = new JMenu("File");
			mnFile.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
			menuBar.add(mnFile);
			
			file = getClass().getResource("/img/new.png");
            image1 = ImageIO.read(file);
            icon1 = new ImageIcon(image1);
            img1 = icon1.getImage() ;  
			newimg1 = img1.getScaledInstance( 16, 16,  java.awt.Image.SCALE_SMOOTH ) ;
			icon1 = new ImageIcon(newimg1);
            JMenuItem mntmNewFile = new JMenuItem("New (Blank file)", icon1);
			mntmNewFile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(textArea_1.getText().length() < 1 && textArea.getText().length() < 1)
					{
						textArea.setText(null);
						return;
					}
					int temp=JOptionPane.showConfirmDialog(null, "Do you want to save data?");
					if(temp==0)
					{
						save();
					}
					else
					{
					textArea.setText(null);
					textArea_1.setText(null);
					}
				}
			});
			mntmNewFile.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			mnFile.add(mntmNewFile);
			
			file = getClass().getResource("/img/save.png");
            image1 = ImageIO.read(file);
            icon1 = new ImageIcon(image1);
            img1 = icon1.getImage() ;  
			newimg1 = img1.getScaledInstance( 16, 16,  java.awt.Image.SCALE_SMOOTH ) ;
			icon1 = new ImageIcon(newimg1);
            mntmSave = new JMenuItem("Save", icon1);
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					save();
			
				}
			});
			mntmSave.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			mnFile.add(mntmSave);
			
			file = getClass().getResource("/img/open.png");
            image1 = ImageIO.read(file);
            icon1 = new ImageIcon(image1);
            img1 = icon1.getImage() ;  
			newimg1 = img1.getScaledInstance( 16, 16,  java.awt.Image.SCALE_SMOOTH ) ;
			icon1 = new ImageIcon(newimg1);
            JMenuItem mntmOpen = new JMenuItem("Open", icon1);
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try
					{
						File dir = new File(userhome + "/Documents/Urdu_Files(DRC to Urdu)");
						if(!dir.exists())
						{
							dir.mkdir();
						}
						else
						{
							fc = new JFileChooser(userhome +"/Documents/Urdu_Files(DRC to Urdu)");
							int returnVal = fc.showOpenDialog(mntmOpen);
					        if (returnVal == JFileChooser.APPROVE_OPTION)
					        {
					            File file = fc.getSelectedFile();
					            String path=file.getAbsolutePath();
					            int i;
					            String read;	    			
				    			FileReader is=new FileReader(path);
					    		BufferedReader fl=new BufferedReader(is);
					    		while((i=fl.read())!=-1)
					    		{
					    			char s= (char)i;
					    			read  = String.valueOf(s);
					    			int pos = textArea.getCaretPosition();
							        textArea_1.insert(read, pos);   
					    		}
					    		is.close();
					    	}
				    	}
					}
					
					catch(Exception fi)
					{
						JOptionPane.showMessageDialog(null, fi);
					} 
				}
			});
			mntmOpen.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			mnFile.add(mntmOpen);
			
			
			
			file = getClass().getResource("/img/exit.png");
            image1 = ImageIO.read(file);
            icon1 = new ImageIcon(image1);
            img1 = icon1.getImage() ;  
			newimg1 = img1.getScaledInstance( 16, 16,  java.awt.Image.SCALE_SMOOTH ) ;
			icon1 = new ImageIcon(newimg1);
            JMenuItem mntmExit = new JMenuItem("Exit", icon1);
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(JFrame.EXIT_ON_CLOSE);
				}
				
			});
			
			mntmExit.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			mnFile.add(mntmExit);
			
			JMenu mnMacro = new JMenu("Macro");
			mnMacro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
			menuBar.add(mnMacro);
			
			file = getClass().getResource("/img/folder.png");
            image1 = ImageIO.read(file);
            icon1 = new ImageIcon(image1);
            img1 = icon1.getImage() ;  
			newimg1 = img1.getScaledInstance( 16, 16,  java.awt.Image.SCALE_SMOOTH ) ;
			icon1 = new ImageIcon(newimg1);
            JMenuItem mntmNewMenuItem = new JMenuItem("Import Macro", icon1);
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					try
					{
						File dir = new File(userhome + "/Documents/Macro_Files(DRC to Urdu)");
						if(!dir.exists())
						{
							JOptionPane.showMessageDialog(null, "Currently No Macros are available.");
							return;
						}
						else
						{
							fc = new JFileChooser(userhome +"/Documents/Macro_Files(DRC to Urdu)");
							int returnVal = fc.showOpenDialog(mntmNewMenuItem);
					        if (returnVal == JFileChooser.APPROVE_OPTION)
					        {
					            File file = fc.getSelectedFile();
					            String path=file.getAbsolutePath();
					            int i;
					            String read;	    			
				    			FileReader is=new FileReader(path);
					    		BufferedReader fl=new BufferedReader(is);
					    		while((i=fl.read())!=-1)
					    		{
					    			char s= (char)i;
					    			read  = String.valueOf(s);
					    			int pos = textArea.getCaretPosition();
							        textArea.insert(read, pos);   
					    		}
					    		is.close();
					    	}
				    	}
					}
					
					catch(Exception fi)
					{
						JOptionPane.showMessageDialog(null, fi);
					}
				}
			});
			mntmNewMenuItem.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			mnMacro.add(mntmNewMenuItem);
			
			file = getClass().getResource("/img/record.png");
            image1 = ImageIO.read(file);
            icon1 = new ImageIcon(image1);
            img1 = icon1.getImage() ;  
			newimg1 = img1.getScaledInstance( 16, 16,  java.awt.Image.SCALE_SMOOTH ) ;
			icon1 = new ImageIcon(newimg1);
            JMenuItem mntmRecordMacro = new JMenuItem("Record Macro", icon1);
			mntmRecordMacro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					recordActionPerformed(e);
				}
			});
			mntmRecordMacro.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			mnMacro.add(mntmRecordMacro);
			
			JMenu mnView = new JMenu("View");
			mnView.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
			menuBar.add(mnView);
			
			file = getClass().getResource("/img/record.png");
            image1 = ImageIO.read(file);
            icon1 = new ImageIcon(image1);
            img1 = icon1.getImage() ;  
			newimg1 = img1.getScaledInstance( 16, 16,  java.awt.Image.SCALE_SMOOTH ) ;
			icon1 = new ImageIcon(newimg1);
            JMenuItem mntmView = new JMenuItem("Raavi to Urdu", icon1);
			mntmView.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					try
					{
						if(textArea_1.getText().length() < 1 && textArea.getText().length() < 1)
						{
							Main2 m2;
							m2 = new Main2();
							m2.frame.setVisible(true);
							frame.setVisible(false);
							return;
						}
						int temp=JOptionPane.showConfirmDialog(null, "Do you want to save data?");
						if(temp==0)
						{
							save();
						}
						else
						{
						textArea.setText(null);
						textArea_1.setText(null);
						}
						
					}
					catch(Exception ee)
					{}
				}
			});
			mntmView.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			mnView.add(mntmView);
			
			
			
			//https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/2d/printing/examples/PrintDialogExample.java
			//https://www.sourcecodester.com/tutorials/java/8190/open-printer-dialog-java.html
			//https://www.youtube.com/watch?v=C3y00RYQRSI
			/*file = getClass().getResource("/img/printer_1.png");
            image1 = ImageIO.read(file);
            icon1 = new ImageIcon(image1);
            img1 = icon1.getImage() ;  
			newimg1 = img1.getScaledInstance( 22, 22,  java.awt.Image.SCALE_SMOOTH ) ;
			icon1 = new ImageIcon(newimg1);
            JButton btnPrint = new JButton("  Print",icon1);
            btnPrint.setBackground(Color.BLACK);
			btnPrint.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnPrint.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(textArea_1.getText().length() <= 1)
					{
						JOptionPane.showMessageDialog(null, "There is no any text in Shahmukhi text box.", "Error Message", JOptionPane.CANCEL_OPTION);
						return;
					}
					try
					{
						Boolean complete = textArea_1.print();
						if(complete)
			            {
			            	JOptionPane.showMessageDialog(null, "Done Printing", "Information", JOptionPane.INFORMATION_MESSAGE);
			            }
			            else
			            {
			            	JOptionPane.showMessageDialog(null, "Printing Canceled.", "Printer", JOptionPane.ERROR_MESSAGE);
			            }
					}
					catch(Exception ee)
					{
		            	JOptionPane.showMessageDialog(null, "Printing Canceled.", "Printer", JOptionPane.ERROR_MESSAGE);
		            	//JOptionPane.showMessageDialog(null, ee, "Exception Handling", JOptionPane.ERROR_MESSAGE);
					}
			    }
			});
			btnPrint.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			btnPrint.setBounds(444, 659, 120, 30);
			frame.getContentPane().add(btnPrint);
			*/
			
			
			JButton btnTranslate = new JButton("<html>T<br>R<br>A<br>N<br>S<br>L<br>A<br>T<br>E</html>");
			btnTranslate.setBackground(Color.BLACK);
			btnTranslate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					convertText();
				}
			});
			btnTranslate.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			btnTranslate.setBounds(((frame.getWidth()/2)-25),(frame.getHeight()/2)-104,40,190);
			frame.getContentPane().add(btnTranslate);
			
			
			
			JButton btnNull = new JButton("Clear");
			btnNull.setBackground(Color.BLACK);
			btnNull.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			btnNull.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText(null);	
				}
			});
			btnNull.setBounds((frame.getWidth()/4)-55, frame.getHeight()-70, 80, 24);
			frame.getContentPane().add(btnNull);
			
			JButton btnNull_1 = new JButton("Clear");
			btnNull_1.setBackground(Color.BLACK);
			btnNull_1.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			btnNull_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea_1.setText(null);
				}
			});
			btnNull_1.setBounds((frame.getWidth()/2) + (frame.getWidth()/4) - 20, frame.getHeight()-70, 80, 24);
			frame.getContentPane().add(btnNull_1);
			
			
			
			
			frame.addComponentListener(new ComponentListener() 
			{  
			        // This method is called after the component's size changes
			        public void componentResized(ComponentEvent evt)
			        {
		        		scrollPane.setBounds(10,70,(frame.getWidth()/2)-40, (frame.getHeight())-150);
			        	scrollPane_1.setBounds((frame.getWidth()/2)+20, 70, (frame.getWidth()/2)-45, frame.getHeight()-150);
			        	lblGurmukhi.setBounds((frame.getWidth()/4)-65, 35, 150, 28);
			        	lblShahmukhi.setBounds((frame.getWidth()/2) + (frame.getWidth()/4) - 65, 35, 150, 28);
			        	btnTranslate.setBounds(((frame.getWidth()/2)-25),(frame.getHeight()/2)-104,40,190);
						//btnPrint.setBounds((frame.getWidth()/2)-65, frame.getHeight()-74, 120, 30);
						btnNull.setBounds((frame.getWidth()/4)-50, frame.getHeight()-70, 80, 24);
						btnNull_1.setBounds((frame.getWidth()/2) + (frame.getWidth()/4) - 40, frame.getHeight()-70, 80, 24);
						toolbar3.setBounds(140, 0, frame.getWidth()-105, 26);
						frame.validate();
						frame.repaint();
					}
			        
			       
			        @Override
					public void componentHidden(ComponentEvent e){/*TODO Auto-generated method stub*/}

			        @Override
					public void componentMoved(ComponentEvent e){/*TODO Auto-generated method stub*/}

					@Override
					public void componentShown(ComponentEvent e){/*TODO Auto-generated method stub*/}
			});
		}
		catch(Exception e)
		{
			textArea_1.setText(String.valueOf(e));
		}
	}
}
