package com.jbl.book.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 1
@EntityListeners(AuditingEntityListener.class) // 2
public class BaseTimeEntity {

    @CreatedDate // 3
    private LocalDateTime createDate;

    @LastModifiedDate // 4
    private LocalDateTime modifiedDate;

}

// BaseTimeEntity클래스는 모든 Entity의 상위 클래스가 되어 Entity들의 createdDate, modifiedDate를 자동으로 관리하는 역할

/*
*  1. @MappedSuperclass
*    - JPA Entity 클래스들이 BaseTimeEntity을 상속할 경우 필드들(createdDate, modifiedDate)도 칼럼으로 인식하도록 합니다.
*
*  2. @EntityListeners(AuditingEntityListener.class)
*    - BaseTimeEntity 클래스에 Auditing 기능을 포함 시킵니다.
*
*  3. @CreatedDate
*    - Entity가 생성되어 저장될 때 시간이 자동 저장됩니다.
*
*  4. @LastModifiedDate
*    - 조회한 Entity의 값을 변경할 때 시간이 자동 저장됩니다.
* */