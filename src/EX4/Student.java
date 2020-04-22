package EX4;

public class Student {
    String ten;
    int tuoi;
    float diem;
    String gioiTinh;

    public Student(String ten, int tuoi, float diem) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diem=" + diem +
                ", gioiTinh='" + gioiTinh + '\'' +
                '}';
    }
}

