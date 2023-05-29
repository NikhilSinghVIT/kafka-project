package com.kafka.project.kafkaproject.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Library;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LibraryEvent {
    private Integer libraryEventId;
    private LibraryEventType libraryEventType;
    private Book book;
}
