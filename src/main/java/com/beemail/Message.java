package com.beemail;

import java.time.LocalDateTime;

public class Message {

    private String id;
    private LocalDateTime timestamp;
    private String content;
    private User from;
    private User to;
    private Boolean delivered;
    private Boolean read;


}
