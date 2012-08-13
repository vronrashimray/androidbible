package yuku.alkitab.base.model;


public class Book {
	public int[] nayat;
	public int npasal;
	public int[] pasal_offset;
	public String nama;
	public String judul;
	public String file;
	public int pos = -1;
	public int pdbBookNumber;
	/** Hanya dipake di YesPembaca */
	public int offset = -1;

	@Override
	public String toString() {
		return String.format("%s (%d pasal)", judul, npasal); //$NON-NLS-1$
	}
}