package com.joaobarbosadev.WolfAcademy.controllers;
import com.joaobarbosadev.WolfAcademy.dto.EnrollmentDTO;
import com.joaobarbosadev.WolfAcademy.entities.pk.EnrollmentPK;
import com.joaobarbosadev.WolfAcademy.services.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    @Autowired
    EnrollmentService enrollmentService;

    @GetMapping
    public ResponseEntity<Page<EnrollmentDTO>> getAllEnrollments(Pageable pageable) {
        Page<EnrollmentDTO> enrollmentDTOS = enrollmentService.getAllPage(pageable);
        return ResponseEntity.ok(enrollmentDTOS);
    }


    @GetMapping("/{id}")
    public ResponseEntity<EnrollmentDTO> getEnrollmentById(@PathVariable EnrollmentPK id){
        EnrollmentDTO enrollmentDTO = enrollmentService.getById(id);
        return ResponseEntity.ok(enrollmentDTO);
    }

    @PostMapping
    public ResponseEntity<EnrollmentDTO> saveEnrollment(@RequestBody EnrollmentDTO enrollmentDTO){
        enrollmentDTO = enrollmentService.save(enrollmentDTO);
        return ResponseEntity.ok(enrollmentDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EnrollmentDTO> updateEnrollment(@RequestBody EnrollmentDTO enrollmentDTO, @PathVariable EnrollmentPK id){
        enrollmentDTO = enrollmentService.update(enrollmentDTO, id);
        return ResponseEntity.ok(enrollmentDTO);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteEnrollmentById(@PathVariable EnrollmentPK id){
        enrollmentService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
