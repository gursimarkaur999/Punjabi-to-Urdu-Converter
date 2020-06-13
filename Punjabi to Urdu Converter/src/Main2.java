

/**importing java files
 * 
 * 
 * functions which are used in this project require importing of inbuilt files that help in processing of named functions.
 * there can be class object creation, function calling, or keywords used that need importing of java files.
 *  these java files can be user defined as well as built in.
 *  
 *  */
import java.awt.EventQueue;/** EventQueue is a platform-independent class that queues events, both from the underlying peer classes and from trusted application classes. */
import javax.swing.JFrame;/** this is the inbuilt file used to import frames(window) in the project */
import javax.swing.JPopupMenu;/** This in built file is used to implementation of a popupmenu - a small window that popsup and display series of choices like save option and macros etc*/
import javax.swing.JTextArea;/** this file is imported as we require textArea where user can give input*/
import javax.swing.JToolBar;
import javax.swing.KeyStroke;/**A KeyStroke represents a key action on the keyboard, or equivalent input device. */
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;/** as we need scroll effect in our textArea as well as textArea_1 */
import java.awt.Font;/** to set font in our project*/
import java.awt.Frame;/**this file is imported for all java frames */
import java.awt.Image;/**this file is used to import images in the project */
import java.awt.Insets;/** An Insets object is a representation of the borders of a container. It specifies the space that a container must leave at each of its edges. 
                           The space can be a border, a blank space, or a title.*/
import java.awt.Toolkit;/** This class is the abstract superclass of all actual implementations of the Abstract Window Toolkit. Subclasses of the Toolkit class are used to bind the various components to particular native toolkit implementations*/

import javax.swing.JMenuBar;/** to create a menu bar */
import javax.swing.JLabel;/** a display area for short text,images and strings.Like in our project it is after the menubar*/
import javax.imageio.ImageIO;/**This file is imported to locate the ImageReaders and ImageWriters   */
import javax.swing.Action;/** The Action interface provides a useful extension to the ActionListener interface in cases where the same functionality may be accessed by several controls*/
import javax.swing.ImageIcon;/** An implementation of the Icon interface that paints Icons from Images*/
import javax.swing.JButton;/** this in built file is used to import the button.  */
import javax.swing.JComboBox;
import javax.swing.JFileChooser;/** allow the user to choose the files he/she wants to display in the textarea like open menu in the project*/
import javax.swing.JMenu;/** this file is imported for the implementation of menu- a popup window that contains JMenuItems that is displayed when the user selects an item on the JMenuBar.Example file,macro etc*/
import javax.swing.JMenuItem;/**to display the items in the menu. when the user clicks the item then action associated with it performs*/
import javax.swing.JOptionPane;/**a popup box used to inform the user */
import java.awt.event.ActionListener;/** an interface for receiving the action event*/
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;/**The BufferedImage subclass describes an Image with an accessible buffer of image data. */
import java.io.BufferedReader;/**Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters,array and lines */
import java.io.BufferedWriter;/**writes text to a character-output stream,buffering characters so as to provide for the efficient writing of single characters,arrays and strings  */
import java.io.File;/** An abstract representation of file and directory pathnames*/
import java.io.FileReader;/** this imported file is used to read the contents of file*/
import java.io.FileWriter;/**this imported file is used for writing character files */
/** Exception are user defined error with relation to the coding. Example is if in coding it is defined to have input in char and user is given any numeric input */

import java.io.IOException;/** IOException file is immported because there can be any input or output device error */
import java.net.URL;
import java.nio.charset.Charset;/**A named mapping between sequences of sixteen-bit Unicode code units and sequences of bytes. This class defines methods for creating decoders and encoders and for retrieving the various names associated with a charset. Instances of this class are immutable.*/
import java.nio.file.FileSystems;/**Factory methods for file systems. This class defines the getDefault method to get the default file system and factory methods to construct other types of file systems.*/
import java.nio.file.Files;/**This class consists exclusively of static methods that operate on files, directories, or other types of files.  */
import java.nio.file.Path;/** this file is imported to define the path of file in the file system*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import java.awt.event.ActionEvent;/**A semantic event which indicates that a component-defined action occurred. This high-level event is generated by a component (such as a Button) when the component-specific action occurs (such as being pressed). The event is passed to every ActionListener object that registered to receive such events using the component's addActionListener method.*/
import java.awt.Color;
import java.awt.ComponentOrientation;/**The ComponentOrientation class encapsulates the language-sensitive orientation that is to be used to order the elements of a component or of text. It is used to reflect the differences in this ordering between Western alphabets, Middle Eastern (such as Hebrew), and Far Eastern (such as Japanese). */
import java.awt.Dimension;/**to set the dimensions of the project */

import javax.swing.text.BadLocationException;/** BadLocationException file is imported to report bad locations within a document model (that is, attempts to reference a location that doesn't exist).*/
import javax.swing.text.DefaultEditorKit;/**This is the set of things needed by a text component to be a reasonably functioning editor for some type of text document. */
import javax.swing.text.Document;/** Document is a container used to store swing text components*/
import javax.swing.text.JTextComponent;/**JTextComponent is used as base class for swing text components*/
import javax.swing.text.TextAction;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;/** All text components share a set of default Actions. Each of these Actions are instances of TextAction by default. JTextComponent provides a private static EditorKit which consists of a set of four pre-built TextActions shared by all text components through the use of a default Keymap instance.*/

/** main class gets started having defined name Main2*/
public class Main2
{
	/**declaration of variables*/
	public JFrame frame;
	/**
	 *The textArea_1 is for urdu text where output is given to user */
	private JTextArea textArea_1;
	/** The textArea is for punjabi text where input is taken by user */
	private JTextArea textArea;
	/** Following are the variable which represents the icons in menubar*/
	private JButton pause;
	private JButton resume;
	private JButton cancel;
	private JButton stop;
	private JButton print,back;
	
	/** path and data variables are used in saving data.... 
	 * path stores the location and name of file
	 * data stores the text to be stored
	 * */
	private String path,data;
	/**
	 *taking user folder path which is logged in*/
	String userhome = System.getProperty("user.home");
	public JFileChooser fc;
	private JMenuItem mntmSave;
	
