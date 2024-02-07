//package com.company.jmixpractise.dto;
//
//import com.fasterxml.jackson.annotation.JsonAutoDetect;
//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//import jakarta.persistence.*;
//import jakarta.validation.constraints.Pattern;
//import jakarta.validation.constraints.Size;
//
//public class Reference {
//    /**
//     * Implementation of a category which serves as a Data-Transfer-Object (DTO). Used annotations for bean validation
//     * purposes (JSR-349).
//     *
//     * @author huebnera
//     *
//     */
//    @Entity
//    @Audited
//    @Table(name = "CATEGORY")
//    @JsonIgnoreProperties(ignoreUnknown = true)
//    @JsonAutoDetect(fieldVisibility = Visibility.NONE, getterVisibility = Visibility.PUBLIC_ONLY, setterVisibility = Visibility.NONE)
//    @JsonPropertyOrder(alphabetic = true)
//    @JsonIdentityInfo(generator = JSOGGenerator.class)
//    public class Category {
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_id_seq")
//        @SequenceGenerator(name = "category_id_seq", sequenceName = "CATEGORY_ID_SEQ", allocationSize = 20)
//        private Integer id;
//
//        @NotNull
//        @Size(min = 1, max = 30)
//        @Column(name = "LABEL", unique = true)
//        private String label;
//
//        @NotNull
//        @Size(min = 1, max = 50)
//        @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
//        @Column(name = "AUD_MAIL_FACTUAL")
//        private String auditorEmail;
//
//        @NotNull
//        @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
//        @Size(min = 1, max = 50)
//        @Column(name = "AUD_MAIL_MONETARY_LOW")
//        private String auditorEmailMonetaryLow;
//
//        @NotNull
//        @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
//        @Size(min = 1, max = 50)
//        @Column(name = "AUD_MAIL_MONETARY_MID")
//        private String auditorEmailMonetaryMiddle;
//
//        @NotNull
//        @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
//        @Size(min = 1, max = 50)
//        @Column(name = "AUD_MAIL_MONETARY_HIGH")
//        private String auditorEmailMonetaryHigh;
//
//        /**
//         * Empty default constructor required by JPA/Hibernate.
//         */
//        protected Category() {
//            super();
//        }
//
//        /**
//         * Constructor.
//         *
//         * @param builder
//         */
//        public Category(final Builder builder) {
//            this();
//            this.id = builder.id;
//            this.label = builder.label;
//            this.auditorEmail = builder.auditorEmail;
//            this.auditorEmailMonetaryLow = builder.auditorEmailMonetaryLow;
//            this.auditorEmailMonetaryMiddle = builder.auditorEmailMonetaryMiddle;
//            this.auditorEmailMonetaryHigh = builder.auditorEmailMonetaryHigh;
//        }
//
//        /**
//         * @return the categoryId
//         */
//        public Integer getId() {
//            return id;
//        }
//
//        /**
//         * @param categoryId
//         *            the categoryId to set
//         */
//        public void setId(Integer categoryId) {
//            this.id = categoryId;
//        }
//
//        /**
//         * @return the label
//         */
//        public String getLabel() {
//            return label;
//        }
//
//        /**
//         * @param label
//         *            the label to set
//         */
//        public void setLabel(String label) {
//            this.label = label;
//        }
//
//        /**
//         * @return the auditorEmail
//         */
//        public String getAuditorEmail() {
//            return auditorEmail;
//        }
//
//        /**
//         * @param auditorEmail
//         *            the auditorEmail to set
//         */
//        public void setAuditorEmail(String auditorEmail) {
//            this.auditorEmail = auditorEmail;
//        }
//
//        /**
//         * @return the auditorEmailMonetaryLow
//         */
//        public String getAuditorEmailMonetaryLow() {
//            return auditorEmailMonetaryLow;
//        }
//
//        /**
//         * @param auditorEmailMonetaryLow
//         *            the auditorEmailMonetaryLow to set
//         */
//        public void setAuditorEmailMonetaryLow(String auditorEmailMonetaryLow) {
//            this.auditorEmailMonetaryLow = auditorEmailMonetaryLow;
//        }
//
//        /**
//         * @return the auditorEmailMonetaryMiddle
//         */
//        public String getAuditorEmailMonetaryMiddle() {
//            return auditorEmailMonetaryMiddle;
//        }
//
//        /**
//         * @param auditorEmailMonetaryMiddle
//         *            the auditorEmailMonetaryMiddle to set
//         */
//        public void setAuditorEmailMonetaryMiddle(String auditorEmailMonetaryMiddle) {
//            this.auditorEmailMonetaryMiddle = auditorEmailMonetaryMiddle;
//        }
//
//        /**
//         * @return the auditorEmailMonetaryHigh
//         */
//        public String getAuditorEmailMonetaryHigh() {
//            return auditorEmailMonetaryHigh;
//        }
//
//        /**
//         * @param auditorEmailMonetaryHigh
//         *            the auditorEmailMonetaryHigh to set
//         */
//        public void setAuditorEmailMonetaryHigh(String auditorEmailMonetaryHigh) {
//            this.auditorEmailMonetaryHigh = auditorEmailMonetaryHigh;
//        }
//
//        /*
//         * (non-Javadoc)
//         *
//         * @see java.lang.Object#hashCode()
//         */
//        @Override
//        public int hashCode() {
//            final int prime = 31;
//            int result = 1;
//            result = prime * result + ((id == null) ? 0 : id.hashCode());
//            result = prime * result + ((label == null) ? 0 : label.hashCode());
//            return result;
//        }
//
//        /*
//         * (non-Javadoc)
//         *
//         * @see java.lang.Object#equals(java.lang.Object)
//         */
//        @Override
//        public boolean equals(Object obj) {
//            if (this == obj) {
//                return true;
//            } else if (obj == null) {
//                return false;
//            } else if (obj instanceof Category) {
//                return hashCode() == obj.hashCode();
//            } else {
//                return false;
//            }
//        }
//
//        @Override
//        public String toString() {
//            return String.format("CategoryName [categoryName=%s]", label);
//        }
//
//        /**
//         * Implementation of the {@link Builder} pattern used to create instances of
//         * type {@link Category}.
//         *
//         * @author huebnera
//         *
//         */
//        public static class Builder {
//
//            private Integer id;
//
//            private String label;
//
//            private String auditorEmail;
//
//            private String auditorEmailMo   netaryLow;
//
//            private String auditorEmailMonetaryMiddle;
//
//            private String auditorEmailMonetaryHigh;
//
//            /**
//             * Default constructor
//             */
//            private Builder() {
//            }
//
//            /**
//             * Constructor.
//             *
//             * @param category
//             */
//            private Builder(final Category category) {
//                this();
//                this.id = category.id;
//                this.label = category.label;
//                this.auditorEmail = category.auditorEmail;
//                this.auditorEmailMonetaryLow = category.auditorEmailMonetaryLow;
//                this.auditorEmailMonetaryMiddle = category.auditorEmailMonetaryMiddle;
//                this.auditorEmailMonetaryHigh = category.auditorEmailMonetaryHigh;
//            }
//
//            /**
//             * Sets the id and returns itself.
//             *
//             * @param id
//             * @return {@link Builder}
//             */
//            public Builder id(Integer id) {
//                this.id = id;
//                return this;
//            }
//
//            /**
//             * Sets the label and returns itself.
//             *
//             * @param label
//             * @return {@link Builder}
//             */
//            public Builder label(String label) {
//                this.label = label;
//                return this;
//            }
//
//            /**
//             * Sets the auditorEmail and returns itself.
//             *
//             * @param auditorEmail
//             * @return {@link Builder}
//             */
//            public Builder auditorEmail(String auditorEmail) {
//                this.auditorEmail = auditorEmail;
//                return this;
//            }
//
//            /**
//             * Sets the auditorEmailMonetaryLow and returns itself.
//             *
//             * @param auditorEmailMonetaryLow
//             * @return {@link Builder}
//             */
//            public Builder auditorEmailMonetaryLow(String auditorEmailMonetaryLow) {
//                this.auditorEmailMonetaryLow = auditorEmailMonetaryLow;
//                return this;
//            }
//
//            /**
//             * Sets the auditorEmailMonetaryMiddle and returns itself.
//             *
//             * @param auditorEmailMonetaryMiddle
//             * @return {@link Builder}
//             */
//            public Builder auditorEmailMonetaryMiddle(String auditorEmailMonetaryMiddle) {
//                this.auditorEmailMonetaryMiddle = auditorEmailMonetaryMiddle;
//                return this;
//            }
//
//            /**
//             * Sets the auditorEmailMonetaryHigh and returns itself.
//             *
//             * @param auditorEmailMonetaryHigh
//             * @return {@link Builder}
//             */
//            public Builder auditorEmailMonetaryHigh(String auditorEmailMonetaryHigh) {
//                this.auditorEmailMonetaryHigh = auditorEmailMonetaryHigh;
//                return this;
//            }
//
//            /**
//             * Creates a {@link Category} based on this {@link Builder}.
//             *
//             * @return {@link Category}
//             */
//            public Category build() {
//                return new Category(this);
//            }
//
//            /**
//             * Returns a {@link Builder} instance.
//             *
//             * @return {@link Builder}
//             */
//            public static Builder builder() {
//                return new Builder();
//            }
//
//            /**
//             * Returns a {@link Builder} instance.
//             *
//             * @param category
//             * @return {@link Builder}
//             */
//            public static Builder builder(final Category category) {
//                return new Builder(category);
//            }
//        }
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//}
