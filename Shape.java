/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tesst;

/**
 *
 * @author DINH CHAU
 */
abstract class PhuongTienDiChuyen{
    protected String LoaiPhuongTien;
    protected String tenHangSanXUat;
    protected String tenQuocGia;
    
//    public PhuongTienDiChuyen(){}

//    public PhuongTienDiChuyen(String LoaiPhuongTien, String tenHangSanXUat, String tenQuocGia) {
//        this.LoaiPhuongTien = LoaiPhuongTien;
//        this.tenHangSanXUat = tenHangSanXUat;
//        this.tenQuocGia = tenQuocGia;
//    }

    abstract void Batdau();
    abstract void tangToc();
    abstract void dungLai();
    abstract double layVanToc();
}

class MayBay extends PhuongTienDiChuyen{
    private String LoaiNhienLieu;
    
//    public MayBay(){}

//    public MayBay(String LoaiNhienLieu) {
//        this.LoaiNhienLieu = LoaiNhienLieu;
//    }

//    public MayBay(String LoaiNhienLieu, String LoaiPhuongTien, String tenHangSanXUat, String tenQuocGia) {
//        super(LoaiPhuongTien, tenHangSanXUat, tenQuocGia);
//        this.LoaiNhienLieu = LoaiNhienLieu;
//    }

    public String getLoaiNhienLieu() {
        return LoaiNhienLieu;
    }

    public void setLoaiNhienLieu(String LoaiNhienLieu) {
        this.LoaiNhienLieu = LoaiNhienLieu;
    }
    
    @Override
    public void Batdau(){
        System.out.println("Started.");
    }
    @Override
    public void tangToc(){
        System.out.println("ET ET.");
    }
    @Override
    public void dungLai(){
        System.out.println("Stopped.");
    }
    @Override
    public double layVanToc(){
        System.out.println("TOC OUT.");
        return 0;
    }
}

class Xeoto extends PhuongTienDiChuyen{
    private String LoaiNhienLieu;

//    public Xeoto(String LoaiNhienLieu) {
//        this.LoaiNhienLieu = LoaiNhienLieu;
//    }
//
//    public Xeoto(String LoaiNhienLieu, String LoaiPhuongTien, String tenHangSanXUat, String tenQuocGia) {
//        super(LoaiPhuongTien, tenHangSanXUat, tenQuocGia);
//        this.LoaiNhienLieu = LoaiNhienLieu;
//    }

    public String getLoaiNhienLieu() {
        return LoaiNhienLieu;
    }

    public void setLoaiNhienLieu(String LoaiNhienLieu) {
        this.LoaiNhienLieu = LoaiNhienLieu;
    }
 
    @Override
    public void Batdau(){
        System.out.println("cut");
    }
    @Override
    public void tangToc(){
        System.out.println("GIA HE GIA HE.");
    }
    @Override
    public void dungLai(){
        System.out.println("NOOOOO.");
    }
    @Override
    public double layVanToc(){
        System.out.println("KO.");
        return  0;
    }
}
class Xedap extends PhuongTienDiChuyen{
    @Override
    public void Batdau(){
        System.out.println("cut");
    }
    @Override
    public void tangToc(){
        System.out.println("GIA HE GIA HE.");
    }
    @Override
    public void dungLai(){
        System.out.println("NOOOOO.");
    }
    @Override
    public double layVanToc(){
        System.out.println("KO.");
        return  0;
    }
}