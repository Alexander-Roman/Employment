package by.alexander.employment.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "employees")
public final class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "position")
    private String position;

    @Column(name = "phone", unique = true)
    private String phone;

    @Column(name = "photo")
    private String photo;

    @Column(name = "code", nullable = false, updatable = false)
    private String code;

    protected Employee() {
    }

    public Employee(Long id, String name, String email, String position, String phone, String photo, String code) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.position = position;
        this.phone = phone;
        this.photo = photo;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public String getPhoto() {
        return photo;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(name, employee.name) &&
                Objects.equals(email, employee.email) &&
                Objects.equals(position, employee.position) &&
                Objects.equals(phone, employee.phone) &&
                Objects.equals(photo, employee.photo) &&
                Objects.equals(code, employee.code);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", photo='" + photo + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    /* BUILDER */

    public static final class Builder {
        private Long id;
        private String name;
        private String email;
        private String position;
        private String phone;
        private String photo;
        private String code;

        public Builder() {
        }

        private Builder(Employee employee) {
            id = employee.id;
            name = employee.name;
            email = employee.email;
            position = employee.position;
            phone = employee.phone;
            photo = employee.photo;
            code = employee.code;
        }

        public static Builder from(Employee employee) {
            return new Builder(employee);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPosition(String position) {
            this.position = position;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setPhoto(String photo) {
            this.photo = photo;
            return this;
        }

        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public Employee build() {
            return new Employee(id, name, email, position, phone, photo, code);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Builder builder = (Builder) o;
            return Objects.equals(id, builder.id) &&
                    Objects.equals(name, builder.name) &&
                    Objects.equals(email, builder.email) &&
                    Objects.equals(position, builder.position) &&
                    Objects.equals(phone, builder.phone) &&
                    Objects.equals(photo, builder.photo) &&
                    Objects.equals(code, builder.code);
        }

        @Override
        public int hashCode() {
            int result = id != null ? id.hashCode() : 0;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            result = 31 * result + (email != null ? email.hashCode() : 0);
            result = 31 * result + (position != null ? position.hashCode() : 0);
            result = 31 * result + (phone != null ? phone.hashCode() : 0);
            result = 31 * result + (photo != null ? photo.hashCode() : 0);
            result = 31 * result + (code != null ? code.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return getClass().getName() + "{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", position='" + position + '\'' +
                    ", phone='" + phone + '\'' +
                    ", photo='" + photo + '\'' +
                    ", code='" + code + '\'' +
                    '}';
        }
    }
}
