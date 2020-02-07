public enum Operator {
    PLUS("+") {
        double operate(double num1, double num2) {
            return num1 + num2;
        }
    },
    MINUS("-") {
        double operate(double num1, double num2) {
            return num1 - num2;
        }
    },
    MUL("*") {
        double operate(double num1, double num2) {
            return num1 * num2;
        }
    },
    DIV("/") {
        double operate(double num1, double num2) throws ArithmeticException {
            try {
                return num1 / num2;
            } catch (ArithmeticException ae) {

            }
            throw new IllegalArgumentException("0으로 나눌 수 없습니다..");
        }
    };

    private String stringOperator;

    Operator(String stringOperator) {
        this.stringOperator = stringOperator;
    }

    static Operator getOperatorByString(String stringOperator) {
        Operator[] operators = values();

        for (Operator o : operators) {
            if (o.stringOperator.equals(stringOperator)) {
                return o;
            }
        }
        throw new IllegalArgumentException("연산자가 잘못되었습니다.");
    }

    abstract double operate(double num1, double num2) ;
}
