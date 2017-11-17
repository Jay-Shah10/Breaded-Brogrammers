/**
 * 
 */
package gui;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

/**
 * @author nryle
 *
 */
public class SearchBox extends HBox {
	private TextField 	textBox;
	private Button		searchButton;
	/**
	 * 
	 */
	public SearchBox() {
		// TODO Auto-generated constructor stub
		this.getStyleClass().add("searchBox");
		
		textBox = new TextField();
		textBox.getStyleClass().add("tBox");
		this.getChildren().add(textBox);
		textBox.setPrefHeight(getMaxHeight());
		setHgrow(textBox, Priority.ALWAYS);
		
		searchButton = new Button("Search");
		searchButton.getStyleClass().add("btn");
		this.getChildren().add(searchButton);
		searchButton.setPrefHeight(getMaxHeight());
		
		searchButton.setOnAction(
			(event) -> {
				if(searchButton.getStyleClass().contains("selected")) 
					searchButton.getStyleClass().remove("selected");
				else 
					searchButton.getStyleClass().add("selected");
			}
			
		);
	}

}