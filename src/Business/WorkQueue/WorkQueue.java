/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private List<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public List<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(List<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }
}