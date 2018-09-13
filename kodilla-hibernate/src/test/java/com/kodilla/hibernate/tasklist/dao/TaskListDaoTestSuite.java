package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "List of planned, not started tasks";

   /* @Test
    public void testTaskListDaoSave() {
        //Given
        TaskList taskList = new TaskList("Maniana",DESCRIPTION );

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        TaskList readTaskList = taskListDao.findOne(id);
        Assert.assertEquals(id, readTaskList.getId());

        //CleanUp
        taskListDao.delete(id);
    }*/

  /*  @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("BHG", DESCRIPTION) ;
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTaskList.size());
        Assert.assertEquals("BHG",readTaskList.get(0).getListName());

        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.delete(id);
    }*/
}
