import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class test {
    public static void main (String [] args) {
        test_Frame tf = new test_Frame();
    }
}
class test_Frame extends JFrame implements ActionListener{
    JButton jbt = new JButton("왼쪽");
    JButton jbt2 = new JButton("오른쪽");
    test_Frame2 tf2;
    public test_Frame(){

        this.setLayout(new GridLayout(0,2));
        getContentPane().add(jbt);
        getContentPane().add(jbt2);

        this.setSize(1900,1080);
        this.setVisible(true);

        jbt.addActionListener(this);
        jbt2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        if(arg0.getSource() == jbt || arg0.getSource() == jbt2){
            tf2 = new test_Frame2(arg0.getActionCommand() + " 버튼을 누르셨군요!");
        }
    }
}

class test_Frame2 extends JDialog{
    JLabel jlb = new JLabel("");
    public test_Frame2(String str){
        getContentPane().add(jlb);

        jlb.setText(str.toString());

        this.setSize(1900,1080);
        this.setModal(true);
        this.setVisible(true);

    }
}
