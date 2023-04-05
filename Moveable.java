/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuco;

/**
 *
 * @author DINH CHAU
 */
interface Moveable {
    
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
    
}

class MoveableCỉcle implements Moveable{
    
    @Override
     public void moveUp(){
        System.out.println("xoa len");
    }
    @Override 
    public void  moveDown(){
        System.out.println("Lay duoi");
    }
    @Override
    public void moveLeft(){
        System.out.println("trai");
    }
    @Override
    public void moveRight(){
        System.out.println("Phai");
    }
}
class MoveablePoint implements Moveable{
    
    @Override
     public void moveUp(){
        System.out.println("xoa len");
    }
    @Override 
    public void  moveDown(){
        System.out.println("Lay duoi");
    }
    @Override
    public void moveLeft(){
        System.out.println("trai");
    }
    @Override
    public void moveRight(){
        System.out.println("Phai");
    }
}

