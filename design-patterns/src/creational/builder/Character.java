package creational.builder;

public class Character {

    private String name;
    private String power;
    private Integer age;

    private Character(CharacterBuilder builder) {
        this.name = builder.name;
        this.power = builder.power;
        this.age = builder.age;
    }

    public Character(String name, String power, Integer age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", age=" + age +
                '}';
    }

    public static class CharacterBuilder {

        private String name;
        private String power;
        private Integer age;

        public CharacterBuilder() {
        }

        //        You can add a constructor with only required fields
        public CharacterBuilder(String name, String power, Integer age) {
            this.name = name;
            this.power = power;
        }

        public CharacterBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CharacterBuilder setPower(String power) {
            this.power = power;
            return this;
        }

        public CharacterBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}
