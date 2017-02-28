package com.jarvis.sysmgmt.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jarvis.sysmgmt.entity.Reader;

public interface ReaderRepository extends JpaRepository<Reader, String> {
}
