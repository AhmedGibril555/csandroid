package application;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Main extends Pane
{
	public Main()
	{
		paintcal();
	}
    private final FlowPane pane =new FlowPane();
    TextArea textArea =new TextArea();
    Button btn1 =new Button("1");
    Button btn2 =new Button("2");
    Button btn3 =new Button("3");
    Button btn4 =new Button("4");
    Button btn5 =new Button("5");
    Button btn6 =new Button("6");
    Button btn7 =new Button("7");
    Button btn8 =new Button("8");
    Button btn9 =new Button("9");
    Button btn0 =new Button("0");
    Button btnremainder =new Button("%");
    Button btndot =new Button(".");
    Button btnequal =new Button("=");
    Button btnmul =new Button("x");
    Button btndiv =new Button("/");
    Button btnsub =new Button("-");
    Button btnadd =new Button("+");
    Button btnsquare =new Button("x²");
    Button btnpr1 =new Button("(");
    Button btnpr2 =new Button(")");
    Button btn111 =new Button("⌂");
    Button btnenter =new Button("◄");
    Button btnroot =new Button("√");
    HBox v0 =new HBox(textArea);
    HBox v2 =new HBox(15,btn7,btn8,btn9,btnsub,btndiv);
    HBox v3 =new HBox(15,btn4,btn5,btn6,btnadd,btnmul);
    HBox v4 =new HBox(15,btn1,btn2,btn3,btnsquare,btnroot);
    HBox v5 =new HBox(15,btn0,btndot,btnremainder,btnpr1,btnpr2);
    HBox v6 =new HBox(15,btnequal,btnenter,btn111);
    
    private void paintcal()
    {
        
        v2.setPadding(new Insets(2,1,2,5));
        v3.setPadding(new Insets(2,1,2,5));
        v4.setPadding(new Insets(2,1,2,5));
        v5.setPadding(new Insets(2,1,2,5));
        v6.setPadding(new Insets(2,1,2,5));
        int x =40 ;
        btn1.setPrefHeight(x);
        btn2.setPrefHeight(x);
        btn3.setPrefHeight(x);
        btn4.setPrefHeight(x);
        btn5.setPrefHeight(x);
        btn6.setPrefHeight(x);
        btn7.setPrefHeight(x);
        btn8.setPrefHeight(x);
        btn9.setPrefHeight(x);
        btn0.setPrefHeight(x);
        btnmul.setPrefHeight(x);
        btnadd.setPrefHeight(x);
        btndiv.setPrefHeight(x);
        btnsub.setPrefHeight(x);
        btn111.setPrefHeight(x);
        btnenter.setPrefHeight(x);
        btnequal.setPrefHeight(x);
        btnremainder.setPrefHeight(x);
        btndot.setPrefHeight(x);
        btnpr1.setPrefHeight(x);
        btnpr2.setPrefHeight(x);
        btnroot.setPrefHeight(x);
        btnsquare.setPrefHeight(x);
        btn1.setStyle("-fx-background-radius:25;-fx-background-color:white;-fx-text-fill:black;");
        btn2.setStyle("-fx-background-radius:25;-fx-background-color:white;-fx-text-fill:black;");
        btn3.setStyle("-fx-background-radius:25;-fx-background-color:white;-fx-text-fill:black;");
        btn4.setStyle("-fx-background-radius:25;-fx-background-color:white;-fx-text-fill:black;");
        btn5.setStyle("-fx-background-radius:25;-fx-background-color:white;-fx-text-fill:black;");
        btn6.setStyle("-fx-background-radius:25;-fx-background-color:white;-fx-text-fill:black;");
        btn7.setStyle("-fx-background-radius:25;-fx-background-color:white;-fx-text-fill:black;");
        btn8.setStyle("-fx-background-radius:25;-fx-background-color:white;-fx-text-fill:black;");
        btn9.setStyle("-fx-background-radius:25;-fx-background-color:white;-fx-text-fill:black;");
        btn0.setStyle("-fx-background-radius:25;-fx-background-color:white;-fx-text-fill:black;");
        btndot.setStyle("-fx-background-radius:25;-fx-background-color:white;-fx-text-fill:black;");
        btnremainder.setStyle("-fx-background-radius:25;-fx-background-color:white;-fx-text-fill:black;");
        int y =30 ;
        btn1.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btn2.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btn3.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btn4.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btn5.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btn6.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btn7.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btn8.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btn9.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btn0.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btndot.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btnequal.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btnremainder.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btnsub.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btnmul.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btndiv.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btnadd.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btnroot.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btnsquare.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btn111.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btnenter.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btnpr1.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        btnpr2.setFont( Font.font("Times New Roman",FontWeight.BOLD,y));
        textArea.setFont(Font.font("Times new Roman",FontWeight.BOLD,y));
        btnpr1.setStyle("-fx-background-color:gray");
    	btnpr2.setStyle("-fx-background-color:gray");
        btnroot.setStyle("-fx-background-color:gray");
    	btnsquare.setStyle("-fx-background-color:gray");
    	btnadd.setStyle("-fx-background-color:gray");
    	btnsub.setStyle("-fx-background-color:gray");
    	btnmul.setStyle("-fx-background-color:gray");
    	btndiv.setStyle("-fx-background-color:gray");
    	btnequal.setStyle("-fx-background-color:orange");
    	btnenter.setStyle("-fx-background-color:red");
    	btn111.setStyle("-fx-background-color:red");
    	this.setStyle("-fx-border-color:blue");
    	pane.setStyle("-fx-background-color:black;");
    	pane.setPadding(new Insets(5,15,20,5));
    	pane.setHgap(10);
    	pane.setVgap(21);
        pane.setPrefWidth(360);
    	pane.getChildren().addAll(v0,v2,v3,v4,v5,v6);
    	btnequal.setPrefWidth(195);
        textArea.setPrefSize(345,210);
        textArea.setEditable(false);
        textArea.setStyle("-fx-border-color:silver;-fx-border-style:solid;-fx-border-width:15px;");
    	this.getChildren().add(pane);
    }






}