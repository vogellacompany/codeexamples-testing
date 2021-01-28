//package com.vogella.junit5;
//
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.events.SelectionAdapter;
//import org.eclipse.swt.events.SelectionEvent;
//import org.eclipse.swt.layout.GridData;
//import org.eclipse.swt.layout.GridLayout;
//import org.eclipse.swt.widgets.Button;
//import org.eclipse.swt.widgets.Display;
//import org.eclipse.swt.widgets.Shell;
//
//public class Snippet1 {
//
//public static void main (String [] args) {
//	Display display = new Display ();
//	Shell shell = new Shell(display);
//	GridLayout gridLayout = new GridLayout(1, false);
//	shell.setLayout(gridLayout);
//	Button button = new Button(shell, SWT.PUSH);
//	button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
//	button.setText("Hello"
//			+ "");
//	button.addSelectionListener(new SelectionAdapter() {
//		@Override
//		public void widgetSelected(SelectionEvent e) {
//			
//		}
//	});
//	
//	shell.setText("Snippet 1");
//	shell.open ();
//	while (!shell.isDisposed ()) {
//		if (!display.readAndDispatch ()) display.sleep ();
//	}
//	display.dispose ();
//}
//}
