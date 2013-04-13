package logogui;

import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class LogoPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * This is the default constructor
	 */
	public LogoPanel() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vue", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
		this.setSize(600, 400);
		this.setLayout(new GridBagLayout());
	}

}
