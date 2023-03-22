/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ray Mosaid
 */

/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 5 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/


// Membuat class student yang menmpung data-data mahasiswa
public class Student {
    private String nim;
    private String name;
    private String grade;
    private String program;
    
    // Membuat konstruktor
    public Student(String nim, String name, String grade, String program){
        this.nim = nim;
        this.name = name;
        this.grade = grade;
        this.program = program;
    }
    
    //Membuat Setter
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public void setProgram(String program){
        this.program = program;
    }
    
    // Membuat Getter
    public String getNim(){
        return this.nim;
    }
    public String getName(){
        return this.name;
    }
    public String getGrade(){
        return this.grade;
    }
    public String getProgram(){
        return this.program;
    }
}
