import javax.swing.JFrame;
public class ApplicationWindow extends JFrame
{

	public ApplicationWindow()
	{
		add(new Board());
		setSize(600,600);
		setTitle("Trash");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Opens windows in the middle of the screen
        setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		ApplicationWindow mainWindow = new ApplicationWindow();
		mainWindow.setVisible(true);
	}

}
