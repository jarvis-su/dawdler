package com.jarvis.sysmgmt.service.impl;

import com.jarvis.sysmgmt.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, String> {
}
