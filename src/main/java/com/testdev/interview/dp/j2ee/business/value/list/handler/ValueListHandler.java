package com.testdev.interview.dp.j2ee.business.value.list.handler;

/**
 * Use a Value List Handler to control the search, cache the results, and provide the results to the client in a result set whose size and traversal meets the client's requirement
 * Created by oleh.krupenia on 6/30/2015.
 */
public class ValueListHandler {
    /*
    protected List list;
  protected ListIterator listIterator;

  private ProjectDAO dao = null;
  // use ProjectTO as a template to determine
  // search criteria
  private ProjectTO projectCriteria = null;

  // Client creates a ProjectTO instance, sets the
  // values to use for search criteria and passes
  // the ProjectTO instance as projectCriteria
  // to the constructor and to setCriteria() method
  public ProjectListHandler(ProjectTO projectCriteria)
  throws ProjectException, ListHandlerException {
    try {
      this.projectCriteria = projectCriteria;
      this.dao = PSADAOFactory.getProjectDAO();
      executeSearch();
    } catch (Exception e) {
      // Handle exception, throw ListHandlerException
    }
  }

  public void setCriteria(ProjectTO projectCriteria) {
    this.projectCriteria = projectCriteria;
  }

  // executes search. Client can invoke this
  // provided that the search criteria has been
  // properly set. Used to perform search to refresh
  // the list with the latest data.
  public void executeSearch()
  throws ListHandlerException {
    try {
      if (projectCriteria == null) {
        throw new ListHandlerException(
          "Project Criteria required...");
      }
      List resultsList =
        dao.executeSelect(projectCriteria);
      setList(resultsList);
    } catch (Exception e) {
      // Handle exception, throw ListHandlerException
    }
  }

  public ValueListHandler() {
  }

  protected void setList(List list)
  throws IteratorException {
    this.list = list;
    if(list != null)
      listIterator =  list.listIterator();
    else
      throw new IteratorException("List empty");
  }

  public Collection getList(){
    return list;
  }

  public int getSize() throws IteratorException{
    int size = 0;

    if (list != null)
      size = list.size();
    else
      throw new IteratorException(...); //No Data

    return size;
  }

  public Object getCurrentElement()
  throws IteratorException {

    Object obj = null;
    // Will not advance iterator
    if (list != null)
    {
      int currIndex = listIterator.nextIndex();
      obj = list.get(currIndex);
    }
    else
      throw new IteratorException(...);
    return obj;

  }

  public List getPreviousElements(int count)
  throws IteratorException {
    int i = 0;
    Object object = null;
    LinkedList list = new LinkedList();
    if (listIterator != null) {
      while (listIterator.hasPrevious() && (i < count)){
        object = listIterator.previous();
        list.add(object);
        i++;
      }
    }// end if
    else
      throw new IteratorException(...); // No data

    return list;
  }

  public List getNextElements(int count)
  throws IteratorException {
    int i = 0;
    Object object = null;
    LinkedList list = new LinkedList();
    if(listIterator != null){
      while(  listIterator.hasNext() && (i < count) ){
        object = listIterator.next();
        list.add(object);
        i++;
      }
    } /  / end if
    else
      throw new IteratorException(...); // No data

    return list;
  }

  public void resetIndex() throws IteratorException{
    if(listIterator != null){
      listIterator = list.ListIterator();
    }
    else
      throw new IteratorException(...); // No data
  }
     */
}
