
package com.backendless.coderunner_test;

import com.backendless.Backendless;
import com.backendless.coderunner_test.models.Address;
import com.backendless.coderunner_test.models.Contact;
import com.backendless.coderunner_test.models.PhoneBook;
import com.backendless.servercode.IBackendlessBootstrap;


public class Bootstrap implements IBackendlessBootstrap
{
            
  @Override
  public void onStart()
  {
    Backendless.setUrl( "http://localhost:9000" );
    Backendless.initApp( "A92906D6-6B36-FAD1-FFE0-718BFD7CAE00", "BDEC8F84-A5A9-A253-FF62-A66620DC4100","v1");

    Backendless.Persistence.mapTableToClass( "Address", Address.class );
    Backendless.Persistence.mapTableToClass( "Contact", Contact.class );
    Backendless.Persistence.mapTableToClass( "PhoneBook", PhoneBook.class );
    // add your code here
  }
    
  @Override
  public void onStop()
  {
    // add your code here
  }
    
}
        