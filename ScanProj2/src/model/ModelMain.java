package model;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ModelMain {
	
	private JLabel Task;
	private JLabel Task2;
	private JButton PCFromStorage;
	private JButton PCFromStorageOk1;
	private JButton PCToStorage;
	private JButton PCToStorageOk1;
	private JButton ChangePC;
	private JButton ChangePCOk1;
	private JButton No;
	private JTextField Input;
	private int i;
	private String Answer = "";
	
	
	public JLabel getTask2() {
		return Task2;
	}

	public void setTask2(JLabel task2) {
		Task2 = task2;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public JTextField getInput() 
	{
		return Input;
	}

	public void setInput(JTextField input) {
		Input = input;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public JButton getPCFromStorage() {
		return PCFromStorage;
	}

	public void setPCFromStorage(JButton pCFromStorage) {
		PCFromStorage = pCFromStorage;
	}

	public JButton getPCToStorage() {
		return PCToStorage;
	}

	public void setPCToStorage(JButton pCToStorage) {
		PCToStorage = pCToStorage;
	}

	public JButton getChangePC() {
		return ChangePC;
	}

	public void setChangePC(JButton changePC) {
		ChangePC = changePC;
	}

	public JButton getNo() {
		return No;
	}

	public void setNo(JButton no) {
		No = no;
	}

	public JLabel getTask() {
		return Task;
	}

	public void setTask(JLabel task) {
		Task = task;
	}

	public JButton getPCFromStorageOk1() {
		return PCFromStorageOk1;
	}

	public void setPCFromStorageOk1(JButton pCFromStorageOk1) {
		PCFromStorageOk1 = pCFromStorageOk1;
	}


	public JButton getPCToStorageOk1() {
		return PCToStorageOk1;
	}

	public void setPCToStorageOk1(JButton pCToStorageOk1) {
		PCToStorageOk1 = pCToStorageOk1;
	}
	
	public JButton getChangePCOk1() {
		return ChangePCOk1;
	}

	public void setChangePCOk1(JButton changePCOk1) {
		ChangePCOk1 = changePCOk1;
	}


	
}
