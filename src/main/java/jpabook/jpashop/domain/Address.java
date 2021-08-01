package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Getter
@Embeddable
public class Address {

    private String city;

    private String street;

    private String zipcode;

    /** JPA가 사용하기 위한 기본 생성자
     * 사용자는 건드릴 일이 없도록 protected로 제한한다. */
    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
