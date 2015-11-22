package View;

import javax.swing.JFrame;

import Controller.ControllerMain;

public class ViewMain extends JFrame {
	
	public ViewMain()
	{
		super("Inventory");
		setLayout(null);
		setSize(600,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{ 	
		ControllerMain cm = new ControllerMain();
		ViewMain jf = new ViewMain();
		//Подумать насчет панелей
		jf.add(cm.ggTask());
		jf.add(cm.ggPCFromStorage());
		jf.add(cm.ggPCToStorage());
		jf.add(cm.ggChangePC());
		jf.add(cm.ggNo());
		jf.add(cm.ggInput());
		jf.add(cm.ggPCFromStorageOk1());
		jf.add(cm.ggPCToStorageOk1());
		jf.add(cm.ggChangePCOk1());
		jf.add(cm.ggTask2());
		jf.setVisible(true);
		//jf.pack();
	} 
	
	
	

}
