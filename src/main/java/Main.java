import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        setTitle("Window");

        setSize(800, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String[] args) {
        Main ventana = new Main();
    }
}