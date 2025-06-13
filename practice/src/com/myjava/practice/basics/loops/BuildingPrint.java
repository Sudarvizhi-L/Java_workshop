package com.myjava.practice.basics.loops;

public class BuildingPrint {
    public void print(char buildingIdentifier){
        switch (buildingIdentifier){
            case 'A':
            case 'R':
            case 'W':
                System.out.println("10 Floors");
                break;

            case 'B':
            case 'K':
            case  'L':

                System.out.println("20 Floors");
                break;

            case 'C':
            case 'I':
            case 'T':
                System.out.println("23 floors");
                break;

            case 'D':
            case 'O':
            case 'G':
                System.out.println("13 floors");
                break;

            case 'E':
            case 'Q':
            case 'Z':
                System.out.println("25 floors");
                break;

            default:
                System.out.println("11 floors");
        }
    }

    public static void main(String[] args) {
        BuildingPrint buildingPrint = new BuildingPrint();
        buildingPrint.print('C');
        buildingPrint.print('G');


    }
}
