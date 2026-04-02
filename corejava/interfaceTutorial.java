interface computer {
    void code();
}

class laptop implements computer {
    public void code() {
        System.out.println("I'm laptop");
    }
}

class desktop implements computer {
    public void code() {
        System.out.println("desktop");
    }
}

class devloper {
    void devapp(computer lap) {
        lap.code();
    }
}

class interfaceTutorial {
    public static void main(String a[]) {
        computer lap = new laptop();
        computer desk = new desktop();
        devloper dev1 = new devloper();

        dev1.devapp(desk);
        dev1.devapp(lap);

    }
}