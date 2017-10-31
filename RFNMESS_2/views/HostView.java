package views;

import java.io.IOException;

import gui.HostCenterGrid;
import gui.HostRight;
import javafx.application.*;
import javafx.collections.*;
import javafx.css.*;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class HostView implements views.View {
	
	private Node left,right,center,bottom;
	
	public HostView(){
		
	
		HostCenterGrid gp = new HostCenterGrid();
		this.center = gp;
		
		/*
		 * this is for the right side of the border pane
		 */
		
		HostRight vb = new HostRight();
		this.right = vb;
		
		
	}

	/* (non-Javadoc)
	 * @see views.View#getLeft()
	 */
	public Node getLeft() {
		// TODO Auto-generated method stub
		
		return this.left;
	}

	/* (non-Javadoc)
	 * @see views.View#getRight()
	 */
	public Node getRight() {
		// TODO Auto-generated method stub
		return this.right;
	}

	/* (non-Javadoc)
	 * @see views.View#getCenter()
	 */
	public Node getCenter() {
		// TODO Auto-generated method stub
		return this.center;
	}

	/* (non-Javadoc)
	 * @see views.View#getBottom()
	 */
	public Node getBottom() {
		// TODO Auto-generated method stub
		return this.bottom;
	}

	@Override
	public <T extends Event> void addEventHandler(EventType<T> eventType, EventHandler<? super T> eventHandler) {
		this.center.addEventHandler(eventType, eventHandler);
	}
}