package classes;

public abstract class Person {

    private String id_num; // Profile Number
    private String work_id; // Users Work-Job / Station ID
    private String chosenSide; /* BOH or FOH */
    private boolean profileActive;

    public Person(String id_num, String work_id, String chosenSide) {
        this.id_num = id_num;
        this.work_id = work_id;
        this.chosenSide = chosenSide;
        this.profileActive = false;
    }

    public String getId_num() {
        return id_num;
    }

    public void setId_num(String _id_num) {
        if (_id_num.equals(null) || _id_num.isBlank()) {
            throw new IllegalArgumentException("_id_num cannot be NULL or Blank");
        } else {
            this.id_num = _id_num;
        }
    }

    public String getWork_id() {
        return work_id;
    }

    public void setWork_id(String _work_id) {
        if (_work_id.equals(null) || _work_id.isBlank()) {
            throw new IllegalArgumentException("_work_id cannot be NULL or Blank");
        } else {
            this.id_num = _work_id;
        }
    }

    public String getChosenSide() {
        return chosenSide;
    }

    public void setChosenSide(String _chosenSide) {
        if (_chosenSide.equals(null) || _chosenSide.isBlank()) {
            throw new IllegalArgumentException("_chosenSide cannot be NULL or Blank");
        } else {
            this.chosenSide = _chosenSide;
        }

    }

    public boolean getPersonStatus() {
        return this.profileActive;
    }

    public void setPersonStatus() {
        this.profileActive = !profileActive;
    }

    // Methods
    public abstract void updateProfileStatus();
}
