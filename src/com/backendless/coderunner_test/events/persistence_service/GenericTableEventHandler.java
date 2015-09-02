package com.backendless.coderunner_test.events.persistence_service;

import com.backendless.BackendlessCollection;
import com.backendless.persistence.BackendlessDataQuery;
import com.backendless.property.ObjectProperty;
import com.backendless.servercode.ExecutionResult;
import com.backendless.servercode.RunnerContext;
import com.backendless.servercode.annotation.Asset;

import java.util.HashMap;
import java.util.Map;
        
/**
* GenericTableEventHandler handles events for all entities. This is accomplished
* with the @Asset( "*" ) annotation.  The asterisk denotes "all entities". 
* The methods in the class correspond to the events selected in Backendless
* Console.
*/
    
@Asset( "*" )
public class GenericTableEventHandler extends com.backendless.servercode.extension.PersistenceExtender<HashMap>
{
    
  @Override
  public void beforeRemoveBulk( RunnerContext context, String tableName, String whereClause ) throws Exception
  {
    System.out.println( "beforeRemoveBulk" );
  }
    
  @Override
  public void afterUpdate( RunnerContext context, HashMap hashmap, ExecutionResult<HashMap> result ) throws Exception
  {
    System.out.println( "afterUpdate" );
  }
    
  @Override
  public void afterFirst( RunnerContext context, ExecutionResult<HashMap> result ) throws Exception
  {
    System.out.println( "afterFirst" );
  }
    
  @Override
  public void beforeFind( RunnerContext context, BackendlessDataQuery query ) throws Exception
  {
    System.out.println( "beforeFind" );
  }
    
  @Override
  public void beforeFindById( RunnerContext context, Object objectId, String[] relations ) throws Exception
  {
    System.out.println( "beforeFindById" );
  }
    
  @Override
  public void afterUpdateBulk( RunnerContext context, String tableName, String whereClause, HashMap properties, ExecutionResult<Integer> result ) throws Exception
  {
    System.out.println( "afterUpdateBulk" );
  }
    
  @Override
  public void afterLoadRelations( RunnerContext context, Object objectId, String entityName, String[] relations, ExecutionResult<Map> result ) throws Exception
  {
    System.out.println( "afterLoadRelations" );
  }
    
  @Override
  public void afterRemove( RunnerContext context, Object objectId, ExecutionResult<Long> result ) throws Exception
  {
    System.out.println( "afterRemove" );
  }
    
  @Override
  public void afterLast( RunnerContext context, ExecutionResult<HashMap> result ) throws Exception
  {
    System.out.println( "afterLast" );
  }
    
  @Override
  public void beforeDescribe( RunnerContext context, String entityName ) throws Exception
  {
    System.out.println( "beforeDescribe" );
  }
    
  @Override
  public void beforeLast( RunnerContext context ) throws Exception
  {
    System.out.println( "beforeLast" );
  }
    
  @Override
  public void beforeCreate( RunnerContext context, HashMap hashmap) throws Exception
  {
    System.out.println( "beforeCreate" );

//    try {
//    String https_url = "https://www.google.com/";
//    URL url;
//
//
//      url = new URL(https_url);
//      HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
//      con.connect();
//
//      System.out.println(con);
//
//    } catch (MalformedURLException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

  }
    
  @Override
  public void afterDescribe( RunnerContext context, String entityName, ExecutionResult<ObjectProperty[]> result ) throws Exception
  {
    System.out.println( "afterDescribe" );
  }

  @Override
  public void beforeLoadRelations( RunnerContext context, Object objectId, String entityName, String[] relations ) throws Exception
  {
    System.out.println( "beforeLoadRelations" );
  }
    
  @Override
  public void afterFindById( RunnerContext context, Object objectId, String[] relations, ExecutionResult<HashMap> result ) throws Exception
  {
    System.out.println( "afterFindById" );
  }
    
  @Override
  public void afterFind( RunnerContext context, BackendlessDataQuery query, ExecutionResult<BackendlessCollection<HashMap>> result ) throws Exception
  {
    System.out.println( "afterFind" );
  }
    
  @Override
  public void afterRemoveBulk( RunnerContext context, String tableName, String whereClause, ExecutionResult<Integer> result ) throws Exception
  {
    System.out.println( "afterRemoveBulk" );
  }
    
  @Override
  public void beforeRemove( RunnerContext context, Object objectId ) throws Exception
  {
    System.out.println( "beforeRemove" );
  }
    
  @Override
  public void beforeUpdateBulk( RunnerContext context, String tableName, String whereClause, HashMap properties ) throws Exception
  {
    System.out.println( "beforeUpdateBulk" );
  }
    
  @Override
  public void afterCreate( RunnerContext context, HashMap hashmap, ExecutionResult<HashMap> result ) throws Exception
  {
    System.out.println( "afterCreate" );
  }
    
  @Override
  public void beforeUpdate( RunnerContext context, HashMap hashmap ) throws Exception
  {
    System.out.println( "beforeUpdate" );
  }
    
  @Override
  public void beforeFirst( RunnerContext context ) throws Exception
  {
    System.out.println( "beforeFirst" );
  }
    
}
        