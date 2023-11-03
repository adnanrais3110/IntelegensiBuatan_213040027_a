package id.ac.unpas.ib.latihan.heuristik.astar;

// main program
public class MainTest {
    // fungsi main
    public static void main(String[] args) {
        // inisialisasi node-node yang ada
        Node Pangkalpinang = new Node("Pangkalpinang");
        Node Probolinggo = new Node("Probolinggo");
        Node Pasuruan = new Node("Pasuruan");
        Node Jakarta = new Node("Jakarta");
        Node Bekasi = new Node("Bekasi");
        Node Bandung = new Node("Bandung");
        Node Cirebon = new Node("Cirebon");
        Node Indramayu = new Node("Indramayu");
        Node Semarang = new Node("Semarang");
        Node Surabaya = new Node("Surabaya");
        Node Malang = new Node("Malang");
        Node Madiun = new Node("Madiun");
        Node Padang = new Node("Padang");
        Node Pekanbaru = new Node("Pekanbaru");
        Node Jambi = new Node("Jambi");
        Node Medan = new Node("Medan");
        Node Kalimantan = new Node("Kalimantan");
        Node Batam = new Node("Batam");
        Node Tegal = new Node("Tegal");
        Node Bali = new Node("Bali");

        // inisialisasi node-node yang ada dengan costnya
        NodeUCS PangkalpinangUCS = new NodeUCS(Pangkalpinang, 366);
        NodeUCS ProbolinggoUCS = new NodeUCS(Probolinggo, 0);
        NodeUCS PasuruanUCS = new NodeUCS(Pasuruan, 160);
        NodeUCS JakartaUCS = new NodeUCS(Jakarta, 242);
        NodeUCS BekasiUCS = new NodeUCS(Bekasi, 161);
        NodeUCS BandungUCS = new NodeUCS(Bandung, 176);
        NodeUCS CirebonUCS = new NodeUCS(Cirebon, 77);
        NodeUCS IndramayuUCS = new NodeUCS(Indramayu, 151);
        NodeUCS SemarangUCS = new NodeUCS(Semarang, 226);
        NodeUCS SurabayaUCS = new NodeUCS(Surabaya, 244);
        NodeUCS MalangUCS = new NodeUCS(Malang, 241);
        NodeUCS MadiunUCS = new NodeUCS(Madiun, 234);
        NodeUCS PadangUCS = new NodeUCS(Padang, 380);
        NodeUCS PekanbaruUCS = new NodeUCS(Pekanbaru, 10);
        NodeUCS JambiUCS = new NodeUCS(Jambi, 193);
        NodeUCS MedanUCS = new NodeUCS(Medan, 253);
        NodeUCS KalimantanUCS = new NodeUCS(Kalimantan, 329);
        NodeUCS BatamUCS = new NodeUCS(Batam, 80);
        NodeUCS TegalUCS = new NodeUCS(Tegal, 199);
        NodeUCS BaliUCS = new NodeUCS(Bali, 374);

        // menambahkan tetangga dari masing-masing node dengan costnya
        PangkalpinangUCS.addTetangga(BaliUCS, 75);
        PangkalpinangUCS.addTetangga(MedanUCS, 140);
        PangkalpinangUCS.addTetangga(KalimantanUCS, 118);

        ProbolinggoUCS.addTetangga(BandungUCS, 211);
        ProbolinggoUCS.addTetangga(PekanbaruUCS, 101);
        ProbolinggoUCS.addTetangga(CirebonUCS, 90);
        ProbolinggoUCS.addTetangga(BatamUCS, 85);

        PasuruanUCS.addTetangga(JakartaUCS, 120);
        PasuruanUCS.addTetangga(JambiUCS, 146);
        PasuruanUCS.addTetangga(PekanbaruUCS, 138);

        JakartaUCS.addTetangga(MalangUCS, 75);
        JakartaUCS.addTetangga(PasuruanUCS, 120);

        BekasiUCS.addTetangga(IndramayuUCS, 86);

        BandungUCS.addTetangga(MedanUCS, 99);
        BandungUCS.addTetangga(ProbolinggoUCS, 211);

        CirebonUCS.addTetangga(ProbolinggoUCS, 90);

        IndramayuUCS.addTetangga(BatamUCS, 98);
        IndramayuUCS.addTetangga(BekasiUCS, 86);

        SemarangUCS.addTetangga(MadiunUCS, 87);
        SemarangUCS.addTetangga(TegalUCS, 92);

        SurabayaUCS.addTetangga(KalimantanUCS, 111);
        SurabayaUCS.addTetangga(MalangUCS, 70);

        MalangUCS.addTetangga(SurabayaUCS, 70);
        MalangUCS.addTetangga(JakartaUCS, 75);

        MadiunUCS.addTetangga(SemarangUCS, 87);

        PadangUCS.addTetangga(BaliUCS, 71);
        PadangUCS.addTetangga(MedanUCS, 151);

        PekanbaruUCS.addTetangga(JambiUCS, 97);
        PekanbaruUCS.addTetangga(PasuruanUCS, 138);
        PekanbaruUCS.addTetangga(ProbolinggoUCS, 101);

        JambiUCS.addTetangga(MedanUCS, 80);
        JambiUCS.addTetangga(PasuruanUCS, 146);
        JambiUCS.addTetangga(PekanbaruUCS, 97);

        MedanUCS.addTetangga(PangkalpinangUCS, 140);
        MedanUCS.addTetangga(PadangUCS, 151);
        MedanUCS.addTetangga(BandungUCS, 99);
        MedanUCS.addTetangga(JambiUCS, 80);

        KalimantanUCS.addTetangga(PangkalpinangUCS, 118);
        KalimantanUCS.addTetangga(SurabayaUCS, 111);

        BatamUCS.addTetangga(ProbolinggoUCS, 85);
        BatamUCS.addTetangga(TegalUCS, 142);
        BatamUCS.addTetangga(BaliUCS, 98);

        TegalUCS.addTetangga(SemarangUCS, 92);
        TegalUCS.addTetangga(BatamUCS, 142);

        BaliUCS.addTetangga(PangkalpinangUCS, 75);
        BaliUCS.addTetangga(PadangUCS, 71);

        // menampilkan hasil dari algoritma A*
        System.out.println("A*");
        // inisialisasi objek AStar
        AStar aStar = new AStar();
        // memanggil fungsi search dari objek aStar dari node PangkalpinangUCS ke
        // ProbolinggoUCS
        aStar.search(PangkalpinangUCS, ProbolinggoUCS);
        System.out.println();
    }
}