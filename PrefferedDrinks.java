
package customerspreferreddrinks;

//authors Paloma D'Silva and Henry Ngo

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class PrefferedDrinks extends Application {
    
      //CUSTOMER FIRST NAME  
 private String names [] = {"Henry Ngo", "Paloma D'silva", "Brandon Liu", "Ali Raja", "Mugiesshan Anandarajah", " Ahmed Ahmeer", "Nilaka Kaluarachchi", "Darrell Byrne", "Calvin Coish", "Osama Faisal"};
    private ArrayList<String> nameList = new ArrayList(); 
    private int id[];
    private int next=0;//next counter variable
    private ArrayList<Integer> idList = new ArrayList(); 
    //cust address
    private String address[];
    private ArrayList<String> addressList = new ArrayList(); 
    //customer city arraylist
    private String city[] = {"Mississauga", "Mississauga", "Brampton", "Hamilton", "Oakville", "Mississauga", "Oakville", "Brampton", "Guelph", "Toronto"};
    private ArrayList<String> cityList = new ArrayList(); 
    //cust age
   private int age[] = {25, 22, 40, 55, 21, 24, 49, 35, 60, 40};
    private ArrayList<Integer> ageList = new ArrayList(); 
    //cust drink
    private String drink[] = {"Millers Genuine Draft", "Smirnoff Ice Vodka", "Margarita", "Molson Canadian", "Jacobs Creek White Wine", "Labatts Blue", "Pabst Blue Ribbon", "Heineken", "Crown Royal Whisky", "Brandy"};
    private ArrayList<String> drinkList = new ArrayList(); 
    //nodes we created
    Label customerID = new Label("Customer ID");
    Label customerName = new Label("Customer Name");
    Label customerAddress = new Label("Customer Address");
    Label customerCity = new Label("Customer City");
    Label customerAge = new Label("Customer Age");
    Label customerDrink = new Label("Customer Drink");
    TextField idText = new TextField();
    TextField NameText = new TextField();
    TextField addressText = new TextField();
    TextField cityText = new TextField();
    TextField ageText = new TextField();
    TextField drinkText = new TextField();
    Button btnFirst = new Button("First");
    Button btnNext = new Button("Next");
    Button btnPrevious = new Button("Previous");
    Button btnLast = new Button("Last");
    Button btnAdd = new Button("Add");
    Button btnDelete = new Button("Delete");
    Button btnModify = new Button("Modify");
    Button btnSearch = new Button("Search");
    
   
    public PrefferedDrinks(){ 
        this.id = new int[10] ;
        //first arraylist 
       id[0]=1;
       id[1]=2;
       id[2]=3;
       id[3]=4;
       id[4]=5;
       id[5]=6;
       id[6]=7;
       id[7]=8;
       id[8]=9;
       id[9]=10; 
       //second arraylist
       this.address=new String[10];
       address[0]="28 North Country Club Ave";
       address[1]="2833 Rockland St";
       address[2]="7413 Birchwood Dr";
       address[3]="8 North Santa Clara Drive";
       address[4]="2452 Woodurst Drive";
       address[5]="2870 South Brickyard St.";
       address[6]="28 North Country Club Ave";
       address[7]="2832 North Armstrong Drive";
       address[8]="285 Canal St";
       address[9]="286 Olive Drive";
      
    
    
    
    
    }//default constructor
    
    @Override
    public void start(Stage primaryStage) {
    
       setidList();
        setaddressList();
        setcityList();
        setageList();
        setNameList();
        setDrinkList(); 
    
         setTextArea(); //call in second line of start method
         //define first button event handler
            btnFirst.setOnAction((ActionEvent event) -> { //this is what we do when the first button is clicked
               
                 //onclick add the first record to textname
            int firstid= idList.get(0);
            idText.setText(Integer.toString(firstid));
            //onclick add the first address record to textfield
            String firstaddress=addressList.get(0);
            addressText.setText(firstaddress);
             //onclick add the first city record to textfield
            String firstcity=cityList.get(0);
            cityText.setText(firstcity);
            //onclick add the first age record to textfield
             //onclick add the first age record to textfield
            int firstage=ageList.get(0);
            ageText.setText(Integer.toString(firstage));
            //onclick add the first drink record to textfield
            String firstdrink=drinkList.get(0);
            drinkText.setText(firstdrink);
            //onclick add the first firstname record to textfield
            String firstname=nameList.get(0);
            NameText.setText(firstname);
               
                
           
            
        });
            //define next button eventhandler
             
            btnNext.setOnAction((ActionEvent event) -> { //this is what we do when the first button is clicked
                next++;//increment the value of next every time the user clicks it
                 //onclick add the first record to textname
            int nextid= idList.get(next);
            idText.setText(Integer.toString(nextid));
            //onclick add the first address record to textfield
            String nextaddress=addressList.get(next);
            addressText.setText(nextaddress);
             //onclick add the first city record to textfield
            String nextcity=cityList.get(next);
            cityText.setText(nextcity);
            //onclick add the first age record to textfield
             //onclick add the first age record to textfield
            int nextage=ageList.get(next);
            ageText.setText(Integer.toString(nextage));
            //onclick add the first drink record to textfield
            String nextdrink=drinkList.get(next);
            drinkText.setText(nextdrink);
            //onclick add the first firstname record to textfield
            String nextname=nameList.get(next);
            NameText.setText(nextname);
                
           
            
        });
               //define previous button eventhandler
             
            btnPrevious.setOnAction((ActionEvent event) -> {
                //this is what we do when the first button is clicked
                next--;//increment the value of next every time the user clicks it
                //onclick add the first record to textname
                int nextid= idList.get(next);
            idText.setText(Integer.toString(nextid));
            //onclick add the first address record to textfield
            String nextaddress=addressList.get(next);
            addressText.setText(nextaddress);
             //onclick add the first city record to textfield
            String nextcity=cityList.get(next);
            cityText.setText(nextcity);
            //onclick add the first age record to textfield
             //onclick add the first age record to textfield
            int nextage=ageList.get(next);
            ageText.setText(Integer.toString(nextage));
            //onclick add the first drink record to textfield
            String nextdrink=drinkList.get(next);
            drinkText.setText(nextdrink);
            //onclick add the first firstname record to textfield
            String nextname=nameList.get(next);
            NameText.setText(nextname);
                
       });
            //define add button event handler
             btnAdd.setOnAction((ActionEvent e) -> {
                 
                 String addName = NameText.getText();
                 nameList.add(addName);
                 String addAddress = addressText.getText();
                 addressList.add(addAddress);
                 String addCity = cityText.getText();
                 cityList.add(addCity);
                 String addDrink = drinkText.getText();
                 drinkList.add(addDrink);
                 try{
                 String addAge = ageText.getText();
                 ageList.add(Integer.parseInt(addAge));
                 String addId = idText.getText();
                 idList.add(Integer.parseInt(addId));}
                 catch(NumberFormatException ex){
                     System.out.println("Not a number");
                 }
                 
                 
             });
             
              
            //define dekete button event handler
             btnDelete.setOnAction((ActionEvent event) -> { //this tells us what i want it to do
                 
             
            boolean isName = nameList.get(next).equals(NameText.getText());
            String removeName;
            removeName=nameList.get(next);
            nameList.remove(removeName);  //then we just delete that record from the arraylist

            
            boolean isCity=cityList.get(next).equals(cityText.getText());
            String removeCity;
            removeCity= cityList.get(next);
            cityList.remove(removeCity); 
            
         
            boolean isDrink=drinkList.get(next).equals(drinkText.getText());
            String removeDrink;
           removeDrink = drinkList.get(next);
            drinkList.remove(removeDrink); 
      
             boolean isAddress=addressList.get(next).equals(addressText.getText());
            String removeAddress;
           removeAddress = addressList.get(next);
            addressList.remove(removeAddress); 
            
            Integer isAge=ageList.get(next);
            String stringAge=Integer.toString(isAge);
            String compareAge=ageText.getText();
            if (stringAge.equals(compareAge)){
            String removeAge;
            removeAge = Integer.toString(ageList.get(next));
                boolean remove;
                remove = ageList.remove(removeAge);
                
} 
            
            
         Integer isID=idList.get(next);
         String stringID=Integer.toString(isID);
         String compareID=idText.getText();
         if (stringID.equals(compareID)){
         String removeID;
             removeID = Integer.toString(idList.get(next));
             boolean remove;
            remove= idList.remove((removeID));  } 

                 
                 
               });
            //define modift button event
             btnModify.setOnAction((ActionEvent event) -> {
                 
                 String modifyName = NameText.getText();
                 nameList.set(next, modifyName);
                 String modifyAddress = addressText.getText();
                 addressList.set(next, modifyAddress);
                 String modifyDrink = drinkText.getText();
                 drinkList.set(next, modifyDrink);
                 String modifyCity = cityText.getText();
                 cityList.set(next, modifyCity);
                 String modifyAge = ageText.getText();
                 ageList.set(next, Integer.parseInt(modifyAge));
                 String modifyId = idText.getText();
                 idList.set(next,Integer.parseInt(modifyId));
                 
                 
                 
               });
            //define search button event
             btnSearch.setOnAction((ActionEvent event) -> {
                 
                 Label customerID1 = new Label("Customer ID");
                 Label customerName1 = new Label("Customer Name");
                 Label customerAddress1 = new Label("Customer Address");
                 Label customerCity1 = new Label("Customer City");
                 Label customerAge1 = new Label("Customer Age");
                 Label customerDrink1 = new Label("Customer Drink");
                 TextField idText1 = new TextField();
                 TextField NameText1 = new TextField();
                 TextField addressText1 = new TextField();
                 TextField cityText1 = new TextField();
                 TextField ageText1 = new TextField();
                 TextField drinkText1 = new TextField();
                 Button btnCancel = new Button("Cancel");
                 Button btnSearch1 = new Button("Search");
                 GridPane pane = new GridPane();
           //add the nodes to the pane and add the labels to the pane
           pane.add(customerID1, 0, 0); //id node
           pane.add(idText1, 1, 0); //id label
           pane.add(customerName1, 0, 1); //name node
           pane.add(NameText1, 1, 1); //name label
           pane.add(customerAddress1, 0, 2); //address node
           pane.add(addressText1, 1, 2); //address label
           pane.add(customerCity1, 0, 3); //city node
           pane.add(cityText1, 1, 3); //city label
           pane.add(customerDrink1, 0, 4); //drink node
           pane.add(drinkText1, 1, 4); //drink label
           pane.add(customerAge1, 0, 5); //age node
           pane.add(ageText1, 1, 5); //age label
           pane.add(btnCancel, 0, 6);
           pane.add(btnSearch1, 1, 6);
           
           pane.setPadding(new javafx.geometry.Insets(20, 20, 20, 20));
           Scene scene2 = new Scene(pane, 300,250 );
           Stage newStage = new Stage();
           newStage.setScene(scene2);
           newStage.initModality(Modality.APPLICATION_MODAL);
           newStage.setTitle("Search Box");
           btnCancel.setOnAction(f -> newStage.close());
          newStage.showAndWait();
           
           btnSearch1.setOnAction((ActionEvent e) ->{
            
               Alert alert = new Alert(AlertType.INFORMATION);
               alert.setTitle("Results");
               String getName = NameText.getText();
               boolean isNameThere = nameList.contains(getName);
               if (isNameThere == true) {
                   nameList.stream().forEach((contentText) -> alert.setContentText(contentText));
                     Optional<ButtonType> showAndWait = alert.showAndWait(); }
               else {
                    System.out.println("Record not found");
               }
           });
                   
                   
                   
         
          
       });
                 
                 
           
            
            //define last button event handler
            btnLast.setOnAction((ActionEvent e) -> {
            String lastCust = nameList.get(nameList.size()-1);
            NameText.setText(lastCust);
            String lastDrink = drinkList.get(drinkList.size() - 1);
            drinkText.setText(lastDrink);
            String lastAddress = addressList.get(addressList.size() - 1);
            addressText.setText(lastAddress);
            String lastCity = cityList.get(cityList.size() - 1);
            cityText.setText(lastCity);
            try{
            int lastID = idList.get(idList.size() - 1);
          //  String convertlastID=Integer.toString(lastID);
            idText.setText(lastID + "");
            int lastAge = ageList.get(ageList.size() - 1);
           // String convertlastage=Integer.toString(lastAge);
            ageText.setText(lastAge + "");}
            catch(NumberFormatException ge){
                System.out.println("This is not a number");
            }
            });
            
         GridPane pane = new GridPane();
        //add the nodes to the pane and add the labels to the pane
        pane.add(customerID, 0, 0); //id node
        pane.add(idText, 1, 0); //id label
        pane.add(customerName, 0, 1);//name node
        pane.add(NameText, 1, 1);//name label
        pane.add(customerAddress, 0, 2); //address node
        pane.add(addressText, 1, 2);//address label
        pane.add(customerCity, 0, 3);//city node
        pane.add(cityText, 1, 3);//city label
        pane.add(customerDrink, 0, 4);//drink node
        pane.add(drinkText, 1, 4);//drink label
        pane.add(customerAge, 0, 5);//age node
        pane.add(ageText,1,5);//age label
        
        
        BorderPane bp= new BorderPane();
        bp.setTop(pane);
        HBox pButtons=new HBox(btnFirst, btnNext, btnPrevious,btnLast);
        HBox pButtons2 = new HBox(btnAdd, btnDelete, btnModify, btnSearch);
        bp.setCenter(pButtons);
        bp.setBottom(pButtons2);
        pButtons.setSpacing(40);//spacing of 40px
        pButtons2.setSpacing(40);
        bp.setPadding(new javafx.geometry.Insets(20, 20, 20, 20));
        Scene scene = new Scene(bp, 370, 270);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Preferred Customer Drinks");
        primaryStage.show();
        
        
    }
    
    public void setidList(){ //setter method for idlist
        
         for (int ide : id) { //create a new foreach loop that for each element in the names array, name will do what i tell it to do in the for loop
            //add all elements found in names to the array list
            idList.addAll(Arrays.asList(ide)); //this is the collectins method, arraylist.addall(arrays.aslist(array name));
            //for every element in the customers array, the code will add the customers to customerlist
        } //end for loop
        
    }

       public void setaddressList(){ //setter method for idlist
        
         for (String addresses : address) { //create a new foreach loop that for each element in the names array, name will do what i tell it to do in the for loop
            //add all elements found in names to the array list
            addressList.addAll(Arrays.asList(address)); //this is the collectins method, arraylist.addall(arrays.aslist(array name));
            //for every element in the customers array, the code will add the customers to customerlist
        } //end for loop
        
    }
   
    public static void main(String[] args) {
        launch(args);
    }

    private void setcityList() {
        
           for (String cities : city) { //create a new foreach loop that for each element in the names array, name will do what i tell it to do in the for loop
            //add all elements found in names to the array list
            cityList.addAll(Arrays.asList(city)); //this is the collectins method, arraylist.addall(arrays.aslist(array name));
            //for every element in the customers array, the code will add the customers to customerlist
        } //end for loop
        
    }

    private void setageList() {
        
        for (int ages : age) { //create a new foreach loop that for each element in the names array, name will do what i tell it to do in the for loop
            //add all elements found in names to the array list
            ageList.addAll(Arrays.asList(ages)); //this is the collectins method, arraylist.addall(arrays.aslist(array name));
            //for every element in the customers array, the code will add the customers to customerlist
        } //end for loop
    }

    private void setNameList() {
        
           for (String name : names) { //create a new foreach loop that for each element in the names array, name will do what i tell it to do in the for loop
            //add all elements found in names to the array list
            nameList.addAll(Arrays.asList(names)); //this is the collectins method, arraylist.addall(arrays.aslist(array name));
            
        } //end for loop
         
    }

    private void setDrinkList() {
        
          for (String drinks : drink) { //create a new foreach loop that for each element in the names array, name will do what i tell it to do in the for loop
            //add all elements found in names to the array list
            drinkList.addAll(Arrays.asList(drink)); //this is the collectins method, arraylist.addall(arrays.aslist(array name));
            //for every element in the customers array, the code will add the customers to customerlist
        } //end for loop
    }

   
   

    private void setTextArea() {
        //places all elements in idlist into a string
        String sDisplayid; 
     //loop through the arraylist
   //  for (Integer idList1 : idList) {
         sDisplayid = idList.get(0) + " "; //add each element in the array list to the string and increase the value of sdisplay each time
    // } //end for 
        idText.setText(sDisplayid); //sdisplay issent to text area to be displayed
        //is called in the second line of start method
      //places all elements in addresslist into a string
       String sDisplayaddress; 
     //loop through the arraylist
    // for (String addressList1 : addressList) {
         sDisplayaddress = addressList.get(0) + " "; //add each element in the array list to the string and increase the value of sdisplay each time
   //  } //end for 
        addressText.setText(sDisplayaddress); //sdisplay issent to text area to be displayed
        //PLACES all elements in city list in a string
        String sDisplaycity; 
     //loop through the arraylist
     //for (String cityList1 : cityList) {
         sDisplaycity = cityList.get(0) + " "; //add each element in the array list to the string and increase the value of sdisplay each time
    // } //end for 
        cityText.setText(sDisplaycity); //sdisplay issent to text area to be displayed
        //is called in the second line of start method
        //places all elements in age list into a string
         String sDisplayage; 
        //loop through the arraylist
     //   for (int i = 0; i < ageList.size(); i++) { 
            sDisplayage = ageList.get(0) + " "; //add each element in the array list to the string and increase the value of sdisplay each time
       // }//end for 
        ageText.setText(sDisplayage); //sdisplay issent to text area to be displayed
       //places all elements in drink list into a string
        String sDisplaydrink; 
        //loop through the arraylist
     //   for (int i = 0; i < drinkList.size(); i++) { 
            sDisplaydrink = drinkList.get(0) + " "; //add each element in the array list to the string and increase the value of sdisplay each time
       // }//end for 
        drinkText.setText(sDisplaydrink); //sdisplay issent to text area to be displayed
         String sDisplayname; 
        //loop through the arraylist
       // for (int i = 0; i < nameList.size(); i++) { 
            sDisplayname = nameList.get(0) + " "; //add each element in the array list to the string and increase the value of sdisplay each time
     //   }//end for 
        NameText.setText(sDisplayname); //sdisplay issent to text area to be displayed
    }
    
    /*   public class AddName implements EventHandler<ActionEvent>{ //this is my inner class
       
        @Override
        public void handle(ActionEvent e){
           
            //the idlist
            String sAddid = idText.getText(); //add txtname values to string sadd
            int convertid = Integer.p
            idList.add(convertid);
            setTextArea();//textarea loops through the array and puts it into textarea, call this method here as we want this on clic
            idText.clear();//after the buttons' been clicked, we clear it
            idText.requestFocus();//cursor goes back to textname on requestfocus */
            
            //the address list
           /* String sAddaddress=addressText.getText(); //add txtname values to string sadd
            addressList.add(sAddaddress); //add the elements in the arraylist namelist to sadd
            setTextArea();//textarea loops through the array and puts it into textarea, call this method here as we want this on click
            addressText.clear();//after the buttons' been clicked, we clear it
            addressText.requestFocus();//cursor goes back to textname on requestfocus
            
            //the name list
            String sAddName=NameText.getText(); //add txtname values to string sadd
            nameList.add(sAddName); //add the elements in the arraylist namelist to sadd
            setTextArea();//textarea loops through the array and puts it into textarea, call this method here as we want this on click
            NameText.clear();//after the buttons' been clicked, we clear it
            NameText.requestFocus();//cursor goes back to textname on requestfocus
            
            
            
            //the city list
             String sAddCity=cityText.getText(); //add txtname values to string sadd
            cityList.add(sAddCity); //add the elements in the arraylist namelist to sadd
            setTextArea();//textarea loops through the array and puts it into textarea, call this method here as we want this on click
            cityText.clear();//after the buttons' been clicked, we clear it
            cityText.requestFocus();//cursor goes back to textname on requestfocus
            
           //the age list
             
             String sAddage=ageText.getText(); //add txtname values to string sadd
              int convertage = Integer.parseInt(sAddage);
            ageList.add(convertage);
            setTextArea();//textarea loops through the array and puts it into textarea, call this method here as we want this on click
            ageText.clear();//after the buttons' been clicked, we clear it
            ageText.requestFocus();//cursor goes back to textname on requestfocus */
            
           
            //the drink list
          /*   String sAdddrink=drinkText.getText(); //add txtname values to string sadd
            drinkList.add(sAdddrink); //add the elements in the arraylist namelist to sadd
            setTextArea();//textarea loops through the array and puts it into textarea, call this method here as we want this on click
            drinkText.clear();//after the buttons' been clicked, we clear it
            drinkText.requestFocus();//cursor goes back to textname on requestfocus
            
        } */
     }
    

