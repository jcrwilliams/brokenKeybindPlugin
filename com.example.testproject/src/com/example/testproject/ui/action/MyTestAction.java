package com.example.testproject.ui.action;

import com.example.testproject.Activator;
import org.eclipse.jface.action.Action;

public class MyTestAction extends Action {
	
	public MyTestAction() {
		setActionDefinitionId("com.example.testproject.myKeybindAction");
	}
	@Override
	public void run() {
		Activator.getDefault().log("In MyTestAction");
	}

}
