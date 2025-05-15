package ToDoList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ToDoListGUI extends JFrame{
    
    JPanel panel = new JPanel();
    JCheckBox checkBox = new JCheckBox();
    JButton button = new JButton();
    JTextField textField = new JTextField("Enter a task");
    

    ToDoListGUI(){
    
        panel.add(checkBox);
        panel.add(textField);
        panel.add(bu)
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.setSize(500,500);
        this.setTitle("TO DO LIST");
    }

}
