package com.testdev.interview.dp.j2ee.business.value.object;

import java.util.Date;

/**
 * Use a Transfer Object to encapsulate the business data
 * Created by oleh.krupenia on 6/30/2015.
 */
public class ProjectTO {
    public String projectId;
    public String projectName;
    public String managerId;
    public String customerId;
    public Date startDate;
    public Date endDate;
    public boolean started;
    public boolean completed;
    public boolean accepted;
    public Date acceptedDate;
    public String projectDescription;
    public String projectStatus;
}
