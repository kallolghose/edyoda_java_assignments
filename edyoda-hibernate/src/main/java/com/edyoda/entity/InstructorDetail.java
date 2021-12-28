package com.edyoda.entity;

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

    @Column(name = "twitter_handle")
    private String twitterHandle;

    @Column(name = "linkedin_profile")
    private String linkedinProfile;

    //Bi-Directional
    @OneToOne(mappedBy = "instructorDetail")
    private Instructor instructor;

    public InstructorDetail(String twitterHandle, String linkedinProfile) {
        this.twitterHandle = twitterHandle;
        this.linkedinProfile = linkedinProfile;
    }

    @Override
    public String toString() {
        return String.format("Instructor Details : [ID = %d, Twitter = %s, LinkedIn = %s]", id, twitterHandle, linkedinProfile);
    }
}
