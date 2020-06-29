package com.app.cpfb.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


/**
 * Generic DAO with common methods for CRUD operations.
 *
 * <p>Extend this interface if you want typesafe DAO's
 * (no casting necessary)
 *
 * @param <T> a type variable
 * @param <PK> the primary key for that type
 */
public interface IBaseDAO <T, PK extends Serializable> {

    /**
     * Generic method used to get all objects of a particular type. This
     * is the same as lookup up all rows in a table.
     * @return List of populated objects
     */
    List<T> getAll();

    /**
     * Generic method to get an object based on class and identifier. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if
     * nothing is found.
     *
     * @param id the identifier (primary key) of the object to get
     * @return a populated object
     * @see org.springframework.orm.ObjectRetrievalFailureException
     */
    T get(long id);

    /**
     * Checks for existence of an object of type T using the id arg.
     * @param id the id of the entity
     * @return - true if it exists, false if it doesn't
     */
    boolean exists(long id);

    /**
     * Generic method to save an object - handles both update and insert.
     * @param object the object to save
     * @return the persisted object
     */
    T save(T object);
    
    /**
     * Generic method to save an object - handles both update and insert.
     * @param object the object to save and retruns the generated identifiers
     * @return the persisted object
     */
    long saveAndRetrunUniqkey(T object);

    /**
     * Generic method to save or Update an object - handles both update and insert.
     * @param object the object to save
     * @return the persisted object
     */
    void saveorUpdate(T object);

    /**
     * Generic method to delete an object based on class and id
     * @param id the identifier (primary key) of the object to remove
     */
    void delete(Long id);

    /**
     * Generic method to get an object based on class and identifier. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if
     * nothing is found.
     *
     * @param queryString, queryParams used to get
     * @return a populated object
     * @see org.springframework.orm.ObjectRetrievalFailureException
     */
  //  List<T> findByQuery(String queryString, Map<String, Object> queryParams) ;
}
