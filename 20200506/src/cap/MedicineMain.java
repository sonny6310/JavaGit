package cap;

//class TakeMedicine {
//	public void Atake() {
//		MedicineA ma = new MedicineA();
//		ma.take();
//	}
//	public void Btake() {
//		MedicineB mb = new MedicineB();
//		mb.take();
//	}
//	public void Ctake() {
//		MedicineC mc = new MedicineC();
//		mc.take();
//	}
//}

class TakeMedicine {
private void Atake(MedicineA ma) {
	ma.take();
}
private void Btake(MedicineB mb) {
	mb.take();
}
private void Ctake(MedicineC mc) {
	mc.take();
}
public void ABCtake(MedicineA ma,MedicineB mb, MedicineC mc) {
	Atake(ma);
	Btake(mb);
	Ctake(mc);
}
}

public class MedicineMain {
	public static void main(String[] args) {
		TakeMedicine tm = new TakeMedicine();
//		tm.Atake();
//		tm.Btake();
//		tm.Ctake();
		MedicineA ma = new MedicineA();
		MedicineB mb = new MedicineB();
		MedicineC mc = new MedicineC();
		tm.ABCtake(ma,mb,mc);

	}
}
