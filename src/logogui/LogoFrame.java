package logogui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Enumeration;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import logoparsing.LogoLexer;
import logoparsing.LogoParser;
import logoparsing.LogoParser.ProgrammeContext;
import logoparsing.LogoTreeVisitor;

public class LogoFrame extends JFrame {
	private int SIZE = 1000, // for clearing view
	            X = 1400, Y = 1000;
	private Dimension buttonDimension = new Dimension(150,10);
    private String title = "Logo Frame";
	private static final long serialVersionUID = 1L;

	// Panels
	private JPanel jContentPane = null;   // global panel
	private JPanel jControlPane = null;   // panel with buttons and log area
	private JSplitPane jlogoSplitPane = null; // split panel with logo program and display
	private JPanel jLogoPane = null;      // panel for graphic view
	private JScrollPane jProgScrollPane = null; // scroll pane for logo program
	private JScrollPane jLogPane = null;        // panel with log area
	private JSplitPane jSplitASTPane = null;    // split pane with ast and graphic view
	private JScrollPane jScrollASTPane = null;  // panel with AST tree
	private JTabbedPane jTabDisplayPane = null; // tabbed pane with ast and graphic view 
	private JPanel jTreeViewPane = null; // pane for tree and slider
	private JSlider scaleSlider = null;  // slider for resizing tree viewer
	private JButton jRunButton = null;
	private JButton jClearButton = null;
	private JButton jClearLogButton = null;
	private JButton jChangeButton = null;

	private JTextArea jProgramArea = null;
	private JTextArea jLogArea = null;
	private TreeViewer viewer = null;
	private boolean tabbedview = true;
	
	
	
	/**
	 * This is the default constructor
	 */
	public LogoFrame() {
		super();
		initialize();
	}

	private boolean isViewVisible() {
	  return
	    tabbedview && getJTabDisplayPanel().getSelectedComponent() == getJLogoPane()
	    || !tabbedview;
	}
	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(X,Y);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(getJContentPane());
		this.setTitle(title);
		Log.getInstance().setLogZone(getJLogArea());
		initFrameSize();
		this.setVisible(true);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private void initComponents() {
		 GroupLayout layout = new GroupLayout(jContentPane);
		 jContentPane.setLayout(layout);
		 
		 // Turn on automatically adding gaps between components
		 layout.setAutoCreateGaps(true);
		 
		 // Turn on automatically creating gaps between components that touch
		 // the edge of the container and the container.
		 layout.setAutoCreateContainerGaps(true);
		 // Create a sequential group for the horizontal axis.
		 
		 GroupLayout.ParallelGroup hGroup = layout.createParallelGroup();
		 hGroup.addComponent(getJlogoSplitPane());
		 hGroup.addComponent(getJControlPane());
		 layout.setHorizontalGroup(hGroup);
		   
		 // Create a sequential group for the vertical axis.
		 GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
		 vGroup.addComponent(getJlogoSplitPane());
		 vGroup.addComponent(getJControlPane());
		 layout.setVerticalGroup(vGroup);
	}
	
