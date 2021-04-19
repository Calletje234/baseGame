public enum Gender {
    FEMALE(2, 5),
    MALE(5, 2);

    int muscle;
    int looks;
    Gender(int muscle, int looks){
        this.muscle = muscle;
        this.looks = looks;
    }
}
