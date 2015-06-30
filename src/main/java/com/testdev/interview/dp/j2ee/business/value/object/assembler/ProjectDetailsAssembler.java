package com.testdev.interview.dp.j2ee.business.value.object.assembler;

/**
 * Use a Transfer Object Assembler to build the required model or submodel.
 * Created by oleh.krupenia on 6/30/2015.
 */
public class ProjectDetailsAssembler {
    /*
    public ProjectDetailsData getData(String projectId){

    // Construct the composite Transfer Object
    ProjectDetailsData pData = new
                      ProjectDetailsData();

    //get the project details;
    ProjectHome projectHome =
        ServiceLocator.getInstance().getHome(
          "Project", ProjectEntityHome.class);
    ProjectEntity project =
      projectHome.findByPrimaryKey(projectId);
    ProjectTO projTO = project.getData();

    // Add Project Info to ProjectDetailsData
    pData.projectData = projTO;

    //get the project manager details;
    ProjectManagerHome projectManagerHome =
      ServiceLocator.getInstance().getHome(
        "ProjectManager", ProjectEntityHome.class);

    ProjectManagerEntity projectManager =
      projectManagerHome.findByPrimaryKey(
        projTO.managerId);

    ProjectManagerTO projMgrTO =
      projectManager.getData();

    // Add ProjectManager info to ProjectDetailsData
    pData.projectManagerData = projMgrTO;

    // Get list of TaskTOs from the Project
    Collection projTaskList = project.getTasksList();

    // construct a list of TaskResourceTOs
    ArrayList listOfTasks = new ArrayList();

    Iterator taskIter = projTaskList.iterator();
    while (taskIter.hasNext()) {
      TaskTO task = (TaskTO) taskIter.next();

      //get the Resource details;
      ResourceHome resourceHome =
      ServiceLocator.getInstance().getHome(
        "Resource",         ResourceEntityHome.class);

      ResourceEntity resource =
        resourceHome.findByPrimaryKey(
          task.assignedResourceId);

      ResourceTO resTO = resource.getResourceData();

      // construct a new TaskResourceTO using Task
      // and Resource data
      TaskResourceTO trTO = new TaskResourceTO(
              task.projectId, task.taskId,
              task.name, task.description,
              task.startDate, task.endDate,
              resTO);

      // add TaskResourceTO to the list
      listOfTasks.add(trTO);
    }

    // add list of tasks to ProjectDetailsData
    pData.listOfTasks = listOfTasks;

    // add any other data to the Transfer Object
    ...

    // return the composite Transfer Object
    return pData;

  }
     */
}
