package com.backendless.coderunner_test.events.persistence_service;

import com.backendless.BackendlessCollection;
import com.backendless.coderunner_test.models.PhoneBook;
import com.backendless.persistence.BackendlessDataQuery;
import com.backendless.property.ObjectProperty;
import com.backendless.servercode.ExecutionResult;
import com.backendless.servercode.RunnerContext;
import com.backendless.servercode.annotation.Asset;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by backendlessdev on 9/2/15.
 */
@Asset( "PhoneBook" )
public class PhoneBookTableEventHandler extends com.backendless.servercode.extension.PersistenceExtender<PhoneBook>
{

  @Override
  public void afterUpdate( RunnerContext context, PhoneBook phonebook,
                           ExecutionResult<PhoneBook> result ) throws Exception
  {
    System.out.println( "PhoneBook afterUpdate" );
  }

  @Override
  public void afterCreate( RunnerContext context, PhoneBook phonebook,
                           ExecutionResult<PhoneBook> result ) throws Exception
  {
    System.out.println( "PhoneBook afterCreate" );
  }

  @Override
  public void beforeFirst( RunnerContext context ) throws Exception
  {
    System.out.println( "PhoneBook beforeFirst" );
  }

  @Override
  public void beforeDescribe( RunnerContext context, String entityName ) throws Exception
  {
    System.out.println( "PhoneBook beforeDescribe" );
  }

  @Override
  public void beforeLast( RunnerContext context ) throws Exception
  {
    System.out.println( "PhoneBook beforeLast" );
  }

  @Override
  public void beforeUpdate( RunnerContext context, PhoneBook phonebook ) throws Exception
  {
    System.out.println( "PhoneBook beforeUpdate" );
  }

  @Override
  public void beforeLoadRelations( RunnerContext context, Object objectId, String entityName,
                                   String[] relations ) throws Exception
  {
    System.out.println( "PhoneBook beforeLoadRelations" );
  }

  @Override
  public void afterFindById( RunnerContext context, String objectId, String[] relations,
                             ExecutionResult<PhoneBook> result ) throws Exception
  {
    System.out.println( "PhoneBook afterFindById" );
  }

  @Override
  public void beforeFindById( RunnerContext context, String objectId, String[] relations ) throws Exception
  {
    System.out.println( "PhoneBook beforeFindById" );
  }

  @Override
  public void afterUpdateBulk( RunnerContext context, String tableName, String whereClause, HashMap properties,
                               ExecutionResult<Integer> result ) throws Exception
  {
    System.out.println( "PhoneBook afterUpdateBulk" );
  }

  @Override
  public void afterRemove( RunnerContext context, String objectId, ExecutionResult<Long> result ) throws Exception
  {
    System.out.println( "PhoneBook afterRemove" );
  }

  @Override
  public void beforeCreate( RunnerContext context, PhoneBook phonebook ) throws Exception
  {
    System.out.println( "PhoneBook beforeCreate" );
  }

  @Override
  public void beforeUpdateBulk( RunnerContext context, String tableName, String whereClause,
                                HashMap properties ) throws Exception
  {
    System.out.println( "PhoneBook beforeUpdateBulk" );
  }

  @Override
  public void afterRemoveBulk( RunnerContext context, String tableName, String whereClause,
                               ExecutionResult<Integer> result ) throws Exception
  {
    System.out.println( "PhoneBook afterRemoveBulk" );
  }

  @Override
  public void afterDescribe( RunnerContext context, String entityName,
                             ExecutionResult<ObjectProperty[]> result ) throws Exception
  {
    System.out.println( "PhoneBook afterDescribe" );
  }

  @Override
  public void beforeRemoveBulk( RunnerContext context, String tableName, String whereClause ) throws Exception
  {
    System.out.println( "PhoneBook beforeRemoveBulk" );
  }

  @Override
  public void afterLoadRelations( RunnerContext context, Object objectId, String entityName, String[] relations,
                                  ExecutionResult<Map> result ) throws Exception
  {
    System.out.println( "PhoneBook afterLoadRelations" );
  }

  @Override
  public void afterFind( RunnerContext context, BackendlessDataQuery query,
                         ExecutionResult<BackendlessCollection<PhoneBook>> result ) throws Exception
  {
    System.out.println( "PhoneBook afterFind" );
  }

  @Override
  public void beforeRemove( RunnerContext context, String objectId ) throws Exception
  {
    System.out.println( "PhoneBook beforeRemove" );
  }

  @Override
  public void afterLast( RunnerContext context, ExecutionResult<PhoneBook> result ) throws Exception
  {
    System.out.println( "PhoneBook afterLast" );
  }

  @Override
  public void beforeFind( RunnerContext context, BackendlessDataQuery query ) throws Exception
  {
    System.out.println( "PhoneBook beforeFind" );
  }

  @Override
  public void afterFirst( RunnerContext context, ExecutionResult<PhoneBook> result ) throws Exception
  {
    System.out.println( "PhoneBook afterFirst" );
  }
}

