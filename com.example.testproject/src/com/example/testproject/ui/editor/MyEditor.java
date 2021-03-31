package com.example.testproject.ui.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.part.FileEditorInput;

import com.example.testproject.ui.action.MyTestAction;

import org.eclipse.ui.PartInitException;
import org.eclipse.ui.contexts.IContextService;
import org.eclipse.ui.part.EditorPart;

public class MyEditor extends EditorPart {

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
//		if(!(input instanceof FileEditorInput)) {
//			throw new PartInitException("Editor input must be a workspace file");
//		}
		
		super.setInput(input);
		super.setSite(site);
	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		registerActions();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	
	protected void registerActions() {
		IContextService service = getSite().getService(IContextService.class);
		if(service == null) {
			return;
		}

		service.activateContext("com.example.testproject.editor.myContext");
		new MyTestAction();
	}

}
