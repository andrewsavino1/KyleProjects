package Change;

public abstract class Coin {

    abstract int getValue();

}

class Quarter extends Coin {

    @Override
    int getValue() {
        return 25;
    }
}

class Dime extends Coin {

    @Override
    int getValue() {
        return 10;
    }
}

class Nickel extends Coin {


    @Override
    int getValue() {
        return 5;
    }
}

class Penny extends Coin {

    @Override
    int getValue() {
        return 1;
    }
}
