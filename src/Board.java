import java.awt.*;
import javax.swing.*;
public class Board extends JFrame {
	JPanel panel;
	public static void main(String[] args) {
		System.out.println("Test");
		Board b = new Board();
		b.setVisible(true);
	}
	public Board()
	{
		setTitle("Trash");
		setSize(400,400);
		setResizable(false);
		panel = new JPanel();
		panel.setBackground(Color.BLUE);
		add(panel);
	}
}
