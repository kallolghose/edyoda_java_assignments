package com.edyoda.springmvcdemo.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "instructor_detail")
@Getter @Setter
@NoArgsConstructor
public class InstructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "youtube_channel")
    private String youtubeChannel;

    @Column(name = "hobby")
    private String hobby;

    @OneToOne(mappedBy = "instructorDetail", cascade = CascadeType.ALL)
    private Instructor instructor;

    public InstructorDetail(String youtubeChannel, String hobby){
        this.hobby = hobby;
        this.youtubeChannel = youtubeChannel;
    }

}
