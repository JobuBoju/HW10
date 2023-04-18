import javax.swing.*;
import java.awt.event.*;

public class ProgramReview extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton goodButton;
    private JButton badButton;
    
    public ProgramReview() {
        setTitle("Program Review");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        goodButton = new JButton("Good Program");
        badButton = new JButton("Bad Program");
        
        JPanel panel = new JPanel();
        panel.add(goodButton);
        panel.add(badButton);
        add(panel);
        
        goodButton.addActionListener(this);
        badButton.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == goodButton) {
            System.out.println("This user has reviewed this program as a Good Program");
            System.exit(0);
        } else if (e.getSource() == badButton) {
            System.out.println("This user has reviewed this program as a Bad Program");
            System.exit(0);
        }
    }
}