	/** creating object of class Main2 in main function*/
	/** macro is a term defined to record a particular set of words that can be reused by user.*/
	/** macro's related functions 
	 * 
	 * macro option in our project contains recording related options same as that of MS-WORD
	 * 
	 * It has record, pause, save and stop and cancel option
	 * 
	 * */
	
	
	
	
	/** action to be represented at time of recording*/
	public void recordActionPerformed(java.awt.event.ActionEvent rc)
	{
		/**
		 * setEnabled function is used to make button clickable(true) or non-clickable(false)*/
		resume.setEnabled(false);
		pause.setEnabled(true);
		stop.setEnabled(true);
		cancel.setEnabled(true);
		
	}
	/** action to be represented at time of pause button click*/
	public void pauseActionPerformed(java.awt.event.ActionEvent pa)
	{
		resume.setEnabled(true);
		pause.setEnabled(false);
	}
	
	/** action to be represented at time of resume button click*/
	public void resumeActionPerformed(java.awt.event.ActionEvent rs)
	{
		resume.setEnabled(false);
		pause.setEnabled(true);
	}
	
	/** action to be represented at time of stop and save button click*/
	public void stopActionPerformed(java.awt.event.ActionEvent st)
	{
		
		resume.setEnabled(false);
		pause.setEnabled(false);
		stop.setEnabled(false);
		cancel.setEnabled(false);
		/** taking name of macro recording in a variable */
		path=JOptionPane.showInputDialog(null, "Enter name of macro to be saved : ","Macro name");
		if(path == null)
		{
			JOptionPane.showMessageDialog(null, "Macro could not be saved successfully.", "Error Message", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		data=textArea.getText();
		/** saving data and thus creating a userdefined macro*/
		try
		{
			/** creating a directory or folder with Macro_Files name in Documents folder and storing the location in dir 
			 * 
			 * */
			File dir = new File(userhome + "/Documents/Macro_Files(Raavi to Urdu)");
			/** if directory doesn't exists then if condition gets executed  */
			if(!dir.exists())
			{
				dir.mkdir();
			}
			/**creating the file with the value stored in path variable*/
			File f=new File(userhome + "/Documents/Macro_Files(Raavi to Urdu)/"+path+".txt");
			/** Validating the following conditions to check whether the name of file is too small or file with same name already exists or save the data with the given name */
			if(path.length() < 6)
			{
				JOptionPane.showMessageDialog(null, "Name must exceed from 6 letters");	
				stopActionPerformed(st);
			}
			else if(f.exists())
			{
				JOptionPane.showMessageDialog(null, "File with same name already exits. Save with some other name: ");
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
	
	/** action to be represented at time of cancel button click*/

	public void cancelActionPerformed(java.awt.event.ActionEvent ca)
	{
		resume.setEnabled(false);
		pause.setEnabled(false);
		stop.setEnabled(false);
		cancel.setEnabled(false);
	}
	/** saving macro function used in stopActionPerformed function*/
		
	public void saveActionPerformed(java.awt.event.ActionEvent sa)
	{
		/** creating a null buffer */
		BufferedWriter writer = null;
	/** taking it into a try --- catch as there can be any kind of exception*/
		try
		{
			/** writting the data into file*/
			writer = new BufferedWriter( new FileWriter(userhome + "/Documents/Macro_Files(Raavi to Urdu)/"+path+".txt"));
		    writer.write(data);
		}
		catch ( IOException e)
		{
		}
		/** finally block is used to make the buffer 'writer' empty
		 * In any condition, finally block will get executed in exception or termination of program
		 * */
		finally
		{
		    try
    		{
	     	   if ( writer != null)
    		    writer.close( );
   			}
	    	catch ( IOException e)
    		{
	    	}
		}
		resume.setEnabled(false);
		pause.setEnabled(false);
		stop.setEnabled(false);
		cancel.setEnabled(false);
	}
	/** end of macro functioning*/
	
	/** save function for saving converted data of textArea_1*/
	private void save()
	{
		/** Taking in try---catch as any exception can occur*/
		try
		{
			/** Checking if the user has converted the text and then command gets pressed or before converting text user has clicked save button*/
			if(textArea_1.getText().length() < 1)
			{
				
				JOptionPane.showMessageDialog(null, "There is no any text in Shahmukhi text box.");
			}
			/** If converted text id there in textArea_1 then all the macro save button functions gets performed but here as urdu files functioning
			 *  */
			else
			{
				String text=textArea_1.getText();
				File dir = new File(userhome + "/Documents/Urdu_Files(Raavi to Urdu)");
				if(!dir.exists())
				{
					dir.mkdir();
				}
				
	            fc= new JFileChooser(userhome + "/Documents/Urdu_Files(Raavi to Urdu)");
	            /** Getting the return value of the option selected by user as OK or YEs to save data */
		        int returnVal = fc.showSaveDialog(mntmSave);
		        /** If user selects the OK or Yes then following code gets executed */
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
			/** Displaying any exception to user */
			JOptionPane.showMessageDialog(null, e2);
		}
	}
	
	
	/**
	 * class constructor
	 * @throws IOException 
	 * @wbp.parser.entryPoint*/
	public Main2() throws IOException
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
    	
		/** calling initialize function*/
		initialize();
		/** adding copy, paste, select all and cut functioning in textArea and textArea_1*/
		JPopupMenu menu = new JPopupMenu();
		/** Creating cut variable with defining cut action to it */
        Action cut = new DefaultEditorKit.CutAction();
        /** Giving a name for cut function to user */
        cut.putValue(Action.NAME, "Cut");
        /** Having an alternate key that is ctrl+X */
        cut.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control X"));
        /** Adding cut variable functioning to PopupMenu */
        menu.add( cut );
        /** Same as cut; 
         * we will create copy and paste */
        Action copy = new DefaultEditorKit.CopyAction();
        copy.putValue(Action.NAME, "Copy");
        copy.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control C"));
        menu.add( copy );

        Action paste = new DefaultEditorKit.PasteAction();
        paste.putValue(Action.NAME, "Paste");
        paste.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control V"));
        menu.add( paste );
        /** As we don't have selectall function in defaulteditorkit thats why we have created a selectall function  */
        Action selectAll = new SelectAll();
        menu.add( selectAll );
        
        /** adding menu in both textArea(where punjabi text input is taken) and textArea_1(where urdu text is given as output) */
        textArea.setComponentPopupMenu( menu );
        textArea_1.setComponentPopupMenu( menu );
        
      
	}
	
	
    /** creating selectall function*/
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


	
	/** main conversion of gurmukhi*/
	
	private void convertText()
    {
		if(textArea.getText() == null)
    	{
    		textArea_1.setText(null);
    		return;
    	}
    	
		/** taking all the textArea text in a string far*/
		String far = " " + textArea.getText() + " ";
		/** validating the text in far(only symbols)*/
		
		
		/** converting ] */far = far.replaceAll(String.valueOf((char)2405)," " + String.valueOf((char)1748) + String.valueOf((char)1748) + " ");
		/** converting ! */far = far.replaceAll("!"," " + String.valueOf((char)33) + " ");
		/** converting _ */far = far.replaceAll("_"," " + String.valueOf((char)95) + " ");
		/** converting ; */far = far.replaceAll(";"," " + String.valueOf((char)1563) + " ");
		/** converting , */far = far.replaceAll(","," " + String.valueOf((char)1644) + " ");
		/** converting % */far = far.replaceAll("%", " " + String.valueOf((char)1645) + " ");
		/** converting : */far = far.replaceAll(":", " " + String.valueOf((char)58) + " ");
		/** converting - */far = far.replaceAll("-"," " + String.valueOf((char)45) + " ");
		/** converting ' */far = far.replaceAll("'"," " + String.valueOf((char)1589) + " ");
		
		int i;
		/** adding all the validated text in textArea*/
        textArea_1.setText(far);
        /** splitting words and storing into array*/
		String lines[] = textArea_1.getText().split("\n");
        textArea_1.setText(null);
        
        /** again adding text back to textArea with single space before and after every word and next line in the end*/
        
        for(i=0;i<lines.length;i++)
        {
        	
        	
        	if(i == lines.length -1)
        	{
        		textArea_1.setText(textArea_1.getText() + " " + lines[i] + " ");
        	}
        	else
        	{
        		textArea_1.setText(textArea_1.getText() + " " + lines[i] + " \n");
        	}
        }
        /** removing if any double space occurs*/
        textArea_1.setText(textArea_1.getText().replaceAll("  ", " "));
        /** adding all text into character array and then converting them*/
        char text[]=textArea_1.getText().toCharArray();
        textArea_1.setText(null);
           for(i=0;i<text.length;i++)
            {
        	   	Document doc=textArea_1.getDocument();
                try
                { 
                	 /**^p*/	 if(i>0 && text[i-1] == ((char)94) && text[i] ==((char)2602) )
                     {
                       doc.remove(doc.getLength() -1,1);
                       textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)94) + String.valueOf((char)2602) + " ");                 
                     } 
                	 /**[*/ else if(text[i] == ((char)91))
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)8228));
                     }
                    
                	 /**\*/else if(text[i] == (char)92)
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)92) + " ");
                     }
                	 /*'else if(String.valueOf(text[i]) == String.valueOf((char)39))
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)1589) + " ");
                     }*/
                     
                	 /** */else if(text[i] == ((char)42))
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)1645) + " ");
                     }
                	 /*(*/else if(text[i] == ((char)40))
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)64831) + " ");
                     }
                	 /*)*/else if(text[i] == ((char)41))
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)64830) + " ");
                     }
                	 /*+*/else if(text[i] == ((char)43))
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf(text[i]) + " ");
                     }
                	 /*}*/else if(text[i] == ((char)125))
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)125) + " ");
                     }
                     
                	 /*{*/else if(text[i] == ((char)123))
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)123) + " ");
                     }
                    /*.*/ else if(text[i] == ((char)2404))
                     {
                   	  textArea_1.setText(textArea_1.getText() + String.valueOf((char)1748));
                     }
                   /*"*/  else if(text[i] == ((char)34))
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf(text[i]) + " ");
                     }
                   /**/  else if(text[i] == '?')
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)1567));
                     }
                    
                   /**/ else if(text[i] == '=')
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)61) + " ");
                     }
                    
                   /**/else if(text[i] == (char)8217)
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)1590) + " ");
                     }
                   /**/ else if(text[i] == (char)8216)
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)1589) + " ");
                     }
                    
                     
                   /**/ else if(text[i] == '@')
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)64) + " ");
                     }
                   /**/ else if(text[i] == '#')
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)35) + " ");
                     }
                   /**/else if(text[i] == '$')
                     {
                   	  textArea_1.setText(textArea_1.getText() + " " + String.valueOf((char)36) + " ");
                     }
                  
                   /**/else if(text[i] == (char)8220)
                     {
                   	  textArea_1.setText(textArea_1.getText() + String.valueOf((char)1593) + " ");
                     }
                   /**/ else if(text[i] == (char)8221)
                     {
                   	  textArea_1.setText(textArea_1.getText() + String.valueOf((char)1594) + " ");
                     }
                   	 else if(text[i] == (char)2673)
                     {
                   		 textArea_1.setText(textArea_1.getText() + text[i+1]);                 
                   		 textArea_1.setText(textArea_1.getText() + text[i]);
                   		 i++;
                     }
                   	 else if(i>0 && text[i-1] == ' ' && text[i] == ' ')
                   	 {}
                	 
                   	 /** If  */
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
            ResultSet res = stt.executeQuery("SELECT * FROM wordconvert2");
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
   		 
		
		 
		 /*comparing and replacing of a word wherever it exists in entire text */
		 
	     /**new Sihari*/
     	  
    	 textArea_1.setText(" " + textArea_1.getText() + " ");
   		 
    	 textArea_1.setText(textArea_1.getText().replaceAll("  ", " "));
   		 
    	 /*ਿਕ*/ textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2623) + String.valueOf((char)2581), " " + String.valueOf((char)1705) + String.valueOf((char)1616) + String.valueOf((char)1729) + " ")); 
      	  
    	  /*ਕਿ*/ textArea_1.setText(textArea_1.getText().replaceAll( String.valueOf((char)2581) +  String.valueOf((char)2623),  String.valueOf((char)1705) + String.valueOf((char)1616) + String.valueOf((char)1729))); 
       	  
       	/*ਆਉ*/  textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2566) + String.valueOf((char)2569), String.valueOf((char)1570) + String.valueOf((char)1574) + String.valueOf((char)1615))); 
        		
       	/*ਸ਼*///textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2616) + String.valueOf((char)2620), String.valueOf((char)1588) )); 
     	  
      	 /*ਖ਼*/ textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2582) + String.valueOf((char)2620) , String.valueOf((char)1582) )); 
       	  
       	  /*ਗ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2583) + String.valueOf((char)2620), String.valueOf((char)1594))); 
       	  
       	  /*ਜ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2588) + String.valueOf((char)2620), String.valueOf((char)1586)));
       	  
       	 /*ਫ਼*/ textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2603) + String.valueOf((char)2620), String.valueOf((char)1601) ));
       	  
       	  /*ਲ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2610)+ String.valueOf((char)2620), String.valueOf((char)1604) + String.valueOf((char)1726)));
       	  
       	/*^ਟ*/ textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)94) + String.valueOf((char)2591), " ")); 
       	  
       	/*^ਲ*/ textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)94) + String.valueOf((char)2610), " "));

       	/*ਿ^$*/  //textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2623) + String.valueOf((char)94)+ String.valueOf((char)36), String.valueOf((char)2623) + String.valueOf((char)94)+ String.valueOf((char)36) + String.valueOf((char)2623)));
   		 
        /*ਿਲ ---- ਲਿ*/ textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2623)+ String.valueOf((char)2610), String.valueOf((char)2610)+ String.valueOf((char)2623)));
   		 
        /*ਿਹ--ਹਿ*/  textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2623)+ String.valueOf((char)2617), String.valueOf((char)2617)+ String.valueOf((char)2623)));
   		 
   		 /*ਿਰ--ਰਿ*/  textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2623)+ String.valueOf((char)2608), String.valueOf((char)2608)+ String.valueOf((char)2623)));
   		 
		    /*ਿਵ੍----ਵਿ੍*/  textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2623) + String.valueOf((char)2637) + String.valueOf((char)2613),String.valueOf((char)2637) + String.valueOf((char)2613) + String.valueOf((char)2623)));
		      
    	 
    	 
    		 
		    		      
		      
		      
		      //adhak
 		      //textArea_1.setText(textArea_1.getText().replaceAll("W", "w"));
 		    
 		     /*ੱ^$*/ //textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2673) + "^$", String.valueOf((char)2673) + "^&" + String.valueOf((char)2673)));
 		      
 		      /*ੱੱ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2673)+String.valueOf((char)2673), " "));
 		      
    		  
 		   //new m
     		 /*ਆਇਆ*/textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)2566) + String.valueOf((char)2567) + String.valueOf((char)2566) + " ", " " + String.valueOf((char)1570) + String.valueOf((char)1740) + String.valueOf((char)1575) + " " ));
     
       		/*ਇਆ*/ textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2567) + String.valueOf((char)2566) + " ", " " + String.valueOf((char)1740) + String.valueOf((char)1575) + " "));
     		 
       		 /*ਅਤੇ*/textArea_1.setText(textArea_1.getText().replaceAll(" "+ String.valueOf((char)2565) + String.valueOf((char)2596) + String.valueOf((char)2631) + " ", " " + String.valueOf((char)1575) + String.valueOf((char)1578) + String.valueOf((char)1746) + " " ));
              
       		/*ਹਨ*/ textArea_1.setText(textArea_1.getText().replaceAll( " " + String.valueOf((char)2617)+String.valueOf((char)2600) +  " ",String.valueOf((char)1729) + String.valueOf((char)1606) + " "));
     		 
       		 /*ਹੈ*/textArea_1.setText(textArea_1.getText().replaceAll( " "+ String.valueOf((char)2617)+ String.valueOf((char)2632)+ String.valueOf((char)1729) +" ", String.valueOf((char)1746) + String.valueOf((char)1614) + " " ));
              
       		/*ਆਉ*/  textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2566) + String.valueOf((char)2569), String.valueOf((char)1570) + String.valueOf((char)1574) + String.valueOf((char)1615) ));

       		 /* ਏ */textArea_1.setText(textArea_1.getText().replaceAll( " "+ String.valueOf((char)2575) +" ", String.valueOf((char)1747) + " "));
       		 
       		 /* ਨੂੰ */textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)2600)+String.valueOf((char)2626)+String.valueOf((char)2672) + " ", " " + String.valueOf((char)1606) + String.valueOf((char)1608) + String.valueOf((char)1615) +  String.valueOf((char)1722) + " " ));
              
       		 /*ਏ */textArea_1.setText(textArea_1.getText().replaceAll( String.valueOf((char)2575) +" ", String.valueOf((char)1574) + String.valueOf((char)1746) + " "));
     		 
       		/*ik onkar*/// textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2676) ,String.valueOf((char)2676) ));
       		 
       	    // textArea_1.setText(textArea_1.getText().replaceAll("ÃÄ",String.valueOf((char)2676) ));
      		
       		/* ਆ */ textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2566)+" ", " " + String.valueOf((char)1570) + " "));
       		 
       		/* ਆ*/textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2566), " " + String.valueOf((char)1570)));
       		 
       		/*ਆ */ textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2566) + " ", String.valueOf((char)1740) + String.valueOf((char)1575) + " "));
       		 
       		/*ਆ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2566),String.valueOf((char)1740) + String.valueOf((char)1575)));
      		 
       		/*ਾਂਅ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2622)+String.valueOf((char)2562)+String.valueOf((char)2565),String.valueOf((char)1575) + String.valueOf((char)1722)+ String.valueOf((char)1620)  + " "));
     		 
       		/* ਆਂ */textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2566)+String.valueOf((char)2562)+" ", " " + String.valueOf((char)1570) + String.valueOf((char)1722) + " "));
    		 
       		/* ਆਂ*/textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2566)+String.valueOf((char)2562), " " + String.valueOf((char)1570) + String.valueOf((char)1606) + String.valueOf((char)1618)));
       		
       		/*ਆਂ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2566)+String.valueOf((char)2562)+" ", String.valueOf((char)1740) + String.valueOf((char)1575) + String.valueOf((char)1722) + " "));
       		
       		/*ਆਂ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2566)+String.valueOf((char)2562), " " + String.valueOf((char)1740) + String.valueOf((char)1575)  + String.valueOf((char)1606) + String.valueOf((char)1618)));
       		
       		/* ਇ */textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)2567) + " ", " " + String.valueOf((char)1575) + String.valueOf((char)1616) + " "));
       		/* ਇ*/textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)2567), " " + String.valueOf((char)1575) + String.valueOf((char)1616)));
       		/*ਇ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2567) + " ", String.valueOf((char)1569) + String.valueOf((char)1616) + " "));
       		/*ਇ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2567), String.valueOf((char)1574) + String.valueOf((char)1616)));
       		
       		
       		/* ਇ */textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2674)+String.valueOf((char)2623)+" ", " " + String.valueOf((char)1575) + String.valueOf((char)1616) + " "));
       		/* ਇ*/textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2674)+String.valueOf((char)2623), " " + String.valueOf((char)1575) + String.valueOf((char)1616)));
       		/*ਇ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2674)+String.valueOf((char)2623)+" ", String.valueOf((char)1569) + String.valueOf((char)1616) + " "));
       		/*ਇ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2674)+String.valueOf((char)2623), String.valueOf((char)1574) + String.valueOf((char)1616)));
       		
       		/* ਈ  */textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2568)+" ", " " + String.valueOf((char)1575) + String.valueOf((char)1616) + String.valueOf((char)1740) + " "));
       		/* ਈ*/textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2568), " " + String.valueOf((char)1575) + String.valueOf((char)1616) + String.valueOf((char)1740)));
       		/*ਈ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2568)+" ", String.valueOf((char)1574) + " "));
       		/*ਈਅ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2568)+String.valueOf((char)2565), String.valueOf((char)1574) + String.valueOf((char)1616) + String.valueOf((char)1740) + String.valueOf((char)1593)));
       		/*ਈ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2568), String.valueOf((char)1574) + String.valueOf((char)1616) + String.valueOf((char)1740)));
       		
       		
       		/* ਈ  */textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2674)+String.valueOf((char)2624)+" ", " " + String.valueOf((char)1575) + String.valueOf((char)1616) + String.valueOf((char)1740) + " "));
       		/* ਈ*/textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2674)+String.valueOf((char)2624), " " + String.valueOf((char)1575) + String.valueOf((char)1616) + String.valueOf((char)1740)));
       		/*ਈ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2674)+String.valueOf((char)2624)+" ", String.valueOf((char)1574) + " "));
       		/*ਈਅ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2674)+String.valueOf((char)2624)+String.valueOf((char)2565), String.valueOf((char)1574) + String.valueOf((char)1616) + String.valueOf((char)1740) + String.valueOf((char)1593)));
       		/*ਈ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2674)+String.valueOf((char)2624), String.valueOf((char)1574) + String.valueOf((char)1616) + String.valueOf((char)1740)));
       		/*ਾਉ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2622)+String.valueOf((char)2569), String.valueOf((char)1575) + String.valueOf((char)1614) + String.valueOf((char)1608)));
       		
       		/* ਉ */textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2569)+" ", " " + String.valueOf((char)1575) + String.valueOf((char)1615)) + " ");
       		/* ਉ*/textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2569), " " + String.valueOf((char)1575) + String.valueOf((char)1615)));
       		/*ਉ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2569)+" ", String.valueOf((char)1572) + String.valueOf((char)1615) + " "));
       		/*ਉ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2569), String.valueOf((char)1574) + String.valueOf((char)1615)));
       				
       		/* ਊ */textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2570)+" ", " " + String.valueOf((char)1575) + String.valueOf((char)1615) + String.valueOf((char)1608) + " "));
       		/* ਊ*/textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2570), " " + String.valueOf((char)1575) + String.valueOf((char)1615) + String.valueOf((char)1608)));
       		/*ਊ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2570)+" ", String.valueOf((char)1572) +  String.valueOf((char)1615) + " "));
       		/*ਊ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2570), String.valueOf((char)1574) + String.valueOf((char)1615)+ String.valueOf((char)1608)));
       		
       		/* ਏ */textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2575)+" ", " " + String.valueOf((char)1575) + String.valueOf((char)1746) + " "));
       		/* ਏ*/textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2575), " " + String.valueOf((char)1575) + String.valueOf((char)1740)));
       		/*ਏ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2575)+" ", String.valueOf((char)1574) + String.valueOf((char)1746) + " "));
       		/*ਏ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2575), String.valueOf((char)1574) + String.valueOf((char)1740)));
       		
       		/* ਐ */textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2576)+" ", " " + String.valueOf((char)1575) + String.valueOf((char)1614) + String.valueOf((char)1746) + " "));
       		/* ਐ*/textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2576), " " + String.valueOf((char)1575) + String.valueOf((char)1614) + String.valueOf((char)1740)));
       		/*ਐ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2576)+" ", String.valueOf((char)1574) +  String.valueOf((char)1614)+  String.valueOf((char)1746) + " "));
       		/*ਐ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2576), String.valueOf((char)1574) + String.valueOf((char)1614)+ String.valueOf((char)1740)));
       		
       		/*textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2576)+" ", " " + String.valueOf((char)1575) + String.valueOf((char)1608) + " "));
       		textArea_1.setText(textArea_1.getText().replaceAll(" E", " " + String.valueOf((char)1575) + String.valueOf((char)1608)));
       		textArea_1.setText(textArea_1.getText().replaceAll("E ", String.valueOf((char)1572) + " "));
       		textArea_1.setText(textArea_1.getText().replaceAll("E", String.valueOf((char)1572)));*/
       		
       		/* ਔ */textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2580)+" ", " " + String.valueOf((char)1575) + String.valueOf((char)1614) + String.valueOf((char)1608) + " "));
       		/* ਔ*/textArea_1.setText(textArea_1.getText().replaceAll(" "+String.valueOf((char)2580), " " + String.valueOf((char)1575)+ String.valueOf((char)1614) + String.valueOf((char)1608)));
       		/*ਔ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2580)+" ", String.valueOf((char)1572)+ String.valueOf((char)1614) + " "));
       		/*ਔ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2580), String.valueOf((char)1572)+ String.valueOf((char)1614)));
       		
       		/*ੱ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2673), String.valueOf((char)1617)));
       		
       		
       		
       		/**A4Main1*/
		/*ਅ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2565) + String.valueOf((char)2620), String.valueOf((char)1593)));

		/*ੇਅ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2631) + String.valueOf((char)2565), String.valueOf((char)1740) + String.valueOf((char)1574)));

		/*ਅ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2565), String.valueOf((char)1575)));

		/*ੳ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2675) + String.valueOf((char)2620), String.valueOf((char)1593)));

		/*ੳ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2675), String.valueOf((char)1575)));

		/*ੲ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2674) + String.valueOf((char)2620), String.valueOf((char)1593)));

		/*ੲ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2674), String.valueOf((char)1575)));

		/*ਸ਼਼਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2616) + String.valueOf((char)2620) + String.valueOf((char)2620) + String.valueOf((char)2620), String.valueOf((char)1579)));

		/*ਸ਼਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2616) + String.valueOf((char)2620) + String.valueOf((char)2620), String.valueOf((char)1589)));

		/*ਸ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2616) + String.valueOf((char)2620), String.valueOf((char)1588)));

		/*ਸ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2614), String.valueOf((char)1588)));

		/*ਸ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2616), String.valueOf((char)1587)));

		/*ਹ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2617) + String.valueOf((char)2620), String.valueOf((char)1581)));

		/*ਹ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2617), String.valueOf((char)1729)));

		/*ੜ੍ਹ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2652) + String.valueOf((char)2637) + String.valueOf((char)2617), String.valueOf((char)1681) + String.valueOf((char)1726)));

		/*੍ਹ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637) + String.valueOf((char)2617), String.valueOf((char)1729)));

		//textArea_1.setText(textArea_1.getText().replaceAll("§", String.valueOf((char)1729) + String.valueOf((char)1615) + String.valueOf((char)1608)));

		/*ਕ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2581) + String.valueOf((char)2620), String.valueOf((char)1602)));

		/*ਕ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2581), String.valueOf((char)1705)));

		/*ਖ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2582) + String.valueOf((char)2620), String.valueOf((char)1582)));

		/*ਖ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2649), String.valueOf((char)1582)));

   		/*ਖ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2582), String.valueOf((char)1705) + String.valueOf((char)1726)));

		/*ਗ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2583) + String.valueOf((char)2620), String.valueOf((char)1594)));

		/*ਗ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2650), String.valueOf((char)1594)));

		/*ਗ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2583), String.valueOf((char)1711)));

		/*ਙ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2585), String.valueOf((char)1711)));

		/*ਘ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2584), String.valueOf((char)1711) + String.valueOf((char)1726)));

		/*ਚ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2586), String.valueOf((char)1670)));

		/*੍ਚ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637) + String.valueOf((char)2586), String.valueOf((char)1670)));

		/*ਛ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2587), String.valueOf((char)1670) + String.valueOf((char)1726)));

		/*ਜ਼਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2588) + String.valueOf((char)2620) + String.valueOf((char)2620), String.valueOf((char)1590)));

  		/*ਝ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2589), String.valueOf((char)1580) + String.valueOf((char)1726)));

		/*ਟ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2591), String.valueOf((char)1657)));

		/*੍ਟ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637) + String.valueOf((char)2591), String.valueOf((char)1657)));

		/*ਠ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2592), String.valueOf((char)1657) + String.valueOf((char)1726)));

		/*ਡ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2593), String.valueOf((char)1672)));

		/*ਢ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2594), String.valueOf((char)1672) + String.valueOf((char)1726)));

		/*ਣ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2595), String.valueOf((char)1606) + String.valueOf((char)1726)));

		/*ਤ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2596) + String.valueOf((char)2620), String.valueOf((char)1591)));

		/*ਤ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2596), String.valueOf((char)1578)));

		/*੍ਤ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637) + String.valueOf((char)2596), String.valueOf((char)1578)));

		/*ਥ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2597), String.valueOf((char)1578) + String.valueOf((char)1726)));

		/*ਦ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2598), String.valueOf((char)1583)));

		/*ਧ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2599), String.valueOf((char)1583) + String.valueOf((char)1726)));

		/*ਨ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2600), String.valueOf((char)1606)));
   
		/*ਪ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2602), String.valueOf((char)1662)));

		/*ਫ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2603) + String.valueOf((char)2620), String.valueOf((char)1601)));
		 
		/*ਫ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2654), String.valueOf((char)1601)));
		 
		/*ਫ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2603), String.valueOf((char)1662) + String.valueOf((char)1726)));
		 
		/*ਬ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2604), String.valueOf((char)1576)));
		 
		/*ਭ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2605), String.valueOf((char)1576) + String.valueOf((char)1726)));
		 
		/*ਮ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2606), String.valueOf((char)1605)));
		 
		/*ਯ਼਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2607) + String.valueOf((char)2620) + String.valueOf((char)2620), String.valueOf((char)1592)));
		
		/*ਯ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2607) + String.valueOf((char)2620), String.valueOf((char)1688)));

		/*ਯ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2607), String.valueOf((char)1740)));

		/*ਯ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2607) + String.valueOf((char)2620), String.valueOf((char)1586)));

		/*੍ਯ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637) + String.valueOf((char)2607), String.valueOf((char)1586)));

		//textArea_1.setText(textArea_1.getText().replaceAll("Î", String.valueOf((char)1686)));

		/*੍ਯ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637) + String.valueOf((char)2607), String.valueOf((char)1586)));

		/*੍ਰ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637) + String.valueOf((char)2608), String.valueOf((char)1585)));

		/*ਰ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2608), String.valueOf((char)1585)));

		/*ਲ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2610) + String.valueOf((char)2620), String.valueOf((char)1604) + String.valueOf((char)1726)));

		/*ਲ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2611), String.valueOf((char)1604) + String.valueOf((char)1726)));

		/*ਲ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2610), String.valueOf((char)1604)));

		/*ਵ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2613), String.valueOf((char)1608) + String.valueOf((char)1618)));

		/*੍ਵ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637) + String.valueOf((char)2613), String.valueOf((char)1608)));

		/*ੜ੍ਹ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2652) + String.valueOf((char)2637) + String.valueOf((char)2617), String.valueOf((char)1681) + String.valueOf((char)1726)));

		/*ੜ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2652), String.valueOf((char)1681)));

		/*ਾ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2622), String.valueOf((char)1575)));

		/*ਾਂ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2622) + String.valueOf((char)2562) + " ", String.valueOf((char)1575) + String.valueOf((char)1722) + " "));

   		/*ਾਂ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2622) + String.valueOf((char)2562), String.valueOf((char)1575) + String.valueOf((char)1606) + String.valueOf((char)1618)));

		/*ਿ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2623), String.valueOf((char)1616)));

		/*ੲੀ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2674) + String.valueOf((char)2624) + " ", String.valueOf((char)1574) + " "));

		//idi with badi ee and space
		//textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2568) + " ", String.valueOf((char)1574) + " "));

		/*ੲੀ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2674) + String.valueOf((char)2624), String.valueOf((char)1593) + String.valueOf((char)1616) + String.valueOf((char)1609) + " "));
		 
		//edi with badi ee but without space
		//textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2568), String.valueOf((char)1593) + String.valueOf((char)1616) + String.valueOf((char)1609) + " "));

		/*ੀ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2624) + " ", String.valueOf((char)1609) + " "));

		/*ੀ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2624), String.valueOf((char)1616) + String.valueOf((char)1609)));

		/*ੁ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2625), String.valueOf((char)1615)));

		//textArea_1.setText(textArea_1.getText().replaceAll("ü", String.valueOf((char)1615)));

		/*ੂ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2626), String.valueOf((char)1615) + String.valueOf((char)1608)));

		//textArea_1.setText(textArea_1.getText().replaceAll("¨", String.valueOf((char)1615) + String.valueOf((char)1608)));

		//textArea_1.setText(textArea_1.getText().replaceAll("¨", String.valueOf((char)1735)));

		/*ੇ  */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2631) + " ", String.valueOf((char)1746) + " "));

		/*ੇ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2631), String.valueOf((char)1740)));

		/*ੈ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2632 + " "), String.valueOf((char)1746) + String.valueOf((char)1614) + " "));

		/*ੈ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2632), String.valueOf((char)1614) + String.valueOf((char)1740)));

		/*ਓ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2579), String.valueOf((char)1575) + String.valueOf((char)1608)));

		/*ੋ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2635), String.valueOf((char)1608)));

		/*ੌ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2636), String.valueOf((char)1614) + String.valueOf((char)1608)));

		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2614), String.valueOf((char)1606) + String.valueOf((char)1617)));

		/*ੰ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2672) + " ", String.valueOf((char)1722) + " "));

		/*ੰ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2672), String.valueOf((char)1606) + String.valueOf((char)1617)));

		//textArea_1.setText(textArea_1.getText().replaceAll("µ", String.valueOf((char)1606) + String.valueOf((char)1617)));

		//textArea_1.setText(textArea_1.getText().replaceAll("µ", String.valueOf((char)1606) + String.valueOf((char)1617)));

		/*ਂ */textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2562) + " ", String.valueOf((char)1722) + " "));

		/*ਂ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2562), String.valueOf((char)1606) + String.valueOf((char)1618)));

		/*’*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)8217), String.valueOf((char)1548)));

		/*~*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)126), String.valueOf((char)1617)));
		
		/*॥*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2405), String.valueOf((char)1748) + String.valueOf((char)1748) + " "));
		
		//dot
		//textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)46), " " + String.valueOf((char)1748)));

		/*ਜ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2651), String.valueOf((char)1584)));

		/*ਜ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2651), String.valueOf((char)1584)));

		/*ਜ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2588), String.valueOf((char)1580)));

		/*ਞ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2590), String.valueOf((char)1580)));

		/*ਜ਼*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2588) + String.valueOf((char)2620), String.valueOf((char)1584)));

		/*੍ਟ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637) + String.valueOf((char)2591), String.valueOf((char)1657)));

		/*੍ਨ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637) + String.valueOf((char)2600), String.valueOf((char)1606)));

   		/*੍ਤ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637) + String.valueOf((char)2596), String.valueOf((char)1578)));

		//textArea_1.setText(textArea_1.getText().replaceAll("®", String.valueOf((char)1585)));

		/*੍ਵ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637) + String.valueOf((char)2613), String.valueOf((char)1608)));

		/*੍ਯ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637) + String.valueOf((char)2607), String.valueOf((char)1586)));

		/*੍ਚ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637) + String.valueOf((char)2586), String.valueOf((char)1670)));

		/*ਨੂੰ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2600) + String.valueOf((char)2626) + String.valueOf((char)2672), String.valueOf((char)1606) + String.valueOf((char)1735) + String.valueOf((char)1606) + String.valueOf((char)1617)));

		//textArea_1.setText(textArea_1.getText().replaceAll("¨", String.valueOf((char)1735)));

		/*°*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)176), String.valueOf((char)1731)));

		/*ਃ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2563), String.valueOf((char)1475)));
		 
		 
		 
		/**Uu06Main2*/
		//textArea_1.setText(textArea_1.getText().replaceAll("Î", String.valueOf((char)1686)));

		//textArea_1.setText(textArea_1.getText().replaceAll("ü", String.valueOf((char)1615)));

		/* ੵ*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2677), String.valueOf((char)1729)));

		//Ekonkar symbol
		//textArea_1.setText(textArea_1.getText().replaceAll("¡", String.valueOf((char)2676)));

		textArea_1.setText(textArea_1.getText().replaceAll("  ", " "));

		/*।*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2404), String.valueOf((char)1748)));
		 
		
		/**Change Font Direction*/
		textArea_1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	        
         
		/**PunctuationBack*/
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1575) + String.valueOf((char)33) + String.valueOf((char)1575), String.valueOf((char)33) + " "));
		 	
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)8220) + " ", String.valueOf((char)8220)));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)8221), String.valueOf((char)8221)));
		 
		 
		/**ShahmukhiCorrection*/
		/** first LEFT SINGLE QUOTATION MARK is replaced by unicode(1589) three times. 
		 * In shamukhi correction after the whole conversion is done; wherever three unicode(1589) character appears it changes back to LEFT SINGLE QUOTATION MARK*/
		/*LEFT SINGLE QUOTATION MARK*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1589) + String.valueOf((char)1589) + String.valueOf((char)1589) + " ", String.valueOf((char)8216)));
		 
		/*RIGHT SINGLE QUOTATION MARK*/textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1590) + String.valueOf((char)1590) + String.valueOf((char)1590), String.valueOf((char)8217)));
		 
		/*RIGHT DOUBLE QUOTATION MARK*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1593) + String.valueOf((char)1593) + String.valueOf((char)1593) + " ", String.valueOf((char)8221)));
		 
		/*ARABIC LETTER ALEF MAKSURA + FARSI YEH + WAW*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1609) + String.valueOf((char)1608) + String.valueOf((char)1618), String.valueOf((char)1609) + String.valueOf((char)1608)));
		 
		/*LEFT DOUBLE QUOTATION MARK*/textArea_1.setText(textArea_1.getText().replaceAll( " " + String.valueOf((char)1594) + String.valueOf((char)1594) + String.valueOf((char)1594), String.valueOf((char)8220)));
		 
		/*ARABIC LETTER FARSI YEH + WAW + SUKUN*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1740) + String.valueOf((char)1608) + String.valueOf((char)1618), String.valueOf((char)1740) + String.valueOf((char)1608)));
		 
		/*SPACE + ARABIC LETTER FARSI YEH + WAW + FATHA + FARSI YEH*/textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1608) + String.valueOf((char)1618) + String.valueOf((char)1614) + String.valueOf((char)1740), " " + String.valueOf((char)1608) + String.valueOf((char)1614) + String.valueOf((char)1740)));
		 
		/*ARABIC SUKUN + KASRA*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1618) + String.valueOf((char)1616), String.valueOf((char)1616)));
		 
		/*ARABIC LETTER LAM + ALEF + ALEF*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1604) + String.valueOf((char)1575) + String.valueOf((char)1575), String.valueOf((char)1604) + String.valueOf((char)1575) + String.valueOf((char)1569)));
		 
		/*HYPHEN + ARABIC LETTER FARSI YEH + WAW*/textArea_1.setText(textArea_1.getText().replaceAll("-" + String.valueOf((char)1608) + String.valueOf((char)1618), "-" + String.valueOf((char)1608)));
		 
		/*ARABIC LETTER FARSI YEH + WAW + ALEF*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1608) + String.valueOf((char)1618) + String.valueOf((char)1575), String.valueOf((char)1608) + String.valueOf((char)1575)));
		 
		/*(﴿)ORNATE RIGHT PARENTHESIS*/textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)64831), String.valueOf((char)64831)));
		 
		/*(﴿)ORNATE RIGHT PARENTHESIS + SYRIAC ESASA ABOVE + SPACE*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)64831) + String.valueOf((char)1853) + " ", String.valueOf((char)64831) + String.valueOf((char)1853)));
		 
		/*ARABIC LETTER FARSI YEH + WAW + SUKUN*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1740) + String.valueOf((char)1608) + String.valueOf((char)1618), String.valueOf((char)1740) + String.valueOf((char)1608)));
		 
		/*SPACE + ARABIC LETTER KEHEH + KASRA + SPACE*/textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1705) + String.valueOf((char)1616) + " ", " " + String.valueOf((char)1705) + String.valueOf((char)1616) + String.valueOf((char)1729) + " "));
		 
		/*SPACE + ARABIC LETTER SEEN + HEH GOAL + DAMMA + NOON GHUNNA + SPACE*/textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1587) + String.valueOf((char)1729) + String.valueOf((char)1615) + String.valueOf((char)1722) + " ", " " + String.valueOf((char)1587) + String.valueOf((char)1614) + String.valueOf((char)1608) + String.valueOf((char)1606) + String.valueOf((char)1618) + String.valueOf((char)1729) + " "));
		 
		/*ARABIC LETTER YEH WITH HAMZA ABOVE + KASRA + FARSI YEH + SPACE*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1574) + String.valueOf((char)1616) + String.valueOf((char)1740) + " ", String.valueOf((char)1574) + " "));
		 
		/*ARABIC LETTER HEH GOAL + DAMMA + KEHEH + MEEM*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1729) + String.valueOf((char)1615) + String.valueOf((char)1705) + String.valueOf((char)1605), String.valueOf((char)1581) + String.valueOf((char)1615) + String.valueOf((char)1705) + String.valueOf((char)1605)));
		 
		/*ARABIC LETTER WAW + SUKUN + YEH BARREE + SPACE*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1608) + String.valueOf((char)1618) + String.valueOf((char)1746) + " ", String.valueOf((char)1608) + String.valueOf((char)1746) + " "));
		 
		/*ARABIC LETTER WAW + SUKUN + YEH BARREE*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1608) + String.valueOf((char)1618) + String.valueOf((char)1746), String.valueOf((char)1608) + String.valueOf((char)1746)));
		 
		/*SPACE + ARABIC LETTER YEH BARREE WITH HAMZA ABOVE + SPACE*/textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)1747) + " ", " " + String.valueOf((char)1575) + String.valueOf((char)1746) + " "));
		 
		/*ARABIC LETTER LAM + SHADDA + ALEF + SPACE*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1604) + String.valueOf((char)1617) + String.valueOf((char)1575) + " ", String.valueOf((char)1604) + String.valueOf((char)1617) + String.valueOf((char)1729) + " "));
		 
		/*ARABIC KASRA + ALEF MAKSURA + ALEF + TEH + SPACE*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1616) + String.valueOf((char)1609) + String.valueOf((char)1575) + String.valueOf((char)1578) + " ", String.valueOf((char)1616) + String.valueOf((char)1740) + String.valueOf((char)1574) + String.valueOf((char)1578) + " "));
		 
		/*ARABIC LETTER BEH + HEH DOACHASHMEE + ALEF + ALEF + SPACE*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1576) + String.valueOf((char)1726) + String.valueOf((char)1575) + String.valueOf((char)1575) + " ", String.valueOf((char)1576) + String.valueOf((char)1726) + String.valueOf((char)1575) + String.valueOf((char)1643) + " "));
		 
		/*ARABIC LETTER YEH WITH HAMZA ABOVE + DAMMA + NOON + SPACE*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)1574) + String.valueOf((char)1615) + String.valueOf((char)1722) + " ", String.valueOf((char)1574) + String.valueOf((char)1615) + String.valueOf((char)1608) + String.valueOf((char)1722) + " "));
		
		/*GURMUKHI SIGN VIRAMA*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2637), ""));
		 
		/**/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2641), ""));
		 
		/*GURMUKHI SIGN NUKTA*/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2620), ""));
		 
		/**/textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)2677), ""));
		 
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
		 
		textArea_1.setText(textArea_1.getText().replaceAll("L",""));
		 
		textArea_1.setText(textArea_1.getText().replaceAll(" !","!"));
		 
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
		 
		textArea_1.setText(textArea_1.getText().replaceAll(" " + String.valueOf((char)94) + String.valueOf((char)2602), String.valueOf((char)94) + String.valueOf((char)2602)));
		
		textArea_1.setText(textArea_1.getText().replaceAll(String.valueOf((char)94) + String.valueOf((char)2602) + " ", String.valueOf((char)94) + String.valueOf((char)2602)));
	
	    return;
    }   
       
    
	/** intialize method consisting of all the design with its size, location, image icons or fonts...
	 * initialize method is called at the top of constructor to create the design of project
	 * @throws IOException */
	private void initialize() throws IOException
	{
	
	try
	{
    	frame = new JFrame("Punjabi(Raavi) to Urdu(Urdu)");
    	frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Main2.class.getResource("/img/logo with background.png")));
    	frame.setTitle("Gurmukhi(Raavi) to Shahmukhi(Urdu)");
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
		textArea.setFont(new Font("Raavi", Font.PLAIN, 30));
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
	
		JButton drtu =new JButton("DRC to GIST");
		drtu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main1 m1;
				try {
					m1 = new Main1();
					m1.frame.setVisible(true);
					frame.setVisible(false);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		drtu.setBounds(480, 0, 60, 22);
		
		drtu.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		drtu.setBackground(UIManager.getColor("Button.background"));
		
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
	    		textArea.setFont(new Font("Raavi", Font.PLAIN, new Integer(""+fontSize.getSelectedItem())));
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
	    toolbar4.setBounds(360, 0, 300, 26);
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
        back.setBorder(new EmptyBorder(new Insets(0,6,0,6)));
        toolbar4.add(drtu);
       drtu.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
              
	    
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
					File dir = new File(userhome + "/Documents/Urdu_Files(Raavi to Urdu)");
					if(!dir.exists())
					{
						dir.mkdir();
					}
					else
					{
						fc = new JFileChooser(userhome +"/Documents/Urdu_Files(Raavi to Urdu)");
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
					File dir = new File(userhome + "/Documents/Macro_Files(Raavi to Urdu)");
					if(!dir.exists())
					{
						JOptionPane.showMessageDialog(null, "Currently No Macros are available.");
						return;
					}
					else
					{
						fc = new JFileChooser(userhome +"/Documents/Macro_Files(Raavi to Urdu)");
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
        JMenuItem mntmView = new JMenuItem("DRChatrikWeb  To  GIST", icon1);
		mntmView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if(textArea_1.getText().length() < 1 && textArea.getText().length() < 1)
					{
						Main1 m2;
						m2 = new Main1();
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
