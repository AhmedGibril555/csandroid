package com.gluonapplication22;
//
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
public class BasicView extends View 
{
       boolean put=true;
       ComboBox<String>c=new ComboBox<>();
    public BasicView(String name) 
    {
        super(name);
    FlowPane pane =new FlowPane();
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
    Button btnmul =new Button("*");
    Button btndiv =new Button("/");
    Button btnsub =new Button("-");
    Button btnadd =new Button("+");
    Button btnsquare =new Button("pow(n)");
    Button btnpr1 =new Button("(");
    Button btnpr2 =new Button(")");
    Button btn111 =new Button("Clear");
    Button btnenter =new Button("x");
    Button btnroot =new Button("sqrt");
    HBox v0 =new HBox(textArea);
    HBox v2 =new HBox(15,btn7,btn8,btn9,btnsub,btndiv);
    HBox v3 =new HBox(15,btn4,btn5,btn6,btnadd,btnmul);
    HBox v4 =new HBox(15,btn1,btn2,btn3,btnsquare,btnroot);
    HBox v5 =new HBox(15,btn0,btndot,btnremainder,btnpr1,btnpr2);
    HBox v6 =new HBox(15,btnequal,btnenter,btn111);
    c.getItems().addAll("sin","cos","tan");
    c.setValue("Trigonometric function");
    /////////////////////////////////////////////////////////////function of design calculator 
  ///////////////////////////set padding 
        v2.setPadding(new Insets(2,1,2,5));
        v3.setPadding(new Insets(2,1,2,5));
        v4.setPadding(new Insets(2,1,2,5));
        v5.setPadding(new Insets(2,1,2,5));
        v6.setPadding(new Insets(2,1,2,5));
        ///////////////////// set height of button 
        btn1.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btn2.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btn3.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btn4.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btn5.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btn6.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btn7.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btn8.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btn9.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btn0.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btnmul.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btnadd.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btndiv.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btnsub.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btn111.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btnenter.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btnequal.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btndot.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btnpr1.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btnpr2.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btnroot.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btnsquare.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        btnremainder.prefWidthProperty().bind((widthProperty().divide(5)).subtract(50));
        ///////////////////////////////////////////////////////////////////////////
        int x=6;int m=40;
        btn1.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btn2.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btn3.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btn4.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btn5.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btn6.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btn7.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btn8.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btn9.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btn0.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btnmul.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btnadd.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btndiv.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btnsub.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btn111.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btnenter.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btnequal.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btndot.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btnpr1.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btnpr2.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btnroot.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btnsquare.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        btnremainder.prefHeightProperty().bind((heightProperty().divide(x)).subtract(m));
        ////////////////////////////////////////make 0->9 is around and white 
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
        /////////////////////////////////////////////set font bold and big 
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
        ///////////////////////////////////////////////////////////////make buttons operator gray
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
        /////////////////////////////////////////////////////design the pane (backcolor black ,
    	pane.setStyle("-fx-background-color:black;");
    	pane.setPadding(new Insets(5,15,20,5));
    	pane.setHgap(10);
    	pane.setVgap(21);
    	pane.getChildren().addAll(v0,v2,v3,v4,v5,v6);
    	btnequal.prefWidthProperty().bind((widthProperty().divide(2)).add(20));
        textArea.prefWidthProperty().bind(widthProperty());
        textArea.prefHeightProperty().bind(((heightProperty().divide(6)).multiply(3)).subtract(145));
        textArea.setEditable(false);
        textArea.setStyle("-fx-border-color:silver;-fx-border-style:solid;-fx-border-width:15px;");
        /////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////to write in textarea the expression
    	btnadd.setOnAction(e->
    	{
            if(!textArea.getText().contains("=")&&!textArea.getText().contains("invalid exprission")&&!textArea.getText().endsWith("%")&&!textArea.getText().endsWith("(")&&!textArea.getText().endsWith("^")&&put&&!textArea.getText().isEmpty()&&!textArea.getText().endsWith("+")&&!textArea.getText().endsWith("-")&&!textArea.getText().endsWith("*")&&!textArea.getText().endsWith("/"))
    	{
            textArea.setText(textArea.getText()+"+");
            put=true;
        }
        });
        
    	btnsub.setOnAction(e->
    	{
            if(!textArea.getText().contains("=")&&!textArea.getText().contains("invalid exprission")&&put&&!textArea.getText().endsWith("-"))
    	{
            textArea.setText(textArea.getText()+"-");
            put=true;
        }
    	});
    	btnmul.setOnAction(e->
    	{
            if(!textArea.getText().contains("=")&&!textArea.getText().contains("invalid exprission")&&!textArea.getText().endsWith("(")&&!textArea.getText().endsWith("%")&&!textArea.getText().endsWith("^")&&put&&!textArea.getText().isEmpty()&&!textArea.getText().endsWith("+")&&!textArea.getText().endsWith("-")&&!textArea.getText().endsWith("*")&&!textArea.getText().endsWith("/"))
    	{
            textArea.setText(textArea.getText()+"*");
            put=true;
        }
        });
    	btndiv.setOnAction(e->
    	{
            if(!textArea.getText().contains("=")&&!textArea.getText().contains("invalid exprission")&&!textArea.getText().endsWith("(")&&!textArea.getText().endsWith("%")&&!textArea.getText().endsWith("^")&&!textArea.getText().endsWith("(")&&put&&!textArea.getText().isEmpty()&&!textArea.getText().endsWith("+")&&!textArea.getText().endsWith("-")&&!textArea.getText().endsWith("*")&&!textArea.getText().endsWith("/"))
    	{
            textArea.setText(textArea.getText()+"/");
            put=true;
        }
        });
        btn1.setOnAction(e->
        {
            if(textArea.getText().contains("=")||textArea.getText().contains("invalid exprission"))
                textArea.clear(); 
            textArea.setText(textArea.getText()+"1");
        });
        btn2.setOnAction(e->
        {
            if(textArea.getText().contains("=")||textArea.getText().contains("invalid exprission"))
                textArea.clear(); textArea.setText(textArea.getText()+"2");
        });
    	btn3.setOnAction(e->
        {
            if(textArea.getText().contains("=")||textArea.getText().contains("invalid exprission"))
                textArea.clear(); textArea.setText(textArea.getText()+"3");
        });
    	btn4.setOnAction(e->
        {
            if(textArea.getText().contains("=")||textArea.getText().contains("invalid exprission"))
                textArea.clear(); textArea.setText(textArea.getText()+"4");
        });
    	btn5.setOnAction(e->
        {
            if(textArea.getText().contains("=")||textArea.getText().contains("invalid exprission"))
                textArea.clear(); textArea.setText(textArea.getText()+"5");
        });
    	btn6.setOnAction(e->
        {
            if(textArea.getText().contains("=")||textArea.getText().contains("invalid exprission"))
                textArea.clear(); textArea.setText(textArea.getText()+"6");
        });
    	btn7.setOnAction(e->
        {
            if(textArea.getText().contains("=")||textArea.getText().contains("invalid exprission"))
                textArea.clear(); textArea.setText(textArea.getText()+"7");});
    	btn8.setOnAction(e->
        {
            if(textArea.getText().contains("=")||textArea.getText().contains("invalid exprission"))
                textArea.clear(); textArea.setText(textArea.getText()+"8");
        });
    	btn9.setOnAction(e->
        {
            if(textArea.getText().contains("=")||textArea.getText().contains("invalid exprission"))
                textArea.clear(); textArea.setText(textArea.getText()+"9");
        });
    	btn0.setOnAction(e->
        {
            if(textArea.getText().contains("=")||textArea.getText().contains("invalid exprission"))
                textArea.clear(); textArea.setText(textArea.getText()+"0");
        });
    	btndot.setOnAction(e->
        {
            if(put&&textArea.getText().endsWith(")"))
            {
                if(textArea.getText().contains("=")||textArea.getText().contains("invalid exprission"))
                    textArea.clear();
                textArea.setText(textArea.getText()+".");
                put=false;
            }
            if(textArea.getText().contains("=")||textArea.getText().contains("invalid exprission"))
            {
                textArea.clear();textArea.setText(textArea.getText()+".");
                put=false;
            }
        });
        btnremainder.setOnAction(e->
        {
            if(!textArea.getText().contains("=")&&!textArea.getText().contains("invalid exprission")&&!textArea.getText().endsWith("%")&&!textArea.getText().endsWith("(")&&put&&!textArea.getText().isEmpty()&&!textArea.getText().endsWith("+")&&!textArea.getText().endsWith("-")&&!textArea.getText().endsWith("*")&&!textArea.getText().endsWith("/"))
            textArea.setText(textArea.getText()+"%");
        });
        btnroot.setOnAction(e->
        {
            if(!textArea.getText().endsWith(")")&&put)
            {
                if(textArea.getText().contains("=")||textArea.getText().contains("invalid exprission"))
                {
                textArea.clear();
                }
                textArea.setText(textArea.getText()+"sqrt(");
            }
        });
        btnsquare.setOnAction(e->
        {
            if(!textArea.getText().contains("=")&&!textArea.getText().contains("invalid exprission")&&!textArea.getText().endsWith("(")&&!textArea.getText().endsWith("%")&&!textArea.getText().isEmpty()&&put&&!textArea.getText().endsWith("-")&&!textArea.getText().endsWith("*")&&!textArea.getText().endsWith("/"))
                textArea.setText(textArea.getText()+"^");
        });
    	btnenter.setOnAction(e->
        {
            if(!textArea.getText().isEmpty())
                textArea.setText(textArea.getText().substring(0, textArea.getText().length()-1));
        });
    	btn111.setOnAction(e->
        {
            textArea.clear();
        });
    	btnpr1.setOnAction(e->
        {
            textArea.setText(textArea.getText()+'(');
        });
    	btnpr2.setOnAction(e->
        {
            if(textArea.getText().contains("("))
                textArea.setText(textArea.getText()+')');
        });
        c.setOnAction(e->
        {
          switch(c.getValue())
          {
              case "sin":
              {
            if(!textArea.getText().contains(")")&&put)
            {
                if(textArea.getText().contains("invalid exprission")||textArea.getText().contains("="))
                    textArea.clear();
                textArea.setText(textArea.getText()+"sin(");
            }
              }break;
              case "cos":
              {
            if(!textArea.getText().contains(")")&&put)
            {
                if(textArea.getText().contains("invalid exprission")||textArea.getText().contains("="))
                    textArea.clear();
                textArea.setText(textArea.getText()+"cos(");
            }
              }break;
              case "tan":
              {
            if(!textArea.getText().contains(")")&&put)
            {
                if(textArea.getText().contains("invalid exprission")||textArea.getText().contains("="))
                    textArea.clear();
                textArea.setText(textArea.getText()+"tan(");
            }
              }break;
        }
        });
    	btnequal.setOnAction(e->
    	{
            try
            {
               if(!textArea.getText().contains("=")&&!textArea.getText().isEmpty())
                 {
                   String newline ="\n";
    		   textArea.setText(textArea.getText()+newline+"="+eval(textArea.getText()));
                 }
            }catch(Exception n){textArea.setText("invalid exprission");}
    	});
    	  
/////////////////////////////////////////////////////////////////////////////////eval function
        setCenter(pane);   
    }
public  double eval(final String str) 
    {
    return new Object() 
    {
        int pos = -1, ch;

        void nextChar() 
        {
            ch = (++pos < str.length()) ? str.charAt(pos) : -1;
        }

        boolean eat(int charToEat) 
        {
            while (ch == ' ') 
                nextChar();
            if (ch == charToEat) 
            {
                nextChar();
                return true;
            }
            return false;
        }

        double parse() 
        {
            nextChar();
            double x = parseExpression();
            if (pos < str.length()) 
                throw new RuntimeException("Unexpected: " + (char)ch);
            return x;
        }

        // Grammar:
        // expression = term | expression `+` term | expression `-` term
        // term = factor | term `*` factor | term `/` factor
        // factor = `+` factor | `-` factor | `(` expression `)`
        //        | number | functionName factor | factor `^` factor

        double parseExpression() 
        {
            double x = parseTerm();
            for (;;) 
            {
                if(eat('+')) 
                    x+= parseTerm(); // addition
                else if (eat('-'))
                    x-= parseTerm(); // subtraction
                else return x;
            }
        }

        double parseTerm() 
        {
            double x=parseFactor();
            for (;;) 
            {
                if(eat('*')) 
                    x*= parseFactor(); // multiplication
                else if(eat('/')) 
                    x/= parseFactor(); // division
                else 
                    return x;
            }
        }

        double parseFactor() {
            if (eat('+')) 
                return parseFactor(); // unary plus
            if (eat('-')) 
                return -parseFactor(); // unary minus
            double x;
            int startPos = this.pos;
            if (eat('(')) 
            { // parentheses
                x = parseExpression();
                eat(')');
            } 
            else if((ch >= '0' && ch <= '9') || ch == '.') 
            { // numbers
                while ((ch >= '0' && ch <= '9') || ch == '.') 
                    nextChar();
                x = Double.parseDouble(str.substring(startPos, this.pos));
            } 
            else if(ch >= 'a' && ch <= 'z') 
            { // functions
                while (ch >= 'a' && ch <= 'z') 
                    nextChar();
                String func = str.substring(startPos, this.pos);
                x = parseFactor();
                if(func.equals("sqrt")) 
                    x=Math.sqrt(x);
                else if(func.equals("sin"))
                    x=Math.sin(Math.toRadians(x));
                else if(func.equals("cos")) 
                    x=Math.cos(Math.toRadians(x));
                else if(func.equals("tan")) 
                    x=Math.tan(Math.toRadians(x));
                else 
                    throw new RuntimeException("Unknown function: " + func);
            } 
            else 
            {
                throw new RuntimeException("Unexpected: " + (char)ch);
            }

            if(eat('^')) 
                x= Math.pow(x, parseFactor()); // exponentiation
            if(eat('%'))
                x%=parseFactor();

            return x;
        }
    }.parse();
}
    
    @Override
    protected void updateAppBar(AppBar appBar) 
    {
        appBar.setTitleText("CalCulator");
        appBar.getActionItems().add(c);
        
    }
}
