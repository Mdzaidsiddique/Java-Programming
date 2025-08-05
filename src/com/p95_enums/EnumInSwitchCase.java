package com.p95_enums;

public class EnumInSwitchCase {

    // from java 5 onwards we can take enums inside switch case also;

    enum Role{
        FRONTEND, BACKEND, DB_ADMINISTRATOR, ML_ENGINEER, DATA_SCIENTIST;
    }

    public static void main(String[] args) {
        Role role = Role.BACKEND;

        switch (role){
            case FRONTEND:
                System.out.println("frontend");
                break;
            case BACKEND:
                System.out.println("backend");
                break;
            case DB_ADMINISTRATOR:
                System.out.println("db administrator");
                break;
            case ML_ENGINEER:
                System.out.println("machine learning engineer");
                break;
            case DATA_SCIENTIST:
                System.out.println("data scientist");
                break;
            default:
                System.out.println("keep apply jo the job, all the best");
        }
    }
}
