package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import model.ModelMain;
import model.ModelStorageTable;

public class ControllerMain {
	
	ModelMain mm = new ModelMain();
	//Текст задания
	public JLabel ggTask()
	{
		JLabel WhatToDo = new JLabel ("Что вы хотите сделать?");
		WhatToDo.setBounds(100, 50, 700, 30); 
		mm.setTask(WhatToDo);
		return mm.getTask();
	}
	//Кнопки главного меню
	public JButton ggPCFromStorage()
	{
		JButton PCFS = new JButton ("Перенести ПК со склада");
		PCFS.setBounds(200, 150, 200, 30); 
		PCFS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	PCFromStorageAction();
            }
		});
		mm.setPCFromStorage(PCFS);
		return mm.getPCFromStorage();
	}
	public JButton ggPCToStorage()
	{
		JButton PCTS = new JButton ("Перенести ПК на склад");
		PCTS.setBounds(200, 250, 200, 30); 
		PCTS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	PCToStorageAction();
            }
		});
		mm.setPCToStorage(PCTS);
		return mm.getPCToStorage();
	}
	public JButton ggChangePC()
	{
		JButton CPC = new JButton ("Поменять ПК местами");
		CPC.setBounds(200, 350, 200, 30); 
		CPC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	ChangePCAction();
            }
		});
		mm.setChangePC(CPC);
		return mm.getChangePC();
	}
	//Действия кнопок главного меню
	public void PCFromStorageAction()
	{
		mm.setI(0);
		JLabel WhatToDo = new JLabel ();	
		WhatToDo = mm.getTask();
		WhatToDo.setText("Перенести ПК со склада");
		JButton Test = new JButton();
		Test = mm.getPCFromStorage();
		Test.setVisible(false);
		mm.setTask(WhatToDo);
		mm.setPCFromStorage(Test);
		Test = mm.getPCToStorage();
		Test.setVisible(false);
		mm.setPCToStorage(Test);
		Test = mm.getChangePC();
		Test.setVisible(false);
		mm.setChangePC(Test);
		Test = mm.getNo();
		Test.setVisible(true);
		mm.setNo(Test);
		Test = mm.getPCFromStorageOk1();
		Test.setVisible(true);
		mm.setPCFromStorageOk1(Test);
		//--------->
		JTextField jf = new JTextField();
		jf = mm.getInput();
		jf.setVisible(true);
		mm.setInput(jf);
		JLabel lb = mm.getTask2();
		lb.setText("Введите какой компьютер со склада будете переносить");
		lb.setVisible(true);
		mm.setTask2(lb);
        //PCToStorage.setVisible(false);
        //ChangePC.setVisible(false);
        //JTextField Task = new JTextField ("Введите какой компьютер со склада будете переносить");
        //Task.setBounds(200, 150, 200, 30);
        
        //JButton Ok = new JButton ("Ввод");
        //Ok.setBounds(200, 250, 80, 30);
	}
	public void PCToStorageAction()
	{
		mm.setI(0);
		JLabel WhatToDo = new JLabel ();	
		WhatToDo = mm.getTask();
		WhatToDo.setText("Перенести ПК на склад");
		JButton Test = new JButton();
		Test = mm.getPCFromStorage();
		Test.setVisible(false);
		mm.setTask(WhatToDo);
		mm.setPCFromStorage(Test);
		Test = mm.getPCToStorage();
		Test.setVisible(false);
		mm.setPCToStorage(Test);
		Test = mm.getChangePC();
		Test.setVisible(false);
		mm.setChangePC(Test);
		Test = mm.getNo();
		Test.setVisible(true);
		mm.setNo(Test);
		Test = mm.getPCToStorageOk1();
		Test.setVisible(true);
		mm.setPCToStorageOk1(Test);
		//--------->
				JTextField jf = new JTextField();
				jf = mm.getInput();
				jf.setVisible(true);
				mm.setInput(jf);
		JLabel lb = mm.getTask2();
		lb.setText("Введите какой компьютер на склад будете переносить");
		lb.setVisible(true);
		mm.setTask2(lb);
        //PCToStorage.setVisible(false);
        //ChangePC.setVisible(false);
        //JTextField Task = new JTextField ("Введите какой компьютер со склада будете переносить");
        //Task.setBounds(200, 150, 200, 30);
        
        //JButton Ok = new JButton ("Ввод");
        //Ok.setBounds(200, 250, 80, 30);
	}
	public void ChangePCAction()
	{
		mm.setI(0);
		JLabel WhatToDo = new JLabel ();	
		WhatToDo = mm.getTask();
		WhatToDo.setText("Поменять ПК местами");
		JButton Test = new JButton();
		Test = mm.getPCFromStorage();
		Test.setVisible(false);
		mm.setTask(WhatToDo);
		mm.setPCFromStorage(Test);
		Test = mm.getPCToStorage();
		Test.setVisible(false);
		mm.setPCToStorage(Test);
		Test = mm.getChangePC();
		Test.setVisible(false);
		mm.setChangePC(Test);
		Test = mm.getNo();
		Test.setVisible(true);
		mm.setNo(Test);
		Test = mm.getChangePCOk1();
		Test.setVisible(true);
		mm.setChangePCOk1(Test);
		//--------->
				JTextField jf = new JTextField();
				jf = mm.getInput();
				jf.setVisible(true);
				mm.setInput(jf);
		JLabel lb = mm.getTask2();
		lb.setText("Введите откуда хотите перенести ПК");
		lb.setVisible(true);
		mm.setTask2(lb);
        //PCToStorage.setVisible(false);
        //ChangePC.setVisible(false);
        //JTextField Task = new JTextField ("Введите какой компьютер со склада будете переносить");
        //Task.setBounds(200, 150, 200, 30);
        
        //JButton Ok = new JButton ("Ввод");
        //Ok.setBounds(200, 250, 80, 30);
	}
	//Введ данных
	public JTextField ggInput()
	{
		JTextField jf = new JTextField();
		jf.setBounds(200, 150, 200, 30);
		jf.setVisible(false);
		jf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	ggInputAction();
            }
        });
		mm.setInput(jf);
		return mm.getInput();
	}
	public void ggInputAction()
	{
		JTextField jf = new JTextField();
		jf.setVisible(true);
		mm.setInput(jf);
	}
	//Кнопка отмены
	public JButton ggNo()
	{
		JButton No = new JButton ("Отмена");
        No.setBounds(350, 250, 80, 30);
        No.setVisible(false);
        No.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	ggNoAction();
            }
        });
		mm.setNo(No);
		return mm.getNo();
	}
	//Действие кнопки отмены
	public void ggNoAction()
	{
		JButton Test = new JButton();
		Test = mm.getPCFromStorageOk1();
		Test.setVisible(false);
		mm.setPCFromStorageOk1(Test);
		Test = mm.getPCToStorageOk1();
		Test.setVisible(false);
		mm.setPCToStorageOk1(Test);
		Test = mm.getChangePCOk1();
		Test.setVisible(false);
		mm.setChangePCOk1(Test);
		Test = mm.getNo();
		Test.setVisible(false);
		mm.setNo(Test);
		JLabel TestL = new JLabel();
		TestL = mm.getTask();
		TestL.setText("Что вы хотите сделать?");
		mm.setTask(TestL);
		TestL = mm.getTask2();
		TestL.setVisible(false);
		mm.setTask2(TestL);
		Test = mm.getPCFromStorage();
		Test.setVisible(true);
		mm.setPCFromStorage(Test);
		Test = mm.getPCToStorage();
		Test.setVisible(true);
		mm.setPCToStorage(Test);
		Test = mm.getChangePC();
		Test.setVisible(true);
		mm.setChangePC(Test);
		//--------->
				JTextField jf = new JTextField();
				jf = mm.getInput();
				jf.setVisible(false);
				mm.setInput(jf);
		mm.setAnswer("");
	}
	//Кнопки после нажатия кнопок в меню
	public JButton ggPCFromStorageOk1()
	{
		JButton Ok = new JButton ("ОК");
		Ok.setBounds(200, 250, 80, 30);
		Ok.setVisible(false);
		Ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	ggAddString();
            	ggPCFromStorageOk1Action();
            	
            }
        });
		mm.setPCFromStorageOk1(Ok);
		return mm.getPCFromStorageOk1();
	}
	public void ggPCFromStorageOk1Action()
	{
		JLabel lb = mm.getTask2();
		
    	mm.setI(mm.getI()+1);
    	if (mm.getI()!=3)
    	{
    		if (mm.getI()==1)
    		{
    			lb.setText("Введите номер аудитории(куда переносим)");
    			lb.setVisible(true);
    			mm.setTask2(lb);
    		}
    		if (mm.getI()==2)
    		{
    			lb.setText("Введите номер компьютера(вместо какого переносим)");
    			lb.setVisible(true);
    			mm.setTask2(lb);
    		}
    	}
    	else
    	{
    		//сохранение в бд
    		String s = new String();
    		s = mm.getAnswer();
    		int k = 0;
    		String[] Data = new String[4];
    		for (int i=0;i<4;i++)
    		{
    			Data[i] = "";
    		}
    		//StringBuilder sb = new StringBuilder(s);
    		//sb.deleteCharAt(1);
    		for(int i = 0;i<s.length();i++)
    		{
    			if (s.charAt(i)!=' ')
    			{
    				Data[k] += s.charAt(i);
    			}
    			else {k++;}
    		}
    		
    		ModelStorageTable mst = new ModelStorageTable();
    		
    		mst.setAction("ПК со склада");
    		mst.setPcName1(Data[0]);
    		mst.setRoomTo(Data[1]);
    		mst.setPcName2(Data[2]);
    		Configuration configuration = new Configuration().configure();
    		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
    		applySettings(configuration.getProperties());
    		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
    		Session session = sessionFactory.openSession();
    		session.beginTransaction();
    		
    		session.save(mst);
    		session.getTransaction().commit();
    		session.close();
    		
    		ggNoAction();
    	}
	}
	public JButton ggPCToStorageOk1()
	{
		JButton Ok = new JButton ("ОК");
		Ok.setBounds(200, 250, 80, 30);
		Ok.setVisible(false);
		Ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	ggAddString();
            	ggPCToStorageOk1Action();
            }
        });
		mm.setPCToStorageOk1(Ok);
		return mm.getPCToStorageOk1();
	}
	public void ggPCToStorageOk1Action()
	{
		JLabel lb = mm.getTask2();
    	mm.setI(mm.getI()+1);
    	if (mm.getI()!=2)
    	{
    		if (mm.getI()==1)
    		{
    			lb.setText("Введите номер аудитории(куда переносим)");
    			lb.setVisible(true);
    			mm.setTask2(lb);
    		}
    	}
    	else
    	{
    		//сохранение в бд
    		String s = new String();
    		s = mm.getAnswer();
    		int k = 0;
    		String[] Data = new String[3];
    		for (int i=0;i<3;i++)
    		{
    			Data[i] = "";
    		}
    		//StringBuilder sb = new StringBuilder(s);
    		//sb.deleteCharAt(1);
    		for(int i = 0;i<s.length();i++)
    		{
    			if (s.charAt(i)!=' ')
    			{
    				Data[k] += s.charAt(i);
    			}
    			else {k++;}
    		}
    		
    		ModelStorageTable mst = new ModelStorageTable();
    		
    		mst.setAction("ПК на склад");
    		mst.setPcName1(Data[0]);
    		mst.setRoomFrom(Data[1]);
    		Configuration configuration = new Configuration().configure();
    		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
    		applySettings(configuration.getProperties());
    		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
    		Session session = sessionFactory.openSession();
    		session.beginTransaction();
    		
    		session.save(mst);
    		session.getTransaction().commit();
    		session.close();
    		
    		ggNoAction();
    	}
	}
	public JButton ggChangePCOk1()
	{
		JButton Ok = new JButton ("ОК");
		Ok.setBounds(200, 250, 80, 30);
		Ok.setVisible(false);
		Ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	ggAddString();
            	ggChangePCOk1Action();
            }
        });
		mm.setChangePCOk1(Ok);
		return mm.getChangePCOk1();
	}
	public void ggChangePCOk1Action()
	{
    	mm.setI(mm.getI()+1);
    	if (mm.getI()!=4)
    	{
//    		JButton Test = new JButton();
//    		Test = mm.getPCFromStorageOk1();
//    		mm.setPCFromStorageOk1(Test);
    		//сделать переменную для сохранения туда текста из jtextfield
    	}
    	else
    	{
    		//сохранение в бд
    		String s = new String();
    		s = mm.getAnswer();
    		int k = 0;
    		String[] Data = new String[5];
    		for (int i=0;i<5;i++)
    		{
    			Data[i] = "";
    		}
    		//StringBuilder sb = new StringBuilder(s);
    		//sb.deleteCharAt(1);
    		for(int i = 0;i<s.length();i++)
    		{
    			if (s.charAt(i)!=' ')
    			{
    				Data[k] += s.charAt(i);
    			}
    			else {k++;}
    		}
    		
    		ModelStorageTable mst = new ModelStorageTable();
    		
    		mst.setAction("Поменять ПК местами");
    		mst.setPcName1(Data[0]);
    		mst.setRoomTo(Data[1]);
    		mst.setPcName2(Data[2]);
    		mst.setRoomFrom(Data[3]);
    		Configuration configuration = new Configuration().configure();
    		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
    		applySettings(configuration.getProperties());
    		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
    		Session session = sessionFactory.openSession();
    		session.beginTransaction();
    		
    		session.save(mst);
    		session.getTransaction().commit();
    		session.close();
    		
    		ggNoAction();
    		ggNoAction();
    	}
	}
	//Добавление в бд
	public void ggAddString()
	{
		JTextField jf = mm.getInput();
		String s = mm.getAnswer() + jf.getText()+" ";
		mm.setAnswer(s);
	}
	public JLabel ggTask2()
	{
		JLabel lb = new JLabel();
		lb.setBounds(100, 300, 700, 30);
		lb.setVisible(false);
		mm.setTask2(lb);
		return mm.getTask2();
	}
	public static void main(String[] args) 
	{} 
	
}
