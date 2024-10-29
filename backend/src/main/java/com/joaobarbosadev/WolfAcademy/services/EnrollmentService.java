package com.joaobarbosadev.WolfAcademy.services;

import com.joaobarbosadev.WolfAcademy.dto.EnrollmentDTO;
import com.joaobarbosadev.WolfAcademy.entities.Enrollment;
import com.joaobarbosadev.WolfAcademy.entities.pk.EnrollmentPK;
import com.joaobarbosadev.WolfAcademy.repositories.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
public class EnrollmentService {

    @Autowired
    EnrollmentRepository repo;

    @Transactional(readOnly = true)
    public Page<EnrollmentDTO> getAllPage(Pageable pageable) {
        Page<Enrollment> enrollments = repo.findAll(pageable);
        return enrollments.map(EnrollmentDTO::new);
    }

    @Transactional(readOnly = true)
    public EnrollmentDTO getById(EnrollmentPK id) {
        Enrollment enrollment = repo.findById(id).orElseThrow(() -> new EntityNotFoundException("Enrollment not found"));
        return new EnrollmentDTO(enrollment);
    }

    @Transactional
    public EnrollmentDTO save(EnrollmentDTO dto) {

        Enrollment enrollment = new Enrollment();
        copyDTOToEntity(dto, enrollment);
        enrollment = repo.save(enrollment);
        return new EnrollmentDTO(enrollment);
    }

    @Transactional
    public EnrollmentDTO update(EnrollmentDTO dto, EnrollmentPK id) {
        Enrollment enrollment = repo.findById(id).orElseThrow(() -> new EntityNotFoundException("Enrollment not found"));
        copyDTOToEntity(dto, enrollment);
        enrollment = repo.save(enrollment);
        return new EnrollmentDTO(enrollment);
    }

    @Transactional
    public void deleteById(EnrollmentPK id) {
        try {
            repo.deleteById(id);
        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("Enrollment not found: " + e.toString());
        }
    }

    public void copyDTOToEntity(EnrollmentDTO dto, Enrollment enrollment) {
        if (dto.getStudent() != null) enrollment.setStudent(dto.getStudent());
        if (dto.getOffer() != null) enrollment.setOffer(dto.getOffer());
        if (dto.getRefundMoment() != null) enrollment.setRefundMoment(dto.getRefundMoment());
        if (dto.isAvailable()) enrollment.setAvailable(true);
        if (dto.isOnlyUpdate()) enrollment.setOnlyUpdate(true);
        if (dto.getEnrollMoment() != null) enrollment.setEnrollMoment(dto.getEnrollMoment());

    }
}
