package com.example.raschetKP.repos;

import com.example.raschetKP.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {
}
