public class Eagle extends Bird {
    private String prey;

    public Eagle(int age, int weight) {
        super(age, weight);
    }

    public void capture() {
        System.out.println("捕食 " + prey);
    }

    public void showEagleAgeAndWeight () {
        System.out.println("一只 " + getAge() + " 岁的老鹰， 体重 " + getWeight() + " Kg 。");
    }

    public void setPrey(String prey) {
        System.out.println("生活在 " + prey + "族群旁， 所以它只捕食 " + prey);
        this.prey = prey;
    }

    public String getPrey() {
        return this.prey;
    }
}
