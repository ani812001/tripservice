package com.trippy.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tour")
    public class Tour {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String tourName;

//        @Temporal(TemporalType.DATE)
//        private Date start_date;
//
//        @Temporal(TemporalType.DATE)
//        private Date end_date;
//
//        private int capacity;
//        private double unit_price;
//
//        @Temporal(TemporalType.TIMESTAMP)
//        private Date created_at;
//
//        @Temporal(TemporalType.TIMESTAMP)
//        private Date updated_at;

        // Constructors

        public Tour() {
        }

//        public Tour(String tourName, Date start_date, Date end_date, int capacity, double unit_price) {
//            this.tourName = name;
//            this.start_date = start_date;
//            this.end_date = end_date;
//            this.capacity = capacity;
//            this.unit_price = unit_price;
//            this.created_at = new Date();
//            this.updated_at = new Date();
//        }


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTourName() {
            return tourName;
        }

        public void setTourName(String tourName) {
            this.tourName = tourName;
        }
    }
