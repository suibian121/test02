import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class test extends Frame {

	public static void main(String[] args) {

		Frame f = new Frame(); //��ʼ��һ�����ɼ���Frame��ʵ��

		f.setTitle("��һ����������");//���ô��ڱ���
		f.setSize(500, 400);//���ô��ڴ�С
		f.setLocation(300, 200);//���ô���λ��
		f.setVisible(true);//���ô��ڿɼ�
		f.setLayout(new FlowLayout());//���ô���Ϊ��ʽ����

		Button b = new Button("��ť");
		f.add(b);

		//���ڹر��¼�
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		});

	}

}