	private void initControlComponents() {
		 GroupLayout layout = new GroupLayout(jControlPane);
		 jControlPane.setLayout(layout);
		 jControlPane.setName("Control");
		 //JLabel fakeLabel = new JLabel("   ");
		 // Turn on automatically adding gaps between components
		 layout.setAutoCreateGaps(true);
		 
		 // Turn on automatically creating gaps between components that touch
		 // the edge of the container and the container.
		 layout.setAutoCreateContainerGaps(true);
		 // Create a sequential group for the horizontal axis.
		 
		 GroupLayout.ParallelGroup hButtonGroup = layout.createParallelGroup(Alignment.LEADING);
		 hButtonGroup.addComponent(getJRunButton(),0, GroupLayout.DEFAULT_SIZE, buttonDimension.width)
		              .addComponent(getJClearButton(),0, GroupLayout.DEFAULT_SIZE, buttonDimension.width)
		              .addComponent(getJClearLogButton(),0, GroupLayout.DEFAULT_SIZE, buttonDimension.width)
		              .addComponent(getJChangeButton(),0, GroupLayout.DEFAULT_SIZE, buttonDimension.width);
		   
		 GroupLayout.SequentialGroup vButtonGroup = layout.createSequentialGroup();
		 vButtonGroup.addComponent(getJRunButton());
		 vButtonGroup.addComponent(getJClearButton());
		 vButtonGroup.addComponent(getJClearLogButton());
		 vButtonGroup.addComponent(getJChangeButton());
		  
		 GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
		 hGroup.addGroup(hButtonGroup);
		 hGroup.addComponent(getJLogPane());
		 
		 GroupLayout.ParallelGroup vGroup = layout.createParallelGroup();
		 vGroup.addGroup(vButtonGroup);
		 vGroup.addComponent(getJLogPane());
		 
		 layout.setHorizontalGroup(hGroup);
		 layout.setVerticalGroup(vGroup);
	}
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			initComponents();
		}
		return jContentPane;
	}

	private JSplitPane getJlogoSplitPane() {
		if (jlogoSplitPane == null) {
			jlogoSplitPane = new JSplitPane();
			jlogoSplitPane.setPreferredSize(new Dimension(800, 900));
			jlogoSplitPane.setLeftComponent(getJProgScrollPane());
			jlogoSplitPane.setRightComponent(getJTabDisplayPanel());
			jlogoSplitPane.setDividerLocation(230);	
		}
		return jlogoSplitPane;
	}

	private JPanel getJLogoPane() {
		if (jLogoPane == null) {
			jLogoPane = new JPanel();
		}
		return jLogoPane;
	}

	private JScrollPane getJProgScrollPane() {
		if (jProgScrollPane == null) {
			jProgScrollPane = new JScrollPane();
			jProgScrollPane.setViewportView(getJProgramArea());
		}
		return jProgScrollPane;
	}
	
	public JPanel getjTreeViewPane() {
		if (jTreeViewPane == null) {
			jTreeViewPane = new JPanel();
			jTreeViewPane.setLayout(new BorderLayout(0,0));
			jTreeViewPane.add(getJScrollASTPane(), BorderLayout.CENTER);
			JPanel bottomPanel = new JPanel(new BorderLayout(2,2));
			//int sliderValue = (int) ((viewer.getScale()-1.0) * 1000);
			int sliderValue = (int) ((1.5-1.0) * 1000);
			scaleSlider = new JSlider(JSlider.HORIZONTAL,
					  -999,1000,sliderValue);
             scaleSlider.addChangeListener(
                new ChangeListener() {
                  @Override
                    public void stateChanged(ChangeEvent e) {
                      int v = scaleSlider.getValue();
                       if (viewer != null)
                    	  viewer.setScale(v / 1000.0 + 1.0);
                     }
                 }
              );
             bottomPanel.add(scaleSlider, BorderLayout.CENTER);

			 jTreeViewPane.add(bottomPanel, BorderLayout.SOUTH);
		}
		return jTreeViewPane;
	}

	private void initFrameSize() {
   		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
   		int xwin = getSize().width;
   		int ywin = getSize().height;
   		setBounds((screenSize.width-xwin)/2, (screenSize.height-ywin)/2, xwin, ywin);
   	}

	private JButton getJRunButton() {
		if (jRunButton == null) {
			jRunButton = new JButton();
			jRunButton.setName("run");
			jRunButton.setText("Exécute ...");
			jRunButton.setPreferredSize(buttonDimension);
			jRunButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					runParser();
				}
			});
		}
		return jRunButton;
	}
	public JButton getJClearButton() {
		if (jClearButton == null) {
			jClearButton = new JButton();
			jClearButton.setName("clear");
			jClearButton.setText("Efface Vue");
			jClearButton.setPreferredSize(buttonDimension);
			jClearButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					clearDisplay();
				}
			});
		}
		return jClearButton;
	}
	public JButton getJClearLogButton() {
		if (jClearLogButton == null) {
			jClearLogButton = new JButton();
			jClearLogButton.setName("ClearLog");
			jClearLogButton.setText("Efface Log");
			jClearLogButton.setPreferredSize(buttonDimension);
			jClearLogButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					clearLog();
				}
			});
		}
		return jClearLogButton;
	}

	private JButton getJChangeButton() {
		if (jChangeButton == null) {
			jChangeButton = new JButton();
			jChangeButton.setName("Change");
			jChangeButton.setText("Change Vue");
			jChangeButton.setPreferredSize(buttonDimension);
			jChangeButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					permuteDisplay();
				}
			});
		}
		return jChangeButton;
	}


	/**
	 * This method initializes jProgramArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJProgramArea() {
		if (jProgramArea == null) {
			jProgramArea = new JTextArea();
		}
		return jProgramArea;
	}
	private JTextArea getJLogArea() {
		if (jLogArea == null) {
			jLogArea = new JTextArea();
		}
		return jLogArea;
	}
	private JScrollPane getJLogPane() {
		if (jLogPane == null) {
			jLogPane = new JScrollPane();
			jLogPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Log", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
			jLogPane.setViewportView(getJLogArea());
		}
		return jLogPane;
	}
	private void runParser() {
	  String program = getJProgramArea().getText();
	  if (program.length() > 1 ) {
		try {
		   // lexer	
		   ANTLRInputStream str = new ANTLRInputStream(program);
		   LogoLexer lexer = new LogoLexer(str);
		   
		   // parser
		   CommonTokenStream tokens = new CommonTokenStream(lexer);
		   LogoParser parser = new LogoParser(tokens);
	       
	       //boolean cont = parser.getValide(); 
	
	       		   
		   ProgrammeContext tree = parser.programme(); 
		   
		  
		   viewer = new TreeViewer(parser, tree);
		   int sliderValue = (int) ((viewer.getScale()-1.0) * 1000);
			scaleSlider.setValue(sliderValue);
			//viewer.open();
		    getJScrollASTPane().setViewportView(viewer);
		   
		  // getJASTTree().setModel(new ASTtoTreeModelAdapter(tree));
		  // expandAll();
	       LogoTreeVisitor visitor = new LogoTreeVisitor();
	       visitor.initialize(getJLogoPane().getGraphics());
	       visitor.visit(tree);
		
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	  }
	  else {Log.appendnl("Pas de programme");}
	}

	
	/**
	 * This method initializes jSplitASTPane	
	 * 	
	 * @return javax.swing.JSplitPane	
	 */
	private JSplitPane getJSplitASTPane() {
		if (jSplitASTPane == null) {
			jSplitASTPane = new JSplitPane();
			jSplitASTPane.setDividerLocation(150);
			jSplitASTPane.setLeftComponent(getjTreeViewPane());
			jSplitASTPane.setRightComponent(getJLogoPane());
		}
		return jSplitASTPane;
	}


	/**
	 * This method initializes jScrollASTPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollASTPane() {
		if (jScrollASTPane == null) {
			jScrollASTPane = new JScrollPane();
			

			//jScrollASTPane.setViewportView(getJASTTree());
		}
		return jScrollASTPane;
	}


	/**
	 * This method initializes jASTTree	
	 * 	
	 * @return javax.swing.JTree	
	 */
	
	private JTabbedPane getJTabDisplayPanel() {
		if (jTabDisplayPane == null) {
			jTabDisplayPane = new JTabbedPane();
			jTabDisplayPane.setTabPlacement(JTabbedPane.BOTTOM);
			jTabDisplayPane.add("arbre",getjTreeViewPane());
			jTabDisplayPane.add("Vue",getJLogoPane());
		}
		return jTabDisplayPane;
	}
	/*private TreeModel getDefaultTreeModel() {
		return new ASTtoTreeModelAdapter(null);
	}
*/

	public JPanel getJControlPane() {
		if (jControlPane == null) {
		  jControlPane = new JPanel();
  		  jControlPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contrôle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
		  initControlComponents();
		}
		return jControlPane;
	}

    private void clearDisplay() {
    	Graphics g = getJLogoPane().getGraphics();
    	if (isViewVisible()) {
		  g.clearRect(0, 0, SIZE, SIZE);
    	}
    }
    private void clearLog() {
    	getJLogArea().setText("");
    }
    
    
    private void permuteDisplay() {
    	if (tabbedview) {
    		jSplitASTPane = null;
    		getJlogoSplitPane().setRightComponent(getJSplitASTPane()); 		
    	}
    	else {
    		jTabDisplayPane = null;
    		getJlogoSplitPane().setRightComponent(getJTabDisplayPanel());
    	}
    	getJlogoSplitPane().setDividerLocation(0.20);
    	tabbedview = !tabbedview;
    }
}
