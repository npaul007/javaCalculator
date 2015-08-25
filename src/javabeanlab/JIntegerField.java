
package javabeanlab;

import javax.swing.JTextField;

public class JIntegerField extends JTextField{
    
    
    public JIntegerField(){
        super();
    }
    
    public void doNotLetType(){
        
        /*
           Code below prevents ivalid 
           values from entering txtfield
        */
          
        String invalidValue = super.getText();
            
        super.setText("");
               
        for(int i = 0; i < invalidValue.length() - 1; i++){
           super.setText(super.getText()+String.valueOf(invalidValue.charAt(i)));
        }
                
        return;
    }

    @Override
    public void validate(){
        if(super.getText().length() > 0){    
            try{
                // check for negative sign
                if(String.valueOf(String.valueOf(super.getText().charAt(0))).equals("-") 
                        && super.getText().length() < 2 ){
                    return;
                }
                
                else if(String.valueOf(String.valueOf(super.getText().charAt(0))).equals(".") && super.getText().length() < 2 ){
                    return;
                }
                
                for(int p = 0; p < super.getText().length(); p++){
                    if(String.valueOf(super.getText().charAt(p)).equalsIgnoreCase("f") ||
                          String.valueOf(super.getText().charAt(p)).equalsIgnoreCase("d")  ){
                        doNotLetType();
                    }
                }
                
                // testing for valid value in txtfield
                double value = Double.parseDouble(super.getText()); 
                
            }catch(Exception e){
               doNotLetType();
            }
        }
    }
    

}
