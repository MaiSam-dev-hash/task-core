package sn.isi.l3gl.core.task_core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.isi.l3gl.core.task_core.entity.Task;
import sn.isi.l3gl.core.task_core.enums.Status;
import sn.isi.l3gl.core.task_core.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    // Version 0.0.1-SNAPSHOT
    public Task createTask(Task task) {
        task.setStatus(Status.TODO);
        return taskRepository.save(task);
    }

    // Version 0.1.0-SNAPSHOT
    public List<Task> listTasks() {
        return taskRepository.findAll();
    }
}
