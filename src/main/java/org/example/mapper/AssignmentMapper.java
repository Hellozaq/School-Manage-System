package org.example.mapper;

import org.example.dto.respone.AssignmentDTO;
import org.example.entity.Assignment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AssignmentMapper {
    public AssignmentDTO toDTO(Assignment assignment) {
        return new AssignmentDTO(
                assignment.getAssignmentId(),
                assignment.getSubject().name(), // Nếu enum
                assignment.getTitle(),
                assignment.getDueDates(),
                assignment.getDescription()
        );
    }

}
